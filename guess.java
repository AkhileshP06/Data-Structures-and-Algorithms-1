import java.util.Scanner;
import java.util.Random;
class guess
{
    public static void main(String args[])
    {
        Scanner S=new Scanner(System.in);
        Random R=new Random();
        int num=R.nextInt(101);
        int k=0;
        int n;
        while(k>=0)
        {
            System.out.println("Enter a number : ");
            n=S.nextInt();
            if(n==num)
            {
                System.out.println("Guess is correct !");
                break;
            }
            else if(n>num)
            {
                System.out.println("Number entered is greater than the number to be guessed");
                System.out.println("Try a lower number");
            }
            else
            {
                System.out.println("Number entered is lesser than the number to be guessed");
                System.out.println("Try a higher number");
            }
            k++;
        }
        System.out.println("Number of guesses : "+k);
    }
}