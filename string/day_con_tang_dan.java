package string;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class day_con_tang_dan {
    
    static int n;
    static int [] a = new int[100];
    static String res = "";
    static ArrayList<String> result = new ArrayList<>();
    
    static void Try(int i){
        if(i >= n) return;
        
        for(int j=i+1; j<=n; j++){
            if(a[j] < a[i]) continue;
            String tmp = res;
            res += a[j] + " ";
            if(res.split("\\s+").length > 1)
                result.add(res);
            Try(j);
            res = tmp;
        }
    }
    
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        a[0] = 0;
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            a[i] = sc.nextInt();
        }
        Try(0);
        Collections.sort(result);
        for(String i: result){
            System.out.println(i);
        }
    }
}
