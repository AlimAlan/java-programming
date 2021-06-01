package replit;

public class PrintAttributes {
    int amount;
    String name;
    String color;

    @Override
    public String toString() {
        return "name: "+name+":"+"color: "+color+"amount: "+amount;
    }

    public int getAmount() {
        return 1;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = "table";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = "brown";
    }
}

