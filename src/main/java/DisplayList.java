import java.util.Vector;

/**
 * Created by Minh Hang on 09/22/2016.
 */
public class DisplayList{
    public void Display(Vector<Student> lst) {
        if (lst.size() != 0) {
            for (int i = 0; i < lst.size(); i++) {
                System.out.println("---------------------------------------------");
                System.out.println("====The Student " + (i + 1) + "====");
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
        } else
            System.out.println("List is Null!!!");
    }
}
