import java.util.Scanner;
public class frequency
{
    public static void main(String args[])
    {
        Scanner S=new Scanner (System.in);
        System.out.println("Enter size of matrix : ");
        int n=S.nextInt();
        int a[][]=new int [n][n];
        System.out.println("Enter the values : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=S.nextInt();
            }
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int val=0,fre=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
               val=a[i][j];
               for(int x=0;x<n;x++)
               {
                   for(int y=0;y<n;y++)
                   {
                       if(val==a[x][y])
                       fre++;
                   }
               }
               System.out.println("Frequency of "+val+" = "+fre);
               fre=0;
            }
        }
    }
}