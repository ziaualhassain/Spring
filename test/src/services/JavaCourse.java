package services;

public class JavaCourse implements Icourse {

	@Override
	public Boolean getTheCourse(Double Price) {
		System.out.println("Java Course purchased and fee paid is :" +Price);
		return true;
	}

}
