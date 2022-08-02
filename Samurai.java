import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Samurai here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.List;
public class Samurai extends Actor
{
    /**
     * Act - do whatever the Samurai wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        makeMove();
        attack();
        ending();
        badAttack();
    }
    public void makeMove()
    {
        if (Greenfoot.isKeyDown("left"))
        {
            setRotation(0);
            move(-3);
            setImage("samurai der 1.png");
        }
        if (Greenfoot.isKeyDown("right"))
        {
            setRotation(0);
            move(3);
            setImage("samurai izq 1.png");
        }
        if (Greenfoot.isKeyDown("down"))
        {
            setRotation(90);
            move(3);
            setImage("samurai frente 1.png");
        }
        if (Greenfoot.isKeyDown("up"))
        {
            setRotation(90);
            move(-3);
            setImage("samurai back 1.png");
        }
    }
    public void attack()
    {
        Actor goblinA;
        goblinA = getOneObjectAtOffset(0, 0, Goblin2.class);
        if (goblinA != null)
        {
            World world;
            world = getWorld();
            world.removeObject(goblinA);
            Greenfoot.playSound("machete_vs_spatula_1.wav");
        }
    }
    public void badAttack()
    {
        Actor chicken;
        chicken = getOneObjectAtOffset(0, 0, Chicken.class);
        if (chicken != null)
        {
            World world;
            world = getWorld();
            world.removeObject(chicken);
            Greenfoot.playSound("Chicken Sound Effect.mp3");
        }
    }
    public void ending()
    {
        if (getObjectsInRange(1000,Goblin2.class).isEmpty())
        {
            Greenfoot.stop();
            System.out.println("¡Felicidades!");
        }
    }
}
