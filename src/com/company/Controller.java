package com.company;

import java.util.Scanner;

public class Controller {
    private final Model model;
    private final View view;

    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }

    public void fin(){
        Scanner scanner=new Scanner(System.in);
        while(!model.checkNumber(getNumber(scanner)));
        view.print(View.WIN);
        view.print(View.WAY+model.getWay());
    }

    private int getNumber(Scanner sc){
        int number =0;
        view.print(View.INPUT+View.BRACKET1+model.getMinBar()+View.SPACE+model.getMaxBar()+View.BRACKET2);
        while(true){
            while(!sc.hasNextInt()){
                view.print(View.WRONG_INPUT);
                sc.next();
            }
            number=sc.nextInt();
            if(number<= model.getMinBar()||number>=model.getMaxBar()){
                view.print(View.WRONG_INPUT);
                continue;
            }
            break;
        }
        return number;
    }
}
