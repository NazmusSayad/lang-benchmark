import java.io.*;
import java.util.*;

public class Benchmark {
  public static void main(String[] args) throws IOException {
    // Arithmetic operations
    long arithSum = 0;
    for (int i = 0; i < 100000000; i++) {
      arithSum += i * 2;
    }

    // String concatenation
    StringBuilder strConcat = new StringBuilder();
    for (int i = 0; i < 100000; i++) {
      strConcat.append("test");
    }

    // Array operations
    int[] arr = new int[100000];
    for (int i = 0; i < 100000; i++) {
      arr[i] = i;
    }
    long arrSum = 0;
    for (int num : arr) {
      arrSum += num;
    }

    // Function calls
    long funcSum = 0;
    for (int i = 0; i < 1000000; i++) {
      funcSum += square(i);
    }

    // File write and read 1000 times
    for (int j = 0; j < 1000; j++) {
      FileWriter writer = new FileWriter("test.txt");
      for (int i = 0; i < 10000; i++) {
        writer.write("This is a test file.\n");
      }
      writer.close();

      BufferedReader reader = new BufferedReader(new FileReader("test.txt"));
      StringBuilder fileContent = new StringBuilder();
      String line;
      while ((line = reader.readLine()) != null) {
        fileContent.append(line).append("\n");
      }
      reader.close();
    }

    // Sorting
    List<Double> unsortedArr = new ArrayList<>();
    for (int i = 0; i < 100000; i++) {
      unsortedArr.add(Math.random());
    }
    Collections.sort(unsortedArr);

    // HashMap operations
    HashMap<String, Integer> dict = new HashMap<>();
    for (int i = 0; i < 100000; i++) {
      dict.put("key" + i, i);
    }
    long dictSum = 0;
    for (Integer value : dict.values()) {
      dictSum += value;
    }
  }

  public static int square(int n) {
    return n * n;
  }
}
