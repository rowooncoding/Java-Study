package chapter_09.coffee;

public class CoffeeByName {
    public Object name;

    public CoffeeByName(Object name){
        this.name = name;
    }

    public void ready(){
        System.out.println("커피준비완료 : " + name);
    }
}
