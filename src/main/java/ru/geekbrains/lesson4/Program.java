package ru.geekbrains.lesson4;

import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(12);

        HashMap<String, String> hashMap = new HashMap<>(4);
        hashMap.put("+7900111223300", "AAAAAAA");
        hashMap.put("+7900111223301", "BBBBBBB");
        hashMap.put("+7900111223300", "DDDDDDD");
        hashMap.put("+7900111223302", "EEEEEEE1");
        hashMap.put("+7900111223303", "EEEEEEE2");
        hashMap.put("+7900111223304", "EEEEEEE3");
        hashMap.put("+7900111223305", "EEEEEEE4");
        hashMap.put("+7900111223306", "EEEEEEE5");
        hashMap.put("+7900111223307", "EEEEEEE6");
        hashMap.put("+7900111223308", "EEEEEEE7");
        hashMap.put("+7900111223309", "EEEEEEE8");
        hashMap.put("+7900111223310", "EEEEEEE8");


//        String searchResult = hashMap.get("+7900111223307");

        System.out.println(hashMap);

//        for (HashMap.Entity entuty : hashMap) {
//            System.out.printf("%s - %s", entuty.key, entuty.value);
//        }
    }

}
