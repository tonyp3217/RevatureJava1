package Questions;
/*
 * Sort two employees based on their name, department, and age using the Comparator 
 * interface
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp {

	private String name;
	private String department;
	private int age;

	public Emp(String name, String department, int age){
	this.name = name;
	this.department = department;
	this.age = age;}
	
	public String getName(){
	return name; 
	}
	public void setName(){
	this.name = name;
	}
	public String getDepartment(){
	return department;
	}
	public void setDepartment(){
	this.department = department;
	}	

    	public int getAge() {
        return age;
	}
	public void setAge(int age) {
        this.age = age;
    	}
}

class EmpAgeComparator implements Comparator<Emp> {
    
    public int compare(Emp e1, Emp e2) {
        return e1.getAge() - e2.getAge();
    }    
}

//public class EmpDeptComparator implements Comparator<Emp>{
//
//  public int compare(Emp e1, Emp e2) { return e1.getDepartment() - e2.getDepartment(); } }


public class QuestionSeven {
	
	    public void EmpComparative() {

	        //create some Employee(Emp) objects
	        ArrayList<Emp> listEmp = new ArrayList<Emp>();
	        listEmp.add( new Emp("John", "Communications", 40) );
	        listEmp.add( new Emp("Mark", "Communications", 42) );
	        listEmp.add( new Emp("Oliver", "HR", 28) );
	        listEmp.add( new Emp("Silvia", "HR", 32) );
	        listEmp.add( new Emp("Shannon", "Accounting", 28) );

	        //list without sorting
	        System.out.println("Emp list without sorting");
	        System.out.println(listEmp);

	        //sort the list using age comparator
	        Collections.sort( listEmp, new EmpAgeComparator() );

	        System.out.println("Emp list after sorting by age");
	        //(listEmp);


	        //sort the list using department comparator
	        //Collections.sort( listEmp, new EmpDeptComparator() );

	        System.out.println("Emp list after sorting by department");
	        System.out.println(listEmp);

	    }
}




