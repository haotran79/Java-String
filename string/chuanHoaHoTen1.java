package string;

import java.util.Scanner;

/**
 *
 * @author David Tran
 */
public class chuanHoaHoTen1 {
    
    static String standardlize(String s){
        String [] data = s.trim().toLowerCase().split("\\s+");
        String res = " ";
        for(String i: data){
            res += Character.toUpperCase(i.charAt(0)) + i.substring(1) + " ";
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = Integer.parseInt(sc.nextLine());
        while(test --> 0){
            String s = sc.nextLine();
            System.out.println(standardlize(s));
        }
    }
}
