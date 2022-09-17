import java.util.Scanner;
public class Paranthesis 
{
    public static void main(String[] args) 
    {
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the sequence of paranthesis : ");
        String S=Sc.nextLine();
        S+='#';
        Stack <Character> stk= new Stack<Character>();
        char c;
        char cc='a';
        int i=0;
        while(S.charAt(i)!='#')
        {
            if (S.charAt(i)=='{' || S.charAt(i)=='(' || S.charAt(i)=='[' )
                stk.push(S.charAt(i));

            else if (S.charAt(i)=='}' || S.charAt(i)==')' || S.charAt(i)==']' )
            {
                c=stk.pop();
                switch(c)
                { case '{' : cc='}';break;
                    case '[': cc=']'; break;
                    case '(': cc=')'; break;

                }
                if (cc!=S.charAt(i))
                    break;
            }
            i++;
        }
        if (i!=S.length()-1)
            System.out.println("Sequence is not correct");
        else
            System.out.println("Sequence is correct");
    }
}