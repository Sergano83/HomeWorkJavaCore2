package DZ4.task2;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Ваня", "89151234567");
        phonebook.add("Антон", "89261234567");
        phonebook.add("Ольга", "891031234567");
        phonebook.add("Галя", "89061234567");
        phonebook.add("Юля", "112");


        System.out.println(phonebook.get("Ваня"));


    }

}
