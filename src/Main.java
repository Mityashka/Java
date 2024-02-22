public class Main {
    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addContact("Ваня", "55332211");
        phoneBook.addContact("Лена", "55332212");
        phoneBook.addContact("Лололошка", "55332213");
        phoneBook.addContact("Ваня", "55332214");
        phoneBook.addContact("Егор", "55332215");

        phoneBook.displayPhoneBook();
    }
}