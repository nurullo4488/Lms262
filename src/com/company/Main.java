package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<City>sities= new TreeSet<City>();

        City city1= new City(1,"BELIKOBRITANIYA");
        City city2= new City(2,"BRAZILIYA");
        City city3= new City(3,"SIRIYA");
        City city4= new City(4,"FRANCE");
        City city5= new City(5,"TOTEHAM");
        City city6= new City(6,"TOTEHAM");
        City city7= new City(7,"TOTEHAM");
        City city8= new City(8,"TOTEHAM");


        sities.add(city1);
        sities.add(city2);
        sities.add(city3);
        sities.add(city4);
        sities.add(city5);
        sities.add(city6);
        sities.add(city7);
        sities.add(city8);

        TreeSet<City>cityTreeSet=new TreeSet<>();
        for (City c:sities) {
            if (c.getCode() % 2==1){
                cityTreeSet.add(c);
            }

        }
        System.out.println(cityTreeSet);
        ArrayList<City>cities=new ArrayList<>();
        cities.add(new City());
        System.out.println(sities);

    }
}
