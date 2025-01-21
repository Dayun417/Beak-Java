import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a, b, t, sum=0;
        t = sc.nextInt();
        
        for(int i=0;i<t;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            
            sum = a + b;
            System.out.println(sum);
        }      
    }
}