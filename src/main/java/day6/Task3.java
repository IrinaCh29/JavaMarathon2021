package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Телятник Игорь Иванович","химия");
        Student student = new Student("Колесник Олег");
        teacher.evaluate(student);
    }
}