package com.company;

import java.util.Scanner;

public class Main2
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter P value");
        int p=sc.nextInt();
        System.out.println("Enter T value");
        int t=sc.nextInt();
        System.out.println("Enter R value");
        int r=sc.nextInt();
        int sim=(p*t*r)/100;
        System.out.println(sim);

    }
}
