package task2;
public class PoJoClassForStudent {
   private String name;
   private int regNo;
   private String rollNo;
   private int age;
    private String department;
   
    @Override
    public String toString() {
        return "PoJoClassForStudent{" +
                "name='" + name + '\'' +
                ", regNo=" + regNo +
                ", rollNo='" + rollNo + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRegNo() {
        return regNo;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }
}
