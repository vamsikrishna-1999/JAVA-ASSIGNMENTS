package com.company;

import java.util.Scanner;

public class Main5
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[]{5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};
        int n=sc.nextInt();
        for(int i=0;i<a.length;i++)
        {
            if(n==a[i])
            {
                System.out.println(i);
            }
        }
    }
}
