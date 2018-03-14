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

public class Gender {

    public static JComboBox gender;

    public static void createMaleFemaleBox(JPanel panel, GridBagConstraints c) {
        String genderArray[] = {"Male", "Female     "};
        Arrays.sort(genderArray);
        gender = new JComboBox(genderArray);
        c.gridx = 0;
        c.gridy = 6;
        JLabel genderLabel = new JLabel("Gender");
        panel.add(genderLabel,c);
        c.gridx = 1;
        c.gridy = 6;
        panel.add(gender,c);
    }
}