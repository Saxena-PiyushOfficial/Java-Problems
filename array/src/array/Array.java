package array;
public class Array {
   
    public static void main(String[] args) 
    {
        int i,j;
        int A[][]={{11,12,13},{14,15,16},{17,18,19}};
        int B[][]={{1,2,3},{4,5,6},{7,8,9}};
        int sum[][]=new int[3][3];
        for(i=0;i<A.length;i++)
        {
            for(j=0;j<A[0].length;j++)
            {
                sum[i][j]=A[i][j]+B[i][j];
                System.out.print(sum[i][j]+" ");
                
            }
            System.out.print("\n");
        }
    }
}
