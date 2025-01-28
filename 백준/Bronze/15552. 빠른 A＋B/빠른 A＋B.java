import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine()); // 한 줄의 입력을 문자열로 읽음. 문자열을 정수로 변환
        
        for(int i=0;i<t;i++) {
            String[] inputs = br.readLine().split(" "); // 테스트 케이스의 입력을 한 줄로 읽음. 공백으로 분리
            int a = Integer.parseInt(inputs[0]); // 문자열을 정수로 변환
            int b = Integer.parseInt(inputs[1]); // 문자열을 정수로 변환
            int sum = a + b;
            
            bw.write(String.valueOf(sum)); // sum을 문자열로 변환
            bw.newLine(); // \n
        }

        // flush와 close
        bw.flush(); // 버퍼에 남아 있는 데이터를 실제 출력. 한번에 출력
        br.close();
        bw.close();   
    }
}