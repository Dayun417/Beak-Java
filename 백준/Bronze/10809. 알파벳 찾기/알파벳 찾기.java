import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
//import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int arr[] = new int[26];
        Arrays.fill(arr, -1);

        String s = br.readLine();
        
        for(int i=0;i<s.length();i++) {
            int n = s.charAt(i) - 'a';    

            if(arr[n] == -1) {
                arr[n] = i;
            }
        }

        for(int i=0;i<26;i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
