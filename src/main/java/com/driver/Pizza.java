package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean topping=false;
    private boolean cheese=false;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            this.price=300;
        }
        else
        {
            this.price=400;
        }
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheese==false)
        {
            price+=80;
            cheese=true;
        }
    }

    public void addExtraToppings(){
        // your code goes here
        if(topping==false)
        {
            if(isVeg)
            {
                price+=70;
            }
            else
            {
                price+=120;
            }
            topping=true;
        }
    }

    public void addTakeaway(){
        // your code goes here
        price+=20;
    }

    public String getBill(){
        bill=price+"";
        return this.bill;
    }
}
