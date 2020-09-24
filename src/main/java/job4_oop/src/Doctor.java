package job4_oop.src;

public class Doctor extends Profession{
    private String receipt;
    private int numberReceipt;
    private char groupTablets;
        public void Receipt(String receipt){
            this.receipt = receipt;
        }
        public void nmbrReceipt(int numberReceipt){
            this.numberReceipt = numberReceipt;
        }
        public void grpTablet(char groupTablets){
            this.groupTablets= groupTablets;
        }

}
