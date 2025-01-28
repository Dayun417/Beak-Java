import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] arr = new double[1000];
        int n;
        double avg, max = 0, sum = 0;

        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
            if (max < arr[i]) {
                max = arr[i];
            }
        }

        if (max == 0) {
            avg = 0;
        } else {
            for (int i = 0; i < n; i++) {
                arr[i] = (arr[i] / max) * 100;
                sum += arr[i];
            }
            
            avg = sum / n;
        }

        System.out.println(avg);
    }
}