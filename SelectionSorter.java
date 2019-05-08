import java.util.ArrayList;

public class SelectionSorter extends Sorter {
  public SelectionSorter(ArrayList<String> elems) {
    super(elems);
  }
  //precondition: elements is initialized to an ArrayList.
  //postcondition: elements' elements are sorted in lexographic order.
  /*
  Algorithm: For every element in [0, n - 2], run champIndex, swapping the
  element at the result index with the current element.
  */
  public void mySort() {
    for (int i = 0; i < elements.size() -1; i++) {
      System.out.println("List before next step: " + elements);
      int champIndex = champIndex(i, elements.size());
      swap(i, champIndex);
    }
  }
  
  //precondition: startIndex and endIndex point to the beginning and end
  //of the unsorted region of elements
  // postcondition: the smallest index is returned
  private int champIndex(int startIndex, int endIndex) {
    String smallest = elements.get(startIndex);
    int smallestIndex = 0;
    int i = startIndex;
    for (; i < elements.size(); i++) {
      if (elements.get(i).compareTo(smallest) < 1) {
        smallest = elements.get(i);
        smallestIndex = i;
      }
    }
    return smallestIndex;
  }

  private void swap(int i, int j) {
    String temp = elements.get(i);
    elements.set(i, elements.get(j));
    elements.set(j, temp);
  }
}