package java_practice;

import java.util.Scanner;

public class Prac_A {

	public static void main(String[] args){
//		Age a = new Age();
//		a.run();
//		Temp t = new Temp();
//		t.run();
//		Square s = new Square();
//		s.run();
//		Apart ap = new Apart();
//		ap.run();
//		Day d = new Day();
//		d.run();
//		Score sc = new Score();
//		sc.run();
		File f = new File();
		f.run();
	}
}

class Age
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("태어난 년도를 입력하시오. ");
		int index = s.nextInt();
		System.out.println("당신의 나이는 "+(2017-index+1)+"살 입니다. ");
		
		s.close();
	}
}

class Temp
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("섭씨 온도를 입력하시오. ");
		double c_degree = s.nextDouble();
//		double f_degree = s.nextDouble();
		System.out.println("화씨 온도는 "+(c_degree*1.8+32)+"도 입니다. ");
		
		s.close();

	}
}

class Square
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("직사각형의 가로 크기를 입력하시오. ");
		int width = s.nextInt();
		System.out.print("직사각형의 세로 크기를 입력하시오. ");
		int height = s.nextInt();
		int area = width * height;
		System.out.print("직사각형의 넓이는 "+area+"입니다.\n");
		
		s.close();
	}
}

class Apart
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("아파트의 분양 면적을 입력하시오. ");
		double m2_area = s.nextDouble();
		double pyung_area = m2_area/3.305;
		System.out.format("아파트의 평형은 %.1f입니다\n", pyung_area);
		
		s.close();

	}
}	

class Day
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("날 수를 입력하세요.");
		int days = s.nextInt();
		int seconds = days * 24 * 60 *60;
		System.out.print("날수에 해당되는 시간은 모두 "+ seconds + "초 입니다.");
		
		s.close();
	}
}

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
		System.out.format("평균은 %.1f 입니다.\n",average);
		
		s.close();
	}
}

class File
{
	void run(){
		Scanner s = new Scanner(System.in);
		System.out.print("파일 용량을 기가바이트 단위로 입력하세요.");
		int gigabytes = s.nextInt();
		int megabytes = gigabytes * 1024;
		int kilobytes = megabytes * 1024;
		long bytes = kilobytes * 1024;
		System.out.println("입력하신 파일 용량은 \n"+megabytes+" 메가바이트,\n"+kilobytes+" 킬로바이트,\n"+bytes+" 바이트 입니다.");

		s.close();

	}
}	







