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


/**
 * BACPanel for our SimpleGui BAC Calculator application
 *
 * @author Dominic Kirby and Hernan Duran
 * @version CS56 F16
 */


public class BACPanel extends JPanel {

    JTextField weightField;
    JTextField hoursField;

    static JTextArea BACArea;
    static JScrollPane scroller;

    JComboBox weightUnits;
    JComboBox gender;
    JComboBox beer;
    JComboBox wine;
    JComboBox hardLiquor;
    JComboBox beerType;
    JComboBox wineType;
    JComboBox liqType;
    JComboBox beerAmount;
    JComboBox wineAmount;
    JComboBox liqAmount;
    JComboBox backColor;
    JPanel display;

    public BACPanel() {
        super(new BorderLayout());

        display = new JPanel();

        JPanel panel = new JPanel(new GridLayout());
        panel.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();

        c.weighty = 0.05;
        c.insets = new Insets(0, 0, 0, 0);

        //create a weight label & text field
        Weight.CreateWeightLabelAndTextField(panel, c);
        //create a hours text field and panel
        HoursDrinking.createHoursTextFieldAndPanel(panel, c);
        //create a male/female combo box
        Gender.createMaleFemaleBox(panel, c);
        //create a color box
        BackgroundColor.createColorBox(panel, c);

        //CREATE BEER LABEL AND FIELD
        CreateBeerLabelsForTypeAndLevel createBeerLabelsForTypeAndLevel = new CreateBeerLabelsForTypeAndLevel(panel, c).invoke();
        String[] number = createBeerLabelsForTypeAndLevel.getNumber();
        int amountOfBrands = createBeerLabelsForTypeAndLevel.getAmountOfBrands();
        String[] types = createBeerLabelsForTypeAndLevel.getTypes();
        double[] typePercentages = createBeerLabelsForTypeAndLevel.getTypePercentages();

        //Create ammount of beer label can, 40, Bullet, keg
        //This does not contribute to BAC Level, does not work, for next year's group to solve
        String bamounts[] = {"Can", "40", "Bullet", "Keg"};
        Arrays.sort(bamounts);
        double bbamounts[] = {12, 40, 16, 1984};
        beerAmount = new JComboBox(bamounts);
        int bamountofAmounts = 4;
        JLabel beerAmountLabel = new JLabel("Amount of Beer");
        c.gridx = 0;
        c.gridy = 11;
        panel.add(beerAmountLabel, c);
        c.gridx = 1;
        panel.add(beerAmount, c);


        //CREATE WINE LABEL AND FIELD
        CreateLabelsForWineTypeAndLevel createLabelsForWineTypeAndLevel = new CreateLabelsForWineTypeAndLevel(panel, c, number).invoke();
        int wamountOfBrands = createLabelsForWineTypeAndLevel.getWamountOfBrands();
        String[] wtypes = createLabelsForWineTypeAndLevel.getWtypes();
        double[] wtypePercentages = createLabelsForWineTypeAndLevel.getWtypePercentages();

        //amount of wine label, glass, bottle, bag, barrel
        //This does not contribute to BAC Level, does not work, for next year's group to solve
        String wamounts[] = {"Glass", "Bottle", "Bag", "Barrel"};
        Arrays.sort(wamounts);
        double wwamounts[] = {5, 25.4, 169.05, 4032};
        wineAmount = new JComboBox(wamounts);
        int wamountofAmounts = 4;
        JLabel wineAmountLabel = new JLabel("Amount of Wine");
        c.gridx = 0;
        c.gridy = 15;
        panel.add(wineAmountLabel, c);
        c.gridx = 1;
        panel.add(wineAmount, c);



        //CREATE HARD LIQOUR LABEL AND FIELD
        CreateLiqourLabelAndLevel createLiqourLabelAndLevel = new CreateLiqourLabelAndLevel(panel, c, number).invoke();
        int lamountOfBrands = createLiqourLabelAndLevel.getLamountOfBrands();
        String[] ltypes = createLiqourLabelAndLevel.getLtypes();
        double[] ltypePercentages = createLiqourLabelAndLevel.getLtypePercentages();

        //create an amount of liquor label shot, doubleshot, bottle, handle
        //This does not contribute to BAC Level, does not work, for next year's group to solve
        String lamounts[] = {"Shot", "Doubleshot", "Bottle", "Handle"};
        double llamounts[] = {1.5, 3, 25.6, 59.2};
        Arrays.sort(lamounts);
        liqAmount = new JComboBox(lamounts);
        int lamountofAmounts = 4;
        JLabel liqAmountLabel = new JLabel("Amount of Liqour");
        c.gridx = 0;
        c.gridy = 21;
        panel.add(liqAmountLabel, c);
        c.gridx = 1;
        panel.add(liqAmount, c);


        //GUI CONFIGURATION
        BACArea = new JTextArea(10, 20);
        BACArea.setLineWrap(true);
        BACArea.setRows(10);

        scroller = new JScrollPane(BACArea);
        scroller.setVerticalScrollBarPolicy
                (ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy
                (ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        display.add(scroller);
        add(panel, BorderLayout.WEST);
        add(display, BorderLayout.SOUTH);
        JButton submit = new JButton("Calculate BAC");


        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                BACArea.setText(null);
                boolean isMale;
                String gender1 = (String) Gender.gender.getSelectedItem();
                String color1 = (String) BackgroundColor.backColor.getSelectedItem();
                if(color1 == "Blue")
                {
                    panel.setBackground(Color.BLUE);
                    display.setBackground(Color.BLUE);
                }
                else if(color1 == "Red")
                {
                    panel.setBackground(Color.RED);
                    display.setBackground(Color.RED);
                }else if(color1 == "Yellow")
                {
                    panel.setBackground(Color.YELLOW);
                    display.setBackground(Color.YELLOW);
                }else if (color1 == "Green")
                {
                    panel.setBackground(Color.GREEN);
                    display.setBackground(Color.GREEN);
                }else if (color1 == "Orange")
                {
                    panel.setBackground(Color.ORANGE);
                    display.setBackground(Color.ORANGE);
                }else if (color1 == "Cyan")
                {
                    panel.setBackground(Color.CYAN);
                    display.setBackground(Color.CYAN);
                }else if (color1 == "Black")
                {
                    panel.setBackground(Color.BLACK);
                    display.setBackground(Color.BLACK);
                }else if (color1 == "Gray")
                {
                    panel.setBackground(Color.GRAY);
                    display.setBackground(Color.GRAY);
                }else if (color1 == "Pink")
                {
                    panel.setBackground(Color.PINK);
                    display.setBackground(Color.PINK);
                }else if (color1 == "White")
                {
                    panel.setBackground(Color.WHITE);
                    display.setBackground(Color.WHITE);
                }

                int hours;
                int weight;
                try {
                    hours = Integer.parseInt(HoursDrinking.hoursField.getText());
                    weight = Integer.parseInt(Weight.weightField.getText());
                } catch (NumberFormatException nfe) {
                    hours = -1;
                    weight = -1;
                }

                boolean isKilograms = false;
                String lbsOrKg = (String) Weight.weightUnits.getSelectedItem();
                String bType = (String) createBeerLabelsForTypeAndLevel.beerType.getSelectedItem();
                String wType = (String) createLabelsForWineTypeAndLevel.wineType.getSelectedItem();
                String lType = (String) createLiqourLabelAndLevel.liqType.getSelectedItem();
                String bAmount = (String) beerAmount.getSelectedItem();
                String wAmount = (String) wineAmount.getSelectedItem();
                String lAmount = (String) liqAmount.getSelectedItem();
                int beer1 = Integer.parseInt
                        ((String) createBeerLabelsForTypeAndLevel.beer.getSelectedItem());
                int wine1 = Integer.parseInt
                        ((String) createLabelsForWineTypeAndLevel.wine.getSelectedItem());
                int hardLiquor1 = Integer.parseInt
                        ((String) createLiqourLabelAndLevel.hardLiquor.getSelectedItem());

                int index = 0;
                for (int j = 0; j < amountOfBrands; j++)
                    if (types[j].equals(bType))
                        index = j;
                double beerAlcoholPercentage = typePercentages[index];

                index = 0;
                for (int j = 0; j < bamountofAmounts; j++)
                    if (bamounts[j].equals(bAmount))
                        index = j;
                double beerOunces = bbamounts[index];


                int windex = 0;
                for (int j = 0; j < wamountOfBrands; j++)
                    if (wtypes[j].equals(wType))
                        windex = j;
                double wineAlcoholPercentage = wtypePercentages[windex];

                windex = 0;
                for (int j = 0; j < wamountofAmounts; j++)
                    if (wamounts[j].equals(wAmount))
                        windex = j;
                double wineOunces = wwamounts[windex];

                int lindex = 0;
                for (int j = 0; j < lamountOfBrands; j++)
                    if (ltypes[j].equals(lType))
                        lindex = j;
                double liqAlcoholPercentage = ltypePercentages[lindex];

                lindex = 0;
                for (int j = 0; j < lamountofAmounts; j++)
                    if (lamounts[j].equals(lAmount))
                        lindex = j;
                double liqOunces = llamounts[lindex];

                isMale = gender1.equals("Male") ? true : false;
                isKilograms = lbsOrKg.equals("Kilograms") ? true : false;
                double BAC = Calc.BAC
                        (isMale,
                                hours,
                                weight,
                                isKilograms,
                                beer1,
                                beerAlcoholPercentage,
                                wine1,
                                wineAlcoholPercentage,
                                hardLiquor1,
                                liqAlcoholPercentage);

                BACArea.append(BACMessage.GuiMessage(BAC) + "\n");
            }
        });

        display.add(submit);
    }
}




