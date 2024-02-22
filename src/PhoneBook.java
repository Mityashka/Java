import java.util.HashSet;
import java.util.HashMap;
import java.util.Map;

public class PhoneBook {
    private HashMap<String, HashSet<String>> contacts;

    public PhoneBook() {
        contacts = new HashMap<>();
    }

    public void addContact(String name, String phoneNumber) {
        HashSet<String> numbers = contacts.getOrDefault(name, new HashSet<>());
        numbers.add(phoneNumber);
        contacts.put(name, numbers);
    }

    public void displayPhoneBook() {
        for (Map.Entry<String, HashSet<String>> entry : contacts.entrySet()) {
            String name = entry.getKey();
            HashSet<String> numbers = entry.getValue();
            System.out.println(name + ": " + numbers);
        }
    }

}