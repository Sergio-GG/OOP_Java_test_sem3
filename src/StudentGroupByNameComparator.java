import java.util.Comparator;

public class StudentGroupByNameComparator implements Comparator<StudentGroup> {

    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
