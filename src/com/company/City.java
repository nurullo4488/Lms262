package com.company;
//City деген класс тузунуз. (code, name, ...)
//        Эгерде code так сан болсо TreeSetke салыныз.
//        Аларды чонунан кичинесине караган тартипте чыгарыныз.

public class City implements  Comparable <City>{
    private static int  code;
    private String name;

    public City(int code, String name) {
        this.code = code;
        this.name = name;
    }

    public City() {

    }

    public  int getCode() {
        return  code;

    }

    public void setCode(int code) {
        this.code=code;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return " \n Sity{" +
                "code=" + code +
                ", name='" + name + '\'' +
                '}';
    }


    @Override
    public int compareTo(City o) {
        return this.getCode() < o.code ? 1: -1;
    }
}
