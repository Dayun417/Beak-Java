import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        for(int i=0;i<n;i++) {
            int sum=0;
            int sum2=0;
            String s = br.readLine();
            for(int j=0;j<s.length();j++) {
                if(s.charAt(j)=='O') {
                    sum++;
                    sum2+=sum;
                } else {
                    sum=0;
                }
            }
            System.out.println(sum2);
        }
    }
}
