package task2;

public class ConstructorOverloadedForUser {
    String userName;
    String password;
    int age;

    public ConstructorOverloadedForUser(String userName) {
        this.userName = userName;
    }

    public ConstructorOverloadedForUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public ConstructorOverloadedForUser(String userName, String password, int age) {
        this.userName = userName;
        this.password = password;
        this.age = age;
    }

    @Override
    public String toString() {
        return "ConstructorOverloadedForUser{" +
                "userName='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                '}';
    }
}
