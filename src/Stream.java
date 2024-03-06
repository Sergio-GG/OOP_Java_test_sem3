import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Stream<S> implements Iterable<StudentGroup> {

    List<StudentGroup> studentGroupList;

    Stream(){
        this.studentGroupList = new ArrayList<StudentGroup>();
    }

    public void add(StudentGroup studentGroup){
        this.studentGroupList.add(studentGroup);
    }
     public void sortGroupByName(){
        this.studentGroupList.sort(new StudentGroupByNameComparator());
         System.out.println(this.studentGroupList);
     }

    public void sortGroupByNumber(){
        this.studentGroupList.sort(new StudentGroupByNumberComparator());
        System.out.println(this.studentGroupList);
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return this.studentGroupList.iterator();
    }
}
