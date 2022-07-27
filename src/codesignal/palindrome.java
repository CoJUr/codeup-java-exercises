package codesignal;

public class palindrome {

    boolean mySolution(String inputString) {
        String reverse = "";

        for (int i = inputString.length() - 1; i >= 0; i--) {
            reverse += inputString.charAt(i);
        }

        return inputString.equals(reverse);
    }

    boolean mminellasSol(String str) {
        return str.equals(new StringBuilder(str).reverse().toString());
    }

    boolean evansSol(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length()-i-1)) return false;

        }
        return true;
    }

    boolean math_ml_dlSol(String s) {
        return new StringBuilder(s).reverse().toString().equals(s);
    }

}
