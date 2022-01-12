
 class Student{
    private String name;
}

public class Student{
    
	public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = student1;
        System.println(assertEquals(student1, student3));
	}
}