import jdk.nashorn.internal.ir.WhileNode;

import java.io.*;

public class FileProcess {
    public static String LINK_FILE = "C:\\Users\\Dell\\IdeaProjects\\QuanLyDanhBa\\src\\contact.csv";
    File file = new File(LINK_FILE);

    public void readFile() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                String[] arrays;
                arrays = line.split(",");
                Management.listPerson.add(new Person(arrays[0], arrays[1], arrays[2], arrays[3], arrays[4], arrays[5], arrays[6]));
                System.out.println(line);
            }
        } catch (IOException e) {

            e.printStackTrace();
        }

    }

    public void fileWriter() {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true));
            for (Person person : Management.listPerson) {
                bufferedWriter.write(person.writeToFile());
            }
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
