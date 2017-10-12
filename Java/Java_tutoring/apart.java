import java.util.Scanner;

class Apart
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적을 입력하시오. ");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area/3.305;
		System.out.print("아파트의 평형은 "+pyung_area+"입니다\n");

	}
	public static void main(String[] args){
		Apart a = new Apart();
		a.run();
	}
}