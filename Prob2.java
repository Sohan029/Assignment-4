package Assign4;

import java.util.Scanner;

public class Prob2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num<0) System.out.println((num * -1));
        else System.out.println(num);
    }
}
