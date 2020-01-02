//Sabrina Turney
//COP 2800 - Programming With Java
//Week Five - Polymorphism
//February 12, 2019
//This program package demonstrates inheritance and polymorphism using an example
//of employees within a payroll system.

package employee;

public class SalariedEmployee extends Employee
{
   private double weeklySalary;
 
   //Salaried Employee constructor
   public SalariedEmployee( String first, String last, String ssn, Date DayOfBirth, double salary )
   {
      super( first, last, ssn, DayOfBirth); // pass to Employee constructor
      setWeeklySalary( salary ); //keep new salary
   }
 
   // set salary
   public final void setWeeklySalary( double salary )
   {
      weeklySalary = salary < 0.0 ? 0.0 : salary;
   } 
 
   // get salary
   public double getWeeklySalary()
   {
      return weeklySalary;
   } 
 
   // calculate earnings; OVERRIDE OCCURS HERE
   public double earnings()
   {
      return getWeeklySalary();
   } 
 
   // return String of SalariedEmployee
    @Override
   public String toString()
   {
      return String.format( "salaried employee: %s\n%s: $%,.2f",
         super.toString(), "weekly salary", getWeeklySalary() );
   } 
} 