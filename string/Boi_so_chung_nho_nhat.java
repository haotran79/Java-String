package string;

import java.math.BigInteger;
import java.util.Scanner;

public class Boi_so_chung_nho_nhat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            BigInteger c = a.gcd(b);
            System.out.println(a.multiply(b).divide(c));
        }
    }
}
