import java.util.Scanner;
public class ar
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter the size of the Array :");
        int n=S.nextInt();
        int A[]=new int[n];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter value "+(i+1)+" : ");
            A[i]=S.nextInt();
            sum+=A[i];
        }
        System.out.println("Sum of all values in the Array is : "+sum);
        System.out.println("Enter value to search frequency : ");
        int a=S.nextInt();
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a==A[i])
            {
                f+=1;
            }
        }
        System.out.println("The frequency of the given value is : "+f);
        int X[]=new int[n];
        int k=0;
        /*for(int i=0;i<n;i++)
        {
            int x=A[i];
            while(x!=X[k]&&k!=n)
            {
                k++;
            }
            X[i]=x;
            int fr=0;
            for(int j=0;j<n;j++)
            {
                if(x==A[i])
                {
                    fr+=1;
                }
            }
            System.out.println("value : "+x+" frequency : "+fr);
        }*/
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n;j++)
            {
                int temp = 0;
                if (A[j]<A[i])
                {
                    temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
            System.out.println(A[i]);
        }
    }
}
