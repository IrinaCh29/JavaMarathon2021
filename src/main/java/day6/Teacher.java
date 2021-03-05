package day6;

public class Teacher {
    private String nameTeacher;
    private String subject;

    public Teacher(String nameTeacher, String subject) {
        this.nameTeacher = nameTeacher;
        this.subject = subject;
    }

    public String getNameTeacher() {
        return nameTeacher;
    }

    public void setNameTeacher(String nameTeacher) {
        this.nameTeacher = nameTeacher;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void evaluate(Student student) {
        int assessment = ((int)(Math.random() * 4 + 2));
        String mark = null;
        switch (assessment) {
            case 2:
                mark = "неудовлетворительно";
                break;
            case 3:
                mark = "удовлетворительно";
                break;
            case 4:
                mark = "хорошо";
                break;
            case 5:
                mark = "отлично";
                break;
            default:
                mark = "хорошо";
                break;
        }

        System.out.println("Преподаватель " + nameTeacher.toUpperCase() + " оценил студента с именем " + student.getNameStudent().toUpperCase() + " по предмету " + subject.toUpperCase() + " на оценку " + mark.toUpperCase());
    }
}