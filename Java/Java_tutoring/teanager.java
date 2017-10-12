import java.util.Scanner;

class Teanager
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하세요.");
		int birth_year = s.nextInt();
		int age = 2017 - birth_year + 1;

		if (age < 20){
			System.out.println("미성년자가 입니다.");
		}
		else {
			System.out.println("미성년자입니다.");
		}

	}
	public static void main(String[] args){
		Teanager t = new Teanager();
		t.run();
	}
}