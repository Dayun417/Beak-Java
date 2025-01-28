import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, x, n, result=0;
        x = sc.nextInt();
        n = sc.nextInt();

        for(int i=0;i<n;i++) {
            a = sc.nextInt();
            b = sc.nextInt();
            result += a*b;
        }

        if(result==x) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}