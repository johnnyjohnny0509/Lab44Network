package my.edu.taruc.lab44network;

class Course {

    private String code;
    private String title;
    private String credit;

    public Course(){

    }

    Course(String code, String tittle, String credit) {
        this.code = code;
        this.title = tittle;
        this.credit = credit;

    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCredit() {
        return credit;
    }

    public void setCredit(String credit) {
        this.credit = credit;
    }
}
