package stringbasic;

public class Student {
    Person person;
    private String neptunCode;
    private String eduId;
    private String entryCardNo;

    public Student(Person person, String neptunCode, String eduId) {
        this.person = person;
        this.neptunCode = neptunCode;
        this.eduId = eduId;
//        this.entryCardNo = entryCardNo;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getNeptunCode() {
        return neptunCode;
    }

    public void setNeptunCode(String neptunCode) {
        this.neptunCode = neptunCode;
    }

    public String getEduId() {
        return eduId;
    }

    public void setEduId(String eduId) {
        this.eduId = eduId;
    }

    public String getEntryCardNo() {
        return entryCardNo;
    }

    public void setEntryCardNo(String entryCardNo) {
        this.entryCardNo = entryCardNo;
    }
}