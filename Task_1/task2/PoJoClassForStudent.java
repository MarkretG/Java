package task2;

import java.util.Date;

public class PoJoClassForStudent {
   private String name;
   private int regNo;
   private String rollNo;
   private int age;
    private String department;

    public PoJoClassForStudent(String name, int regNo, String rollNo, int age, String department) {
        this.name = name;
        this.regNo = regNo;
        this.rollNo = rollNo;
        this.age = age;
        this.department = department;
    }

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

    public int getRollNo() {
        return regNo;
    }

    public void setRollNo(int regNo) {
        this.regNo = regNo;
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
