package kyu5.Predictive_contact_list;


import java.util.*;

public class PredictiveContactList {


    public static List<String> predict(List<String> contacts, String keystrokes) {
        final Map<String, String> keyStrokeMap = new HashMap<>();
        keyStrokeMap.put("2", "abc");
        keyStrokeMap.put("3", "def");
        keyStrokeMap.put("4", "ghi");
        keyStrokeMap.put("5", "jkl");
        keyStrokeMap.put("6", "mno");
        keyStrokeMap.put("7", "pqrs");
        keyStrokeMap.put("8", "tuv");
        keyStrokeMap.put("9", "wxyz");

        List<String> resultContacts = new ArrayList<>();
        
        contacts.forEach(contact -> {
            if (contact.length() >= keystrokes.length()) {
                for (int i = 0; i < contact.length(); i++) {
                    if (i < keystrokes.length()) {
                        String index = String.valueOf(keystrokes.charAt(i));
                        if (!keyStrokeMap.get(index).contains(String.valueOf(contact.toLowerCase().charAt(i)))) {
                            return;
                        }
                    }
                }
                resultContacts.add(contact);
            }
        });
        return resultContacts;
    }
}
