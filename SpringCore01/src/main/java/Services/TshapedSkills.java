package Services;

public class TshapedSkills {
	
	private Icourse course;
	
	public void setCourse(Icourse course) {
		System.out.println("Setter Injection");
		this.course = course;
	}
	
	public TshapedSkills() {
		System.out.println("TshapedSkills Bean created");
	}
	
	public boolean buyTheCourse(Double amount) {
		
		return course.getTheCourse(amount);
	}

}
