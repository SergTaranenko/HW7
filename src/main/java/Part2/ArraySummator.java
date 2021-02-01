package Part2;

public class ArraySummator {
    public static int sum(String[][] arr) {
        if (arr.length != 4 || arr[0].length != 4) throw new MyArraySizeException("I need 4x4 array only!!!");
        int sum = 0;
        for (int y = 0; y < arr.length; y++) {
            for (int x = 0; x < arr[y].length; x++) {
                if (!isNumber(arr[y][x])) throw new MyArrayDataException(String.format("Not a number data at cell [%d][%d]", x + 1, y +1));
                sum += Integer.parseInt(arr[y][x]);
            }
        }
        System.out.println("Sum is " + sum);
        return sum;
    }

    private static boolean isNumber(String s) {
        try{
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
