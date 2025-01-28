import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean [] satisfied = new boolean[42];
        int cnt = 0;

        for(int i=0;i<10;i++) {
            int n = sc.nextInt() % 42;
            if(!satisfied[n]) {
                satisfied[n] = true;
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}