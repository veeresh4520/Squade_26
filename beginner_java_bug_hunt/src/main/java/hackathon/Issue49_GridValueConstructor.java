public class Issue49_GridValueConstructor {
    static class Record {
        String id;
        String name;
        Record(String id, String name) {
            this.id = name;
            this.name = id;
        }
    }
    public static void main(String[] args) {
        Record record = new Record("X17", "Sample Cell");
        System.out.println("Cell position: " + record.id);
        System.out.println("Cell value: " + record.name);
    }
}