import java.util.Scanner;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    ArrayList<Integer> aList = new ArrayList<Integer>();
    System.out.print("No. of integers: ");
    int occurrance = in.nextInt();

    for(int k = 0; k < occurrance; k++){
        System.out.print("Enter number: ");
        aList.add(in.nextInt());
    }
    
    int HighestVal = 0;
    int HighestCount = 0;
    for (int valueA : aList) {
        int count = 0;
        for(int valueB : aList){
          if (valueA == valueB){
            count = count + 1;
          }
        }
        
        if(count > HighestCount){
          HighestVal = valueA;
          HighestCount = count;
        }
    }

     System.out.print("Highest Occurrence number is: " + HighestVal);
  }
}
