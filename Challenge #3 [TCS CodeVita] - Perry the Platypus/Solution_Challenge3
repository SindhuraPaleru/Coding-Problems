import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        int n1,n2;
        int i,j,h;
        for(h=0;h<t;h++)
        {
            n1=ip.nextInt();
        	n2=ip.nextInt();
        	int[][] a=new int[n1][n2];
        	int[] b=new int[n1];
    
            for(i=0;i<n1;i++)
        	{
            	for(j=0;j<n2;j++)
            	{
                	a[i][j]=ip.nextInt();
                    
            	}
        	}
       		int k=-1;
        	for(i=n1-1,j=0;i>=0&&j<n1;i=i-2,j++)
        	{
                ++k;
                b[k]=a[i][j];
        	}
            
        	for(i=2,j=(n2/2)+1;i<n1&&j<n2;i=i+2,j++)
        	{
                ++k;
                b[k]=a[i][j];
        	}
        	
        
       		for(i=0;i<n1;i++)
        	{
            	System.out.print((char)((b[i]%26)+96));
        	}
            System.out.println();
        }
    }
}




