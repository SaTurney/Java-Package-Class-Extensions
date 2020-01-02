//Sabrina Turney
//COP 2800 - Programming With Java
//Week Five - Polymorphism
//February 12, 2019
//This program package demonstrates inheritance and polymorphism using an example
//of employees within a payroll system.

package employee;

public class PayrollSystemTest
{
   public static void main( String args[] )
   {
      // create subclass objects
      Date currentDate = new Date(2,12,2019);
      System.out.printf( "Current Date is: %s\n", currentDate.toString() );
      System.out.println("--------------------------------");
      SalariedEmployee salariedEmployee =
         new SalariedEmployee( "Sabrina", "Turney", "286-62-6777", new Date(3,16,1997),1000.00 );
      HourlyEmployee hourlyEmployee =
         new HourlyEmployee( "Toni", "Estrada", "254-22-9876", new Date(6,15,1994),18.20, 40 );
      CommissionEmployee commissionEmployee =
         new CommissionEmployee(
         "Thomas", "Timothy", "456-78-8910", new Date(5,15,1993),10000, .03 );
      BasePlusCommissionEmployee basePlusCommissionEmployee =
         new BasePlusCommissionEmployee(
         "William", "Andreu", "867-53-0999", new Date(7,30,1988),8000, .02, 100 );
      PieceWorker pieceWorker = new PieceWorker("Annie", "Mushu", "123-456-987",
              new Date(4,1,1988), 500, 6);
 
      System.out.println( "Employees processed individually:\n" );
 
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         salariedEmployee, "earned", salariedEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         hourlyEmployee, "earned", hourlyEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         commissionEmployee, "earned", commissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
         basePlusCommissionEmployee,
         "earned", basePlusCommissionEmployee.earnings() );
      System.out.printf( "%s\n%s: $%,.2f\n\n",
              pieceWorker, "earned", pieceWorker.earnings() );
 
      //four-element Employee array
      Employee employees[] = new Employee[ 5 ];
 
      // array with Employees
      employees[ 0 ] = salariedEmployee;
      employees[ 1 ] = hourlyEmployee;
      employees[ 2 ] = commissionEmployee;
      employees[ 3 ] = basePlusCommissionEmployee;
      employees[ 4 ] = pieceWorker;
 
      System.out.println("--------------------------------");
      System.out.println( "Employees processed polymorphically:\n" );
 
      // generically process each element in array employees
      for ( Employee currentEmployee : employees )
      {
         System.out.println( currentEmployee ); // toString
 
         // determines whether element is a BasePlusCommissionEmployee
         if ( currentEmployee instanceof BasePlusCommissionEmployee )
         {
            
            BasePlusCommissionEmployee employee =
               ( BasePlusCommissionEmployee ) currentEmployee;
 
            double oldBaseSalary = employee.getBaseSalary();
            employee.setBaseSalary( 1.10 * oldBaseSalary );
            System.out.printf(
               "new base salary with 10%% increase is: $%,.2f\n",
               employee.getBaseSalary() );
         } 
 
         if(currentDate.getMonth()==currentEmployee.getBirthday().getMonth())
         {
             System.out.printf("earned $%,.2f. %s\n\n", currentEmployee.earnings() + 100.00,
                     "Free $100 to your payroll amount. Happy birthday!" );
         }else{
             System.out.printf("earned $%,.2f\n\n", currentEmployee.earnings() );
         }
      } 
 
      // get type name of each object in employees array
      for ( int i = 0; i < employees.length; i++ )
         System.out.printf( "Employee %d is a %s\n", i,
            employees[ i ].getClass().getSimpleName() );
   } 
} 