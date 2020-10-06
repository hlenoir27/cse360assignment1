package cse360assignment02;
/**represents an adding machine 
 * @author Hannah leNoir
 * @version 1.0
 * @since 1.0
 */

public class AddingMachine {
	 private int total;
	 private String memory;
	 /**constructor for AddingMachine class
	  */
	  public AddingMachine () {
	    total = 0;  // not needed - included for clarity
	    memory ="0";
	  }
	  /**returns the total
	   * @return an int representing the total added
	   */
	  
	  public int getTotal () {
	    return total;
	  }
	  /**adds parameter to total value
	   * @param value User input int 
	   */
	  public void add (int value) {
		  total=value+total;
		  memory += " + " + value;
	  }
	
	  /**subtracts parameter from total value
	   * @param value User input int 
	   */
	 
	  public void subtract (int value) {
		  total=total-value;
		  memory += " - " + value;
	  }
	  /**prints out all functions done with Adding Machine
	   * @return a string showing all functions 
	   */
	  public String toString () {
		  
	    return memory;
	  }
	  /**clears AddingMachine
	   */
	  public void clear() {
		  memory= "0";
		  total=0;
	  }

}
