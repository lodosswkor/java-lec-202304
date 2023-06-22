package manager.connect;

import manager.entity.Student;

import java.util.ArrayList;
import java.util.List;

public class CollectionDBConnect {
    private static final List<Student> students = new ArrayList<Student>();

    public static List<Student> getConnection() {
        return students;
    }

    public void closeConnection() {};
}
