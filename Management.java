import java.util.ArrayList;
import java.util.Scanner;

public class Management {
    InputAndOutput io = new InputAndOutput();
    static ArrayList<Person> listPerson = new ArrayList<>();

    public void showAll() {

        if (!listPerson.isEmpty()) {
            for (int i = 0; i < listPerson.size(); i++) {
                io.display(listPerson.get(i));
                if (i % 5 == 4 && i != listPerson.size() - 1) {
                    System.out.println("tab enter to continue");
                    io.inputString();
                }
            }

        } else System.out.println("blank");
    }


    public Person findById(String num) {
        for (Person person : listPerson) {
            if (num.equalsIgnoreCase(person.getPhoneNumber())) {
                return person;
            }
        }
        return null;
    }


    public void addPerson() {
        Person person = io.creatPerson();
        listPerson.add(person);
    }

    public void update() {
        String numberPhone = io.inputNumberPhone();
        Person person = findById(numberPhone);
        if (person != null) {
            person.setName(io.inputName());
            person.setGender(io.inputGender());
            person.setAddress(io.inputAddress());
            person.setBirthday(io.inputBirthday());
            person.setEmail(io.inputEmail());
            person.setGroup(io.inputGroup());
             io.display(true);
        } else {
            io.display(false);
        }
    }


    public void findPerson() {
        String numberPhone = io.inputNumberPhone();
        Person person = findById(numberPhone);
        if (person != null) {
            io.display(person);
            io.display(true);
        } else {
            io.display(false);
        }
    }


    public void remove() {
        String numberPhone = io.inputNumberPhone();
        Person person = findById(numberPhone);
        if (person != null) {
            boolean isRemove = io.isConfirm();
            if (isRemove) {
                listPerson.remove(person);
                io.display(true);
            } else return;
        } else {
            io.display(false);
        }
    }

}
