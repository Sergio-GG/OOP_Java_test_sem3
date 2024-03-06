public class Main {
    public static void main(String[] args) {
        StudentGroup studentGroup1 = new StudentGroup("AP-07", 25);
        StudentGroup studentGroup2 = new StudentGroup("AP-05", 30);
        StudentGroup studentGroup3 = new StudentGroup("AP-01", 29);

        Controller controller = new Controller();
        controller.addGroups(studentGroup1);
        controller.addGroups(studentGroup2);
        controller.addGroups(studentGroup3);
        controller.show();
        controller.sortByName();
        controller.sortByNumber();


    }
}