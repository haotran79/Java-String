package string;

import java.util.*;

public class test {
    static String standard(String s){
        String data[] = s.trim().toLowerCase().split("\\s+");
        int n = data.length;
        String res = data[n-1];
        for(int i=0; i<n-1; i++){
            res += data[i].charAt(0);
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        Map <String, Integer> map = new LinkedHashMap<>();
        sc.nextLine();
        while(test --> 0){
            String s = sc.nextLine();
            s = standard(s);
            if(!map.containsKey(s)){
                System.out.println(s + "@ptit.edu.vn");
                map.put(s, 1);
            } else {
                int tmp = map.get(s) + 1;
                System.out.println(s + tmp + "@ptit.edu.vn");
                map.put(s, tmp);
            }
        }
    }
}

//4
//    nGUYEn    quaNG   vInH  
//   tRan   thi THU    huOnG
//   nGO   quoC  VINH
// lE            tuAn    aNH
