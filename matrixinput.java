import java.util.*;
public class matrixinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of rows :");
        int m = sc.nextInt();
        System.out.println("Enter no of columns :");
        int n = sc.nextInt();
        int mat [][] = new int [m][n];
        System.out.println("Enter the elements");
        for (int i =0;i<m;i++){
            for (int j=0;j<n;j++){
                mat[i][j]=sc.nextInt();
            }
        }
        
    }
}
