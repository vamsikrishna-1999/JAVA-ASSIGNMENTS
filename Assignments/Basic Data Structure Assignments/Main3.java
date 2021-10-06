package com.company;

import java.util.Scanner;

public class Main3
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st sub value");
        int one=sc.nextInt();
        System.out.println("Enter 2nd sub value");
        int two=sc.nextInt();
        System.out.println("Enter 3rd sub value");
        int three=sc.nextInt();
        if(one>60 && two>60 && three>60)
        {
            System.out.println("Passed");
        }
        else if((one>60 && two>60 || three>60) || (one>60 || two>60 && three>60) || (two>60 && one>60 || three>60))
        {
            System.out.println("Promoted");
        }
        else if(one<60 && two<60 && three<60)
        {
            System.out.println("Failed");
        }
    }
}
