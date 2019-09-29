package easyExams;

import java.util.Scanner;

public class HuiWen {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(isPalindrome(sc.nextInt()));
        }


    }

    private static boolean isPalindrome(int x) {
        boolean result=false;
        if (x < 0)
            return false;
        if (x < 10)
            result=true;
        else {
            String numString = String.valueOf(x);
            char[] arrChar = numString.toCharArray();
            for (int i = numString.length()/2-1; i>=0; i--){
                if (arrChar[i] != arrChar[numString.length()-i-1]){
                    result=false;
                    break;
                }
                    result=true;
            }
        }

        return result;
    }
}
