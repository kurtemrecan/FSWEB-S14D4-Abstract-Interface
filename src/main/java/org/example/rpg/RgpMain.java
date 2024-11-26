package org.example.rpg;

public class RgpMain {
    public static void main(String[] args){
        Monster troll=new Troll("Shrek",1000,100);
        System.out.println("Name: " + troll.getName());
        System.out.println("Hit Points: " + troll.getHitPoints());
        System.out.println("Damage: " + troll.getDamage());


        System.out.println("Attack Damage: " + troll.attack());
    }
}
