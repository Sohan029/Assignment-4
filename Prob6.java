package Assign4;

import java.util.Scanner;

public class Prob6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Marks:");
        int  num  = sc.nextInt();
//        float num1 = num/10;
//        System.out.println(num1);

        switch (num/10){
            case 10:
            case 9:
                System.out.println("A+");
                break;
            case 8:
                System.out.println('A');
                break;
            case 7:
                System.out.println("B+");
                break;
            case 6:
                System.out.println('B');
                break;
            case 5:
                System.out.println('C');
                break;
            case 4:
                System.out.println('D');
                break;
            case 3:
                System.out.println('E');
                break;
            default:
                System.out.println("F");

        }
    }
}
