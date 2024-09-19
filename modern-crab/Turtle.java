import lang.stride.*;
import java.util.*;
import greenfoot.*;

/**
 * 
 */
public class Turtle extends Actor
{

    /**
     * Act - do whatever the Turtle wants to do. This method is called whenever the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        move(1);
        if (isAtEdge()) {
            turn(17);
        }
        if (Greenfoot.isKeyDown("z")) {
            turn(-1);
        }
        if (Greenfoot.isKeyDown("c")) {
            turn(1);
        }
    }
}
