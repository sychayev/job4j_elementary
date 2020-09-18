package job4_oop.src;

public class DummyDic {
    public static String engToRus(String eng) {

        System.out.println("Неизвестное слово. " + eng);
        return eng;
    }

    public static void main(String[] args) {
        DummyDic.engToRus("Abracadabra");
    }
}
