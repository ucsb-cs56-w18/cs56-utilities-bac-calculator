package edu.ucsb.cs56.S12.ramonrovirosa.choicePoints;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.lang.*;

/** SimpleGui for our BAC Calculator application

     @author Ramon Rovirosa
     @author Shervin Shaikh
     @version CS56 Choice Points, Spring 2012, UCSB
*/


public class CalcGui{
    
    /**
       Constructor
    */

    private CalcGui(){}

    /**
       The places the BACPanel into the frame and makes
       the specifc frame visible
     */
    public static void main (String[] args) {
	
	JFrame frame = new JFrame("BAC Calculator");
	BACPanel panel = new BACPanel();
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().add(BorderLayout.CENTER, panel);
	frame.pack();
	frame.setSize(400,600);
	frame.setVisible(true);
    }
}