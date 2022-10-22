package array;

import java.util.Scanner;

public class mang_doi_xung {
    
    static boolean check(int a[], int n){
        for(int i=0; i<n/2; i++){
            if(a[i] != a[n-i-1])
                return false;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            int n = sc.nextInt();
            int [] a = new int[n];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }
            if(check(a, n)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
