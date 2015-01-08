class BagelsOrderItem implements OrderItem{
    private double price;
    private int quantity;
    public BagelsOrderItem(double aPrice, int aQuantity){
        price = aPrice;
        quantity = aQuantity;
    }
    public double getPrice(){
        return price;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getCost(){
        double totalPrice = price * quantity;
        return totalPrice;
    }
}

class BakersDozen extends BagelsOrderItem{

    public BakersDozen(double aPrice){
        super(double aPrice, 13);

    }
    public double getCost(){
        double totalPrice = price * 12;
        return totalPrice;
    }
}

BakersDozen aBagOfB=new BakersDozen(6); // this was just the example Mr. Lin showed me, here to show how code works
aBagOfB.getCost(){
    
}