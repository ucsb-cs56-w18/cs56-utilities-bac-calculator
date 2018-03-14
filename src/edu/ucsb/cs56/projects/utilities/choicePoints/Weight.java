package edu.ucsb.cs56.projects.utilities.choicePoints;

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
import java.util.Arrays;
import java.util.*;

import java.lang.*;


public class Weight {

    public static JTextField weightField;
    public static JComboBox weightUnits;

    public static void CreateWeightLabelAndTextField(JPanel panel, GridBagConstraints c) {
        c.gridx = 0;
        c.gridy = 0;
        JLabel weightLabel = new JLabel("Weight ");
        panel.add(weightLabel, c);
        c.gridx = 1;
        c.gridy = 0;
        weightField = new JTextField();
        weightField.setColumns(10);
        panel.add(weightField);

        //create a lbs/kgs combo box
        String weightArray[] = {"Pounds", "Kilograms "};
        Arrays.sort(weightArray); //Sorts array in alphabetical order: all arrays with at least one letter are alphabetically sorted
        weightUnits = new JComboBox(weightArray);
        c.gridx = 0;
        c.gridy = 2;
        panel.add(new JLabel("Units "), c);
        c.gridx = 1;
        c.gridy = 2;
        panel.add(weightUnits, c);
    }
}