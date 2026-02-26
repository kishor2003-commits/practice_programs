import java.util.Scanner;

class SalaryException extends Exception {
    SalaryException(String msg) {
        super(msg);
    }
}
public class SalaryCheck {
    static void checkSalary(int salary) throws SalaryException {
        if (salary < 2100) {
            throw new SalaryException("You need to work hard");
        }
        else if (salary >= 2100 && salary <= 5000) {
            throw new SalaryException("Your salary is somehow good");
        }
        else if (salary > 5000 && salary <= 9000) {
            throw new SalaryException("Salary is very good");
        }
        else {
            System.out.println("Excellent salary");
        }
    }
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter salary: ");
        int sal = sc.nextInt();

        try {
            checkSalary(sal);
        }
        catch (SalaryException e) {
            System.out.println(e.getMessage());
        }
    }
}