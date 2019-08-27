/**
 * Represents a house.
 *
 * @author Olav Valle   
 * @version 1.0
 */
public class House
{
    // defines the parts of the house.
    private Square wall;
    private Triangle roof;
    private Square win;
    
    public void draw()
    {
        Square wall = new Square();
        wall.makeVisible();
        wall.moveHorizontal(-140);
        wall.moveVertical(20);
        wall.changeSize(120);
        
        roof = new Triangle();
        roof.makeVisible();
        roof.changeSize(80, 130);
        roof.moveHorizontal(20);
        roof.moveVertical(-80);
        
        win = new Square();
        win.makeVisible();
        win.changeSize(40);
        win.changeColor("blue");
        win.moveHorizontal(-130);
        win.moveVertical(50);
    }
}    