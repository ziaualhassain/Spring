package Services;

public class TshapedSkills {
	
	private Icourse course;
	
	public TshapedSkills(Icourse course) {
		super();
		this.course = course;
	}
	
	public TshapedSkills() {
		
	}
	
	public boolean buyTheCourse(Double amount) {
		
		return course.getTheCourse(amount);
	}

}
