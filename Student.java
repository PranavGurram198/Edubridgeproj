public class Student {
	private String name;
	private float marks;
	private int age,sem;
	Project project;
	public Student(String name, float marks, int age, int sem, Project project) {
		super();
		this.name = name;
		this.marks = marks;
		this.age = age;
		this.sem = sem;
		this.project = project;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", marks=" + marks + ", age=" + age + ", sem=" + sem + ", project=" + project
				+ "]";
	}
	
	
	

}
