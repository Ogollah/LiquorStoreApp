package com.sample.model;

import java.util.ArrayList;
import java.util.List;

public class LiquorSelect {
    public  List getAvailableBrands(LiquorType type){
        List brands = new ArrayList();
        if(type.equals(LiquorType.WINE)){
            brands.add("Andriana Vineyard");
            brands.add(("J.P. Chenet"));
        }else if(type.equals(LiquorType.WHISKY)){
            brands.add("Glenfiddich");
            brands.add("Jonnie Walker");

        }else if(type.equals(LiquorType.BEER)){
            brands.add("Corona");
        }else {
            brands.add("No Brand available");
        }
        return brands;
    }
}
