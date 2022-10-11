public class Product {

    private int id;
    private String name;
    private String descripcion;
    private double prize;
    private String renk;

    public Product(int id, String name, String descripcion, double prize, String renk, int stockAmount) {
        this.id = id;
        this.name = name;
        this.descripcion = descripcion;
        this.prize = prize;
        this.setRenk(renk);
        this.stockAmount = stockAmount;
    }

    private int stockAmount;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getPrize() {
        return prize;
    }

    public void setPrize(double prize) {
        this.prize = prize;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }
}
