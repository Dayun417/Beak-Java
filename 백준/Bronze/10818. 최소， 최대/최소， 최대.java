import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i]) {
                max = arr[i];
            } 
            if(min>arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min + " " + max);
    }
}