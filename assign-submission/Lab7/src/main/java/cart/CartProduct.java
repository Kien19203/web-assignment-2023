package cart;

import vn.ed.hcmuaf.bean.Product;

public class CartProduct {
    private Product product;
    private int quantity;

    public CartProduct(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

    public CartProduct() {
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void increQuantity(int quantity) {
        this.quantity += quantity;
    }
    public void decreQuantity(int quantity) {
        this.quantity -= quantity;
        if(this.quantity <= 0)  this.quantity += quantity;
    }
}

