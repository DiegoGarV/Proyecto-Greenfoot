import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Goblin2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Goblin2 extends Actor
{
    /**
     * Act - do whatever the Goblin2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        moving();
    }
    public void moving()
    {
        move(4);
        setImage("goblin frente 1.png");
        if (Greenfoot.getRandomNumber(100) < 10)
        {
            turn(Greenfoot.getRandomNumber(90)-45);
        }
        if (getX() <= 5 || getX() >= getWorld().getWidth()-5)
        {
            turn(180);
        }
        if (getY() <= 5 || getY() >= getWorld().getHeight()-5)
        {
            turn(180);
        }
    }
}
