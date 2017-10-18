package java_cora;

public class Person {
	int age;  // 초기값 0
	String name;
	private int height;
	int weight;
	public Person(int age, String name, int height, int weight) {
		super();
		this.age = age;
		this.name = name;
		setHeight(height);
		this.weight = weight;
	}
	
	public Person(int age, String name, int height) {
		super();
		this.age = age;
		this.name = name;
		this.height = height;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
