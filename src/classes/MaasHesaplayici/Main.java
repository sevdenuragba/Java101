package classes.MaasHesaplayici;

public class Main {

    public static void main(String[] args) {
        Employee employee1 = new Employee("Ayça",2500.0,35,2004);
        employee1.printEmployee();
        Employee employee2 = new Employee("Ahmet",800.0,56,2014);
        employee2.printEmployee();
        Employee employee3 = new Employee("Ayla",1800.0,60,1990);
        employee3.printEmployee();
    }

}
