import java.util.Scanner;
public class College1 {
    public static void main(String[] args) {
        int age=20;
        double price=19.99;
        char grade='A';
        boolean isactive=true;
        System.out.println("age="+age);
        System.out.println("price="+price);
        System.out.println("grade="+grade);
        Scanner sc=new Scanner (System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("value of a=" +a);
        System.out.println("value of b=" +b);
        System.out.println("sum="+(a+b));
        System.out.println("hello world");
    }
    
}
