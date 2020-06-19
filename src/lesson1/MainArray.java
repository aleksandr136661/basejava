package lesson1;

import java.util.Scanner;

public class MainArray {
    public static void main(String[] args) {
        ArrayStorage aS = new ArrayStorage();
        Resume r;
        while (true) {
            System.out.print("Введите любую команду - (save, get, delete, size, clear, getAll): ");
            Scanner scan = new Scanner(System.in);
            String[] team = scan.nextLine().split(" ");
            String uuid = null;
            switch (team[0]) {
                case "save":
                    r = new Resume();
                    r.uuid = uuid;
                    aS.save(r);
                    System.out.println("Команда  save");
                    return;
                case "get":
                    System.out.println(aS.get(uuid));
                    return;
                case "delete":
                    aS.delete(uuid);
                    System.out.println("Команда  delete");
                    return;
                case "size":
                    System.out.println(aS.size());
                    return;
                case "clear":
                    aS.clear();
                    System.out.println("Команда  clear");
                    return;
                case "getAll":
                    System.out.println(aS.getAll());
                    return;

            }
        }
    }
}