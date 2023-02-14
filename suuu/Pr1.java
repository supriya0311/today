class Employe 
{
	int emp_id;
	String emp_name;
	double emp_sal;
	Employe(int a,int b,int c)
	{
		emp_id=a;
		emp_name=b;
		emp_sal=c;
		return;
	}
	public static void main(String[] args) 
	{
		Employe e1=new Employe(137,"Priya",30000);
		System.out.println(e1.emp_id);
        System.out.println(e1.emp_sal);
		System.out.println(e1.emp_name);
	}
}
