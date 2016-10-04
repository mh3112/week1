import java.io.*;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Minh Hang on 09/20/2016.
 */

public class AddStudent{

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Scanner sc = new Scanner(System.in);

    public int Choice() {
        System.out.println("1. Add from the keyboard");
        System.out.println("2. Add from the file with path. ");
        System.out.println("3. Back");
        System.out.print("=>Enter the number: ");
        return sc.nextInt();
    }

    public void Input(Vector<Student> lst) {
        try {
            Student inf = new Student();
            System.out.println("Enter the ID: ");
            inf.setId(br.readLine());
            System.out.println("Enter the Name: ");
            inf.setName(br.readLine());
            System.out.println("Enter the Gender: ");
            String s = br.readLine();
            if (s == "Nam" || s == "nam") {
                inf.setGender(true);
            }
            if (s == "Nu" || s == "nu") {
                inf.setGender(false);
            }
            System.out.println("Enter the Address: ");
            inf.setAddress(br.readLine());
            System.out.println("Enter the Date of Birth: ");
            inf.setdOB(br.readLine());
            System.out.println("Enter the Scores:   ");
            System.out.println("Math=  ");
            try {
                inf.setMath(Float.parseFloat(br.readLine()));
            } catch (Exception e) {
                System.out.println("Error! Must be enter the number!");
            }
            System.out.println("Physical= ");
            try {
                inf.setPhysic(Float.parseFloat(br.readLine()));
            } catch (Exception e) {
                System.out.println("Error! Must be enter the number!");
            }
            System.out.println("Chemistry= ");
            try {
                inf.setChemis(Float.parseFloat(br.readLine()));
            } catch (Exception e) {
                System.out.println("Error! Must be enter the number!");
            }
            inf.setTotal((inf.getMath() + inf.getPhysic() + inf.getChemis()));
            lst.addElement(inf);
        } catch (IOException ex) {
            System.out.println("Error Input!");
        }

    }

    public int Keyboard(Vector<Student> lst) {
        int n;
        System.out.print("Enter N= ");
        n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.println("--------------------------------------------");
            System.out.println("====The Student " + i + "====");
            Input(lst);
        }
        System.out.println("Do you want to continue? (1-Yes/0-No) ");
        return sc.nextInt();
    }

    public void WithPath(Vector<Student> lst) throws IOException {
        /*
        001|Nguyen A|Ha Noi|Nam|12/1/1996|5|7|8|20
     */
        System.out.println("Enter the path: ");
        String str = br.readLine();
        BufferedReader brd = new BufferedReader(new FileReader(str));
        String sCurrentLine;

        while ((sCurrentLine = brd.readLine()) != null) {
            Student stCurrent = new Student();
            String[] arr = sCurrentLine.split("\\|");
            stCurrent.setId(arr[0]);
            stCurrent.setName(arr[1]);
            stCurrent.setAddress(arr[2]);
            if (arr[3].equals("Nam") || arr[3].equals("nam"))
                stCurrent.setGender(true);
            else if (arr[3].equals("Nu") || arr[3].equals("nu"))
                stCurrent.setGender(false);
            stCurrent.setdOB(arr[4]);
            stCurrent.setMath(Float.parseFloat(arr[5]));
            stCurrent.setPhysic(Float.parseFloat(arr[6]));
            stCurrent.setChemis(Float.parseFloat(arr[7]));
            stCurrent.setTotal(Float.parseFloat(arr[8]));
            lst.addElement(stCurrent);
        }
        System.out.println("Read file is successfull!!!");
    }


    public void InsertSt(Vector<Student> lst) throws IOException {
        int ch = Choice();
        switch (ch) {
            case 1:
                if (Keyboard(lst) == 1)
                    InsertSt(lst);
                break;
            case 2:
                WithPath(lst);
                break;
            default:
                break;
        }

    }

}
