package com.raghib.calc;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;


public class Controller implements Initializable {

    @FXML
    private Button button_1;
    @FXML
    private Button button_2;
    @FXML
    private Button button_3;
    @FXML
    private Button button_4;
    @FXML
    private Button button_5;
    @FXML
    private Button button_6;
    @FXML
    private Button button_7;
    @FXML
    private Button button_8;
    @FXML
    private Button button_9;
    @FXML
    private Button button_0;
    @FXML
    private Button button_dot;
    @FXML
    private Label labelResult;
    @FXML
    private  Button opButtonPlus;

    @FXML
    private  Button opButtonMinus;

    @FXML
    private  Button opButtonMultiply;
    @FXML
    private  Button opButtonDivide;
    @FXML
    private Button equalButton;

    private  String value_1="";
    private String value_2="";
    private  String operatorSmbl="";

    private  double result=0;

    boolean isOperatorClicked=false;

    /*class NumberButton extends Button
    {
        private int value;

        NumberButton( int value)
        {
            this.value=value;
        }

        public int getValue() {
            return value;
        }
    }

     */
 public  void buttonClicked()
 {
     button_1.setOnAction(event -> {
         System.out.println("button 1 cliked");
         if(isOperatorClicked) {
             value_2 += "1";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "1";
             labelResult.setText(value_1);

         }
     });
     button_2.setOnAction(event -> {
         System.out.println("button 2 cliked");
         if(isOperatorClicked) {
             value_2 += "2";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "2";
             labelResult.setText(value_1);

         }
     });
     button_3.setOnAction(event -> {
         System.out.println("button 3 cliked");
         if(isOperatorClicked) {
             value_2 += "3";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "3";
             labelResult.setText(value_1);

         }
     });
     button_4.setOnAction(event -> {
         System.out.println("button 4 cliked");
         if(isOperatorClicked) {
             value_2 += "4";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "4";
             labelResult.setText(value_1);

         }
     });
     button_5.setOnAction(event -> {
         System.out.println("button 5 cliked");
         if(isOperatorClicked) {
             value_2 += "5";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "5";
             labelResult.setText(value_1);

         }
     });
     button_6.setOnAction(event -> {
         System.out.println("button 6 cliked");
         if(isOperatorClicked) {
             value_2 += "6";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "6";
             labelResult.setText(value_1);

         }
     });
     button_7.setOnAction(event -> {
         System.out.println("button 7 cliked");
         if(isOperatorClicked) {
             value_2 += "7";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "7";
             labelResult.setText(value_1);

         }
     });
     button_8.setOnAction(event -> {
         if(isOperatorClicked) {
             value_2 += "8";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "8";
             labelResult.setText(value_1);

         }
     });
     button_9.setOnAction(event -> {
         System.out.println("button 9 cliked");
         if(isOperatorClicked) {
             value_2 += "9";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "9";
             labelResult.setText(value_1);

         }
     });
     button_0.setOnAction(event -> {
         System.out.println("button 0 cliked");
         if(isOperatorClicked) {
             value_2 += "0";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += "0";
             labelResult.setText(value_1);

         }
     });
     button_dot.setOnAction(event -> {
         System.out.println("button .(dot) cliked");
         if(isOperatorClicked) {
             value_2 += ".";
             labelResult.setText(value_1+operatorSmbl+value_2);
         }
         else
         {
             value_1 += ".";
             labelResult.setText(value_1);

         }
     });
    opButtonPlus.setOnAction(event -> {
                System.out.println("+ clicked");

                if (!isOperatorClicked) {
                    operatorSmbl = " + ";
                    labelResult.setText(value_1 + operatorSmbl);
                    isOperatorClicked = true;

                }
            }

            );

     opButtonMinus.setOnAction(event -> {


                 if (!isOperatorClicked) {
                     operatorSmbl = " - ";
                     labelResult.setText(value_1 + operatorSmbl);
                     isOperatorClicked = true;

                 }
             }

     );
     opButtonMultiply.setOnAction(event -> {

                 if (!isOperatorClicked) {
                     operatorSmbl = " * ";
                     labelResult.setText(value_1 + operatorSmbl);
                     isOperatorClicked = true;

                 }
             }

     );
     opButtonDivide.setOnAction(event -> {

                 if (!isOperatorClicked) {
                     operatorSmbl = " / ";
                     labelResult.setText(value_1 + operatorSmbl);
                     isOperatorClicked = true;

                 }
             }

     );

 }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
       buttonClicked();
       equalButton.setOnAction(event ->
               calculateResult(Double.parseDouble(value_1),Double.parseDouble(value_2),operatorSmbl) );



        //button_1=new NumberButton(11);
    }

    private void calculateResult(double operand_1, double operand_2, String operatorSmbl) {
     switch (operatorSmbl)
     {
         case " + ":
             result=operand_1+operand_2;
             labelResult.setText(value_1+operatorSmbl+value_2+" = "+result);
             break;
         case  " - ":
             result=operand_1-operand_2;
             labelResult.setText(value_1+operatorSmbl+value_2+" = "+result);
             break;
         case " * ":
             result=operand_1*operand_2;
             labelResult.setText(value_1+operatorSmbl+value_2+" = "+result);
             break;
         case  " / ":
             result=operand_1/operand_2;
             labelResult.setText(value_1+operatorSmbl+value_2+" = "+result);


     }
    }


}
