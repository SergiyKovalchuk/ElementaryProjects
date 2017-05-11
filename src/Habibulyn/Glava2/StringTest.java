package Habibulyn.Glava2;

/**
 * Created by Hi-Tech on 21.04.2017.
 */
public class StringTest {
    public static void main(String[] args) {
        String s = "Доброго дня шановні студенти , студенти , студенти";
        int result=0;
        int result2=0;
        char [] a = s.toCharArray();
        for(int i=0; i<a.length; i++){
            if (a[i]=='о')
                result++;
        }
        System.out.println("Символ 'о' зустрічається " + result + " рази");
        String [] sub = s.split(" ");
        System.out.println("Кількість слів у строці - " + sub.length);
        for(int i=0; i<sub.length; i++){
            if("студенти".equals(sub[i]))
                result2++;
        }
        System.out.println("Слово зустрічається " + result2 + " рази");

    }
}
