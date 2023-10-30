package entities;

public class StaffSell extends Staff {
   private double percentage;
   private double sales;

    public StaffSell(String name, double salary) {
        super( name, salary);
    }

    public StaffSell(String name, double salary, double percentage, double sales) {
        super( name, salary);
        this.percentage = percentage;
        this.sales = sales;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public double getSales() {
        return sales;
    }

    public void setSales(double sales) {
        this.sales = sales;
    }

    @Override
    public String toString() {
        return "StaffSell{" +
                "percentage=" + percentage +
                ", sales=" + sales +
                '}';
    }
}
