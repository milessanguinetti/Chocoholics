package GUI;

import javafx.scene.control.TextField;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import userDataStructure.providerNode;

import java.io.Serializable;

/**
 * Created by Spaghetti on 5/2/2016.
 */
//GUI pane for allowing providers to interface with the ChocAn system.
public class providerPane extends StackPane implements Serializable {
    private providerNode currentProvider; //the provider that is presently logged into the system.
    private Text providerNumberHeading; //a heading denoting the provider that is logged in.
    private TextField [] serviceFields; //text fields for inputting information about a new service.
    private TextField memberAuthenticationField; //a textfield for authenticating a member ID
    private TextField searchField; //a textfield for searching for
    private int selectedField; //index of the service field in which we are currently entering text;
                               //used primarily to allow keyboard-based navigation of the fields.

    public providerPane(){
        serviceFields = new TextField[3];
        serviceFields[0] = new TextField();
        serviceFields[1] = new TextField();
        serviceFields[2] = new TextField();
        memberAuthenticationField = new TextField();
    }

    //a class for adding clickable buttons to this UI pane.
    /*buttonFunction identities are as follows:
    0 -> Validate member
    1 -> Log service
    2 -> Enter input at service logging screen.
    3 -> Look up service
    4 -> Return to provider base mode
    5 -> Log out
     */
    private static class providerButton extends StackPane{
        public providerButton(String buttontext, int buttonFunction, providerPane Parent){
            Rectangle buttonBackground = new Rectangle(100, 100);
            buttonBackground.setFill(Color.CORNFLOWERBLUE);
            buttonBackground.setOnMouseReleased(event -> {
                switch(buttonFunction){
                    case 0:{
                        Parent.checkMemberValidationInput();
                    }
                    case 1:{
                        Parent.swapToServiceLoggingMode();
                    }
                    case 2:{
                        Parent.checkServiceInput();
                    }
                    case 3:{
                        Parent.swapToServiceLookupMode();
                    }
                    case 4:{
                        Parent.swapToBaseMode();
                    }
                    case 5:{
                        Parent.logout();
                    }
                }
            });
            getChildren().add(buttonBackground);
            Text buttonText = new Text(buttontext);
            buttonText.setFont(Font.font("Verdana", 12));
            getChildren().add(buttonText);

        }
    }

    //login a new provider into the system and update GUI elements accordingly.
    public void login(providerNode toLogin){
        currentProvider = toLogin;
        providerNumberHeading.setText("Hello Provider #" + toLogin.getUserNumber());
        providerNumberHeading.setFont(Font.font("Verdana", 24));
    }

    public void logout(){

    }

    public void swapToBaseMode(){

    }

    public void checkMemberValidationInput(){

    }

    public void checkServiceInput(){

    }

    public void swapToServiceLookupMode(){

    }

    public void swapToServiceLoggingMode(){

    }
}