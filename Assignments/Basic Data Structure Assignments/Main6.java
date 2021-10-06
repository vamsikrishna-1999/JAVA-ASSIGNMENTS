package com.company;
import java.util.*;
public class Main6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        int[] b=new int[3];
        int[] c=new int[3];
        System.out.println("Enter 1st student marks");
        for(int i=0;i<3;i++)
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter 2nd student marks");
        for(int i=0;i<3;i++)
        {
            b[i]=sc.nextInt();
        }
        System.out.println("Enter 3rd student marks");
        for(int i=0;i<3;i++)
        {
            c[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0;i<3;i++)
        {
            sum=sum+a[i];
        }
        int avg=sum/3;
        System.out.println("Total Marks scored by 1st student="+sum+"Avg Marks of 1st Student="+avg);
        int sum1=0;
        for(int i=0;i<3;i++)
        {
            sum1=sum1+b[i];
        }
        int avg1=sum1/3;
        System.out.println("Total Marks scored by 2nd student="+sum1+"Avg Marks of 2nd Student="+avg1);
        int sum2=0;
        for(int i=0;i<3;i++)
        {
            sum2=sum2+c[i];
        }
        int avg2=sum2/3;
        System.out.println("Total Marks scored by 3rd student="+sum2+"Avg Marks of 3rd Student="+avg2);
    }
}
