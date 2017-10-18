package java_practice;

import java.util.Scanner;

public class Prac_B {
	
	public static void main(String argv[]) {
//		Teanager t = new Teanager();
//		t.run();
		Tempif t2 = new Tempif();
		t2.run();
	}

}

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
		s.close();
	}
}	

class Tempif
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("온도를 입력하세요.");
		double input_degree = s.nextDouble();
		System.out.print("입력하신 온도가 섭씨온도이면 C 를, 화씨온도이면 F 를 입력하세요.");
		String kind = s.next();


		if (kind.equals("C")){
			double output_degree = input_degree * 1.8 + 32;
			System.out.format("변환된 온도는 %.1f 입니다.\n", output_degree);
		}
		else {
			double output_degree = (input_degree - 32) / 1.8;
			System.out.format("변환된 온도는 %.1f 입니다.\n", output_degree);
		}
		s.close();
	}
}	









