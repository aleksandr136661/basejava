package lesson1;

public class MainTestArrayStorage {
    public static void main(String[] args) {
        ArrayStorage aS = new ArrayStorage();
        Resume r1 = new Resume();
        r1.uuid = "uuid1";
        Resume r2 = new Resume();
        r2.uuid = "uuid2";
        Resume r3 = new Resume();
        r3.uuid = "uuid3";

        aS.save(r1);
        aS.save(r2);
        aS.save(r3);

        System.out.println("Get r1: " + aS.get(r2.uuid));
        System.out.println("Size: " + aS.size());

        System.out.print("\n");
        for (Resume r : aS.getAll()) {
            System.out.println(r);
        }

        aS.delete(r3.uuid);
        System.out.print("\n");
        for (Resume r : aS.getAll()) {
            System.out.println(r);
        }

        aS.clear();
        System.out.print("\n");
        for (Resume r : aS.getAll()) {
            System.out.println(r);
        }
        
        System.out.println("Size: " + aS.size());
    }
}
