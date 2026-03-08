import java.io.BufferedReader;
import java.io.InputStreamReader;
//import java.util.Arrays;
//import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int k = 1;
        int res = 1;
        int i = 1;
        while (n>k) {
            k += i*6;
            i++;
            res++;
        }

        System.out.println(res);
    }
}
