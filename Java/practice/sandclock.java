package java_practice;

import java.util.Scanner;

public class sandclock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("짝수입력: ");
		int N = s.nextInt();
		while(true) {
			if (N % 2 == 0) {
				break;
			}
			else {
				System.out.print("홀수를 입력하셨습니다. 다시 입력해주세요. ");
				N = s.nextInt();
				continue;
			}
		}
		int num = N+1;
		for(int i=0;i<N/2;i++){
			for(int j=0;j<i;j++){
				System.out.print(" ");
			}
			for(int k=0;k<num-2;k++){
				System.out.print("*");
			}
			num -= 2;
			System.out.println( );
		}
		int num2 = N/2-1;
		for(int n=N/2;n<N;n++){
			for(int l=1;l<=num2;l++){
				System.out.print(" ");
			}
			for(int m=0;m<num;m++){
				System.out.print("*");
			}
			num += 2;
			num2 -= 1;
			System.out.println( );
		}
		s.close();

	}

}
