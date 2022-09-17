import java.util.Scanner;
public class StackApp
{
    static int max;
    static int precedence(char c)
    {
        switch (c)
        {
            case '+':
                return 2;
            case '-':
                return 1;
            case '/':
                return 4;
            case '*':
                return 3;
        }
        return 0;
    }

    static void infix()
    {
        Stack <Character> stk= new <Character> Stack(15);
        Scanner S=new Scanner(System.in);
        System.out.println("Enter infix expression : ");
        String infix =S.nextLine(); // abcd/+*
        infix+='#';
        int i=0;
        while(infix.charAt(i)!='#')
        {
            if ((infix.charAt(i)>='a') && (infix.charAt(i)<='z'))
                System.out.print(infix.charAt(i)) ;
            else if (infix.charAt(i)==')')
            {
                while(stk.peek()!='(')
                {
                    System.out.print(stk.pop());
                }
                stk.pop();
            }
            else if ( (stk.isEmpty()) || (infix.charAt(i)=='(')|| precedence(stk.peek())<precedence(infix.charAt(i)))
                stk.push(infix.charAt(i));
            else
            {
                System.out.print(stk.pop()); stk.push(infix.charAt(i));
            }
            i++;
        }
        while(!stk.isEmpty())
        {
            System.out.print(stk.pop());
        }
    }

    public static void main(String args[]) 
    {
        Scanner S=new Scanner(System.in);
        int c;
        do
        {
            System.out.println();
            System.out.println("Enter 1 to convert infix to postfix.");
            System.out.println("Enter 2 to evaluate postfix expression.");
            System.out.println("Enter 3 to exit");
            c=S.nextInt();
            switch (c)
            {
                case 1:
                    infix();
                    break;
                case 2:
                    postfix();
                    break;
                case 3:
                    System.out.println("Exit prompt!");
                    break;
                default:
                    System.out.println("invalid input");
                    break;
            }
        }
        while(c!=3);
    }

    static void postfix()
    {
        Stack <Integer> Stk=new <Integer> Stack();
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter postfix expression using variables : ");
        String postfix=Sc.nextLine();
        for(int i=0;i<postfix.length();i++)
        {
            char c=postfix.charAt(i);
            if(c>='a'&&c<='z')
            {
                System.out.println("Enter the value of "+c+" : ");
                Stk.push(Sc.nextInt());
            }
            else if(c=='+')
            {
                Stk.push(Stk.pop()+Stk.pop());
            }
            else if(c=='-')
            {
                Stk.push(Stk.pop()-Stk.pop());
            }
            else if(c=='*')
            {
                Stk.push(Stk.pop()*Stk.pop());
            }
            else if(c=='/')
            {
                Stk.push(Stk.pop()/Stk.pop());
            }
        }
        System.out.println("Result of postfix evaluation is = "+Stk.pop());
    }
}

