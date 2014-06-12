package corejava.collections;

public class Student implements Comparable<Student> {

    private String name;
    private Integer grade;

    public Student(String name, Integer grade) {
        this.name = name;
        this.grade = grade;
    }

    public String toString() {
        String result = name + ": " + grade.toString();
        return result;
    }
    
    @Override
    public int compareTo(Student other) {
        if (!this.grade.equals(other.grade)) {
            return this.grade.compareTo(other.grade);
        }
        return this.name.compareTo(other.name);
    }
}
