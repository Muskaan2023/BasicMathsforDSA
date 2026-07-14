import java.util.*;
//Brute force approach
public class GCD {
    /*public static int gcd(int n1,int n2){
        int gcd=1;
        for(int i=1;i<=Math.min(n1,n2);i++){
            if(n1%i==0 && n2%i==0){
                gcd=i;

            }
            
        }
        return gcd;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the value for n1:");
        n1=sc.nextInt();
        System.out.println("Enter the value for n2:");
        n2=sc.nextInt();
        
        
       
        
        int result=gcd(n1,n2);
        System.out.print("The number " + n1+ " and " +n2+ " gcd is: "+result);
        sc.close();


        
    }*/

//better Approach
    /*public static int gcd(int n1,int n2){
        for(int i=Math.min(n1,n2);i>0;i--){
            if(n1%i==0 && n2%i==0){
                return i;
            }

        }
        return 1;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the value for n1:");
        n1=sc.nextInt();
        System.out.println("Enter the value for n2:");
        n2=sc.nextInt();
        
        
       
        
        int result=gcd(n1,n2);
        System.out.print("The number " + n1+ " and " +n2+ " gcd is: "+result);
        sc.close();

    }
    
}*/
//optimal approach
    public static int gcd(int a,int b){
        while(a>0 && b>0){
            if(a>b) a=a%b;
            
            else b=b%a;


        }
        if(a==0) return b;
        else return a;

    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n1,n2;
        System.out.println("Enter the value for n1:");
        n1=sc.nextInt();
        System.out.println("Enter the value for n2:");
        n2=sc.nextInt();
        
        
       
        
        int result=gcd(n1,n2);
        System.out.print("The number " + n1+ " and " +n2+ " gcd is: "+result);
        sc.close();
    }
}