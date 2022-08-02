package com.example.coffeeshop;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.AnchorPane;

public class HelloController {

    @FXML
    private RadioButton expressoRadioButton;
    @FXML
    private ToggleGroup beverageToggleGroup;
    @FXML
    private RadioButton coffeeRadioButton;
    @FXML
    private Label receiptLabel;
    @FXML
    private RadioButton latteRadioButton;
    @FXML
    private AnchorPane anchorPane;


    //Similar to a constructor runs after JavaFX runs
    public void initialize()
    {
       showReceipt();

    }



    @FXML
    public void beverageRadioButtonClicked(ActionEvent actionEvent) {

        //Which button was pressed?
  /*      if(actionEvent.getSource() == expressoRadioButton)
        {
            receiptLabel.setText("Expresso $1.50");

        }else if(actionEvent.getSource() == coffeeRadioButton){
            receiptLabel.setText("Coffee is $1.00");

        }else if(actionEvent.getSource() == latteRadioButton){
            receiptLabel.setText("Latte $2.00");
        }
  */





        showReceipt();

    }

    private void showReceipt(){

        if(expressoRadioButton.isSelected())
        {
            receiptLabel.setText("Expresso $1.50");

        }else if(coffeeRadioButton.isSelected()){
            receiptLabel.setText("Coffee is $1.00");

        }else if(latteRadioButton.isSelected()){
            receiptLabel.setText("Latte $2.00");
        }
    }
}