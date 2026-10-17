public class Car {
    private final String model;
    private String color;
    private int price;

    Car(String model, String color, int price)
    {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    public String getModel()
    {return this.model;}
    public String getColor()
    {return this.color;}
    public String getPrice()
    {return "$"+this.price;}

    // public void setModel(String model) {this.model = model;} // model has final access
    public void setColor(String color) {this.color = color;}
    public void setPrice(int price)
    {
        if(price < 0)
        {
            System.out.println("Price can't be less than zero");
        }
        else
        {
            this.price = price;
        }
    }
}
