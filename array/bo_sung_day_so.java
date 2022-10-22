package array;

import java.util.Scanner;

public class bo_sung_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int[] flag = new int[205];
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            flag[a[i]] = 1;
        }
        boolean ok = true;
        for(int i=1; i<a[n-1]; i++){
            if(flag[i] == 0){
                System.out.println(i + " ");
                ok = false;
            }
        }
        if(ok == true){
            System.out.println("Excellent!");
        }
    }
}
