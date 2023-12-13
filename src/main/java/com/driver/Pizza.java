package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private final int  cheese=80;
    private final int vegTopping=70;
    private final int nonVegTopping=120;
    private final int bag=20;
    private boolean cheeseF=false;
    private boolean toppingF=false;
    private boolean bagF=false;
    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        if(isVeg)
        {
            price=300;
        }
        else
        {
            price=400;
        }
        bill+="Base Price Of The Pizza: "+price+"\n";
        // your code goes here
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        // your code goes here
        if(cheeseF==false)
        {
            cheeseF=true;
            bill+="Extra Cheese Added: "+cheese+"\n";
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if(toppingF==false)
        {
            cheeseF=true;
            int tempTop= isVeg ? vegTopping : nonVegTopping;
            bill+="Extra Toppings Added: "+tempTop+"\n";
        }
    }

    public void addTakeaway(){
        // your code goes here
        if(bagF==false)
        {
            bagF=true;
            bill+="Paperbag Added: "+bag+"\n";
        }
    }

    public String getBill(){
        int FinalCost=0;
        FinalCost+= price;
        FinalCost+= cheeseF ?80 : 0;
        FinalCost+= toppingF && isVeg ? 70 : 120;
        FinalCost+= bagF ? 20 : 0;
        bill+="Total Price: "+FinalCost+"\n";
        return bill;
    }
}
