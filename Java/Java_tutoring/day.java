import java.util.Scanner;

class Day
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("날 수를 입력하세요.");
		int days = s.nextInt();
		int seconds = days * 24 * 60 *60;
		System.out.print("날수에 해당되는 시간은 모두 "+ seconds + "초 입니다.");
	}
	public static void main(String[] args){
		Day d = new Day();
		d.run();
	}
}