import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Minh Hang on 09/20/2016.
 */
public class DeleteStudent {
    public void DeleteSt(Vector<Student> lst) {
        if (lst.size() != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the ID which you want to delete: ");
            String str = sc.nextLine();
            for (int i = 0; i < lst.size(); i++) {
                if (str.equals(lst.get(i).getId())) {
                    lst.remove(i);
                    System.out.println("Deleted the student have ID= " + str);
                }
            }
        } else
            System.out.println("List is Null!!!");

    }
}
