import java.util.Scanner;

class Score
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("국어 점수를 입력하세요. ");
		int kor = s.nextInt();
		System.out.print("영어 점수를 입력하세요. ");
		int eng = s.nextInt();
		System.out.print("수학 점수를 입력하세요. ");
		int math = s.nextInt();
		int total = kor+eng+math;
		double average = total/3.0;
		System.out.print("입력하신 점수의 총점은 "+total+"이고,\n");
		System.out.print("평균은 "+ average +" 입니다.\n");


	}
	public static void main(String[] args){
		Score s = new Score();
		s.run();
	}
}