//Sabrina Turney
//COP 2800 - Programming With Java
//Week Five - Polymorphism
//February 12, 2019
//This program package demonstrates inheritance and polymorphism using an example
//of employees within a payroll system.

package employee;

public class PieceWorker extends Employee {
    private double wage; //money earned per piece
    private double pieces; //number of pieces made
 
    // PieceWorker constructor
    public PieceWorker( String first, String last, String ssn, Date DayOfBirth, double Wage, double Pieces )
    {
      super( first, last, ssn, DayOfBirth);
      setWage( Wage ); // wage
      setPieces( Pieces ); // pieces;
    } 
 
    // set wage
    public final void setWage( double Wage )
    {
      wage = ( Wage < 0.0 ) ? 0.0 : Wage;
    } 
 
    // get wage
    public double getWage()
    {
      return wage;
    } 
 
    // set pieces
    public final void setPieces( double Pieces )
    {
      pieces = ( ( Pieces >= 0.0 ) && ( Pieces <= 168.0 ) ) ?
         Pieces : 0.0;
    } 
 
    // get pieces
    public double getPieces()
    {
      return pieces;
    } 
 
    // calculate earnings, OVERRIDE Employee
    public double earnings()
    {
      return getWage() * getPieces();
    } 
 
    // return PieceWorker
    @Override
    public String toString()
    {
      return String.format( "Piece Worker: %s\n%s: $%,.2f; %s: %,.2f",
         super.toString(), "Wage per piece", getWage(),
         "Number of pieces produced", getPieces() );
    } 
}