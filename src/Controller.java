public class Controller {

    StreamService ss = new StreamService();

    public void addGroups(StudentGroup studentGroup){
        ss.add(studentGroup);
    }

    public void sortByName(){
        ss.sortByName();
    }

    public void sortByNumber(){
        ss.sortByNumber();
    }

    public void show(){
        ss.showGroups();
    }
}
