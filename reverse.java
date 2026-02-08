import java.util.Scanner;
public class Reverse{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int rev=0;
        System.out.println("a value="+a);
        for(int n=a;n>0;n=n/10){
            int digit=n%10;
            rev=rev*10+digit;
        }
        System.out.println("reversed no is="+rev);
    }
}
