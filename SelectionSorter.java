import java.util.ArrayList;

public class SelectionSorter extends Sorter {
  public SelectionSorter(ArrayList<String> elems) {
    super(elems);
  }

  public void mySort() {
    for (int i = 0; i < elements.size(); i++) {
      System.out.println("List before next step: " + elements);
      int champIndex = champIndex(i, elements.size());
      swap(i, champIndex);
    }
  }

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