package Habibulyn.Glava1;

/**
 * Created by Hi-Tech on 18.04.2017.
 */
class Nested{
    static private int pr;
    String s = "Member of Nested";
    //вкладуєм статичний клас
    static class A {    //повне імя класу Nested.A
        private int a = pr;
        String s = "Member of A";
        // у вкладений клас А вкладуєм ще один клас АВ
        static class AB{    //повне імя класу Nested.A.AB
            private int ab=pr;
            String s = "Member of AB";
        }
    }
    // в клас Nested вкладуєм не статичний клас
    class B{           //повне імя класу Nested.B
        private int b = pr;
        String s = "Member of B";
        // в клас B вкладуємо ще один клас
        class BC{
            private int bc = pr;
            String s = "Member of BC";
        }

        void f(final int i){    //без слова final і та j не можна використовувати у локальному класі D
            final int j = 99;

            class D{     // локальний клас D відомий лише в методі f()
                private int d = pr;
                String s = "Member of D";
                void pr(){
                    System.out.println(s+(i+j));//s еквівалентно this.s
                    System.out.println(B.this.s);
                    System.out.println(Nested.this.s);
                   // System.out.println(AB.this.s); немає доступу
                    // System.out.println(A.this.s);
                }
            }

            D d = new D();// обєкт створюється тут, в методі
            d.pr();
        }
    }
    void m(){
        new Object(){       // створюється обєкт анонімного класу, вказується конструктор його суперкласа
            private int e = pr;
            void  g(){
                System.out.println("From g()");
            }
        }.g(); // тут виконується метод щойно створеного обєкта
    }
}


public class NestedClass {
    public static void main(String[] args) {
        Nested nest = new Nested();  // послідовно відкриваються три класи

       // Nested.A theA = nest.new A();
        //Nested.A.AB theAB = theA.new AB();
    }
}
