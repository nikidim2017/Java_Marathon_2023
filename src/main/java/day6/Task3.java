package day6;

public class Task3 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Иван Петрович", "информатика");
        Student student = new Student("Иванов Сергей");

        teacher.evaluate(student);

    }
}
