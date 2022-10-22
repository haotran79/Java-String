package string;

import java.math.BigInteger;
import java.util.Scanner;


public class chia_het {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if(a.mod(b).equals(BigInteger.valueOf(0)) || b.mod(a).equals(BigInteger.valueOf(0))){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
