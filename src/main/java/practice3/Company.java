package practice3;

public class Company {

    static String companyName = "Asus";
    final int employeeID;
    String employeeName;

    Company(int someEmployeeID, String someEmployeeName) {
        this.employeeName = someEmployeeName;
        employeeID = someEmployeeID;
    }

    public static void printCompanyName() {
        System.out.println("Имя компании: " + companyName);
    }

    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    static void main(String[] args) {

        Company employee1 = new Company(1, "Vasya");
        Company employee2 = new Company(2, "Petya");
        Company employee3 = new Company(3, "Boris");

        Company.printCompanyName();
        companyName = "Lasus";
        Company.printCompanyName();
        System.out.println(employee3.employeeID);

    }


}
