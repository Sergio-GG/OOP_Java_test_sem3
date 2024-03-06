import java.util.Comparator;

public class StudentGroupByNumberComparator implements Comparator<StudentGroup> {
    @Override
    public int compare(StudentGroup o1, StudentGroup o2) {
        return o1.getStudentsNumber() - o2.getStudentsNumber();
    }
}
