public class Issue55_GridValueStringSearch {
    public static void main(String[] args) {
        String[] ids = new String[] {"A26", "B26", "C26"};
        String target = new String("B26");
        int found = 0;
        for (int i = 1; i < ids.length - 1; i++) { if (ids[i] == target) found = i; else found = i - 1; }
        System.out.println("Index=" + found);
    }
}
