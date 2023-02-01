package kjellgren.linus.cleancodeprojekt;

public class JFrame extends javax.swing.JFrame {

    private Components components;
    private Press press;

    public JFrame() {
        components = new Components();
        initiateComponents();
        press = new Press(components);
        press.activeButtons();
        components.getOnButton().setEnabled(false);
    }
    
    

//<editor-fold defaultstate="collapsed" desc="initComponents()">
    protected void initiateComponents() {

        components.setButtonGroup(new javax.swing.ButtonGroup());
        components.setjTextField(new javax.swing.JTextField());
        components.setOnButton(new javax.swing.JRadioButton());
        components.setOffButton(new javax.swing.JRadioButton());
        components.setBackButton(new javax.swing.JButton());
        components.setClearButton(new javax.swing.JButton());
        components.setPlusButton(new javax.swing.JButton());
        components.setButtonSeven(new javax.swing.JButton());
        components.setButtonEight(new javax.swing.JButton());
        components.setButtonNine(new javax.swing.JButton());
        components.setButtonFour(new javax.swing.JButton());
        components.setButtonFive(new javax.swing.JButton());
        components.setButtonSix(new javax.swing.JButton());
        components.setButtonOne(new javax.swing.JButton());
        components.setButtonTwo(new javax.swing.JButton());
        components.setButtonThree(new javax.swing.JButton());
        components.setButtonMinus(new javax.swing.JButton());
        components.setButtonMultiply(new javax.swing.JButton());
        components.setButtonDivide(new javax.swing.JButton());
        components.setDotButton(new javax.swing.JButton());
        components.setButtonZero(new javax.swing.JButton());
        components.setEqualButton(new javax.swing.JButton());
        components.setLabel(new javax.swing.JLabel());
        
        //Set program to end on closing window
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        //Sets iframe above everything
        setAlwaysOnTop(true);
        //Sets calculator name on the top
        setTitle("Calculator");
        setLocation(new java.awt.Point(500, 250));
        //Sets window to not resizeable
        setResizable(false);
        setType(java.awt.Window.Type.UTILITY);
        
        //Sets numbers test frame to not editable
        components.getjTextField().setEditable(false);
        //Set Font
        components.getjTextField().setFont(new java.awt.Font("Tahoma", 1, 23)); // NOI18N
        components.getjTextField().setHorizontalAlignment(javax.swing.JTextField.RIGHT);

        components.getButtonGroup().add(components.getOnButton());
        //Set Font
        components.getOnButton().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        components.getOnButton().setText("On");

        components.getButtonGroup().add(components.getOffButton());
        //Set Font
        components.getOffButton().setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        components.getOffButton().setText("Off");

        //Set Font
        components.getBackButton().setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        components.getBackButton().setText("<--");

        //Set Font
        components.getClear().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getClear().setText("C");

        //Set Font
        components.getPlus().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getPlus().setText("+");

        //Set Font
        components.getButtonSeven().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getButtonSeven().setText("7");

        //Set Font
        components.getButtonEight().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getButtonEight().setText("8");

        //Set Font
        components.getButtonNine().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getButtonNine().setText("9");

        //Set Font
        components.getButtonFour().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getButtonFour().setText("4");

        //Set Font
        components.getButtonFive().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getButtonFive().setText("5");

        //Set Font
        components.getButtonSix().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getButtonSix().setText("6");

        //Set Font
        components.getButtonOne().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getButtonOne().setText("1");

        //Set Font
        components.getButtonTwo().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getButtonTwo().setText("2");

        //Set Font
        components.getButtonThree().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getButtonThree().setText("3");

        //Set Font
        components.getMinus().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getMinus().setText("-");

        //Set Font
        components.getMultiply().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getMultiply().setText("*");

        //Set Font
        components.getDivide().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getDivide().setText("/");

        //Set Font
        components.getDotButton().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getDotButton().setText(".");

        //Set Font
        components.getZero().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getZero().setText("0");

        //Set Font
        components.getEqual().setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        components.getEqual().setText("=");

        //Set Font
        components.getLabel().setFont(new java.awt.Font("Tahoma", 0, 11)); // NOI18N
        //Set Font Color
        components.getLabel().setForeground(new java.awt.Color(232, 15, 15));
        components.getLabel().setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        // Set Empty text
        components.getLabel().setText(" ");

        
        //This sets upp the layout for the JFrame. Its autogenerated in the JFrame Form.
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(components.getjTextField())
                                                .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(components.getOnButton())
                                                                .addComponent(components.getOffButton()))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(components.getBackButton(), javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(components.getClear(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(components.getPlus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addComponent(components.getDotButton(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(components.getZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(components.getEqual(), javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(components.getButtonSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(components.getButtonEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(components.getButtonNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(components.getButtonFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(components.getButtonFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(components.getButtonSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(components.getButtonOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(components.getButtonTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                        .addComponent(components.getButtonThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(components.getMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(components.getMultiply(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addComponent(components.getDivide(), javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(components.getLabel(), javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(components.getLabel())
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(components.getjTextField(), javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(components.getOnButton())
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(components.getOffButton()))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(components.getClear(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(components.getPlus(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(components.getBackButton(), javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(components.getButtonSeven(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(components.getButtonEight(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(components.getButtonNine(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(components.getButtonFour(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(components.getButtonFive(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(components.getButtonSix(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(components.getMinus(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(components.getMultiply(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(components.getButtonOne(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(components.getButtonTwo(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(components.getButtonThree(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(components.getDivide(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(components.getDotButton(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(components.getZero(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(components.getEqual(), javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap())
        );

        pack();
    }
//</editor-fold>


    
}
