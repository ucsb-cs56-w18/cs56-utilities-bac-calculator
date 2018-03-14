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

public class CreateLiqourLabelAndLevel {
    private JPanel panel;
    private GridBagConstraints c;
    private String[] number;
    private int lamountOfBrands;
    private String[] ltypes;
    private double[] ltypePercentages;
    public JComboBox liqType;
    public JComboBox hardLiquor;

    public CreateLiqourLabelAndLevel(JPanel panel, GridBagConstraints c, String... number) {
        this.panel = panel;
        this.c = c;
        this.number = number;
    }

    public int getLamountOfBrands() {
        return lamountOfBrands;
    }

    public java.lang.String[] getLtypes() {
        return ltypes;
    }

    public double[] getLtypePercentages() {
        return ltypePercentages;
    }

    public CreateLiqourLabelAndLevel invoke() {
        hardLiquor = new JComboBox(number);
        c.gridx = 0;
        c.gridy = 16;
        JLabel hardLiquorLabel = new JLabel("Hard Liquor Shots");
        panel.add(hardLiquorLabel, c);
        c.gridx = 1;
        c.gridy = 16;
        panel.add(hardLiquor, c);

        //create a type of liquor label

        Map<String, Double> liqMap = new HashMap<String, Double>();

        liqMap.put("Bourbon", .51);
        liqMap.put("Brandy", .4);
        liqMap.put("EverClear", .8);
        liqMap.put("Gin", .375);
        liqMap.put("Rum", .42);
        liqMap.put("Sake", .15);
        liqMap.put("Tequila", .47);
        liqMap.put("Whiskey", .533);
        liqMap.put("Moonshine", .75);
        liqMap.put("Vodka", .4);
        liqMap.put("Scotch", .45);
        liqMap.put("Other", .4);

        ArrayList<String> sortedLiqKeys = new ArrayList<String>(liqMap.keySet());
        Collections.sort(sortedLiqKeys);

        lamountOfBrands = 12;
        ltypes = new String[12];
        ltypePercentages = new double[12];
        int l = 0;
        for(String key : sortedLiqKeys) {
            ltypes[l] = key;
            ltypePercentages[l] = liqMap.get(key);
            l++;
        }
        liqType = new JComboBox(ltypes);
        c.gridx = 0;
        c.gridy = 18;
        JLabel liqTypeLabel = new JLabel("Type of Liquor");
        panel.add(liqTypeLabel, c);
        c.gridx = 1;
        c.gridy = 18;
        panel.add(liqType, c);
        c.gridx = 1;
        c.gridy = 20;
        return this;


        //create an amount of liquor label shot, doubleshot, bottle, handle
        //This does not contribute to BAC Level, does not work

//        String lamounts[] = {"Shot", "Doubleshot", "Bottle", "Handle"};
//        double llamounts[] = {1.5, 3, 25.6, 59.2};
//        Arrays.sort(lamounts);
//        liqAmount = new JComboBox(lamounts);
//        int lamountofAmounts = 4;
//        JLabel liqAmountLabel = new JLabel("Amount of Liqour");
//        c.gridx = 0;
//        c.gridy = 21;
//        panel.add(liqAmountLabel, c);
//        c.gridx = 1;
//        panel.add(liqAmount, c);
    }
}