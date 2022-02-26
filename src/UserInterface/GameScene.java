package UserInterface;

import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;

/*
Gamescene is the Scene subclass that all scenes for custom games will inherent.
This scene will include the header bar, and everything else will depend on the
game itself, and will compromise JPI and custom elements
 */
public abstract class GameScene extends Scene {
    GameScene(Parent root) {
        super(root);


    }
}
