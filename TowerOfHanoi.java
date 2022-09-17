import java.util.Scanner;
public class TowerOfHanoi 
{
    private static Stack[] tower; 
    public static void towerOfHanoi(int n) 
    {
        tower = new Stack[4];
        for (int i = 0; i <= 3; i++)
        {
            tower[i] = new Stack(10);
        }
        for (int d = n; d > 0; d--)
        {
            tower[1].push(new Integer(d)); 
        }
        showTowerStates(n, 1, 2, 3);
    }
    public static void showTowerStates(int n, int x, int y, int z) 
    {
        if (n > 0) 
        {
                showTowerStates(n - 1, x, z, y);
                Integer d=(Integer)tower[x].pop();
                tower[y].push(d); 
                System.out.println("Move disk " + d + " from tower "+ x + " to tower " + y);
                showTowerStates(n - 1, z, y, x);
        }
    }
    public static void main(String[] args) 
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter number of disks : ");
        towerOfHanoi(S.nextInt());
    }
}