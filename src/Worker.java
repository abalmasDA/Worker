public class Worker {
    private String fullName;
    private String position;
    private int yearOfEmployment;

    public Worker(String fullName, String position, int yearOfEmployment) {
        this.fullName = fullName;
        this.position = position;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getFullName() {
        return fullName;
    }

    public String getPosition() {
        return position;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }
}
