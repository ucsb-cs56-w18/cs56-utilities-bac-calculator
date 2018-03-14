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


public class CreateLabelsForWineTypeAndLevel {
    private JPanel panel;
    private GridBagConstraints c;
    private String[] number;
    private int wamountOfBrands;
    private String[] wtypes;
    private double[] wtypePercentages;
    public JComboBox wineType;
    public JComboBox wine;

    public CreateLabelsForWineTypeAndLevel(JPanel panel, GridBagConstraints c, String... number) {
        this.panel = panel;
        this.c = c;
        this.number = number;
    }

    public int getWamountOfBrands() {
        return wamountOfBrands;
    }

    public java.lang.String[] getWtypes() {
        return wtypes;
    }

    public double[] getWtypePercentages() {
        return wtypePercentages;
    }

    public CreateLabelsForWineTypeAndLevel invoke() {
        wine = new JComboBox(number);
        c.gridx = 0;
        c.gridy = 12;
        JLabel wineLabel = new JLabel("Glasses of Wine");
        panel.add(wineLabel, c);
        c.gridx = 1;
        c.gridy = 12;
        panel.add(wine, c);


        //create a type of wine label
        Map<String, Double> wineMap = new HashMap<String, Double>();

        wineMap.put("Moscato d'Asti", .055);
        wineMap.put("Muscadet", .095);
        wineMap.put("Pinot Grigio", .14);
        wineMap.put("Bordeaux", .135);
        wineMap.put("Sauvignon Blanc", .125);
        wineMap.put("Pinot Noir", .13);
        wineMap.put("Shiraz", .13);
        wineMap.put("Zinfandel", .18);
        wineMap.put("Chardonnay", .12);
        wineMap.put("Merlot", .145);
        wineMap.put("Cabernet", .14);
        wineMap.put("Other", .135);

        ArrayList<String> sortedWineKeys = new ArrayList<String>(wineMap.keySet());
        Collections.sort(sortedWineKeys);


        wamountOfBrands = 12;
        wtypes = new String[12];
        wtypePercentages = new double[12];
        int w = 0;
        for(String key : sortedWineKeys) {
            wtypes[w] = key;
            wtypePercentages[w] = wineMap.get(key);
            w++;
        }
        wineType = new JComboBox(wtypes);
        c.gridx = 0;
        c.gridy = 14;
        JLabel wineTypeLabel = new JLabel("Type of Wine", JLabel.RIGHT);
        panel.add(wineTypeLabel, c);
        c.gridx = 1;
        c.gridy = 14;
        panel.add(wineType, c);
        return this;

        //amount of wine label, glass, bottle, bag, barrel
        //This does not contribute to BAC Level, does not work

//        String wamounts[] = {"Glass", "Bottle", "Bag", "Barrel"};
//        Arrays.sort(wamounts);
//        double wwamounts[] = {5, 25.4, 169.05, 4032};
//        wineAmount = new JComboBox(wamounts);
//        int wamountofAmounts = 4;
//        JLabel wineAmountLabel = new JLabel("Amount of Wine");
//        c.gridx = 0;
//        c.gridy = 15;
//        panel.add(wineAmountLabel, c);
//        c.gridx = 1;
//        panel.add(wineAmount, c);
    }
}