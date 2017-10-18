package java_cora;

public class Student extends Person {  // extends : 상속 

	int degree;
	
	public Student(int age, String name, int height, int weight, int degree) {
		super(age, name, height, weight);  // 상위클래스 찾아가는거 
		this.degree = degree;

	}

}
