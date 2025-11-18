package practice3;

public class University {

    static String universityName;
    final int studentID;
    String studentName;

    University(int someStudentID, String someStudentName) {
        this.studentID = someStudentID;
        this.studentName = someStudentName;
    }

    String getStudentName() {
        return this.studentName;
    }

    static String changeUniversityName(String newName) {
        return University.universityName = newName;
    }

    void printStudentInfo() {
        System.out.println("Студент: " + this.studentName);
        System.out.println("ID: " + this.studentID);
        System.out.println("Университет: " + University.universityName);
    }

}
