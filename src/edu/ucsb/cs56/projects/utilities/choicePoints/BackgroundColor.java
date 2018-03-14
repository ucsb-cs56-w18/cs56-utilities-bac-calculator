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

public class BackgroundColor {

    public static JComboBox backColor;
    public static JLabel colorLabel;

    public static void createColorBox(JPanel panel, GridBagConstraints c) {
        String colorArray[] = {"Blue", "White", "Red", "Yellow", "Green", "Orange", "Cyan", "Black", "Gray", "Pink"};
        Arrays.sort(colorArray);
        backColor = new JComboBox(colorArray);
        c.gridx = 2;
        c.gridy = 0;
        colorLabel = new JLabel("Background Color");
        panel.add(colorLabel,c);
        c.gridx = 5;
        c.gridy = 0;
        panel.add(backColor,c);
    }
}