package string;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class danh_dau_chu_cai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        HashSet<Character> st = new LinkedHashSet<>();
        for(int i=0; i<s.length(); i++){
            st.add(s.charAt(i));
        }
        System.out.println(st.size());
    }
}
