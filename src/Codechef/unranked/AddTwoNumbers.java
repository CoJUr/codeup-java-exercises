package Codechef.unranked;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class AddTwoNumbers {

    public static void main(String[] args) {
//        input and output streams
        InputStream inputStream = System.in;

        Scanner in = new Scanner(inputStream);

//        read the # of test cases
        int T = in.nextInt();
        while (T-- > 0) {
//            read the numbers a and b
            int a = in.nextInt();
            int b = in.nextInt();

//            compute sum
            int ans = a + b;
            System.out.println(ans);
        }
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }
    }

}
