import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int h, m;
        h = sc.nextInt();
        m = sc.nextInt();

        if(h!=0 && m<45) {
            h -= 1;
            m = 60+m-45;
        } else if(h!=0 && m>=45) {
            m = m-45;
        } else if(h==0 && m<45) {
            h = 23;
            m = 60+m-45;
        } else if(h==0 && m>=45) {
            m = m-45;
        }
        System.out.println(h + " " + m);
    }
}