package org.example;
import java.util.*;
public class Main {


    public static void main(String[] args) throws Exception {

        FizzBuzz fizzBuzz=new FizzBuzz();

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Range:");
        int input=scanner.nextInt();
        System.out.println(fizzBuzz.getResult(input));

    }
}