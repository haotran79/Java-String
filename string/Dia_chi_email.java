package string;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Dia_chi_email {
    
    static String convert(String s){
        String [] data = s.trim().toLowerCase().split("\\s+");
        String res = "";
        int n = data.length;
        res += data[n-1];
        for(int i=0; i<n-1; i++){
            res += data[i].charAt(0);
        }
        return res;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        Map<String, Integer>  map = new LinkedHashMap<>();
        sc.nextLine();
        while(test --> 0){
            String s = sc.nextLine();
            s = convert(s);
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
