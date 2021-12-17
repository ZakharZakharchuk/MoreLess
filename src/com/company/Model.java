package com.company;

import java.util.ArrayList;

public class Model {
    private int minBar=0;
    private int maxBar=100;
    private int secretValue=(int)(Math.random()*100)-1;
    private ArrayList<Integer> way=new ArrayList<>();
    public void setBar(int minBar, int maxBar){
        this.minBar=minBar;
        this.maxBar=maxBar;
    }

    public boolean checkNumber(int number){
        way.add(number);
        if(number==secretValue)
            return true;
        if(number<secretValue)
            minBar=number;
        if(number>secretValue)
            maxBar=number;
        return false;
    }

    public int getMinBar() {
        return minBar;
    }

    public int getMaxBar() {
        return maxBar;
    }

    public int getSecretValue() {
        return secretValue;
    }

    public ArrayList<Integer> getWay() {
        return way;
    }
}
