/**
 * Created by krzychol99 on 2016-12-27.
 */
public class Company {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.firstName = "Jan";
        emp1.lastName = "Nowak";
        emp1.age = 25;
        emp1.seniority = 2.3;

        Employee emp2 = new Employee();
        emp2.firstName = "Elżbieta";
        emp2.lastName = "Wielka";
        emp2.age = 99;
        emp2.seniority = 80.2;

        Employee emp3 = new Employee();
        emp3.firstName = "Krzysztof";
        emp3.lastName = "Rutkowski";
        emp3.age = 50;
        emp3.seniority = 20.9;

        System.out.println("Company workers list: ");
        System.out.println(emp1.firstName + " " + emp1.lastName + ", age. " + emp1.age+ ", seniority: "
                + emp1.seniority + " years");
        System.out.println(emp2.firstName + " " + emp2.lastName + ", age. " + emp2.age + ", seniority: "
                + emp2.seniority + " years");
        System.out.println(emp3.firstName + " " + emp3.lastName + ", age. " + emp3.age + ", seniority: "
                + emp3.seniority + " years");
    }
}
