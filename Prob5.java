package Assign4;

import java.util.Scanner;

public class Prob5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an operator(+,_,*,/):-");
        char op = sc.next().charAt(0);

        System.out.println("Enter two Numbers :");
        int a = sc.nextInt();
        int b = sc.nextInt();

        switch (op){
            case '+':
                System.out.println(a+b);
                break;
            case '-':
                System.out.println(a-b);
            case '*':
                System.out.println(a*b);
                break;
            case '/':
                System.out.println(a/b);
                break;
        }
    }
}
