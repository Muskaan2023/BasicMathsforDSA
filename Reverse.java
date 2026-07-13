import java.util.*;
public class Reverse {
    private static void reverse(int num){
        int revNum=0;
        while(num>0){
            int Lastdigit=num%10;
            revNum=revNum*10+Lastdigit;
            num=num/10;
        }
        System.out.println(revNum);
    }
    public static void main(String[]args){
        System.out.print("Enter the number num:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Reverse.reverse(num);
        sc.close();

    }
    
}
