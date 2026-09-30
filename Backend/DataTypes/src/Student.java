
public class Student {
	public static void main(String[] args) {
		System.out.println("Java program running !!");

		// Student record
		byte clg_Year = 2;
		short age = 22;
		int stu_Id = 101;
		long clg_Id = 37987l;

		float marks = 75.43f;
		double clg_Fees = 45000.00;

		char gender = 'M';
		boolean is_Active = true;

		System.out.println("College year is: " + clg_Year);
		System.out.println("Student age is: " + age);
		System.out.println("Student ID is: " + stu_Id);
		System.out.println("College ID is: " + clg_Id);
		System.out.println("Student marks is : " + marks);
		System.out.println("College Fees is: " + clg_Fees);
		System.out.println("Student Gender is: " + gender);
		System.out.println("IS Active : " + is_Active);
		
//Calculate size of the datatype in bytes
		System.out.println(Byte.BYTES);
		System.out.println(Short.BYTES);
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		System.out.println(Float.BYTES);
		System.out.println(Double.BYTES);
		System.out.println(Character.BYTES);

//Calculate size of the datatype in bits
		System.out.println(Byte.SIZE);
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		System.out.println(Long.SIZE);
		System.out.println(Float.SIZE);
		System.out.println(Double.SIZE);
		System.out.println(Character.SIZE);

	}
}
