import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CoreJavaCourse {
    @XmlElement
    private List<Student> enrolledStudents = new ArrayList<Student>();
    @XmlElement
    private int courseId = 1;
    @XmlElement
    private String courseName = "Core Java";

    public CoreJavaCourse() {
        enrolledStudents.add(new Student());
        enrolledStudents.add(new Student());
    }

    @Override
    public String toString() {
        return "CoreJavaCourse [enrolledStudents=" + enrolledStudents + ", courseId=" + courseId + ", courseName="
                + courseName + "]";
    }

}
