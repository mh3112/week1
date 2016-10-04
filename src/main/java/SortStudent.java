import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

/**
 * Created by Minh Hang on 09/20/2016.
 */
public class SortStudent {
    /*
    - SBD (mặc định)
    - Thứ tự tăng dần của bảng chữ cái Anphabe.
    - Thứ tự tăng dần của tổng điểm.

     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    private Scanner sc = new Scanner(System.in);

    public int Choice() {
        System.out.println("1. Sort by the ID");
        System.out.println("2. Sort by the Name(Alphabet)");
        System.out.println("3. Sort by the Totals");
        System.out.print("=>Enter the number: ");
        return sc.nextInt();
    }

    public void Display(int i,Vector<Student> lst) {
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

    public int Sort(Vector<Student> lst) {
        Vector<Student> lst_new = new Vector<Student>();
        lst_new = lst;
        switch (Choice()) {
            case 1:
                Collections.sort(lst_new, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return o1.getId().compareTo(o2.getId());
                    }
                });
                for (int i = 0; i < lst_new.size(); i++) {
                    Display(i,lst_new);
                }
                break;
            case 2:
                Collections.sort(lst_new, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        return o1.getName().compareTo(o2.getName());
                    }
                });
                for (int i = 0; i < lst_new.size(); i++) {
                    Display(i,lst_new);
                }
                break;
            case 3:
                int count=0;
                Collections.sort(lst_new, new Comparator<Student>() {
                    public int compare(Student o1, Student o2) {
                        if(o1.getTotal()>o2.getTotal())
                            return 1;
                        else if(o1.getTotal()<o2.getTotal())
                            return -1;
                        else
                            return 0;
                    }
                });
                for (int i = 0; i < lst_new.size(); i++) {
                    Display(i,lst_new);
                }
                break;
        }
        System.out.println("Do you want to continue? (1-Yes/0-No) ");
        return sc.nextInt();
    }

    public void SortSt(Vector<Student> lst) {
        switch (Sort(lst)) {
            case 1:
                if (Sort(lst) == 1)
                    break;
                break;
            default:
                System.exit(0);
        }


    }

}
