import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
import java.io.FileReader;
public class Files
{
    public static void main(String args[])throws IOException
    {
        Scanner S=new Scanner (System.in);
        File f=new File("in.dat");
        f.createNewFile();
        FileWriter W=new FileWriter("in.dat");
        int A[]=new int[10];
        for(int i=0;i<A.length;i++)
        {
            System.out.println("Enter value "+(i+1));
            A[i]=S.nextInt();
        }
        System.out.println("Unsorted Array : ");
        for(int i=0;i<A.length;i++)
        {
            System.out.println(A[i]);
        }
        int n = A.length;
        for (int i=0;i<n-1;i++)
        {
            for (int j=0;j<n-i-1;j++)
            {
                if (A[j]>A[j + 1])
                {
                    int temp = A[j];
                    A[j] = A[j + 1];
                    A[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            W.write(A[i]);
        }
        FileReader R=new FileReader("in.dat");
        for(int i=0;i<n;i++)
        {
            Character C[]=new Character [n];
            C[i]=(char)A[i];
            System.out.println(C[i]);
        }

    }
}