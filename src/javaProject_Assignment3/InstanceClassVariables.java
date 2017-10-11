/*To differentiate between instance variables and class variables.
And also show the scope of each.*/
/*This assignment will help you to master in the scope of a variable.*/

//Package declaration is mandatory
package javaProject_Assignment3;

public class InstanceClassVariables {
	//Instance variables live until the instance is removed.
		// this instance variable is visible for any child class.
		//Declaring Instance Variable
		public String name = "testing";
		// count variable is visible in this class only.
			private  int count = 5;
			
		//Static variables have the longest scope; they are created when the class is 
		//loaded, and they survive as long as the class stays loaded in the Java Virtual Machine (JVM).
			//Class variable is static variable
			//Declaring Class Variable
		       public static int staticCount = 2;
		 
		      //Getter for Static Variable
		 public static int getStaticCount() {
		   	return staticCount;
		   	}

		 //Setter for Static Variable
		   	public static void setStaticCount(int staticCount) {
		   		InstanceClassVariables.staticCount = staticCount;
		   	}

		
		
		//Main method started
		public static void main(String[] args) {
			
			//create an object of class
			InstanceClassVariables demo1 = new InstanceClassVariables ();
			//create another object of class
			InstanceClassVariables demo2 = new InstanceClassVariables ();
			//assigning new value to instance variable
			demo1.name = "Changing var value of 1st object";
			
			System.out.println("Instance variable value after assigning new value:" + demo1.name + " , "+ demo1.count );
			System.out.println("Instance variable value of 2nd object:" +demo2.name + " , "+ demo2.count );
			
			
			//set two different values using get and set but both copy will give same value by making call from object.
			//First way
			demo1.setStaticCount(67);
			demo2.setStaticCount(23);
			System.out.println("Class variable for first object:" + demo1.getStaticCount());
	        System.out.println("Class variable for second object:" + demo2.getStaticCount());
	        
	        //Second way        
	      //Class Variable access directly by class name / or different object have same value
	        //value will be same for staticCount either call by getters and setters or class
			//InstanceClassVariables.staticCount = 7;
			System.out.println("Class variable:" + demo1.staticCount );	
			
			System.out.println("Class variable for another obj:" + demo2.staticCount );
			
			//Static method can be called without creating object of class
			Staticdisplay();
			//To call Non static method object must be created
			demo1.display();			

		}
		
		//Static Method
		public static void Staticdisplay(){
		    System.out.println("Call from static method");
		  }
		
		//Non Static method
		public void display(){
		    System.out.println("Call from Non - static method");
		  }		

}
