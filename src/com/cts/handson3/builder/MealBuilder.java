package com.cts.handson3.builder;

import com.cts.handson3.builder.impl.ChickenBurger;
import com.cts.handson3.builder.impl.Coke;
import com.cts.handson3.builder.impl.Pepsi;
import com.cts.handson3.builder.impl.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }
}
