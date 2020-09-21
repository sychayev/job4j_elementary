package pojo;

public class Book {
    private String name ;
    private int quantityPages;

    public Book(String name,int quantityPages){
        this.name = name;
        this.quantityPages = quantityPages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantityPages() {
        return quantityPages;
    }

    public void setQuantityPages(int quantityPages) {
        this.quantityPages = quantityPages;
    }
}
