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



public class CreateBeerLabelsForTypeAndLevel {
    private JPanel panel;
    private GridBagConstraints c;
    private String[] number;
    private int amountOfBrands;
    private String[] types;
    private double[] typePercentages;
    public JComboBox beerType;
    public JComboBox beer;

    public CreateBeerLabelsForTypeAndLevel(JPanel panel, GridBagConstraints c) {
        this.panel = panel;
        this.c = c;
    }

    public java.lang.String[] getNumber() {
        return number;
    }

    public int getAmountOfBrands() {
        return amountOfBrands;
    }

    public java.lang.String[] getTypes() {
        return types;
    }

    public double[] getTypePercentages() {
        return typePercentages;
    }

    public String[] createBeerLabel(JPanel panel, GridBagConstraints c) {
        String number[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9",
                "10", "11", "12", "13", "14", "15", "16", "17",
                "18", "19", "20", "21", "22", "23", "24", "25         "};

        beer = new JComboBox(number);
        c.gridx = 0;
        c.gridy = 8;
        JLabel beerLabel = new JLabel("# of Beers");
        panel.add(beerLabel, c);
        c.gridx = 1;
        c.gridy = 8;
        panel.add(beer, c);
        return number;
    }

    public CreateBeerLabelsForTypeAndLevel invoke() {
        number = createBeerLabel(panel, c);

        //create a type of beer label
        Map<String, Double> beerMap = new HashMap<String, Double>();

        beerMap.put("Coors Light", .042);
        beerMap.put("Milwaukee's Best Ice", .059);
        beerMap.put("Keystone Ice", .059);
        beerMap.put("Big Flats Light Beer", .039);
        beerMap.put("Natural Ice", .059);
        beerMap.put("Natural Light", .042);
        beerMap.put("Bud Light Platinum", .06);
        beerMap.put("Miller Lite", .042);
        beerMap.put("Smirnoff Ice", .05);
        beerMap.put("Blue Moon", .054);
        beerMap.put("IPA", .07);
        beerMap.put("Other", .045);

        ArrayList<String> sortedBeerKeys = new ArrayList<String>(beerMap.keySet());
        Collections.sort(sortedBeerKeys);

        amountOfBrands = 12;
        types = new String[12];
        typePercentages = new double[12];
        int i = 0;
        for(String key : sortedBeerKeys) {
            types[i] = key;
            typePercentages[i] = beerMap.get(key);
            i++;
        }
        beerType = new JComboBox(types);
        c.gridx = 0;
        c.gridy = 10;
        JLabel beerTypeLabel = new JLabel("Brand of Beer");
        panel.add(beerTypeLabel, c);
        c.gridx = 1;
        c.gridy = 10;
        panel.add(beerType, c);
        return this;


        //Create ammount of beer label can, 40, Bullet, keg
        //This does not contribute to BAC Level, does not work

//        String bamounts[] = {"Can", "40", "Bullet", "Keg"};
//        Arrays.sort(bamounts);
//        double bbamounts[] = {12, 40, 16, 1984};
//        beerAmount = new JComboBox(bamounts);
//        int bamountofAmounts = 4;
//        JLabel beerAmountLabel = new JLabel("Amount of Beer");
//        c.gridx = 0;
//        c.gridy = 11;
//        panel.add(beerAmountLabel, c);
//        c.gridx = 1;
//        panel.add(beerAmount, c);
    }
}