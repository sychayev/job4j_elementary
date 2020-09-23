package pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] prod,
                                      int index) {
        for (int i = 0; i < prod.length; i++) {
            if (prod[i] == null){

            }

        }
        return prod;
    }

    public static void main(String[] args) {
        Product[] products = new Product[2];
        products[0] = new Product("Milk", 10);
        products[1] = new Product("Bread", 4);
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            if (product != null) {
                System.out.println(product.getName());
            }
        }
    }
}
