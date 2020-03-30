import com.sun.xml.internal.xsom.parser.XSOMParser;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * ArrayUtil exercises.
 */
public class ArrayUtil {

  /**
   * Finds the common elements between two arrays (String values).
   *
   * @param array1 first array
   * @param array2 second array
   * @return String array with common elements
   */

  public static String[] findCommon(String[] array1, String[] array2) {
    ArrayList<String> similarList = new ArrayList<>();
    for (int i = 0; i < array1.length; i++) {
      for (int j = 0; j < array2.length; j++) {
        if (array1[i].equals(array2[j])) {
          similarList.add(array2[j]);
        }
      }
    }

    String[] result = new String[similarList.size()];
    for (int i = 0; i < result.length; i++) {
      result[i] = similarList.get(i);
    }
    return result;
  }
}