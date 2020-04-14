package prototype;

import java.util.HashMap;

public class Prototype_Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        HashMap<String, Character> list = new HashMap<>();

        list.put("1", new Wizard());
        list.put("2", new Rogue());
        list.put("3", new Paladin());

        System.out.println("HASHMAP OLUSTURULDU");
        list.forEach((key, value) -> {
            System.out.println("id: " + value.getId() + " | " + value);
        });

        HashMap<String, Character> listCloned = new HashMap<>();
        listCloned.put("1", (Character) list.get("1").clone());
        listCloned.put("2", (Character) list.get("2").shallow());
        listCloned.put("3", new Paladin());

        System.out.println("HASHMAP ICERIK DEGISTIRILDI");
        list.get("1").setId(1);
        list.get("2").setId(2);
        list.get("3").setId(3);
        System.out.println("ORJINAL HASHMAP");
        list.forEach((key, value) -> {
            System.out.println("id: " + value.getId() + " | " + value);
        });
        System.out.println("KOPYA HASHMAP");
        System.out.println("DeepCopy id: " + listCloned.get("1").getId() + " | " + listCloned.get("1"));
        System.out.println("ShallowCopy id: " + listCloned.get("2").getId() + " | " + listCloned.get("2"));
        System.out.println("CopyYok id: " + listCloned.get("3").getId() + " | " + listCloned.get("3"));
    }

}
