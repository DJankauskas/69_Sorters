
/**
  Implement an insertion sort, in the Sorters structure
 */
import java.util.ArrayList;

public class InsertionSorter extends Sorter {

  /**
   * Construct an instance to process the user's data
   */
  public InsertionSorter(ArrayList<String> usersData) {
    super(usersData);
  }

  /**
   * sort the user's data, implementing insertion sort
   */
  //Precondition: elements rferences a valid ArrayList<String>
  //Postcondition: elements' elements are sorted in lexographic order.
  //Algorithm: For each element in the list, call insertOne.
  public void mySort() {
    for (int i = 0; i < elements.size(); i++) {
      System.out.println("List before next step: "+ elements);
      insertOne(elements, i);
    }
  }

  //Precondition: list != null, sortedBound points to the first element in the unsorted region
  //Postcondition: the first element in the unsorted region is sorted
  //Algorithm: iterate over every element in the sorted region backwards. If the element
  //being sorted is greater than the compared element, drop it in the space created.
  //otherwise, shift the compared element one position to the right.
  private static void insertOne(ArrayList<String> list, int sortedBound) {
    String toBeSorted = list.get(sortedBound);
    for(int beingCompared = sortedBound - 1; beingCompared >= 0; beingCompared--) { 
        if(toBeSorted.compareTo(list.get(beingCompared)) > 0) {
            list.set(beingCompared + 1, toBeSorted); //drop
            return;
        }
        else {
            list.set(beingCompared + 1, list.get(beingCompared)); //shift
            System.out.println("List after shift     : "+ list);
        }
    }
    list.set(0, toBeSorted); //if toBeCompared is never greater, it goes at the beginning of the list.
}
}
