import java.util.Scanner;
public class SymmetricMatrix_5
{
   public static void main(String args[])
   {
       int t = 0;
       Scanner s = new Scanner(System.in);
       System.out.println("Number of rows of Matrix:");
       int m = s.nextInt();
       System.out.println("Number of columns of Matrix:");
       int n = s.nextInt();
       int  a[][] = new int[m][n];
       System.out.println("Enter elements of The Matrix:");
       for(int i =0;i < m;i++){
           for(int j = 0;j<n;j++){
               a[i][j] = s.nextInt();
           }
       }
       System.out.println("The Matrix is:");
       for(int i =0;i < m;i++){
           for(int j = 0;j<n;j++){
               System.out.print(a[i][j]+"\t") ;
           }
          System.out.println(" ");
       }
       if(m != n)
          System.out.println("Matrix is not a Squre matrix");
       else{
          for(int i=0; i < m; i++){
              for(int j = 0;j < n; j++){
                  if(a[i][j] != a[j][i])
                     t = 1;
               }
           }       
          if(t == 1)
              System.out.println("Matrix is not Symmetric");
          else
              System.out.println("Matrix is Symmetric"); 
       }
   }
}

