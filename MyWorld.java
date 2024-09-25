import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public int score = 0;
    Label scoreLabel; 
    /*
     * Constructor for objects of class MyWorld.
     * 
     */                                           
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
    
        Penguin penguin = new Penguin();
        addObject(penguin, 300, 300);
        
        scoreLabel = new Label(0,80);
        addObject(scoreLabel, 30,40);
        createBanana();
    }
    
    public void createBanana()
    {
        Banana banana = new Banana();
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        addObject(banana, 300, 0);
    }
    
    public void scoreIncrease()
    {
      score++;
      scoreLabel.setValue(score);
    }
    
    //game over screen
    public void gameOver()
    {
        Label gameOverLabel = new Label ("Game Over !", 100);
        addObject(gameOverLabel, 300, 200);
    }
}
