import java.util.Vector;

/**
 * Created by Minh Hang on 09/22/2016.
 */
public class StatisticList {
    public void StatisticSt(Vector<Student> lst){
        System.out.println("The size of list student: "+lst.size());
        float TB, Kha, Gioi, XS;
        TB=0; Kha=0; Gioi=0; XS=0;
        for(int i=0;i<lst.size();i++){
            if(lst.get(i).getTotal()<15)
                TB++;
            else if(lst.get(i).getTotal()>=15&&(lst.get(i).getTotal()<20))
                Kha++;
            else if(lst.get(i).getTotal()>=20&&(lst.get(i).getTotal()<25))
                Gioi++;
            else
                XS++;
        }
        System.out.println("Loai trung binh: "+(int)TB);
        System.out.println("Loai kha: "+(int)Kha);
        System.out.println("Loai gioi: "+(int)Gioi);
        System.out.println("Loai xuat sac: "+(int)XS);
    }
}
