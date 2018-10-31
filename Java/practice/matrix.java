package java_practice;
import java.util.Scanner;

public class matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int arrayA[][] = new int[3][3];
		int arrayB[][] = new int[3][3];
		System.out.print("첫째 행렬 입력: ");
		for(int i=0;i<3;i++) {
			for(int j=0;j<3;j++) {
				arrayA[i][j] = s.nextInt();
			}
		}
		System.out.print("둘째 행렬 입력: ");
		for(int l=0;l<3;l++) {
			for(int m=0;m<3;m++) {
				arrayB[l][m] = s.nextInt();
			}
		}
		int arrayM[][] = new int[3][3];
		for(int k=0;k<3;k++) {
			for(int n=0;n<3;n++) {
				arrayM[k][n]=arrayA[k][0]*arrayB[0][n] + arrayA[k][1]*arrayB[1][n] + arrayA[k][2]*arrayB[2][n]; 
			} 
		}
		
		System.out.println("첫째 행렬: ");
		for(int i=0;i<3;i++) {
			if (i >= 0 && i <= 3) {
				for(int j=0;j<3;j++) {
					System.out.print(arrayA[i][j]+"\t");
				}
				System.out.println( );
			}	
			else if (i > 3 && i <= 6) {
				for(int j=0;j<3;j++) {
					System.out.print(arrayA[i][j]+"\t");
				}
			System.out.println( );
			}
			else {
				for(int j=0;j<3;j++) {
					System.out.print(arrayA[i][j]+"\t");
				}
			}
		}
		
		System.out.println("둘째 행: ");
		for(int k=0;k<3;k++) {
			if (k >= 0 && k <= 3) {
				for(int n=0;n<3;n++) {
					System.out.print(arrayB[k][n]+"\t");
				}
				System.out.println( );
			}	
			else if (k > 3 && k <= 6) {
				for(int n=0;n<3;n++) {
					System.out.print(arrayB[k][n]+"\t");
				}
			System.out.println( );
			}
			else {
				for(int n=0;n<3;n++) {
					System.out.print(arrayB[k][n]+"\t");
				}
			}
		}
		
		System.out.println("두 행렬의 곱: ");
		for(int k=0;k<3;k++) {
			if (k >= 0 && k <= 3) {
				for(int n=0;n<3;n++) {
					System.out.print(arrayM[k][n]+"\t");
				}
				System.out.println( );
			}	
			else if (k > 3 && k <= 6) {
				for(int n=0;n<3;n++) {
					System.out.print(arrayM[k][n]+"\t");
				}
			System.out.println( );
			}
			else {
				for(int n=0;n<3;n++) {
					System.out.print(arrayM[k][n]+"\t");
				}
			}
		}
		s.close();
		
	}

}
