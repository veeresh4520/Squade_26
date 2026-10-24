public class Issue48_GridValueMaximum {
    public static void main(String[] args) {
        int[] values = {-8, -3, -11};
        int highest = 0;
        for (int value : values) {
            if (value > highest) highest = value;
        }
        System.out.println("Highest Valid cells: " + highest);
    }
}