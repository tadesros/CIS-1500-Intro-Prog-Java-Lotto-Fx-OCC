package com.example.coffeeshop;

import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;

import java.util.ArrayList;

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
    @FXML
    private CheckBox milkCheckBox;
    @FXML
    private CheckBox halfAndHalf;
    @FXML
    private CheckBox soyMilkCheckBox;
    @FXML
    private Slider milkSlider;

    //Create a beverage from beverage class
    Beverage beverage;
    ArrayList<Beverage> order;
    @FXML
    private TextField customerNameTextField;
    @FXML
    private TextArea orderTextArea;


    //Similar to a constructor runs after JavaFX runs
    public void initialize() {
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

    private void showReceipt() {

        double totalCost = 0;

        if (expressoRadioButton.isSelected()) {
            beverage = new Beverage("Expresso");

        } else if (coffeeRadioButton.isSelected()) {
            beverage = new Beverage("Coffee");
        } else if (latteRadioButton.isSelected()) {
            beverage = new Beverage("Latte");
        }

        //Get slider value
        int numberOfMilksToAdd = (int) milkSlider.getValue();


        if (milkCheckBox.isSelected()) {
            beverage.addAddin("milk", numberOfMilksToAdd);
        }
        if (halfAndHalf.isSelected()) {
            beverage.addAddin("half and half", numberOfMilksToAdd);
        }
        if (soyMilkCheckBox.isSelected()) {
            beverage.addAddin("soy milk", numberOfMilksToAdd);
        }

        receiptLabel.setText(beverage.getReceipt());
    }

    @FXML
    public void addInCheckBoxChecked(ActionEvent actionEvent) {
        showReceipt();
    }

    @FXML
    public void milkSliderScroll(Event event) {
        showReceipt();
    }

    @FXML
    public void addToOrderButtonClicked(ActionEvent actionEvent) {
        beverage.setCustomerName(customerNameTextField.getText());
        orderTextArea.appendText(beverage.getReceipt() + "\n");
        customerNameTextField.setText("");
    }
}