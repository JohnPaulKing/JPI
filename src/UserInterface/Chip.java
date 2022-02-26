package UserInterface;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Circle;
/*
This is a testing class to make a circle that is draggable and clickable
 */

public class Chip extends javafx.scene.shape.Circle{

    Paint secondFill = Color.BLACK;
    Paint primaryFill = Color.BLACK;
    boolean clicked = false;

   Chip(double centerX, double centerY, double radius, Paint fill, Paint secondFill){
       super(centerX,centerY, radius, fill); //create basic circle
        this.secondFill = secondFill;
        this.primaryFill = fill;
       //set draggable

       //set clickable
       this.setOnMouseClicked(event ->
       {
           this.clicked = !this.clicked;
           this.setFill( this.clicked? this.secondFill: this.primaryFill);
       });

       //set draggable
       this.setOnMouseDragged(event ->
               {
                   this.setCenterX(event.getSceneX());
                   this.setCenterY(event.getSceneY());
               }
               );
   }
}
