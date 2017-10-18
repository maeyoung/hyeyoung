package java_practice;
import java.util.Scanner;
import java.util.InputMismatchException;

public class number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int num = 0;
		int max_num = 0;
		int min_num = 100;
		do {
			System.out.print("0부터 100사이의 정수를 입력: ");
			try {
				num = s.nextInt();  // 정수 입력 
				}
				catch(InputMismatchException e) { 
					System.out.println("정수가 아닙니다. 다시 입력하세요!");
					s.next();  // 입력 스트림에 있는 정수가 아닌 토큰을 버린다.
					continue; // 다음 루프
				}
			
			if (num < 0 || num > 100) {
				break;
			}
			if (num > max_num){
				max_num = num;
			}
			if (num < min_num){
				min_num = num;
			}
		} while (num >= 0 && num <= 100);
		System.out.println("입력된 숫자들 중 가장 큰수는" + max_num+ "이고, 가장 작은 수는" +min_num +"입니다.");
		s.close();
	
	}
	


}
