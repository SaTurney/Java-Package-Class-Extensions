//Sabrina Turney
//COP 2800 - Programming With Java
//Week Five - Polymorphism
//February 12, 2019
//This program package demonstrates inheritance and polymorphism using an example
//of employees within a payroll system.

package employee;

public class HourlyEmployee extends Employee
{
   private double wage; // hourly wages
   private double hours; // total hours worked weekly
 
   //HourlyEmployee constructor
   public HourlyEmployee( String first, String last, String ssn, Date DayOfBirth, double hourlyWage, double hoursWorked )
   {
      super( first, last, ssn, DayOfBirth);
      setWage( hourlyWage ); // validate and store hourly wage
      setHours( hoursWorked ); // validate and store hours worked
   } 
 
   // set wage
   public final void setWage( double hourlyWage )
   {
      wage = ( hourlyWage < 0.0 ) ? 0.0 : hourlyWage;
   } 
 
   // get wage
   public double getWage()
   {
      return wage;
   } 
 
   // set hours worked
   public final void setHours( double hoursWorked )
   {
      hours = ( ( hoursWorked >= 0.0 ) && ( hoursWorked <= 168.0 ) ) ?
         hoursWorked : 0.0;
   } 
 
   // get hours worked
   public double getHours()
   {
      return hours;
   } 
 
   // calculate earnings; override abstract method earnings in Employee
   public double earnings()
   {
      if ( getHours() <= 40 ) // no overtime
         return getWage() * getHours();
      else
         return 40 * getWage() + ( getHours() - 40 ) * getWage() * 1.5;
   } 
 
   // return String representation of HourlyEmployee object
    @Override
   public String toString()
   {
      return String.format( "hourly employee: %s\n%s: $%,.2f; %s: %,.2f",
         super.toString(), "hourly wage", getWage(),
         "hours worked", getHours() );
   } 
}