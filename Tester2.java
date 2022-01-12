
public class Student{
    private String name;
}

class Tester2{
    
	public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = student1;
        System.println(assertEquals(student1, student3));
	}
}