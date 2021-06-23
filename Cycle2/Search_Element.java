import java.util.Scanner;
public class Search_Element
{
    public static void main(String[] args) 
    {
        int n,i, flag = 0;
        String item;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        String a[] = new String[n];
        Scanner s2=new Scanner(System.in);

        System.out.println("Enter all the elements:");
        for(i = 0; i < n; i++)
        {
            a[i] = s2.nextLine();
        }

        System.out.print("Enter the string you want to find:");
        item = s2.nextLine();

        for(i = 0; i < n; i++)
        {
            if(a[i].equals(item))
            {
                flag = 1;
                break;
            }
        }
        if(flag == 1)
        {
            System.out.println("Element found at position:"+(i + 1));
        }
        else
        {
            System.out.println("Element not found");
        }
    }
}