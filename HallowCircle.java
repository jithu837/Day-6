import java.util.*;
public class HallowCircle
{
    public static void main(String args[])
    {
        int a;
        int c,d;
        int e;
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        a=2*n;
        for(int i=0;i<=a;i++)
        {
            for(int j=0;j<=a;j++)
            {
                c=n-i;
                d=n-j;
                e=c*c+d*d;
                if(e<=n*n+1)
                System.out.print("*"+" ");
                else{
                    System.out.print(" "+" ");
                }
                
            }System.out.println();
        }
    }
}