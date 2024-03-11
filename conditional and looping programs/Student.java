class Student
{	String firstname;
	String secondname;
	int rollno;
	int mathm;
	int sciencem;
	int socialm;
	Student(String firstname,String secondname,int rollno,int mathm,int sciencem,int socialm)
	{	this.firstname=firstname;
		this.secondname=secondname;
		this.rollno=rollno;
		this.mathm=mathm;
		this.sciencem=sciencem;
		this.socialm=socialm;
	}
	void Status(){
		String fullname=firstname+secondname;
		int total=mathm+sciencem+socialm;
		double avg=total/3;
		System.out.println(fullname);
		System.out.println("rollno-"+rollno);
		System.out.println("totalmarks-"+total);
		System.out.println("average-"+avg);
		}
	public static void main(String[] args) 
	{	Student s1=new Student("Rathan","Sir",111,90,80,60);
		s1.Status();
		System.out.println("****");
		Student s2=new Student("Bhavani","prasad",222,70,90,60);
		s2.Status();
	}
}
