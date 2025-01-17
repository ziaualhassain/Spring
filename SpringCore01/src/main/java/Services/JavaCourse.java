package Services;

public class JavaCourse implements Icourse {

	@Override
	public Boolean getTheCourse(Double price) {
		
		System.out.println("Java Course purchased sucessfully and the fees apid is : "+price);
		
		return true;
	}

}
