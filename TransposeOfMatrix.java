import java.util.*;
public class TransposeOfMatrix {
    static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int m = sc.nextInt();
    int n = sc.nextInt();
    int mat [][]= new int [m][n];
    for(int i=0;i<m;i++){
        for (int j=0;j<n;j++){
            mat[i][j]=sc.nextInt();
        }
    }

}
static void transpose(int mat[][],int m , int n ){
    for (int i=0;i<m;i++){
        for (int j=0;j<n;j++){
            int temp = mat[i][j];
            mat[i][j]=mat[j][i];
            mat[j][i]=temp;
        }
    }
}
}
