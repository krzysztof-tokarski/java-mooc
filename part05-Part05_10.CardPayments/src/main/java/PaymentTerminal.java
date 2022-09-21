
public class PaymentTerminal {

    private double money;  // amount of cash
    private int affordableMeals; // number of sold affordable meals
    private int heartyMeals;  // number of sold hearty meals

    private final double affordableMeal = 2.5;
    private final double heartilyMeal = 4.30;

    public PaymentTerminal() {
        this.money = 1000;
        // register initially has 1000 euros of money
    }

    public double eatAffordably(double payment) {
        if (payment < this.affordableMeal) {
            return payment;
        }

        double differenceBetweenPaymentAndAffordableMeal = payment - this.affordableMeal;
        this.money += affordableMeal;
        this.affordableMeals++;

        return differenceBetweenPaymentAndAffordableMeal;
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= this.affordableMeal) {
            card.takeMoney(this.affordableMeal);
            this.affordableMeals++;
            return true;
        }

        return false;
    }

    public double eatHeartily(double payment) {
        if (payment < this.heartilyMeal) {
            return payment;
        }

        double differenceBetweenPaymentAndHeartilyMeal = payment - this.heartilyMeal;
        this.money += this.heartilyMeal;
        this.heartyMeals++;

        return differenceBetweenPaymentAndHeartilyMeal;
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= this.heartilyMeal) {
            card.takeMoney(this.heartilyMeal);
            this.heartyMeals++;
            return true;
        }

        return false;
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum <= 0) {
            return;
        }

        card.addMoney(sum);
        this.money += sum;
    }

    @Override
    public String toString() {
        return "money: " + money + ", number of sold affordable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
}
