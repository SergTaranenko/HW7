package Part2;

public class Main {
    public static void main(String[] args) {
        String[][] arr1 = new String[][]{
                {"1", "2", "3", "4", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"},
                {"1", "2", "3", "4"}};

        String[][] arr2 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "p"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};

        String[][] arr3 = new String[][]{
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"},
                {"1", "1", "1", "1"}};

        try {
            ArraySummator.sum(arr1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            ArraySummator.sum(arr2);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            ArraySummator.sum(arr3);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
