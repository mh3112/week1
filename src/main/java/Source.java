import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

/**
 * Created by Minh Hang on 09/20/2016.
 */
public class Source {

    private int Menu() {
        System.out.println("##################_Menu_###############");
        System.out.println("1. Add a student");
        System.out.println("2. Display the list");
        System.out.println("3. Delete a student");
        System.out.println("4. Fix formation");
        System.out.println("5. Search a student");
        System.out.println("6. Arrange the list");
        System.out.println("7. Statistic");
        System.out.println("8. Exit");
        System.out.print("=>Enter the number: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextInt();
    }

    public void MainMenu() throws IOException {
        Vector<Student> list = new Vector<Student>();
        int menu = Menu();
        while (true) {
            switch (menu) {
                case 1:
                    AddStudent ad = new AddStudent();
                    ad.InsertSt(list);
                    break;
                case 2:
                    DisplayList dl = new DisplayList();
                    dl.Display(list);
                    break;
                case 3:
                    DeleteStudent ds = new DeleteStudent();
                    ds.DeleteSt(list);
                    break;
                case 4:
                    FixStudent fs = new FixStudent();
                    fs.FixSt(list);
                    break;
                case 5:
                    SearchStudent ss = new SearchStudent();
                    ss.SearchSt(list);
                    break;
                case 6:
                    SortStudent sst = new SortStudent();
                    sst.SortSt(list);
                    break;
                case 7:
                    StatisticList sl = new StatisticList();
                    sl.StatisticSt(list);
                    break;
                case 8:
                    System.exit(1);
                    break;
            }
            menu = Menu();
        }
    }

    public static void main(String[] args) throws IOException {

        Source sc = new Source();
        sc.MainMenu();

    }
}
