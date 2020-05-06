package question1;
public class Instances
{
   public static void main (String []  args)
   {
       Circle circle = new Circle();
       Square square =  new Square();
       Triangle triangle =  new Triangle();
       
       circle.makeVisible();
       triangle.makeVisible();
       square.makeVisible();
       
       square.slowMoveHorizontal(12);
       circle.slowMoveVertical(12);
       triangle.moveUp();
       triangle.changeColor("green");
       square.changeColor("green");
       circle.changeColor("red");
       
       
       
       triangle.changeColor("black");
    }
}