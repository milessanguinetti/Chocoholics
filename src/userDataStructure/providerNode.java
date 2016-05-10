package userDataStructure;

import java.io.Serializable;

/**
 * Created by Spaghetti on 4/25/2016.
 */
public class providerNode extends userNode implements Serializable{
    private String providerName; //the provider's name; 25 characters
    private String providerStreet; //the provider's street; 25 characters
    private String providerCity; //the provider's city; 14 characters
    private String providerState; //the provider's state; 2 letters
    private int providerZip; //the provider's street; 5 digit integer
    private int totalConsultations; //the provider's total consultations over all time; 3 digit integer

    public providerNode(int providerNumber){
        super(providerNumber);
    }

    @Override
    public int getUserCategory() { //returns the user's category as an int.
        return 2;
    }
}
