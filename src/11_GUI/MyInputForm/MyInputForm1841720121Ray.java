/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.myinputform;

/**
 *
 * @author ASUS
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
public class MyInputForm1841720121Ray extends JFrame{
    private static final int FRAME_WIDTH = 600;
    private static final int FRAME_HEIGHT = 200;
    private JLabel mALabel;
    private JLabel mBLabel;
    private JLabel mCLabel;
    private JTextField mAfield;
    private JTextField mBfield;
    private JButton mButton;
    private JPanel mPanel;
    
    public MyInputForm1841720121Ray() {
    createTextFieldRay();
    createButtonRay();
    createPanelRay();
    setSize(FRAME_WIDTH, FRAME_HEIGHT);    
    }
    private void createTextFieldRay(){
        mALabel = new JLabel("Nilai A: ");
        mBLabel = new JLabel("Nilai C: ");
        mCLabel = new JLabel("Hasil : ");
        
        final int FIELD_WIDTH = 10;
        mAfield = new JTextField(FIELD_WIDTH);
        mAfield.setText("0");
        mBfield = new JTextField(FIELD_WIDTH);
        mBfield.setText("0");

    }
    
    private void createButtonRay(){
        mButton = new JButton("Calculate");
        class AddInterestListener implements ActionListener{
            @Override
            public void actionPerformed(ActionEvent event){
                int a = Integer.valueOf(mAfield.getText());
                int b = Integer.valueOf(mBfield.getText());
                int c = a*b;
                mCLabel.setText("Hasil: "+ c);
            }
        }
            ActionListener listener = new AddInterestListener();
            mButton.addActionListener(listener);
        }   
    private void createPanelRay(){
        mPanel=new JPanel();
        mPanel.add(mALabel);
        mPanel.add(mAfield);
        mPanel.add(mBLabel);
        mPanel.add(mBfield);
        mPanel.add(mButton);
        mPanel.add(mCLabel);
        add(mPanel);
    }
    public static void main(String[] args) {
        JFrame frame = new MyInputForm1841720121Ray();
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }
}
