public class Employee {
    private String name;
    private String surName;
    private String middleName;
    private String position;
    private int yearOfEmployment;


    public Employee(String name, String surName, String middleName, String position, int yearOfEmployment) {
        this.name = name;
        this.surName = surName;
        this.middleName = middleName;
        this.position = position;
        this.yearOfEmployment = yearOfEmployment;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getPosition() {
        return position;
    }

    public int getYearOfEmployment() {
        return yearOfEmployment;
    }
}
