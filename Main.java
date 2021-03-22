import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Management management = new Management();
        FileProcess fileProcess = new FileProcess();
        Scanner scanner = new Scanner(System.in);
        Person person1 = new Person("thanh", "12345", "male", "vietnam", "30/6/2000", "thanh@gmail.com", "friend");
        Person person2 = new Person("trang", "112455", "male", "vietnam", "30/1/2010", "ssssss@gmail.com", "friend");
        Person person3 = new Person("nam", "0334239425", "male", "vietnam", "3/6/2010", "thansssh@gmail.com", "friend");
        Person person4 = new Person("nga", "113", "male", "vietnam", "3/3/1995", "ff@gmail.com", "friend");
        Person person5 = new Person("hong", "114", "male", "vietnam", "2/6/1991", "sad@gmail.com", "friend");
        Person person6 = new Person("phuc", "119", "male", "vietnam", "3/6/1999", "thaasdnh@gmail.com", "friend");
        Person person7 = new Person("daddy", "999", "male", "vietnam", "22/10/1999", "sadasfd@gmail.com", "parents");
        Person person8 = new Person("mama", "123", "female", "vietnam", "13/4/2000", "asssss@gmail.com", "parents");
         management.listPerson.add(person1);
        management.listPerson.add(person2);
        management.listPerson.add(person3);
        management.listPerson.add(person4);
        management.listPerson.add(person5);
        management.listPerson.add(person6);
        management.listPerson.add(person7);
        management.listPerson.add(person8);
        String c ;
        while (true) {
            menu();
            c = scanner.nextLine();
            switch (c) {
                case "1":
                    management.showAll();
                    break;
                case "2":
                    management.addPerson();
                    break;
                case "3":
                    management.update();
                    break;
                case "4":
                    management.remove();
                    break;
                case "5":
                    management.findPerson();
                    break;
                case "6":
                    fileProcess.readFile();
                    break;
                case "7":
                    fileProcess.fileWriter();
                    break;
                case "8":
                    System.exit(0);
            }
        }

    }

    public static void menu() {
        System.out.println("------------------------------------");
        System.out.println("1.Display");
        System.out.println("2.Add");
        System.out.println("3.Update");
        System.out.println("4.Delete");
        System.out.println("5.Find");
        System.out.println("6.Read File");
        System.out.println("7.Write File");
        System.out.println("8.Exit");
    }
}
