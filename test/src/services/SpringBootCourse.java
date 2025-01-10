package services;

public class SpringBootCourse implements Icourse {

	@Override
	public Boolean getTheCourse(Double Price) {
		System.out.println("SpringBoot Course purchased and fee paid is :" +Price);
		return true;
	}

}
