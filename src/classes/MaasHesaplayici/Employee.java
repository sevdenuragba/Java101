package classes.MaasHesaplayici;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    int bonus;

    Employee (String name, double salary, int workHours, int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary >= 1000){
            return (this.salary * 0.03);
        }
        else{
            return 0;
        }
    }

    public int bonus(){
        if(this.workHours > 40){
            this.bonus = (this.workHours - 40) * 30;
            return this.bonus;
        }
        else {
            this.bonus = 0;
            return 0;
        }
    }

    public double raiseSalary(){
        if((2021 - this.hireYear) < 10)
            return (this.salary * 0.05);
        else if ((2021 - this.hireYear) >= 10 && (2021 - this.hireYear) < 20)
            return (this.salary * 0.10);
        else return (this.salary * 0.15);
    }

    public void printEmployee(){
        System.out.println("Adı : " + this.name +
                            "\nMaaşı : " + this.salary +
                            "\nÇalışma Saati : " + workHours +
                            "\nBaşlangıç Yılı : " + hireYear +
                            "\nVergi : " + tax() +
                            "\nBonus : " + bonus() +
                            "\nMaaş Artışı : " + raiseSalary() +
                            "\nVergi ve Bonuslar ile birlikte maaş : " + (salary + bonus() - tax()) +
                            "\nToplam Maaş : " + (salary + raiseSalary()) +
                            "\n\n - - - - - - - - - - - - - - - - - - - - - -\n");
    }
}
