import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penguin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penguin extends Actor
{
    GreenfootSound penguinSound = new GreenfootSound("pinguin-220042.mp3");
    //setting up 8 elements in the array
    GreenfootImage[] idle = new GreenfootImage[8];
    //Contructor 
    public Penguin()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/penguin_idle/idle" + i +".png");
        }
        setImage(idle[0]);
    }
    public void act()
    {
        if(Greenfoot.isKeyDown("Left"))
        {
            move(-5);
        }
        if(Greenfoot.isKeyDown("Right"))
        {
            move(5);
        }
        
        eat();
    }
    
    //eating the banana
    public void eat()
    {
        if(isTouching(Banana.class))
        {
            removeTouching(Banana.class);
            MyWorld world = (MyWorld) getWorld();
            world.createBanana();
            world.scoreIncrease();
            penguinSound.play();
        }
    }
}
