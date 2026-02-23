class Emp {

    void getCalculateBill(double amount, boolean isFirstOrder) {

        double finalBill = amount;

        if (amount < 500) {
            finalBill = amount;
        } 
        else if (amount >= 500 && amount < 1500) {
            finalBill = finalBill - amount * 0.05;
        } 
        else if (amount >= 1500) {
            finalBill = finalBill - amount * 0.1;
        }

        if (isFirstOrder) {
            finalBill = finalBill - amount * 0.2;
        }

        System.out.println("The final bill: " + finalBill);
    }
}

public class BillCalculator {
    public static void main(String[] args) {

        Emp ar = new Emp();
        ar.getCalculateBill(500, true);

    }
}