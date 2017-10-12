import java.util.Scanner;

class Age
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하시오. ");
		int index = s.nextInt();
		System.out.println("당신의 나이는 "+(2017-index+1)+"살 입니다. ");
	}
	public static void main(String[] args){
		Age a = new Age();
		a.run();
	}
}