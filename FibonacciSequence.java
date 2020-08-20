
import java.util.Scanner; 

public class FibonacciSequence
{
  public static void main(String[] args)
  {
    Scanner fibonacci = new Scanner(System.in);
    int numbers; 
    
    System.out.println("Enter the number that you want to calculate the Fibonacci sequence of: "); 
    numbers = fibonacci.nextInt();
    
    int[] series = new int[numbers];
     
    series[0] = 0;
    series[1] = 1;
    
    for ( int f = 2; f < numbers; f++ )
    {
      series[f] = series[f-1] + series[f-2];
    }
    
     System.out.println( "Fibonacci Sequence of " + numbers + " numbers." );
     
    for ( int f = 0; f < numbers; f++ )
    {
      System.out.print( series[f] + " " );
    }
  }
}
