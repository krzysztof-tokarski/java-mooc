
public class Statistics {
    private int count;
    private int sum;
    
    public Statistics() {
        this.count = 0;
    }
    
    public void addNumber(int num) {
        this.count ++;
        this.sum += num;
        
    }
    
    public int getCount() {
        return this.count;
    }
    
    public int sum() {
        return this.sum;
    }
       
    public double average() {
        if (this.getCount() == 0) {
            return 0.0;
        }
        
        return this.sum() * 1.0 / this.getCount();
    }
}
