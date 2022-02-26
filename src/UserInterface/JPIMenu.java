package UserInterface;

import javafx.event.EventHandler;
import javafx.scene.Parent;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class JPIMenu extends MenuBar {
    JPIMenu() {
        Parent parent = this.getParent(); //used to bind menu size to parent
        //add each menu
        this.getMenus().addAll(
                buildHelpMenu()
        );
    }

    Menu buildHelpMenu() {
        Menu helpMenu = new Menu("Help");
        //add one option, JPI info
        MenuItem info = new MenuItem("JPI Info");
        info.setOnAction( e ->
        {
            //create popup box
            final Stage dialog = new Stage();
            dialog.initModality(Modality.APPLICATION_MODAL); //Lock application until box is closed
        });

        helpMenu.getItems().addAll(
                info
        );


        //return the help menu we have built
        return helpMenu;
    }


}
