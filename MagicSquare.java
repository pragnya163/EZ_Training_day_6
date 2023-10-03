import java.util.*;
import java.io.*;
class MagicSquare
{
    static void square(int n)
    {
        int[][] magic=new int[n][n];
        int i=n/2;
        int j=n-1;
        for(int num=1;num<=n*n;)
        {
            if(i==-1 && j==n)
            {
                j=n-2;
                i=0;
            }
            else
            {
                if(j==n)
                {
                     j=0;
                }
                if(i<0)
                {
                    i=n-1;
                }
            }
            if(magic[i][j]!=0)
            {
                j=j-2;
                i++;
                continue;
            }
            else
            {
                magic[i][j]=num++;
            }
            j++;
            i--;
        }
        System.out.println("magic square" + n+":");
        System.out.println("sum of each row, column and diagnols "+n*(n*n+1)/2);
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                 System.out.print(magic[i][j] + " ");
            }
            System.out.println();
         }
         
    }
         public static void main(String[] args)
         {
            int n;
            Scanner sc=new Scanner(System.in);
            System.out.println("enter n value:");
             n=sc.nextInt();
             if(n%2!=0)
             {
                square(n);
             }
             else
             {
                 System.out.println("enter odd number only for magic square");
             }
             sc.close();
         }
    }
