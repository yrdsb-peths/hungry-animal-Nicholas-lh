import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Plum here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Plum extends Food
{
    public Plum()
    {
        super(10);
    }
    public void act()
    {
        setLocation(getX(), getY() + 4);
    }
}
