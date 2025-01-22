import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m, c, ch1, ch2;
        n = sc.nextInt(); // 바구니 크기
        m = sc.nextInt(); // M줄
        n = n+1;
        int [] arr = new int[n];

        for(int i=0;i<n;i++) {
            arr[i] = i;
        }

        for(int i=0;i<m;i++) {
            ch1 = sc.nextInt();
            ch2 = sc.nextInt();
            
            c = arr[ch1];
            arr[ch1] = arr[ch2];
            arr[ch2] = c;
        }
          
        for(int i=1;i<n;i++) {
            System.out.println(arr[i]);
        }
    }
}