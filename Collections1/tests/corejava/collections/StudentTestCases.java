package corejava.collections;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentTestCases {

    private Student st1;
    private Student st2;
    private Student st3;
    private List<Student> students;

    @Before
    public void setUp() throws Exception {
        st1 = new Student("Gosho", 6);
        st2 = new Student("Pesho", 6);
        st3 = new Student("Batman", 3);
        students = new ArrayList<Student>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test() {
        Collections.sort(students);
        ArrayList<Student> studentsSorted = new ArrayList<Student>();
        studentsSorted.add(st3);
        studentsSorted.add(st1);
        studentsSorted.add(st2);
        assertEquals(students, studentsSorted);
    }

}
