import java.util.*;
public class primeNum {
    public static boolean prime(int n){
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                cnt++;
            }

        }
        return cnt==2;
    }
    public static void main(String[]args){
        


        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        boolean res=prime(n);
        if(res) System.out.print("The number "+ n+" is a Prime number ");
        else  System.out.print("The number "+ n +" is  not a Prime number ");
        sc.close();
    }
    
}
