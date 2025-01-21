import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max=0, index=0, result=0, cnt=0;
        int arr[] = new int[3];
        
        for(int i=0;i<3;i++) {
            arr[i] = scanner.nextInt();
            if(arr[i]>max) {
                max = arr[i];
            }
        }

        for(int i=0;i<2;i++) {
            for(int j=i;j<2;j++) {
                if(arr[i]==arr[j+1]) {
                    cnt++;
                    index = arr[i];
                }                
            }
        }
        if(cnt==1) {
            result = 1000+index*100;
        } else if(cnt==3) {
            result = 10000+index*1000;
        } else if(cnt==0) {
            result = max*100;
        }
        System.out.println(result);

        scanner.close();
    }
}