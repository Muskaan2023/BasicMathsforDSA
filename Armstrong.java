import java.util.Scanner;

public class Armstrong {
    public static boolean armstrong(int n){
    int k=0;
    int temp=n;
    int original=n;
    int sum=0;
    
    while(temp!=0){
        temp=temp/10;
        k+=1;
        
    }
    temp=n;
    while(temp!=0){
        int ld=temp%10;
        sum+=Math.pow(ld,k);
        temp/=10;

    }
    if(sum==original) return true;
    else return false;
    }
    public static void main(String[] args) {
	    System.out.print("Enter the number:");
	    Scanner sc=new Scanner(System.in);
	  
	    int num=sc.nextInt();
	    boolean res=Armstrong.armstrong(num);
        System.out.print(res);
        
        sc.close();
		
	}
    
}
