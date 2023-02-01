package kjellgren.linus.cleancodeprojekt;

public class Press {

    double Number, answer;
    int calculation;
    boolean clear = true;
    Components components;


    public Press(Components components) {
        this.components = components;
        offButtons();
    }

    public void activeButtons() {
        components.getOffButton().addActionListener((java.awt.event.ActionEvent evt) -> {
            onPower(evt);
        });
        components.getOnButton().addActionListener((java.awt.event.ActionEvent evt) -> {
            setOn(evt);
        });
        components.getBackButton().addActionListener((java.awt.event.ActionEvent evt) -> {
            backButton(evt);
        });
        components.getClear().addActionListener((java.awt.event.ActionEvent evt) -> {
            pressClear(evt);
        });
        components.getPlus().addActionListener((java.awt.event.ActionEvent evt) -> {
            pressPlusButton(evt);
        });
        components.getButtonSeven().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttomSeven(evt);
        });
        components.getButtonEight().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonEight(evt);
        });
        components.getButtonNine().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonNine(evt);
        });
        components.getButtonFour().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonFour(evt);
        });
        components.getButtonFive().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonFive(evt);
        });
        components.getButtonSix().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonSix(evt);
        });
        components.getButtonOne().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonOne(evt);
        });
        components.getButtonTwo().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonTwo(evt);
        });
        components.getButtonThree().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonTree(evt);
        });
        components.getMinus().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonMinus(evt);
        });
        components.getMultiply().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonMultiply(evt);
        });
        components.getDivide().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonDivide(evt);
        });
        components.getDotButton().addActionListener((java.awt.event.ActionEvent evt) -> {
            dotButton(evt);
        });
        components.getZero().addActionListener((java.awt.event.ActionEvent evt) -> {
            buttonZero(evt);
        });
        components.getEqual().addActionListener((java.awt.event.ActionEvent evt) -> {
            equalButton(evt);
        });

    }

    public void math() {
        System.out.println(components.getjTextField().getText());
        int value  = 0;
        switch (value){
            case 1:
                if (calculation == 1) {
                    answer = Calculator.addition(Number, components);
                }
                break;
            case 2:
                if (calculation == 2) {
                    answer = Calculator.substraction(Number, components);
                }
                break;
            case 3:
                if (calculation == 3) {
                    answer = Calculator.multiplication(Number, components);
                }
                break;
            case 4:
                if (calculation == 4) {
                    answer = answer = Calculator.division(Number, components);
                }
                break;
        }
        System.out.println("=");
        System.out.println(Double.toString(answer));
        System.out.println("");
    }

    protected void uTF(javax.swing.JButton button) {
        components.getjTextField().setText(components.getjTextField().getText() + button.getText());
        onButtons();
    }

    public void enabledButton() {
        components.getjTextField().setEnabled(true);
        components.getBackButton().setEnabled(true);
        components.getClear().setEnabled(true);
        components.getPlus().setEnabled(true);
        components.getButtonSeven().setEnabled(true);
        components.getButtonEight().setEnabled(true);
        components.getButtonNine().setEnabled(true);
        components.getButtonFour().setEnabled(true);
        components.getButtonFive().setEnabled(true);
        components.getButtonSix().setEnabled(true);
        components.getButtonOne().setEnabled(true);
        components.getButtonTwo().setEnabled(true);
        components.getButtonThree().setEnabled(true);
        components.getMinus().setEnabled(true);
        components.getMultiply().setEnabled(true);
        components.getDivide().setEnabled(true);
        components.getDotButton().setEnabled(true);
        components.getZero().setEnabled(true);
        components.getEqual().setEnabled(true);
        components.getOnButton().setEnabled(false);
        components.getOffButton().setEnabled(true);
    }

    public void disabledButton() {
        components.getjTextField().setEnabled(false);
        components.getBackButton().setEnabled(false);
        components.getClear().setEnabled(false);
        components.getPlus().setEnabled(false);
        components.getButtonSeven().setEnabled(false);
        components.getButtonEight().setEnabled(false);
        components.getButtonNine().setEnabled(false);
        components.getButtonFour().setEnabled(false);
        components.getButtonFive().setEnabled(false);
        components.getButtonSix().setEnabled(false);
        components.getButtonOne().setEnabled(false);
        components.getButtonTwo().setEnabled(false);
        components.getButtonThree().setEnabled(false);
        components.getMinus().setEnabled(false);
        components.getMultiply().setEnabled(false);
        components.getDivide().setEnabled(false);
        components.getDotButton().setEnabled(false);
        components.getZero().setEnabled(false);
        components.getEqual().setEnabled(false);
        components.getOnButton().setEnabled(true);
        components.getOffButton().setEnabled(false);
    }

    public void offButtons() {
        components.getBackButton().setEnabled(false);
        components.getPlus().setEnabled(false);
        components.getMinus().setEnabled(false);
        components.getMultiply().setEnabled(false);
        components.getDivide().setEnabled(false);
        components.getDotButton().setEnabled(false);
        components.getEqual().setEnabled(false);
    }

    public void onButtons() {
        components.getBackButton().setEnabled(true);
        components.getPlus().setEnabled(true);
        components.getMinus().setEnabled(true);
        components.getMultiply().setEnabled(true);
        components.getDivide().setEnabled(true);
        components.getDotButton().setEnabled(true);
        components.getEqual().setEnabled(true);
    }



    protected void buttonOne(java.awt.event.ActionEvent evt) {
        uTF(components.getButtonOne());
    }

    protected void buttonTwo(java.awt.event.ActionEvent evt) {
        uTF(components.getButtonTwo());
    }

    protected void buttonTree(java.awt.event.ActionEvent evt) {
        uTF(components.getButtonThree());
    }

    protected void buttonFour(java.awt.event.ActionEvent evt) {
        uTF(components.getButtonFour());
    }

    protected void buttonFive(java.awt.event.ActionEvent evt) {
        uTF(components.getButtonFive());
    }

    protected void buttonSix(java.awt.event.ActionEvent evt) {
        uTF(components.getButtonSix());
    }

    protected void buttomSeven(java.awt.event.ActionEvent evt) {
        uTF(components.getButtonSeven());
    }

    protected void buttonEight(java.awt.event.ActionEvent evt) {
        uTF(components.getButtonEight());
    }

    protected void buttonNine(java.awt.event.ActionEvent evt) {
        uTF(components.getButtonNine());
    }

    protected void buttonZero(java.awt.event.ActionEvent evt) {
        uTF(components.getZero());
    }

    protected void pressPlusButton(java.awt.event.ActionEvent evt) {

        if (!clear) {
            math();
        }
        System.out.println(components.getjTextField().getText());
        System.out.println("+");
        clear = false;
        Number = Double.parseDouble(components.getjTextField().getText());
        calculation = 1;
        components.getjTextField().setText("");
        components.getLabel().setText(Number + "+");
    }

    protected void buttonMinus(java.awt.event.ActionEvent evt) {
        if (!clear) {
            math();
        }
        System.out.println(components.getjTextField().getText());
        System.out.println("-");
        clear = false;
        Number = Double.parseDouble(components.getjTextField().getText());
        calculation = 2;
        components.getjTextField().setText("");
        components.getLabel().setText(Number + "-");
    }
    protected void buttonMultiply(java.awt.event.ActionEvent evt) {
        if (Double.parseDouble(components.getjTextField().getText()) == 0.0) {
            System.out.println("Multiplication By Zero");
            components.getjTextField().setText("");
            components.getLabel().setText("Multiplication By Zero");
            offButtons();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(components.getjTextField().getText());
            System.out.println("*");
            clear = false;
            Number = Double.parseDouble(components.getjTextField().getText());
            calculation = 3;
            components.getjTextField().setText("");
            components.getLabel().setText(Number + "*");
        }
    }

    protected void buttonDivide(java.awt.event.ActionEvent evt) {
        if (Double.parseDouble(components.getjTextField().getText()) == 0.0) {
            System.out.println("Division By Zero");
            components.getjTextField().setText("");
            components.getLabel().setText("Division By Zero");
            offButtons();
            clear = true;
        } else {
            if (!clear) {
                math();
            }
            System.out.println(components.getjTextField().getText());
            System.out.println("/");
            clear = false;
            Number = Double.parseDouble(components.getjTextField().getText());
            calculation = 4;
            components.getjTextField().setText("");
            components.getLabel().setText(Number + "/");

        }

    }

    protected void dotButton(java.awt.event.ActionEvent evt) {
        uTF(components.getDotButton());
    }

    protected void pressClear(java.awt.event.ActionEvent evt) {
        components.getjTextField().setText("");
        offButtons();
    }

    protected void setOn(java.awt.event.ActionEvent evt) {
        enabledButton();
    }

    protected void onPower(java.awt.event.ActionEvent evt) {
        disabledButton();
    }

    protected void backButton(java.awt.event.ActionEvent evt) {
        int length = components.getjTextField().getText().length();
        int number = components.getjTextField().getText().length() - 1;
        String store;
        if (length > 0) {
            StringBuilder back = new StringBuilder(components.getjTextField().getText());
            back.deleteCharAt(number);
            store = back.toString();
            components.getjTextField().setText(store);
        }
        if (components.getjTextField().getText().length() <= 0) {
            offButtons();
        }
    }

    protected void equalButton(java.awt.event.ActionEvent evt) {
        math();
        clear = true;
        components.getLabel().setText("");
    }
}
