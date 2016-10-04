import java.io.Serializable;

/**
 * Created by Minh Hang on 09/20/2016.
 */



public class Student {

    private String name;
    private String id;
    private String address;
    private boolean gender;
    private String dOB;

    private float math;
    private float physic;
    private float chemis;

    private float total;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isGender() {
        return gender;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getdOB() {
        return dOB;
    }

    public void setdOB(String dOB) {
        this.dOB = dOB;
    }


    public float getMath() {
        return math;
    }

    public void setMath(float math) {
        this.math = math;
    }

    public float getPhysic() {
        return physic;
    }

    public void setPhysic(float physic) {
        this.physic = physic;
    }

    public float getChemis() {
        return chemis;
    }

    public void setChemis(float chemis) {
        this.chemis = chemis;
    }

    public float getTotal() {
        return total;
    }

    public void setTotal(float total) {
        this.total = total;
    }

    public Student() {


    }

    public Student(String name, String id, boolean gender, String address, String dOB, Float math, Float physic, Float chemis) {
        this.name = name;
        this.id = id;
        this.gender = gender;
        this.address = address;
        this.dOB = dOB;
        this.math = math;
        this.physic = physic;
        this.chemis = chemis;
    }


}

