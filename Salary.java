class Emp {

    void loanDecision(int age, int salary, int creditScore) {

        if (age >= 21) {

            if (salary >= 25000) {

                if (creditScore >= 700) {
                    System.out.println("Loan Approved");
                } else {
                    System.out.println("Low credit score");
                }

            } else {
                System.out.println("Low salary");
            }

        } else {
            System.out.println("Age not eligible");
        }
    }
}

public class LoanDecision {
    public static void main(String[] args) {

        Emp ar = new Emp();
        ar.loanDecision(21, 30000, 750);

    }
}