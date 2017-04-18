package person;

public class Student extends Person {
	private String major;
	

	public Student(){
		System.out.println("Student() called");
	}
	public Student(String major){
		System.out.println("Student(String major) called");
		this.major=major;
	}
	public Student(String name, String major){
		//부모 생성자 명시적으로 어떤것 호출할지 서술
		super(name);//부모의 생성자중 name이용하는 생성자 생성
		this.major=major;
		//setName(name);
		System.out.println("Student(String major,String name) called");
	}
	

}
