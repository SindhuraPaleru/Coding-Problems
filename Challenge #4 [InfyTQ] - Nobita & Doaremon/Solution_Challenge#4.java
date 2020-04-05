import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner ip=new Scanner(System.in);
        int t=ip.nextInt();
        int k;
        for(int i=0;i<t;i++)
        {
            String s=ip.next();
            StringBuilder str=new StringBuilder(s);
            for(k=1;str.length()>=k;k++)
            {
                 System.out.print(str.substring(0,k).charAt(0));
                 if(k!=1)
                     System.out.print(str.substring(0,k).charAt(k-1));
                 str.delete(0,k);
            }
            System.out.println();
        }
    }
}
