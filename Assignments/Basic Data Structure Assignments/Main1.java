package com.company;

import java.util.Scanner;

public class Main1
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        for(int i=100;i<=999;i++)
        {
            String s=Integer.toString(i);
            int sum=0;
            for(int j=0;j<s.length();j++)
            {
                int k=Integer.parseInt(Character.toString(s.charAt((j))));
                sum=sum+(k*k*k);
            }
            if(sum==i)
            {
                System.out.println(sum);
            }
        }

    }
}
