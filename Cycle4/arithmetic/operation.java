package arithmetic;
import java.util.*;
public class operation {
                public static void main(String []args)
                {
                        Scanner sc=new Scanner(System.in);
                        System.out.println("Enter The 1st number ");
                        int c=sc.nextInt();
                        System.out.println("Enter The 2nd number ");
                        int d=sc.nextInt();
                        Arithmetopr m=new Arithmetopr(c,d);
                        System.out.println("Addition of 2 numbers" + m.add());
                        System.out.println("Division of 2 numbers" + m.div());
                        System.out.println("sub of 2 numbers" + m.sub());
                        System.out.println("Multiplecation of 2 numbers" + m.mul());
        }
}
