package services;

public class TshapedSkills {
	
	private Icourse course;
	
	//by using setters we will set the object here 
	public void setCourse(Icourse course) {
		this.course = course;
	}

	
	//Zero parameterised constructor for making setter injection possible
	public TshapedSkills() {
	}
	
	

	public TshapedSkills(Icourse course) {
		super();
		this.course = course;
	}


	//by using that object we are calling method of specified call (Run time ploymorphism)
	public boolean buyTheCourse(Double amount) {
		
		return course.getTheCourse(amount);
	}

}

//Both javacourse and Springboot course are independent of each other and we have achived loose coupling.
