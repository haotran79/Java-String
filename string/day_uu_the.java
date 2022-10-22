package string;

import java.util.Scanner;

public class day_uu_the {
    
    static boolean check(String s){
        int n = s.split("\\s+").length;
        String [] res = s.split("\\s+");
        int chan = 0; int le = 0;
        for(int i=0; i<n; i++){
            int tmp = Integer.parseInt(res[i]);
            if(tmp % 2 == 0) chan++;
            else le++;
        }
        if(n%2 == 0 && chan > le) return true;
        if(n%2 == 1 && chan < le) return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        sc.nextLine();
        while(test --> 0){
            String s = sc.nextLine();
            if(check(s)){
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
