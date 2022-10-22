package array;

import java.util.Scanner;

public class so_khong_lien_ke {
    
    static boolean check(String s){
        int sum = s.charAt(0) - 48;
        for(int i=1; i<s.length(); i++){
            if(Math.abs(s.charAt(i-1) - s.charAt(i)) != 2){
                return false;
            }
            sum += s.charAt(i) - 48;
        }
        return sum % 10 == 0;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            String s = sc.next();
            if(check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
