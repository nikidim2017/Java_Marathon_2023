package day9.Task1;

public class Student extends Human {


    private String groupName;

    public Student(String name, String groupName) {
        super(name);
        this.groupName = groupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void printInfo() {
        System.out.println("Этот человек с именем " + super.getName());
        System.out.println("Этот студент с именем " + getName());
    }

}
