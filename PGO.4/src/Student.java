import java.util.Date;
public class Student {
    private String imie;
    private String nazwisko;
    private Date data = new Date();
    private String email;
    private String adres;

    public Student(String imie, String nazwisko, Date data, String email, String adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.data = data;
        this.email = email;
        this.adres = adres;
    }

    public enrollStudent (StudyProgramme nazwaProgramu) {


    }
}
