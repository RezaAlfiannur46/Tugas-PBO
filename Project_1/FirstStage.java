import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FirstStage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class FirstStage extends World
{
    /**
     * Constructor for objects of class FirstStage.
     * 
     */
    public FirstStage()
    {    
        super(600, 400, 1); 
        
        Rocket player1 = new Rocket();
        this.addObject(player1, 30, 200);
        player1.setName("player1");
        
        Rocket player2 = new Rocket();
        player2.setRotation(180);
        player2.setName("player2");
        this.addObject(player2, 570, 200);
        
        Rocket player3 = new Rocket();
        player3.setRotation(270);
        player3.setName("player3");
        this.addObject(player3, 300,370);
        
        Rocket player4 = new Rocket();
        player4.setRotation(90);
        player4.setName("player4");
        this.addObject(player4, 300, 30);
    }
}
