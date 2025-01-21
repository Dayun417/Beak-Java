import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h, m, time, result, h2, m2;
        h = sc.nextInt();
        m = sc.nextInt();
        time = sc.nextInt();

        result = h*60 + m + time;
        h2 = result / 60;
        m2 = result % 60;

        if(h2>=24) {
            h2 = h2-24;
        }
        System.out.println(h2 + " " + m2);
        
    }
}