import java.util.Scanner;

class Temp
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("섭씨 온도를 입력하시오. ");
		double c_degree = s.nextDouble();
//		double f_degree = s.nextDouble();
		System.out.println("화씨 온도는 "+(c_degree*1.8+32)+"도 입니다. ");

	}
	public static void main(String[] args)
	{
		Temp t = new Temp();
		t.run();
	}
}