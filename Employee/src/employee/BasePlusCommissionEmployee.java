//Sabrina Turney
//COP 2800 - Programming With Java
//Week Five - Polymorphism
//February 12, 2019
//This program package demonstrates inheritance and polymorphism using an example
//of employees within a payroll system.

package employee;

public class BasePlusCommissionEmployee extends CommissionEmployee
{
   private double baseSalary; // employee weekly salary minus commission.
 
   // constructor
   public BasePlusCommissionEmployee( String first, String last,
      String ssn, Date DayOfBirth,double sales, double rate, double salary )
   {
      super( first, last, ssn, DayOfBirth,sales, rate );
      setBaseSalary( salary ); // keep base salary
   } 
 
   // set base salary
   public final void setBaseSalary( double salary )
   {
      baseSalary = ( salary < 0.0 ) ? 0.0 : salary; //salary must be positive!
   } 
 
   // get base salary
   public double getBaseSalary()
   {
      return baseSalary;
   } 
 
   // calculate earnings with commissions, OVERRIDE CommissionEmployee
    @Override
   public double earnings()
   {
      return getBaseSalary() + super.earnings();
   } 
 
   // return String BasePlusCommissionEmployee
    @Override
   public String toString()
   {
      return String.format( "%s %s; %s: $%,.2f",
         "base-salaried", super.toString(),
         "base salary", getBaseSalary() );
   } 
} 