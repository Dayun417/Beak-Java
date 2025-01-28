import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];

        int x = sc.nextInt();

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<arr.length;i++) {
            if(arr[i]<x) {
                System.out.println(arr[i]);
            }
        }
    }
}