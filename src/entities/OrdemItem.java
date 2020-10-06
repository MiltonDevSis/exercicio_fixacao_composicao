package entities;

public class OrdemItem {



    private Integer quantity;
    private Double price;
    // composição com a classe Product
    private Product product;

    public OrdemItem(){
    }

    public OrdemItem(Integer quantity, Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Double subTotal(){

        return price * quantity;
    }
    @Override
    public String toString(){
        return getProduct().getName()
                + ", $"
                + String.format("%.2f", price)
                + ", quantity: "
                + quantity
                + ", subtotal: $"
                + String.format("%.2f", subTotal());
    }
}
