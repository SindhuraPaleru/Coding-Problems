import java.lang.*;
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int i=ip.nextInt();
        int k;
        int n;
        int a[];
        for(int j=0;j<i;j++)
        {
            n=ip.nextInt();
            a=new int[n];
            for(k=0;k<n;k++)
            {
                a[k]=ip.nextInt();
            }
            for(k=0;k<n;k++)
            {
                if(a[k]==-1)
                {
                    if(Math.abs(a[k-1]-a[k+1])%2==0)
                    {
                        a[k]=Math.abs(a[k-1]-a[k+1]);
                    }
                    else
                    {
                        a[k]=(int)Math.floor((a[k-1]+a[k+1])/2);
                    }
                }
            }
            for(k=0;k<n;k++)
            {
                if(a[k]!=1&&k!=n-1)
                {
                    a[k]=a[k]-1;
                }
                System.out.print(a[k]);
            }
            System.out.println();
        }
    }
}


