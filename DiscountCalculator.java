class Emp {

    void getFinalAmount(double amount, boolean isMember) {

        double finalAmount = amount;

        if (amount >= 1000) {
            if (isMember) {
                finalAmount = finalAmount - amount * 0.2;
            } else {
                finalAmount = finalAmount - amount * 0.1;
            }
        } else {
            System.out.println("no discount");
        }

        System.out.println("The final discount: " + finalAmount);
    }
}

public class DiscountCalculator {
    public static void main(String[] args) {

        Emp ar = new Emp();
        ar.getFinalAmount(1000, true);

    }
}