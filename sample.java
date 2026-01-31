import java.util.Scanner;
public class sample{
    public static void main(String args[]){
        System.out.println("enter a value:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("enter b value:");
        float b=sc.nextFloat();
        System.out.println("enter c value:");
        String c=sc.next();
        System.out.println("enter d value:");
        double d=sc.nextDouble();
        System.out.println("a:"+a);
        System.out.println("b:"+b);
        System.out.println("c:"+c);
        System.out.println("d:"+d);
    }
}