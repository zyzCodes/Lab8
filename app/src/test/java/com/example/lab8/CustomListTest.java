package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;



import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;


    @Test
    public void addCityTest(){
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SM"));
        assertEquals(list.getCount(),listSize + 1);

    }

}
