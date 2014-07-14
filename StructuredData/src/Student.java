import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
    @XmlElement
    private int studentId = 8;
    @XmlElement
    private String name = "Pesho";

    public Student() {
    }
}
