package GUI;

import serviceDataStructure.weekListNode;
import userDataStructure.userHashTable;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

import java.io.Serializable;

/**
 * Created by Spaghetti on 4/4/2016.
 */
public class GUIRoot implements Serializable{
    //a class representing the heft of the program's graphical user interface elements

    private Stage primaryStage; //necessary javaFX GUI clsas
    private Scene GUIScene; //necessary javaFX GUI class
    private StackPane rootPane; //a pane for adding and removing more specific GUI panes to and from.
    private loginPane userTypeSelectionPane; //the pane for elements pertaining to logging in as a manager or provider.
    private managerPane managerpane; //the pane for manager-specific user interface elements
    private providerPane providerpane; //the pane for provider-specific user interface elements
    public static userHashTable userStructure; //the hash table of users.
    public static weekListNode weekStructure; //the linear linear linked list of weeks and services for each week


    public GUIRoot(Stage passedStage){
        primaryStage = passedStage; //store the passed stage in a variable.
        rootPane = new StackPane(); //initialize a stackpane to store and arrange GUIRoot.GUIRoot elements.
        rootPane.setAlignment(Pos.CENTER);
        userTypeSelectionPane = new loginPane(); //initialize a second stackpane that can be moved around in reference
                                                 //to the rootpane based on user input.
        rootPane.getChildren().add(userTypeSelectionPane); //add the selection pane to the root pane.

        GUIScene = new Scene(rootPane); //initialize a scene for the pane.

        primaryStage.setTitle("Chocoholics"); //Name GUIRoot.GUIRoot window.
        primaryStage.setMaxHeight(800); //Set dimensions of GUIRoot.GUIRoot window.
        primaryStage.setMinHeight(800);
        primaryStage.setMaxWidth(800);
        primaryStage.setMinWidth(800);

        primaryStage.setFullScreen(false); //ensure that the GUIRoot.GUIRoot is windowed.
        primaryStage.setResizable(false); //keep the GUIRoot.GUIRoot at a constant size for simplicity of element configuration.

        userStructure = new userHashTable();
        userStructure.Test();

        primaryStage.setScene(GUIScene); //assign the scene to the primary stage object.
        primaryStage.show(); //display the GUIRoot.GUIRoot on the user's computer.
    }
}
