package com.test_study.test_study.unit.beverage;

import com.test_study.test_study.unit.Beverage;

public class Latte implements Beverage {

    @Override
    public String getName() {
        return "라떼";
    }

    @Override
    public int getPrice() {
        return 4500;
    }
}
