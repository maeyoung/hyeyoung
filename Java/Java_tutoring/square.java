import java.util.Scanner;

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
	}
	public static void main(String[] args){
		Square s = new Square();
		s.run();
	}
}