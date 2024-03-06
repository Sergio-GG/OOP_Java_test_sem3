import java.util.Iterator;
import java.util.List;

public class StreamService {
    private final Stream stream;

    StreamService(){
        this.stream = new Stream<>();
    }

    public void add(StudentGroup studentGroup){
        stream.add(studentGroup);
    }

    public void sortByName(){
        stream.sortGroupByName();
    }
    public void sortByNumber(){
        stream.sortGroupByNumber();
    }

    public void showGroups(){
        Iterator iterator = stream.iterator();
        while (iterator.hasNext()){
            StudentGroup sg = (StudentGroup) iterator.next();
            System.out.println(sg);
        }
    }

}
