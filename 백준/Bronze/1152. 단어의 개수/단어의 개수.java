import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s = br.readLine();
        
        s = s.trim();
        int cnt = 0;

        if(s=="") {
            System.out.println(0);

            return;
        }

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i) == ' ') {
                cnt++;
            }
        }
        
        System.out.println(cnt+1);
    }
}
