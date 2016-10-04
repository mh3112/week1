//import org.codehaus.jackson.map.ObjectMapper;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Minh Hang on 09/20/2016.
 */
public class SearchStudent {
    Scanner sc = new Scanner(System.in);
    BufferedReader brd = new BufferedReader(new InputStreamReader(System.in));

    public int Choice() {
        System.out.println("1. Search by Scores Total ");
        System.out.println("2. Search by ID ");
        System.out.println("3. Search by Name");
        System.out.println("4. Search by Scores(5-Math/6-Physical/7-Chemistry)");
        System.out.print("=>Enter the number: ");
        return sc.nextInt();
    }


    public void WriteToFile(String str) throws IOException {
        File file = new File("FindStudent.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileWriter fw = new FileWriter(file.getAbsoluteFile());
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(str);
        bw.close();


        System.out.println("===== Write to File successed!!! =====");


    }

    public void PrintStudent(int i, Vector<Student> lst) throws IOException {
        String str_find;
        String gen;
        if (lst.get(i).isGender() == true)
            gen = "Nam";
        else
            gen = "Nu";
        str_find = lst.get(i).getId() + "|" + lst.get(i).getName() + "|" + lst.get(i).getAddress() + "|" + gen + "|" + lst.get(i).getdOB() + "|"
                + String.valueOf(lst.get(i).getMath()) + "|" + String.valueOf(lst.get(i).getPhysic()) + "|" + String.valueOf(lst.get(i).getChemis())
                + "|" + String.valueOf(lst.get(i).getTotal());
        WriteToFile(str_find);
    }

    public void Display(int i, Vector<Student> lst) {
        System.out.println("---------------------------------------------");
        System.out.println("====The Student " + (i) + "====");
        System.out.println("ID: " + lst.get(i).getId());
        System.out.println("Name: " + lst.get(i).getName());
        if (lst.get(i).isGender() == true)
            System.out.println("Gender: Nam");
        else
            System.out.println("Gender: Nu");
        System.out.println("Address: " + lst.get(i).getAddress());
        System.out.println("Date of Birth" + lst.get(i).getdOB());
        System.out.println("Math=  " + lst.get(i).getMath());
        System.out.println("Physical= " + lst.get(i).getPhysic());
        System.out.println("Chemistry= " + lst.get(i).getChemis());
        System.out.println("Total= " + lst.get(i).getTotal());
    }

    public int Search(Vector<Student> lst) throws IOException {
        if (lst.size() == 0)
            System.out.println("List is Null!!!");
        else {
            String str;

            Float ft;
            boolean find = false;
            int ch = Choice();
            switch (ch) {
                case 1: {
                    System.out.println("Enter the key: ");
                    ft = Float.parseFloat(brd.readLine());
                    for (int i = 0; i < lst.size(); i++) {
                        if (lst.get(i).getTotal() == ft) {
                            Display(i, lst);
                            find = true;
                            PrintStudent(i, lst);
                        }
                    }

                    if (find == false)
                        System.out.println("Can not to find!!!");
                    break;
                }
                case 2:
                    System.out.println("Enter the key: ");
                    str = brd.readLine();
                    for (int i = 0; i < lst.size(); i++) {
                        if (lst.get(i).getId().equals(str)) {
                            Display(i, lst);
                            find = true;
                            PrintStudent(i, lst);
                        }
                    }
                    if (find == false)
                        System.out.println("Can not to find!!!");
                    break;

                case 3:
                    System.out.println("Enter the key: ");
                    str = brd.readLine();
                    for (int i = 0; i < lst.size(); i++) {
                        if (lst.get(i).getName().equals(str)) {
                            Display(i, lst);
                            find = true;
                            PrintStudent(i, lst);
                        }
                    }
                    if (find == false)
                        System.out.println("Can not to find!!!");
                    break;
                case 5:
                    System.out.println("Enter the key: ");
                    ft = Float.parseFloat(brd.readLine());
                    for (int i = 0; i < lst.size(); i++) {
                        if (lst.get(i).getMath() == ft) {
                            Display(i, lst);
                            find = true;
                            PrintStudent(i, lst);
                        }
                    }
                    if (find == false)
                        System.out.println("Can not to find!!!");
                    break;
                case 6: {
                    System.out.println("Enter the key: ");
                    ft = Float.parseFloat(brd.readLine());
                    for (int i = 0; i < lst.size(); i++) {
                        if (lst.get(i).getPhysic() == ft) {
                            Display(i, lst);
                            find = true;
                            PrintStudent(i, lst);
                        }
                    }
                    if (find == false)
                        System.out.println("Can not to find!!!");
                    break;
                }
                case 7:
                    System.out.println("Enter the key: ");
                    ft = Float.parseFloat(brd.readLine());
                    for (int i = 0; i < lst.size(); i++) {
                        if (lst.get(i).getChemis() == ft) {
                            Display(i, lst);
                            find = true;
                            PrintStudent(i, lst);
                        }
                    }
                    if (find == false)
                        System.out.println("Can not to find!!!");
                    break;
                default:
                    break;
            }
        }
        System.out.println("Do you want to continue? (1-Yes/0-No) ");
        return sc.nextInt();
    }

    public void SearchSt(Vector<Student> lst) throws IOException {
        switch (Search(lst)) {
            case 1:
                if (Search(lst) == 1)
                    break;
                break;
            default:
                System.exit(0);
        }
    }
}
