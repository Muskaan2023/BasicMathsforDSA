import java.util.*;
// brute force method
/*public class CountDigit  
    private static void digit(int num){
    int count=0;
    
    while(num>0){
        num=num/10;
        count+=1;
        
    }
    System.out.print("The number of digit is:"+ count);
    
}
	public static void main(String[] args) {
	    System.out.print("Enter the number:");
	    Scanner sc=new Scanner(System.in);
	  
	    int num=sc.nextInt();
	    CountDigit.digit(num);
        sc.close();
		
	}
}*/
//optimal method
public class CountDigit{
    private static void digit(int num){
        if(num==0){
            System.out.print("Digit:1");
        }
        else {int digit=(int)Math.log10(Math.abs(num))+1;
            System.out.print("Digit:"+digit);
        }


    }
    public static void main(String[]args){
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        CountDigit.digit(num);
        sc.close();

    }
}

