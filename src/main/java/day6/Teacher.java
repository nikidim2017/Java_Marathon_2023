package day6;

public class Teacher {

    private String name;
    private String subject;

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public void evaluate(Student student) {
        String grade = null;
        int num = (int) (2 + (Math.random() * 4));
        switch (num) {
            case 2:
                grade = "Неудовлетворительно";
                break;
            case 3:
                grade = "Удовлетворительно";
                break;
            case 4:
                grade = "Хорошо";
                break;
            case 5:
                grade = "Отлично";
                break;
        }
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() + " по предмету " + subject + " на оценку " + grade);
    }
}
