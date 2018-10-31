import java.util.Scanner;

class Test
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("사과의 개수는 몇 개입니까?");
		int index = s.nextInt();
		System.out.println("입력하신 사과의 개수는 "+index+" 입니다.");
	}
	public static void main(String[] args){
		Test t = new Test();
		t.run();
	}
}