package asg1;

class Product {
    private int id;
    private String name;
    private float price;

    Product(int id, String name, float price){
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public float getPrice(){
        return price;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return id + " " + name + " " + price;
    }
}


