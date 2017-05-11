package Habibulyn.Glava1;

import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Hi-Tech on 14.04.2017.
 */
public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result=1;
        int factorial = sc.nextInt();
        for(int i=factorial; i>0;i--){
            result*=i;
        }
        System.out.println(result);

    }
}
