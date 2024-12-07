import java.util.*;
public class HallowiPattern
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        if(n%2==0)
        n-=1;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 ||  j==n/2 || i==n-1)
                System.out.print("*"+" ");
                else{
                    System.out.print(" "+" ");
                }
                
            }System.out.println();
        }
    }
}