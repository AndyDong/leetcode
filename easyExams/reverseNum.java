package easyExams;


import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            System.out.println(reverse(sc.nextInt()));
        }


    }

    public static int reverse(int x) {


        int result = x;
        if(x < 0){
            result = x*(-1);
            String numString = Integer.toString(result);
            numString = new StringBuffer(numString).reverse().toString();
            // result = Integer.valueof(numString).intValue() * (-1);
            try{
                result = Integer.valueOf(numString).intValue();
                result = result *(-1);
            }catch(Exception e){
                return 0;
            }

        }else{
            String numString = Integer.toString(result);
            numString = new StringBuffer(numString).reverse().toString();
            // result = Integer.valueof(numString).intValue();
            try{
                result = Integer.valueOf(numString).intValue();
            }catch(Exception e){
                return 0;
            }
        }
        return result;

    }
}
