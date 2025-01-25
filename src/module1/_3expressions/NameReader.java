package module1._3expressions;

import java.util.Scanner;
public class NameReader {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);  

        System.out.println("Please Enter your age:  ");
        int age = scan.nextInt();
        System.out.println("Your age is" + age);

    }

}
