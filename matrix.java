import java.util.Scanner;
class matrix
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the size of the matrix : ");
        int n=S.nextInt();
        int a[][]=new int [n][n];
        int x[][]=new int [n][n];
        int y[][]=new int [n][n];
        System.out.println("Enter the values of x : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                x[i][j]=S.nextInt();
            }
        }
        System.out.println("The matrix X : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(x[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Enter the values of y : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                y[i][j]=S.nextInt();
            }
        }
        System.out.println("The matrix Y : ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                System.out.print(y[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("The matrix A = X+Y ");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=x[i][j]+y[i][j];
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        int rs[]=new int[n],cs[]=new int[n],ds=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                rs[i]+=a[i][j];
                cs[i]+=a[j][i];
            }
        }
        System.out.println("Printing Row sum ....");
        for(int i=0;i<n;i++)
        {
            System.out.println("Sum of Row "+(i+1)+" = "+rs[i]);
        }
        System.out.println("Printing Column sum ....");
        for(int i=0;i<n;i++)
        {
            System.out.println("Sum of Column "+(i+1)+" = "+cs[i]);
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==j)
                {
                    ds+=a[i][j];
                }
            }
        }
        System.out.println("Diagonal Sum : "+ds);
        System.out.println("Printing upper triangular matrix.....");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i>j)
                {
                    System.out.print(" "+" ");
                }
                else
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
        System.out.println("Printing lower triangular matrix....");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i<j)
                {
                    System.out.print(" "+"\t");
                }
                else
                {
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}