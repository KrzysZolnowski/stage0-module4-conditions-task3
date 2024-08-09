package school.mjc.stage0.conditions.task3;

public class SalaryCalculator {
    public void calculateSalary(int salary) {
        if (salary <= 10000) {
            double taxes = 0.15;
            double sumOfTaxes = salary * taxes;
            double basicSalary = salary - sumOfTaxes;
            System.out.println(basicSalary);
        } else if (salary <= 20000) {
            double taxes = 0.18;
            double sumOfTaxes = salary * taxes;
            double basicSalary = salary - sumOfTaxes;
            System.out.println(basicSalary);
        } else {
            double taxes = 0.20;
            double sumOfTaxes = salary * taxes;
            double basicSalary = salary - sumOfTaxes;
            System.out.println(basicSalary);
        }
    }
}
