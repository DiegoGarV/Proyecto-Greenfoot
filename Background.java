import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Background here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Background extends World
{
    Counter timeCount = new Counter();
    /**
     * Constructor for objects of class Background.
     * 
     */
    public Background()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 
        prepare();

    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Samurai samurai = new Samurai();
        addObject(timeCount,95,25);
        addObject(samurai,250,250);
        samurai.setLocation(250,250);
        Goblin2 goblin2 = new Goblin2();
        addObject(goblin2,396,144);
        Goblin2 goblin22 = new Goblin2();
        addObject(goblin22,234,112);
        Goblin2 goblin23 = new Goblin2();
        addObject(goblin23,92,210);
        Goblin2 goblin24 = new Goblin2();
        addObject(goblin24,81,344);
        Goblin2 goblin25 = new Goblin2();
        addObject(goblin25,286,395);
        Goblin2 goblin26 = new Goblin2();
        addObject(goblin26,368,301);
        Goblin2 goblin27 = new Goblin2();
        addObject(goblin27,423,401);
        Goblin2 goblin28 = new Goblin2();
        addObject(goblin28,136,423);
        Goblin2 goblin29 = new Goblin2();
        addObject(goblin29,110,123);
        Goblin2 goblin210 = new Goblin2();
        addObject(goblin210,334,62);
        Goblin2 goblin211 = new Goblin2();
        addObject(goblin211,316,174);
        Goblin2 goblin212 = new Goblin2();
        addObject(goblin212,436,227);
        Goblin2 goblin213 = new Goblin2();
        addObject(goblin213,202,339);
        Chicken chicken = new Chicken();
        addObject(chicken,174,83);
        Chicken chicken2 = new Chicken();
        addObject(chicken2,35,459);
        Chicken chicken3 = new Chicken();
        addObject(chicken3,456,340);
        Chicken chicken4 = new Chicken();
        addObject(chicken4,452,163);
        chicken4.setLocation(251,178);
        chicken.setLocation(133,81);
        chicken2.setLocation(98,398);
    }
}
