import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.text.NumberFormat;
import java.util.Locale;

public class Sort {
  int[] list = null;

  public Sort() { }

  public Sort(String nums, String sort) {
    nums = nums.replaceAll("[^0-9,/]", "");

    String[] items = nums.split(",");

    for (int i = 0; i < items.length; i++) {
      if (items[i].length() > 10) {
        items[i] = items[i].substring(0, 9);
      }
    }

    this.list = new int[items.length];

    for (int i = 0; i < items.length; i++) {
      this.list[i] = Integer.parseInt(items[i]);
    }

    switch (sort.toLowerCase()) {
      case "bubble":
        bubbleSort();
        break;
      case "selection":
        selectionSort();
        break;
      case "dumbBubble":
        dumbBubbleSort();
        break;
      case "quick":
        quickSort();
        break;
      case "bogo":
        bogoSort();
        break;
      default:
        break;
    }
  }

  public List getSortedList() {
    List<String> list = new ArrayList<String>();

    for (int item : this.list) {
      list.add(String.valueOf(item));
    }

    return list;
  }

  public void bubbleSort() {
    boolean swap = true;

    while (swap) {
      swap = false;
      for (int i = 0; i < this.list.length - 1; i++) {
        if (this.list[i] > this.list[i + 1]) {
          this.swap(i, i + 1);
          swap = true;
        }
      }
    }
  }

  public void selectionSort() {
    int lowVal;
    int lowPos;

    for(int i = 0; i < this.list.length; i++) {
      lowVal = this.list[i];
      lowPos = i;

      for(int j = i + 1; j < this.list.length; j++) {
        if (this.list[j] < lowVal) {
          lowVal = this.list[j];
          lowPos = j;
        }
      }

      if (this.list[i] != this.list[lowPos]) {
        this.swap(i, lowPos);
      }
    }
  }

  public void dumbBubbleSort() {
    for(int i = 0; i < this.list.length; i++) {
      for(int j = i; j < this.list.length; j++) {
        if (this.list[i] > this.list[j]) {
          this.swap(i, j);
        }
      }
    }
  }

  public void quickSort() {
    // Not implemented yet, use selection
    selectionSort();
  }

  public void bogoSort() {
    if (this.list.length > 10) {
      this.list = Arrays.copyOfRange(this.list, 0, 10);
    }

    Random rand = new Random();
    boolean sorted = false;
    long counter = 0;

    while(!sorted) {
      // randomize array
      for(int i = 0; i < this.list.length; i++) {
        swap(i, rand.nextInt(this.list.length));
      }
      counter++;

      sorted = true;
      for(int i = 0; i < this.list.length - 1; i++) {
        if(this.list[i] > this.list[i + 1]) {
          sorted = false;
          break;
        }

      }
    }
    System.out.printf("%s tries.\n", NumberFormat.getNumberInstance(Locale.US).format(counter));
  }

  public void swap(int x, int y) {
    int temp;

    temp = this.list[x];
    this.list[x] = this.list[y];
    this.list[y] = temp;
  }

}