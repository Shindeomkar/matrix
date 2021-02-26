package twodarrays;

public class BoundryTraversal {
    static void boundryTraversal(int arr[][])
    {
        int r= arr.length;
        for (int i=0;i<r;i++)
        {
            int c= arr[i].length;
            if (i==0) {
                for (int j = 0; j < c; j++)
                    System.out.print(arr[i][j] + " ");
            }
            else
                System.out.print(arr[i][c-1]+" ");
        }
        for (int i= arr.length-1;i>0;i--)
        {
            if(i== arr.length-1)
            {
                for (int j= arr.length-2;j>=0;j--)
                {
                    System.out.print(arr[i][j]+" ");
                }
            }
            else
                System.out.print(arr[i][0]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        boundryTraversal(arr);
    }
}
