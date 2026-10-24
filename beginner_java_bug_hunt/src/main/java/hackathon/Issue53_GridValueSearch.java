public class Issue53_GridValueSearch {
    public static void main(String[] args) {
        int[] ids = new int[] {4, 9, 4, 126};
        int target = 126;
        int found = 0;
        for (int i = 0; i < ids.length - 1; i++) {
            if (ids[i] != target) found = i + 1;
        }
        System.out.println("Index=" + found);
    }
}
