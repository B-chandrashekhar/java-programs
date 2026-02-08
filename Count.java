import java.util.Scanner;
public class Count{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("a value="+a);
        int count=0;
        if(a==0){
            count=1;
        }else{
        for(int n=a;n>0;n=n/10){
            count=count+1;
        }
    }
        System.out.println("the no of elements="+count);
        
    }}
