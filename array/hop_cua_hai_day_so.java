package array;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class hop_cua_hai_day_so {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int [] a = new int[n];
        int [] b = new int[m];
        HashSet<Integer> st = new LinkedHashSet<>();
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
            st.add(a[i]);
        }
        for(int i=0; i<m; i++){
            b[i] = sc.nextInt();
            st.add(b[i]);
        }
        for(int i: st){
            System.out.print(i + " ");
        }
    }
}
