
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

    public Money plus(Money addition) {
        int totalCents = this.cents() + addition.cents();
        int totalEuros = this.euros() + addition.euros();
        
        if (totalCents >= 100) {
            int difference = totalCents % 100;
            totalCents = difference;
            totalEuros++;
        }
        
        return new Money(totalEuros, totalCents);
    }
    
    public boolean lessThan(Money compared) {
        int thisTotalValue = this.euros() * 100 + this.cents();
        int comparedTotalValue = compared.euros() * 100 + compared.cents();
        
        if (comparedTotalValue > thisTotalValue) {
            return true;
        } else {
            return false;
        }
    }
    
    public Money minus(Money decreaser) {
        int thisTotalValue = this.euros() * 100 + this.cents();
        int decreaserTotalValue = decreaser.euros() * 100 + decreaser.cents();
        
        int decreased = thisTotalValue - decreaserTotalValue;
        
        if (decreased < 0) {
            return new Money (0,0);
        }
        
        int remainingCents = decreased % 100;
        int euros = (decreased - remainingCents) / 100;
        
        return new Money(euros, remainingCents);
    }
}
