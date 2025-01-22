import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n, m, k=0, start=0, end=0;
        n = sc.nextInt(); // 바구니 크기
        m = sc.nextInt(); // M줄
        n = n + 1;
        int arr[] = new int[n]; 

        for(int i=0;i<m;i++) {
               start = sc.nextInt();
               end = sc.nextInt();
               k = sc.nextInt();
   
            for(int j=start;j<= end;j++) {
                   arr[j] = k;
            }
        }

        for(int i = 1; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}