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
    GreenfootImage[] idleRight = new GreenfootImage[8];
    GreenfootImage[] idleLeft = new GreenfootImage[8];

    
    String facing = "right"; 
    //Contructor = for when it generates the image the first time 
    public Penguin()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/penguin_idle/idle" + i +".png");
            idleRight[i].scale(100,100); 
        }
        for(int i = 0; i< idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/penguin_idle/idle" + i +".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(80,90); 
        }
        
        setImage(idleRight[0]);
    }
    
    //animating
    int imageIndex = 0;
    public void animatePenguin()
    {
        if(facing.equals("right"))
        {
            setImage(idleRight[imageIndex]);
            imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }
    
    //arrow keys
    public void act()
    {
        if(Greenfoot.isKeyDown("Left"))
        {
            move(-5);
            facing = "left";
        }
        if(Greenfoot.isKeyDown("Right"))
        {
            move(5);
            facing = "right";
        }
        
        eat();
        animatePenguin();
    }
    
    //eating the banana
    public void eat()
    {
        if(isTouching(Banana2.class))
        {
            removeTouching(Banana2.class);
            MyWorld world = (MyWorld) getWorld();
            world.createFood();
            world.scoreIncrease();
            penguinSound.play();
        }
        if(isTouching(Plum.class))
        {
            removeTouching(Plum.class);
            MyWorld world = (MyWorld) getWorld();
            world.createFood();
            world.scoreIncrease2();
        }
    }
}
