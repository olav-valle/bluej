/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael K�lling and David J. Barnes
 * @version 2016.02.29
 */
public class OneSunPicture
{
    private Square wall;
    private Square window;
    private Triangle roof;
    private Circle sun1;
    private Person person;
    private boolean drawn;

    /**
     * Constructor for objects of class oneSunPicture
     */
    public OneSunPicture()
    {
        wall = new Square();
        window = new Square();
        roof = new Triangle();  
        sun1 = new Circle();
        person = new Person();
        drawn = false;
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        if(!drawn) {
            wall.moveHorizontal(-140);
            wall.moveVertical(20);
            wall.changeSize(120);
            wall.makeVisible();
            
            window.changeColor("black");
            window.moveHorizontal(-120);
            window.moveVertical(40);
            window.changeSize(40);
            window.makeVisible();
    
            roof.changeSize(60, 180);
            roof.moveHorizontal(20);
            roof.moveVertical(-60);
            roof.makeVisible();
    
            sun1.changeColor("yellow");
            sun1.moveHorizontal(100);
            sun1.moveVertical(-40);
            sun1.changeSize(80);
            sun1.makeVisible();           
            drawn = true;
        }
    }
    /**
     * Start the Sunset
     */
    public void sunset()
    {
        if(drawn){
            sun1.slowMoveVertical(150);
            sun1.changeColor("red");
            sun1.slowMoveVertical(70);
            person.moveHorizontal(-300);
            person.moveVertical(30);
            person.makeVisible();
            person.slowMoveHorizontal(200);
            person.makeInvisible();
        }
    }
            
    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        wall.changeColor("black");
        window.changeColor("white");
        roof.changeColor("black");
        sun1.changeColor("black");
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        wall.changeColor("red");
        window.changeColor("black");
        roof.changeColor("green");
        sun1.changeColor("blue");
    }
}
