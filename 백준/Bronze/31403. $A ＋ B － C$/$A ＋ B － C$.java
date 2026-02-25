import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        System.out.println(a+b-c);

        String aStr = String.valueOf(a);
        String bStr = String.valueOf(b);

        //System.out.println(aStr+bStr);
        int sum = Integer.parseInt(aStr+bStr);
        System.out.println(sum-c);
    }
}
