import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a, b, sum=0;

        while (true) {
            a = sc.nextInt();
            b = sc.nextInt();

            sum = a+b;

            if(a==0 && b==0) {
                break;
            }
            System.out.println(sum);
        }
    }
}