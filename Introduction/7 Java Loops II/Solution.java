// Question: https://www.hackerrank.com/challenges/java-loops

import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();  
            int s = a,p=1;
            for(int k=0;k<n;k++){
                s +=(p * b);
                System.out.print(s +" " );
                p *= 2;
            }
            System.out.println();           
        }   
        in.close();
    
    }
}
