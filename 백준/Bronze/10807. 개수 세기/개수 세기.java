import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, cnt=0;
        n = sc.nextInt();
        int arr[] = new int[n];
        int v;

        for(int i=0;i<arr.length;i++) {
            arr[i] = sc.nextInt();
        }

        v = sc.nextInt();
        
        for(int i=0;i<arr.length;i++) {
            if(v==arr[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}