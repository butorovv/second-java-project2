import java.util.Arrays;

public class SortedStringArray {
    public String[] array;
    public int size;

    public SortedStringArray() {
        array = new String[10];
        size = 0;
    }

    public void add(String element) {
        ensureCapacity();
        int index = size;
        for (int i = 0; i < size; i++) {
            if (element.length() < array[i].length()) {
                index = i;
                break;
            }
        }
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = element;
        size++;
    }

    public String getMax() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }
        return array[size - 1];
    }

    public double getAverageLength() {
        if (size == 0) {
            throw new IllegalStateException("Array is empty");
        }
        int totalLength = 0;
        for (int i = 0; i < size; i++) {
            totalLength += array[i].length();
        }
        return (double) totalLength / size;
    }

    private void ensureCapacity() {
        if (size == array.length) {
            array = Arrays.copyOf(array, size * 2);
        }
    }
}
