package Assign4;

import java.util.Scanner;

public class Prob1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int len = sc.nextInt();
        int brd = sc.nextInt();
        if(len == brd) System.out.println("it is a Square.");
        else System.out.println("it is a rectangle.");
    }
}
