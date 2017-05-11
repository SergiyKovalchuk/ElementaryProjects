package Habibulyn.Glava1;

import java.util.Scanner;

/**
 * Created by Hi-Tech on 14.04.2017.
 */
public class Glava1Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int count=0;
        for(int i=number;i>0;i--){
            if((number%i==0)&&(i%2==0)){
                for(int j=i;j>1;i/=2){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
