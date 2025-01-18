package Services;

public class TshapedSkills {
	
	private Icourse course;
	
	public void setCourse(Icourse course) {
		System.out.println("setter injection");
		this.course = course;
	}
	
	public TshapedSkills(Icourse course) {
		System.out.println("TshapedSkills Bean created");
		System.out.println("Constructor injection");
		this.course = course;
		
	}
	
	public TshapedSkills() {
		System.out.println("TshapedSkills Bean created");
	}
	
	public boolean buyTheCourse(Double amount) {
		
		return course.getTheCourse(amount);
	}

}
