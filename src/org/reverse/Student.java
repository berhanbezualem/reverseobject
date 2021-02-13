

package org.reverse;

public class Student {
	private int id;
	
	private String name;
	

	


	public Student(int id, String name) {
		
		this.id = id;
		this.name = name;
	}





	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s[] ={new Student(1,"Berhanu"),new Student(2,"Nati"),
					 new Student(3,"Nahom"),new Student(4,"Redi"),new Student(5,"Selome")};
		Student temp;
		
		
		for (Student st:s)
			System.out.println(st);
		
		for (int i=0;i<s.length/2;i++)
		{
	
			temp=s[i];
			s[i]=s[s.length-1-i];
			s[s.length-1-i]=temp;
			
			
					}
		
		for(int i=0;i<s.length;i++)
		System.out.println("vinod is tutoring"+ s[i]);

	}

}
