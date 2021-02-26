package twodarrays;

public class SnakePattern {
    static void snakePattern(int arr[][])
    {
        int r= arr.length;


        for (int i=0;i<r;i++)
        {
            int c=arr[i].length;
            if (i%2==0)
            {
                for (int j=0;j<c;j++)
                    System.out.print(arr[i][j]+" ");
            }
            else
            {
                for (int j=c-1;j>=0;j--)
                    System.out.print
                            (arr[i][j]+" ");
            }
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        snakePattern(arr);
    }
}
