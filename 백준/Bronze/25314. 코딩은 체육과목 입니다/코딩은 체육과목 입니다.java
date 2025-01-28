import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n, result;
        n = sc.nextInt();

        result = n / 4;

        for(int i=0;i<result;i++) {
            System.out.print("long ");
        }
        System.out.println("int");
        
    }
}