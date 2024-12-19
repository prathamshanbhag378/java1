import java.util.Scanner;
public class T1 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        int n1=sc1.nextInt();
        int[][] mat1=new int[n1][n1];
        int[][] mat2=new int[n1][n1];
        System.out.println("Enter the elements of first matrix:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                mat1[i][j]=sc1.nextInt();
            }
        }
        System.out.println("Enter the elements of second matrix:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                mat2[i][j]=sc1.nextInt();
            }
        }
        int[][] mat3=new int[n1][n1];
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                mat3[i][j]=mat1[i][j]+mat2[i][j];
            }
        }
        System.out.println("The sum of the matrices are:");
        for(int i=0;i<n1;i++){
            for(int j=0;j<n1;j++){
                System.out.print(mat3[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
