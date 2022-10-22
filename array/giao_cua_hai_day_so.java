package array;

import java.util.Scanner;

public class giao_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt();
        int [] a = new int[1001];
        int [] b = new int[1001];
        for(int i=0; i<n; i++){
            int x = sc.nextInt();
            a[x] = 1;
        }
        for(int i=0; i<m; i++){
            int x = sc.nextInt();
            b[x] = 1;
        }
        for(int i=0; i<1000; i++){
            if(a[i] == 1 && b[i] ==1) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
