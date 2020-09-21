package job4_oop.src;

import job4_oop.src.Engineer;

public class Builder extends Engineer {
    private String build;
    private int  numbersBuldings;
    private char namesBuildings;

    public String bld(String build){
        return build;
    }
    public int nmbBuldings(int numbersBuldings){
        return numbersBuldings;
    }
    public char nmsBuildings(char namesBuildings){
        return namesBuildings;
    }
}

