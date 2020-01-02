//Sabrina Turney
//COP 2800 - Programming With Java
//Week Five - Polymorphism
//February 12, 2019
//This program package demonstrates inheritance and polymorphism using an example
//of employees within a payroll system.

package employee;


public abstract class Employee
{
   private String firstName;
   private String lastName;
   private String socialSecurityNumber;
   private Date birthday;
 
   // constructor
   public Employee( String first, String last, String ssn , Date DayOfBirth)
   {
      firstName = first;
      lastName = last;
      socialSecurityNumber = ssn;
      birthday = DayOfBirth;
   } // end three-argument Employee constructor
 
   // set first name
   public void setFirstName( String first )
   {
      firstName = first;
   } // end method setFirstName
 
   // return first name
   public String getFirstName()
   {
      return firstName;
   } // end method getFirstName
 
   // set last name
   public void setLastName( String last )
   {
      lastName = last;
   } // end method setLastName
 
   // return last name
   public String getLastName()
   {
      return lastName;
   } // end method getLastName
 
   // set social security number
   public void setSocialSecurityNumber( String ssn )
   {
      socialSecurityNumber = ssn; // should validate
   } // end method setSocialSecurityNumber
 
   // return social security number
   public String getSocialSecurityNumber()
   {
      return socialSecurityNumber;
   } // end method getSocialSecurityNumber
 
   // set birthday
   public void setBirthday(Date DayOfBirth)
   {
       birthday = DayOfBirth;
   }// end method
 
   // get birthday
   public Date getBirthday()
   {
       return birthday;
   }
 
   // return String representation of Employee object
    @Override
   public String toString()
   {
      return String.format( "%s %s\nsocial security number: %s\nbirthday: %s\n",
         getFirstName(), getLastName(), getSocialSecurityNumber(), getBirthday());
   } // end method toString
 
   // abstract method overridden by subclasses
   public abstract double earnings(); // no implementation here
} // end abstract class Employee