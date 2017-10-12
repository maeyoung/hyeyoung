import java.util.Scanner;

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
			System.out.format("변환된 온도는 %.1f\n입니다.\n", out_degree);
		}
		else {
			double output_degree = (input_degree - 32) / 1.8;
			System.out.format("변환된 온도는 %.1f\n입니다.\n", out_degree);
		}
	}
	public static void main(String[] args){
		Tempif t = new Tempif();
		t.run();
	}
}