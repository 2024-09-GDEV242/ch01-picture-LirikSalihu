/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Lirik Salihu
 * @version 2024.10.07
 */
public class Picture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if (!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(100);
            wall.changeColor("blue");
            wall.makeVisible();
            
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(30);
            window.changeColor("white");
            window.makeVisible();
    
            roof.changeSize(50, 120);
            roof.moveHorizontal(10);
            roof.moveVertical(-50);
            roof.changeColor("green");
            roof.makeVisible();
    
            sun.moveHorizontal(100);
            sun.moveVertical(-40);
            sun.changeSize(50);
            sun.changeColor("yellow");
            sun.makeVisible();
            
            person.moveHorizontal(-60);
            person.moveVertical(10);
            person.makeVisible();
            
            drawn = true;
        }
    }

    /**
     * Change this picture to black/white display.
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun.changeColor("black");
        person.changeColor("black");
    }

    /**
     * Change this picture to use color display.
     */
    public void setColor()
    {
        wall.changeColor("blue");
        window.changeColor("white");
        roof.changeColor("green");
        sun.changeColor("yellow");
        person.changeColor("red");
    }
}
