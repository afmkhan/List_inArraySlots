/**
  Implement a list of integer elements, including
  both data and operations.
 */

public class List_inArraySlots {

    // declare fields here
    private int filledCount = 0;
    private int currentMax = 10;
    private int[] listed = new int[currentMax];
    

    /**
      Construct an empty list with a small initial capacity.
     */
    public List_inArraySlots() {
    }


    /** 
      @return the number of elements in this list
     */
    public int size() {
        return filledCount;
    }


     /** 
       @return a string representation of this list,
       in [a,b,c,] format
      */ 
    public String toString() {
        String total = "";
        for (int i: listed) {
            total += i + " ";
        }
        return total;
    }

    
    /** 
      Appends @value to the end of this list.
      
      @return true, in keeping with conventions yet to be discussed
     */
     public boolean add( int value) {
        if (filledCount == currentMax) {

            expand();
            
        }
        listed[filledCount++] = value;


        return true;
       
     }


    /** 
      Double the capacity of the List_inArraySlots, 
      preserving existing data
     */
     private void expand() {
        int[] dataHolder = new int[currentMax * 2];
        currentMax *= 2;
        for (int i = 0; i < listed.length; i++) {
            dataHolder[i] = listed[i];

        }
        listed = dataHolder;
     }
}
