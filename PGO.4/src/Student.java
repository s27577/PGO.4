import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Student {
    private static int nextId = 1;

    private String status;
    private String indexnumber;
    private String firstName;
    private String lastName;
    private LocalDate birthday;
    private String email;
    private String address;
    private StudyProgramme studyProgramme;
    private int currentSemester;
    private List<Grade> grades;

    public Student(String status, int indexnumber, String firstName, String lastName, LocalDate birthday, String email, String address, StudyProgramme studyProgramme, int currentSemester, List<Grade> grades) {
        this.status = "kandydat";
        this.indexnumber = "s" + nextId++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthday = birthday;
        this.email = email;
        this.address = address;
        this.studyProgramme = studyProgramme;
        this.currentSemester = 0;
        this.grades = new ArrayList<>();
    }

    public static int getNextId() {
        return nextId;
    }
    public static void setNextId(int nextId) {
        Student.nextId = nextId;
    }
    public String getIndexnumber() {
        return indexnumber;
    }
    public void setIndexnumber(String indexnumber) {
        this.indexnumber = indexnumber;
    }
    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getBirthday() {
        return birthday;
    }
    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public StudyProgramme getStudyProgramme() {
        return studyProgramme;
    }
    public void setStudyProgramme(StudyProgramme studyProgramme) {
        this.studyProgramme = studyProgramme;
    }
    public int getCurrentSemester() {
        return currentSemester;
    }
    public void setCurrentSemester(int currentSemester) {
        this.currentSemester = currentSemester;
    }
    public int getITNS() {
        int itns = 0;
        for (Grade grade : grades) {
            if (grade.getGrade() < 3) {
                itns++;
            }
        }
        return itns;
    }

    public void promoteToNextSemester() {
        if (currentSemester < studyProgramme.getNumberOfSemesters() && getITNS() <= studyProgramme.getNumberOfPossibleITNS()) {
            currentSemester++;
            if (currentSemester == studyProgramme.getNumberOfSemesters()) {
                status = "absolwent";
            }
        }
    }
    public void enrollStudent(StudyProgramme studyProgramme) {

    }
    public void addGrade(double grade, ) {

    }
}
