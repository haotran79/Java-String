package array;

import java.util.Scanner;

public class diem_can_bang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        while(test --> 0){
            int n = sc.nextInt();
            int a[] = new int[n];
            int sum = 0;
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
                sum += a[i];
            }
            if(n == 1){
                System.out.println("1");
            } else {
                boolean ok = false;
                int sumTmp = 0;
                int pos = -1;
                for(int i=1; i<n-1; i++){
                    sumTmp += a[i-1];
                    if((sum - a[i]) % 2 == 0 && sumTmp == (sum-a[i])/2){
                        ok = true;
                        pos = i+1;
                        break;
                    }
                }
                if(ok){
                    System.out.println(pos);
                } else {
                    System.out.println(pos);
                }
            }
        }
    }
}
