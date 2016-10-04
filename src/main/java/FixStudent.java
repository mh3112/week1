import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Vector;

/**
 * Created by Minh Hang on 09/22/2016.
 */
public class FixStudent {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public void Fix(int x,Vector<Student> lst) throws IOException {
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
        lst.add(x,inf);
    }

    public void FixSt(Vector<Student> lst) throws IOException {
        {
            System.out.println("Enter the ID of student which you want to fix: ");
            String k = br.readLine();
            boolean ch = false;
            for (int i = 0; i < lst.size(); i++) {
                if (lst.get(i).getId().equals(k)) {
                    lst.removeElementAt(i);
                    ch = true;
                    Fix(i,lst);
                }
            }
            if (ch == false)
                System.out.println("The ID is not correct!!!");
        }
    }
}
