package main.java.io.edocode;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * @author      Eric Storch <eric@edocode.io>
 * @version     0.1
 * @since       2014-07-01
 */
public class Sort {

  /** List of values */
  int[] list = null;

  /**
   * Default constructor
   */
  public Sort() { }

  /**
   * Constructor
   *
   * @param       nums        String of values
   * @param       sort        Sort algorithm
   */
  public Sort(String nums, String sort) {
    // Input sanitization
    nums = nums.replaceAll("[^0-9,/]", "");
    // Put input values into the array
    String[] items = nums.split(",");

    // Truncate values that are too big for int storage
    for (int i = 0; i < items.length; i++) {
      if (items[i].length() > 10) {
        items[i] = items[i].substring(0, 9);
      }
    }

    // Create new int list
    this.list = new int[items.length];

    // Convert and trasfer values to new int list
    for (int i = 0; i < items.length; i++) {
      this.list[i] = Integer.parseInt(items[i]);
    }

    // Select the sorting algorithm (bubble is default)
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
        bubbleSort();
        break;
    }
  }

  /**
   * List getter
   *
   * @return
   */
  public List getSortedList() {
    List<String> list = new ArrayList<String>();

    for (int item : this.list) {
      list.add(String.valueOf(item));
    }

    return list;
  }

  /**
   * Bubble sort algorithm
   */
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

  /**
   * Selection sort algorithm
   */
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

  /**
   * Dumb bubble sort (always performs O(n^2))
   */
  public void dumbBubbleSort() {
    for(int i = 0; i < this.list.length; i++) {
      for(int j = i; j < this.list.length; j++) {
        if (this.list[i] > this.list[j]) {
          this.swap(i, j);
        }
      }
    }
  }

  /**
   * Quick sort algorithm (eventually, uses bubble right now)
   */
  public void quickSort() {
    // Not implemented yet, use selection
    bubbleSort();
  }

  /**
   * Bogo sort (just because I'm crazy like that)
   */
  public void bogoSort() {
    // Limit list to first 10 values or else it'll lock up the server
    if (this.list.length > 10) {
      this.list = Arrays.copyOfRange(this.list, 0, 10);
    }

    // New random num generator
    Random rand = new Random();
    // Sorted checker
    boolean sorted = false;
    // Attempt counter
    long counter = 0;

    // Loop until sorted
    while(!sorted) {
      // Randomize array
      for(int i = 0; i < this.list.length; i++) {
        swap(i, rand.nextInt(this.list.length));
      }
      counter++;

      // Assume sorted
      sorted = true;

      // Check if sorted
      for(int i = 0; i < this.list.length - 1; i++) {
        if(this.list[i] > this.list[i + 1]) {
          sorted = false;
          break;
        }

      }
    }

    // Output number of attempts (soon to be returned with response object)
    System.out.printf("%s tries.\n", NumberFormat.getNumberInstance(Locale.US).format(counter));
  }

  /**
   * Swap function
   *
   * @param     x       First value to be swapped
   * @param     y       Second valye to be swapped
   */
  public void swap(int x, int y) {
    int temp;

    temp = this.list[x];
    this.list[x] = this.list[y];
    this.list[y] = temp;
  }
}