package karabomasimula.question9;

public class Person {
	
	private String name;
	private int age;
	
	// Use to get number of instances present
	private static int count = 0;

	
	public Person(String name, int age) {
		count ++;
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	// Use to get number of instances present
	public static int getCount() {
		return count;
	}
	
}
