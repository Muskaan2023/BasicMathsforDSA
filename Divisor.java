import java.util.*;
// brute force approach
public class Divisor {
    /*  public static void divisor(int n){
        
        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                
            }

        }
        
    }
    public static void main(String[]args){
        


        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Divisor.divisor(n);
    
        sc.close();
    }*/

//optimal approach
     public List<Integer> divisor(int n){
        List<Integer> l=new ArrayList<>();
        
        for(int i=1;i*i<=n;i++){
            if(n%i==0){
                l.add(i);
                if(i!=n/i) l.add(n/i);
                
            }

        }
        return l;
        
    }
    public static void main(String[]args){
        


        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Divisor d= new Divisor();
        List<Integer> res= d.divisor(n);
        System.out.print("Divisor of "+n+" : ");
        for(int val: res){
            System.out.print(val+" ");

        }
        System.out.println();
    
        sc.close();
    }
    
}
