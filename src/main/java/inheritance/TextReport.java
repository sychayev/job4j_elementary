package inheritance;

public class TextReport {
    @Override
    public String genrate(String name, String body) {

        return name + " : " + "name" + "," + System.lineSeparator()
                + body + " : " + "body";
    }

}
