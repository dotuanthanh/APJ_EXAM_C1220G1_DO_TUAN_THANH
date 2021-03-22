import java.util.Scanner;

public class InputAndOutput {
    Scanner scanner = new Scanner(System.in);

    public String inputString() {
        String str = scanner.nextLine();
        return str;
    }

    public int inputTypeNumber() {
        while (true) {
            try {
                int num = Integer.parseInt(scanner.nextLine());
                return num;
            } catch (Exception e) {
                System.out.println("wrongg iput again");
            }
        }

    }

    public String inputName() {
        System.out.println("input the name ");
        String name = inputString();
        return name;
    }

    public String inputGender() {
        System.out.println("input gender");
        String gender = inputString();
        return gender;
    }

    public int inputAge() {
        System.out.println("input age");
        int age = inputTypeNumber();
        return age;
    }

    public String inputNumberPhone() {
        System.out.println("input number phone");
        String num = inputString();
        return num;
    }

    public String inputAddress() {

        System.out.println("input address");
        String address = inputString();
        return address;
    }

    public String inputGroup() {

        System.out.println("input group");
        String group = inputString();
        return group;
    }

    public String inputBirthday() {

        System.out.println("input birthday");
        String birthdays = inputString();
        return birthdays;
    }

    public String inputEmail() {

        System.out.println("input email");
        String email = inputString();
        return email;
    }

    public Person creatPerson() {

        return new Person(inputName(), inputNumberPhone(), inputGender(), inputAddress(), inputBirthday(), inputEmail(), inputGroup());


    }

    public void display(Person person) {
        System.out.println(person.toString());
    }

    public void display(Boolean data) {
        if (data) {
            System.out.println("SUCCESS");
        } else System.out.println("FALSE TRY AGAIN");
    }

    public boolean isConfirm() {
        System.out.println("do you want to remove it ");
        String str = inputString();
        if (str.equalsIgnoreCase("y")) {
            return true;
        } else return false;

    }


}
