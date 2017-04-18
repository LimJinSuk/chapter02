package person;

public class PersonTest {

	public static void main(String[] args) {
		
		//Person p = new Student();
		Person p2 = new Student("CS");
		Person p3 = new Student("임진숙","CS");
		
		Student s =new Student();
		
		//up casting(암시적)
		Person p=s;
		p.setName("둘리");
		
		//down casting(부모가 자식으로 내려옴,명시적)
		Student s2 = (Student)p;
		
		
		((Student)p).setName("");
		
	
	}

}
