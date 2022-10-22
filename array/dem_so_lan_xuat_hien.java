package array;

import java.util.Scanner;

public class dem_so_lan_xuat_hien {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for(int t=1; t<=test; t++){
            int n = sc.nextInt();
            int[] a = new int[n];
            int[] b = new int[10005];
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                b[a[i]]++;
            }
            System.out.printf("Test %d:\n", t);
            for(int i=0; i<n; i++){
                if(b[a[i]] > 0){
                    System.out.printf("%d xuat hien %d lan\n", a[i], b[a[i]]);
                    b[a[i]] = 0;
                }
            }
        }
    }
}
