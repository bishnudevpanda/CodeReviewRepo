/*Create a class Student which allows for following properties
•	A string type variable “name”
•	A int type variable “id”
•	A double type variable “percentage”
•	A string array “skills”
•	Create multiple constructors to initialize objects based on either one or combination of these properties.
•	All relevant getters and setters must be created
*/

//importing the utility functions
import java.util.*;

class Student
{
    String name;
	int id;
	double percentage;
	String[] skills;
    //here we are making different type of constructors for different type of values.
    public Student(String name, int id)
	{
        this.name=name;                               //For ID
		this.id=id;
    }

	public Student(int id, double percentage)
	{
		this.id=id;                                  //For Percentage
		this.percentage=percentage;                     
	}
	public Student(String name, int id, String[] skills)
	{
		this.name=name;
		this.id=id;
		this.skills=skills;
	}

   //Defining the getters.
    
   public String getName() 
   {
		return this.name;

   }
   public int getId()
   {
		return this.id;

   }
   public double getPercentage()
   {
		return this.percentage;

   }
   public String getSkills()
   {
		return Arrays.toString(this.skills);

   }

    // Defining the setters.

      public void setName(String name)
   {
		this.name=name;

   }
   public void setId(int id)
   {
		this.id=id;

   }
   public void setPercentage(double percentage)
   {
		this.percentage=percentage;

   }
	public void update_skills(String s)
	  {
		  ArrayList<String> myList = new ArrayList<String>(Arrays.asList(myArray));
		  myList.add(s);
		  this.skills = myList.toArray(myArray);
        }
}

//operations class second question
/*Create a class Operations which inherits from the above class. Add following methods to it
•	A method “changeName” to change the name of a given object based on a value passed by the user.
•	Another implementation of “changeName” that takes value from the user to change the name
•	A method add skill which allows caller to add upto 5 skills to the current student object
*/

    class operations extends student {

    public void changeName(String name){
        this.name = name;
    }


    public void changeName(){
        System.out.prinltn("Enter the new value: ");
        String name = sc.next();
        this.name = name;
    }

    public void addSkill(){
        int sk = 6;
        while(sk>5){
            System.out.println("Add on the skills: ");
            sk = sc.nextInt();
        }
        for(int i = 0;i<sk;i++){
            System.out.println("Enter the skill");
            String skill = sc.next();
            this.skills.add(skill);
      }}}

      /*Create a class DisplayOperations which inherits from Operations with following methods
•	Display the attributes of the object used to call the method. This method must be called “showAttributes”
•	A method to show the name of student object in upper case called “showNAME”
•	A method “showDifference” to calculate the difference between percentage values of two objects. One object will be calling the method and other will be passed to it.
*/
class displayOperations extends operations{

    //using the display functions to display values
    
    public void showAttributes(){
        System.out.prinltn(this.id);                             //displaying the attributes of students.
        System.out.prinltn(this.name);
        System.out.prinltn(this.percentage);
        System.out.prinltn(this.skills);
    }

    public void showName(){                                       //displaying the name in uppercse.
        System.out.prinltn(this.name.toUpperCase());
    }

    public void showDifference(displayOperations d){
        System.out.prinltn(this.percentage-d.percentage);          //difference of percentage.
    }
    }
}

