
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
  public void mySort() {
    for (int i = 0; i < elements.size(); i++) {
      System.out.println("List before next step: "+ elements);
      insertOne(elements, i);
    }
  }

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
