import java.util.Scanner;
class WhatName{
    public static void main(String[] agrs){
        Scanner scan = new Scanner(System.in);
        System.out.print("당신의 이름은: ");
        String name = "";
        name = scan.next();
        System.out.println("나의 이름은 "+ name + "입니다.");
        System.out.print("당신의 나이는: ");
        int age = 0;
        age = scan.nextInt();
        System.out.println("나는 " + age + "살입니다.");
    }
}
