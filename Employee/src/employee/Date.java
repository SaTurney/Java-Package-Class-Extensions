//Sabrina Turney
//COP 2800 - Programming With Java
//Week Five - Polymorphism
//February 12, 2019
//This program package demonstrates inheritance and polymorphism using an example
//of employees within a payroll system.

package employee;

public class Date
{
   private int month; // must be between 1 and 12
   private int day;   // must be between 1 and 31
   private int year;  // any year is acceptable
 
   // constructor checkMonth;
   // call checkDay
   public Date( int theMonth, int theDay, int theYear )
   {
      month = theMonth; // validate month
      year = theYear; // could validate year
      day = checkDay( theDay ); // validate day
   }
 
   public void setMonth(int theMonth)
   {
       month = theMonth;
   }
 
   // this confirms a proper month value
   public int getMonth()
   {
      if ( month > 0 && month <= 12 ) // validate month
         return month;
      return 0;
   } 
 
   // confirm correct day for month
   private int checkDay( int testDay )
   {
      int daysPerMonth[] =
         { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
 
      // check if day in range for month
      if ( testDay > 0 && testDay <= daysPerMonth[ month ] )
         return testDay;
 
      // check for leap year
      if ( month == 2 && testDay == 29 && ( year % 400 == 0 ||
           ( year % 4 == 0 && year % 100 != 0 ) ) )
         return testDay;
 
      return 0;  // maintain object
   }
 
   // return a String of the form month/day/year
    @Override
   public String toString()
   {
      return String.format( "%d/%d/%d", month, day, year );
   } 
} 