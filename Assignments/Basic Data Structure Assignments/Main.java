package com.company;
import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
	    Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int i=sc.nextInt();
        String s=Integer.toString(i);
        int sum=0;
        for(int j=0;j<s.length();j++)
        {
            int k=Integer.parseInt(Character.toString(s.charAt((j))));
            sum=sum+(k*k*k);
        }
        if(sum==i)
        {
            System.out.println("ArmStrong");
        }
        else
        {
            System.out.println("Not ArmStrong");
        }
    }
}
