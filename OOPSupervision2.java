
/////////////////// QUESTION 3 //////////////////////////////

class MyClass 
{
	int state;
	void behaviour(){};
}

abstract class MyAbClass 
{
	int state;
	void myFunction(){};
	abstract void myAbMethod();
}

interface MyInterface
{
	void someMethod();
	int anotherOne(int x, boolean isRed);
}

class Example extends MyAbClass implements MyInterface
{
	void myAbMethod()
	{
		System.out.println("Implemented abstract method from MyAbClass");
	}
	
	public void someMethod()
	{
		System.out.println("Implemented abstract method from MyInterface");
	}
	
	public int anotherOne(int n, boolean b)
	{
		// another method implemented from MyInterface
		return 5; 
	}
	
}

///////////////////////////////////////////////////////////

////////////////// QUESTION 5 /////////////////////////////


class Ninja 
{
	public void chuckShuriken(){
		System.out.println("Shuriken chucked");
	}
	
	public int getZen()
	{
		return 1;
	}
}

class Employee 
{
	String employeeID; 
	
	void employeeMethod()
	{
		System.out.println("Example Employee Method");
	}
}

interface NinjaInterface
{
	void chuckShuriken();
	
	int getZen();
}

class NinjaEmployee extends Employee implements NinjaInterface
{
	// requires copying of method implementation from Ninja class
	public void chuckShuriken(){
		System.out.println("Shuriken chucked");
	}
	
	public int getZen()
	{
		return 1;
	}
}

///////////////////////////////////////////////////////////////////

//////////////////// Question 7 ///////////////////////////////////

class Person
{
	String firstName;
	String lastName;
	
	Person(String firstName, String lastName)
	{
		this.firstName = firstName;
		this.lastName = lastName;
	}
}

public class OOPSupervision2 {

	public static void testOutput()
	{
		Person p = new Person("Bonnie", "Parker");
		System.out.println("Person details:" + p);
	}
	
	public static void main(String[] args) {
		testOutput();
		
	}
	
}
