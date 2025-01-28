import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int arr[] = new int[9];
        int num=0;
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0;i<arr.length;i++) {
            if(max<arr[i]) {
                max = arr[i];
                num = i+1;
            } 
        }
        System.out.println(max + " " + num);
    }
}