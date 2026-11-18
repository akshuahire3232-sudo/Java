import java.util.*;
class Matrix
{
    int n , i , j ,a[][], b[][] ,c[][] , transpose[][];

    Scanner sc = new Scanner(System.in);
    Matrix()
    {
        
        System.out.println("Enter a Size of MAtrix :");
        n = sc.nextInt();

        if(n <= 0 || n > 10)
        {
            System.out.println("Invalid Matrix Size !");
            return;

        }

        a = new int[n][n];
        b = new int[n][n];
        c = new int[n][n];
        transpose = new int[n][n];

        System.out.println("Enter a First Matrix Elements:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                a[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter a Second Matrix Elements:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                b[i][j] = sc.nextInt();
            }
        }
    }
    void Display()
    {
        System.out.println("First Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(a[i][j]);
            }
        }

        System.out.println("Second Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(b[i][j]);
            }
        }
    }
    void Addition()
    {
        
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
               c[i][j] = a[i][j] + b[i][j];
            }
        }


        System.out.println("<---Addition of Two Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(c[i][j]+"\t");
            }
        }
        
    }
    void Multiplication()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                c[i][j] = 0;

                for(int k=0;k<n;k++)
                {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
               
            }
        }


        System.out.println("<---Multiplication of Two Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(c[i][j]+"\t");
            }
        }
    }

    void Transpose()
    {
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
               transpose[j][i] =  c[i][j];
            }
        }

        System.out.println("<---Transpose  Matrix:");
        for(i=0;i<n;i++)
        {
            for(j=0;j<n;j++)
            {
                System.out.println(transpose[i][j]+"\t");
            }
        }

    }

    void RowSum()
    {
        System.out.println("Row wise Addition of Matrix A:");
        for(i=0;i<n;i++)
        {
           int  sum = 0;

            for(j=0;j<n;j++)
            {
                sum = sum + a[i][j]; 
            }
             System.out.println("Row " + (i+1) + " Sum = " + sum);
        }
       
    }

    void ColumnSum()
{
    System.out.println("\nColumn-wise Sum of Matrix A:");

    for(j=0; j<n; j++)
    {
        int sum = 0;

        for(i=0; i<n; i++)
        {
            sum = sum + a[i][j];
        }

        System.out.println("Column " + (j+1) + " Sum = " + sum);
    }
}
    public static void main(String args[])
    {
        Matrix m = new Matrix();

        m.Display();
        m.Addition();
        m.Multiplication();
        m.Transpose();
        m.RowSum();
        m.ColumnSum();
    }
}
