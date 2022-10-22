package array;

import java.util.Scanner;

public class so_xa_cach {
    
    static int x[] = new int[100];
    static int n;
    static boolean [] unused = new boolean[100];
    
    static void init(){
        for(int i=1; i<100; i++){
            unused[i] = true;
        }
    }
    
    static boolean check(){
        for(int i=2; i<=n; i++){
            if(Math.abs(x[i-1] - x[i]) == 1)
                return false;
        }
        return true;
    }
    
    static void display(){
        if(check()){
            for(int i=1; i<=n; i++){
                System.out.print(x[i]);
            }
            System.out.println();
        }
    }
    
    
    static void Try(int i){
        for(int j=1; j<=n; j++){
            if(unused[j]){
                x[i] = j;
                unused[j] = false;
                if(i == n) display();
                else Try(i+1);
                unused[j] = true;
            }
        }
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            init();
            n = sc.nextInt();
            Try(1);
        }
    }
}
