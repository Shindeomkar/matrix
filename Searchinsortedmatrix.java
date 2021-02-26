package twodarrays;

public class Searchinsortedmatrix {
    static void searchinMat(int mat[][],int x)
    {
        int i=0,j=3;
        while((i<4)&&(j>=0))
        {
            if(mat[i][j]==x)
            {
                System.out.println(i+" "+j);
                return;

            }
            else if (x<mat[i][j])
                j--;
            else
                i++;
        }
        System.out.println("not found");

    }
    public static void main(String[] args) {
        int mat[][]={{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        int x=10;
        searchinMat(mat,x);
    }
}
