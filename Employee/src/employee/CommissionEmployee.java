//Sabrina Turney
//COP 2800 - Programming With Java
//Week Five - Polymorphism
//February 12, 2019
//This program package demonstrates inheritance and polymorphism using an example
//of employees within a payroll system.

package employee;

public class CommissionEmployee extends Employee
{
   private double grossSales; // sales earned
   private double commissionRate; // commission the employee receives
 
   // constructor
   public CommissionEmployee( String first, String last, String ssn, Date DayOfBirth, double sales, double rate )
   {
      super( first, last, ssn, DayOfBirth);
      setGrossSales( sales );
      setCommissionRate( rate );
   } 
 
   // set commission rate
   public final void setCommissionRate( double rate )
   {
      commissionRate = ( rate > 0.0 && rate < 1.0 ) ? rate : 0.0;
   } 
 
   // get commission rate
   public double getCommissionRate()
   {
      return commissionRate;
   } 
 
   // set gross sales amount
   public final void setGrossSales( double sales )
   {
      grossSales = ( sales < 0.0 ) ? 0.0 : sales;
   } 
 
   // get gross sales amount
   public double getGrossSales()
   {
      return grossSales;
   } 
 
   // calculate earnings; OVERRIDE abstract method in Employee
   public double earnings()
   {
      return getCommissionRate() * getGrossSales();
   } 
 
   // return overridden String of CommissionEmployee
    @Override
   public String toString()
   {
      return String.format( "%s: %s\n%s: $%,.2f; %s: %.2f",
         "commission employee", super.toString(),
         "gross sales", getGrossSales(),
         "commission rate", getCommissionRate() );
   } 
} 