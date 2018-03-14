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

public class HoursDrinking {

    public static JTextField hoursField;

    public static void createHoursTextFieldAndPanel(JPanel panel, GridBagConstraints c) {
        c.gridx = 0;
        c.gridy = 4;
        JLabel hoursLabel = new JLabel("Hours Drinking ");
        panel.add(hoursLabel, c);
        c.gridx = 1;
        c.gridy = 4;
        hoursField = new JTextField();
        hoursField.setColumns(10);
        panel.add(hoursField, c);
    }
}