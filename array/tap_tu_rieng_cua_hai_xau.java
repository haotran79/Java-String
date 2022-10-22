package array;

import java.util.HashSet;
import java.util.Scanner;

public class tap_tu_rieng_cua_hai_xau {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test --> 0){
            String a[] = sc.nextLine().split("\\s+");
            String b = sc.nextLine();
            HashSet<String> st = new HashSet<>();
            for(String i: a){
                if(!b.contains(i)){
                    st.add(i);
                }
            }
            for(String i: st){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}
