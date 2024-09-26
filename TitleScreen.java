import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

//This is title Screen.
//2024
public class TitleScreen extends World
{
    Label titleLabel = new Label("Penguin Banana Lover", 60);
    //Label subLabel = new Label("- Nicholas", 40);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, 200);
        addObject(titleLabel, getWidth()/4, getHeight()/4);
        prepare();
    }

    public void act()
    {
        if(Greenfoot.isKeyDown("space"))
        {
            //creating an INSTANCE
            //dont put a dot as that will make it ?? without it will
            //become a call method
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Penguin penguin = new Penguin();
        addObject(penguin,300,150);
        Label label = new Label("Press [SPACE] to start", 40);
        addObject(label,300,250);
        Label label2 = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label2,300,300);
        Label label3 = new Label("By Nicholas.C", 20);
        addObject(label3,90,500);

        label3.setLocation(50,374);
        label3.setLocation(68,380);
    }
}
