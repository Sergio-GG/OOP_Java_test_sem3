public class StudentGroup {
    String name;
    int studentsNumber;
    StudentGroup(String name, int studentsNumber){
        this. name = name;
        this.studentsNumber = studentsNumber;
    }

    public String getName() {
        return name;
    }

    public int getStudentsNumber() {
        return studentsNumber;
    }

    @Override
    public String toString() {
        return "StudentGroup{" +
                "name='" + name + '\'' +
                ", studentsNumber=" + studentsNumber +
                '}';
    }
}
