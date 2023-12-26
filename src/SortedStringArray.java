import java.util.ArrayList;
import java.util.Arrays;

public class SortedStringArray {
    public ArrayList<String> array;

    public SortedStringArray() {
        array = new ArrayList<>();
    }

    public void add(String element) {
        boolean t = false;
        for (int i = 0; i < array.size(); i++) {
            if (element.length() < array.get(i).length())  {
                array.add(i, element);
                t = true;
                break;
            }
            else if (element.length() == array.get(i).length() && element.compareTo(array.get(i)) < 0) {
                array.add(i, element);
                t = true;
                break;
            }
        }
        if (!t){
            array.add(element);
        }
    }

    public String getMax() {
        if (array.size() == 0) {
            throw new IllegalStateException("Array is empty");
        }
        return array.get(array.size() - 1);
    }

    public double getAverageLength() {
        int arraysize = array.size();
        if (arraysize == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int totalLength = 0;
        for (int i = 0; i < arraysize; i++) {
            totalLength += array.get(i).length();
        }
        return (double) totalLength / arraysize;
    }
}