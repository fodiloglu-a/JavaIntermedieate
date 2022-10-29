package MapHashMap;


import WarriorGame.Armor.IceArmor;

import java.sql.SQLOutput;
import java.util.HashMap;
import java.util.Map;

public class Examle {
    public static void main(String[] args) {
        Map<String,String>country=new HashMap<>();
        country.put("TR","Türkiye");
        country.put("ENG","England");
        country.put("FR","Franch");
        country.put("DOC","Dochland");


        System.out.println(country.toString());
        System.out.println(country.get("TR"));
        System.out.println(country.get("DOC"));
        System.out.println(country.get("ENG"));
        System.out.println(country.get("FR"));
        for (String key: country.keySet()
             ) {
            System.out.println(key);

        }
        for (String value: country.values()
        ) {
            System.out.println(value);

        }
        country.containsKey("TR");
        System.out.println(country.hashCode());
        country.clear();
    }
}


