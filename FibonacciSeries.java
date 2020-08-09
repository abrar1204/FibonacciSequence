
public class FibonacciSeries
{
  public static void main(String[] args)
  {
    int numbers = 8;
    int[] series = new int[numbers];
     
    series[0] = 0;
    series[1] = 1;
    
    for ( int f = 2; f < numbers; f++ )
    {
      series[f] = series[f-1] + series[f-2];
    }
    
     System.out.println( "Fibonacci Series of " + numbers + " numbers." );
     
    for ( int f = 0; f < numbers; f++ )
    {
      System.out.print( series[f] + " " );
    }
  }
}