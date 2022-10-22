package array;

import java.util.Scanner;

public class boi_so_nho_nhat_cua_n_so_nguyen_duong_dau_tien {
    
    static long gcd(long a, long b){
        if(b == 0) return a;
        return gcd(b, a%b);
    }
    
    static long bcnn(long a, long b){
        return a*b / gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            int n = sc.nextInt();
            long res = 1;
            for(int i=1; i<=n; i++){
                res = bcnn(i, res);
            }
            System.out.println(res);
        }
    }
}
