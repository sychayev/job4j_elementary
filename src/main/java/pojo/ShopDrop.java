package pojo;

public class ShopDrop {
    public static Product[] leftShift(Product[] prod,
                                      int index) {

        for (int i = 0; i < prod.length; i++) {
            Product product = prod[i];
            System.out.println(product.getName());

        }
        for(int i = index;i < prod.length;i++){
            prod[i]=prod[i + 1];
        }
        prod[prod.length - 1]=null;
//        prod[0] = prod[1];
//        prod[1] = null;
        for (int i = 0; i < prod.length; i++) {
            Product product = prod[i];
            if (product != null) {
                System.out.println(product.getName());
            } else {
                System.out.println("null");
            }
        }
        return prod;
    }

    public static void main(String[] args) {
        Product[] pr = new Product[2];
        pr[0] = new Product("Milk", 10);
        pr[1] = new Product("Bread", 4);
        ShopDrop.leftShift(pr, 0);
        ShopDrop.leftShift(pr, 1);
    }
}
