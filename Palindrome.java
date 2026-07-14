import java.util.*;
public class Palindrome{
    private static void palindrome(int num){
        int rem=0;
        int original=num;
        while(num>0){
        int Lastdigit=num%10;
        rem=rem*10+Lastdigit;
        num=num/10;
        }
        if(rem==original){
            System.out.print("The number is palindrome.");

        }
        else{
            System.out.print("The number is not a Palindrome");
        }

    }
    public static void main(String[]args){
        System.out.print("Enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Palindrome.palindrome(num);
        sc.close();
    }
}