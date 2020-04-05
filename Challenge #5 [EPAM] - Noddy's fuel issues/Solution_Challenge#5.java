import java.util.*;
class Main{
    public static void main(String args[])
    {
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        int s,j,n,f,k,count;
        int i;
        int[] a,b;
        next:
        for(i=0;i<t;i++)
        {
            n=ip.nextInt();
            a=new int[n];
            b=new int[n];
            for(j=0;j<n;j++)
            {
                a[j]=ip.nextInt();
            }
            f=ip.nextInt();
            k=ip.nextInt();
            count=0;
            for(j=0;j<n;j++)
            {
               if(a[j]<=k&&a[j]>0)
               {
                   b[count]=a[j];
                   count++;
               }
            }
            long pow = (long)Math.pow(2, count);
            for(int counter = 0; counter < pow; counter++) 
    		{ 
                s=0;
      			for(j = 0; j < count; j++) 
       			{ 
          			if((counter & (1 << j)) > 0) 
                    {
                        s+=b[j];
                    }
            
       			} 
       			if(s==f)
                {
                    System.out.println("Yes");
                    continue next;
                    
                }
    		}
            System.out.println("No");
        }
    }
}
