package com.hongfei.focus;

import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        
        int m = s.nextInt();
        int n = s.nextInt();
        
        int[] array = new int[m];
            
        while(s.hasNextInt())
        {
            int col = 0;
            col = s.nextInt();
            
            array[col-1] = array[col-1] + 1;
        }
        
        for(int i = 0; i < m-1; i++)
        {
            if(array[i] < array[i+1])
                array[i+1] = array[i];
        }
       
        System.out.println(array[m-1]);
        
        
        String aString  = "1 1 1";
        
        String[] a = aString.split(" ");
        
    }
}
