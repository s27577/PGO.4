import java.util.List;

public class StudyProgramme {
    private String studyProgrammeName;
    private String codeOfStudyProgramme;
    private int numberOfSemesters;
    private int numberOfPossibleITNS;
    private List<String> subjects;

    public StudyProgramme(String studyProgrammeName, String codeOfStudyProgramme, int numberOfSemesters, int numberOfPossibleITNS, List<String> subjects) {
        this.studyProgrammeName = studyProgrammeName;
        this.codeOfStudyProgramme = codeOfStudyProgramme;
        this.numberOfSemesters = numberOfSemesters;
        this.numberOfPossibleITNS = numberOfPossibleITNS;
        this.subjects = subjects;
    }

    public String getStudyProgrammeName() {
        return studyProgrammeName;
    }

    public void setStudyProgrammeName(String studyProgrammeName) {
        this.studyProgrammeName = studyProgrammeName;
    }

    public String getCodeOfStudyProgramme() {
        return codeOfStudyProgramme;
    }

    public void setCodeOfStudyProgramme(String codeOfStudyProgramme) {
        this.codeOfStudyProgramme = codeOfStudyProgramme;
    }

    public int getNumberOfSemesters() {
        return numberOfSemesters;
    }

    public void setNumberOfSemesters(int numberOfSemesters) {
        this.numberOfSemesters = numberOfSemesters;
    }

    public int getNumberOfPossibleITNS() {
        return numberOfPossibleITNS;
    }

    public void setNumberOfPossibleITNS(int numberOfPossibleITNS) {
        this.numberOfPossibleITNS = numberOfPossibleITNS;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }


}
