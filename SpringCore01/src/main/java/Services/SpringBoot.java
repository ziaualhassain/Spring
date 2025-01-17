package Services;

public class SpringBoot implements Icourse {

	@Override
	public Boolean getTheCourse(Double price) {
		System.out.println("SpringBoot Course Purchased successfull and fees paid is "+price);
		return true;
	}

}
