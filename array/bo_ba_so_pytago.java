package array;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class bo_ba_so_pytago {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            int n = sc.nextInt();
            ArrayList <Long> a = new ArrayList<>();
            for(int i=0; i<n; i++){
                Long x = sc.nextLong();
                a.add(x*x);
            }
            Collections.sort(a);
            
            boolean exist = false;
            for(int i=n-1; i>=0; i--){
                int l = 0, r = i;
                while(l < r){
                    if(a.get(l) + a.get(r) < a.get(i)){
                        l++;
                    } else if(a.get(l) + a.get(r) > a.get(i)){
                        r--;
                    } else {
                        exist = true;
                        break;
                    }
                }
                if(exist == true) break;
            }
            if(exist){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
