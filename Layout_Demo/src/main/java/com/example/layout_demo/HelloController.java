package com.example.layout_demo;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

public class HelloController {


    @FXML
    private TextArea textArea;
    @FXML
    private Button leftButton;
    @FXML
    private Button upButton;
    @FXML
    private Button downButton;
    @FXML
    private Button rightButton;

    private Coffee coffee;
    public void initialize(){
        textArea.setEditable(false);
        coffee = null;
    }
    @FXML
    public void buttonClicked(ActionEvent actionEvent) {

        if(actionEvent.getSource() == upButton){
            textArea.appendText("Up Button clicked!\n");
        }
        else if(actionEvent.getSource() == rightButton){
            textArea.appendText("Right Button clicked!\n");
        }
        else if(actionEvent.getSource() == downButton){
            textArea.appendText("Down Button clicked!\n");
        }
        else if(actionEvent.getSource() == leftButton){
            textArea.appendText("Left Button clicked!\n");
        }

        upButton.setDisable(false);
        downButton.setDisable(false);
        leftButton.setDisable(false);
        rightButton.setDisable(false);

        switch ((int)(Math.random()*4)){
            //0 and 3
            case 0:
                upButton.setDisable(true);
                break;
            case 1:
                rightButton.setDisable(true);
                break;
            case 2:
                leftButton.setDisable(true);
                break;
            case 3:
                downButton.setDisable(true);
                break;

        }

         if(coffee !=null){
            textArea.appendText(coffee.getSize());
         }

    }
}

//Check if room is blocked - disable button
//Room can be randomly blocked - caved in etc.
//Class level attribute

//you can have an attribute null

//Room has the random NPC in it
// - Get me the room
//   - get me the NPC
//   - is the npc null  --> Maybe set NPC to null

//Adjust buttons based on what is in the room