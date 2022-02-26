package UserInterface;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

/*
This class is a factory which creates a scene, which is what is visually drawn to the user
 */
public class StartingScene {
      /*
      Creates and returns the default scene
      JPI needs to show multiple scenes
     */

    public Scene get(){
        Pane root = new Pane(); //make root node

        MenuBar menu = this.makeMenu(root);

        Circle red = new Chip(40,40, 25, Color.RED, Color.MAGENTA);
        Circle green = new Chip(70, 70, 20, Color.GREEN, Color.YELLOW);
        Circle blue = new Chip (300, 250, 50, Color.BLUE, Color.CYAN);

        Button closeButton = new Button("Exit");
        closeButton.setLayoutX(250);
        closeButton.setLayoutY(450);


        root.getChildren().add(new Group(red,blue,green)); //add circles
        root.getChildren().add(closeButton);
        root.getChildren().add(menu);
        closeButton.setOnAction(event -> System.exit(0));

        Scene startingScene = new Scene(root, UISettings.SCR_WIDTH, UISettings.SCR_HEIGHT);
        return startingScene;
    }

    private MenuBar makeMenu(Parent root) {
        MenuBar menu = new JPIMenu();
        return menu;
    }
}
