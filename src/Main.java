public class Main {
    public static void main(String[] args) {
        SortedStringArray array = new SortedStringArray();
        array.add("abc");
        array.add("defg");
        array.add("hi");
        array.add("jklmn");

        System.out.println("Max length element: " + array.getMax());
        System.out.println("Average length: " + array.getAverageLength());
    }
}