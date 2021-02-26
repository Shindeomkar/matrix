package twodarrays;

public class Rotateanticlockwiseby90 {
    static void rorate(int arr[][])
    {

        int temp[][]=new int[3][3];
        for (int i=0;i< arr.length;i++)
        {
            for (int j=0;j< arr[i].length;j++)
            {
            temp[arr[i].length-1-j][i]=arr[i][j];
            }

        }
        for (int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = temp[i][j];
            }
        }
        for (int i=0;i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        rorate(arr);
    }
}
