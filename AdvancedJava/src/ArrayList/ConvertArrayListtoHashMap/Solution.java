package ArrayList.ConvertArrayListtoHashMap;

import java.util.*;

// Java program to convert ArrayList to HashMap
public class Solution {

    public static void main1(String[] args) {

        // ArrayList of string
        ArrayList<String> languageList
                = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "PHP", "NodeJS"));

        System.out.println("-------------ArrayList---------------");


        // printing the ArrayList
        for (String language : languageList) {
            System.out.println(language);
        }

        System.out.println("--------------HashMap----------------");

        // convertArrayListToHashMap() method directly converts ArrayList to Hashmap
        HashMap<String, Integer> languageMap = convertArrayListToHashMap(languageList);

        // printing the HashMap
        for (Map.Entry<String, Integer> entry : languageMap.entrySet()) {

            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }
    }

    private static HashMap<String, Integer> convertArrayListToHashMap1(ArrayList<String> arrayList) {

        HashMap<String, Integer> hashMap = new HashMap<>();

        for (String str : arrayList) {

            hashMap.put(str, str.length());
        }

        return hashMap;
    }

    //output:-------------ArrayList---------------
    //Java
    //C++
    //Python
    //PHP
    //NodeJS
    //--------------HashMap----------------
    //Java : 4
    //C++ : 3
    //PHP : 3
    //NodeJS : 6
    //Python : 6


// Java program to convert ArrayList

    public static void main(String[] args) {
        // ArrayList of string
        ArrayList<String> languageList
                = new ArrayList<>(Arrays.asList("Java", "C++", "Python", "PHP", "NodeJS"));

        System.out.println("-------------ArrayList---------------");

        // printing the ArrayList
        for (String language : languageList) {

            System.out.println(language);
        }

        System.out.println("--------------HashMap----------------");

        // convertArrayListToHashMap() method directly
        // converts ArrayList to HashMap
        HashMap<String, Integer> languageMap
                = convertArrayListToHashMap(languageList);

        // printing the HashMap
        for (Map.Entry<String, Integer> entry :
                languageMap.entrySet()) {

            System.out.println(entry.getKey() + " : "
                    + entry.getValue());
        }
    }

    private static HashMap<String, Integer> convertArrayListToHashMap(ArrayList<String> arrayList) {

        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        for (String str : arrayList) {
            linkedHashMap.put(str, str.length());
        }
        return linkedHashMap;
    }

    //output:
    // -------------ArrayList---------------
    //Java
    //C++
    //Python
    //PHP
    //NodeJS
    //--------------HashMap----------------
    //Java : 4
    //C++ : 3
    //Python : 6
    //PHP : 3
    //NodeJS : 6
}


