package Collection;

import java.util.ArrayList;

class book{
	
	String bname;
	void show(String bname)	
	{
	 ArrayList arr1= new ArrayList();
	 arr1.add(bname);
	 System.out.println("book name :"+arr1);
	}  	
}
class author
{
	
	String aname;
	void showemp(String bname,String aname) {
		book b1=new book();
		b1.show(bname);
		ArrayList arr2=new ArrayList();
		arr2.add(aname);
		System.out.println("author name :"+arr2);
		
	}	
}
public class Assignment {

	public static void main(String[] args) {
	  author d1=new author();
	  d1.showemp("Arjun","CS");
	  d1.showemp("Vaibhav","CS");
	  d1.showemp("ajay","CS");
	 
	}

}
