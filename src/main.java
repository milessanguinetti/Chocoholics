import GUI.GUIRoot;
import javafx.application.Application;
import javafx.stage.Stage;
import serviceDataStructure.weekListNode;

import java.io.Serializable;

/**
 * Created by Spaghetti on 4/4/2016.
 */
public class main extends Application implements Serializable{
    public static void main(String[] args) {
            launch();
        }

    public void start(Stage primaryStage) throws Exception{
        GUIRoot newGUI = new GUIRoot(primaryStage);
    }
}
