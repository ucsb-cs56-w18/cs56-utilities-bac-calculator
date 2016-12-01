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

import java.lang.*;

/** BACPanel for our SimpleGui BAC Calculator application
    @author Dominic Kirby and Hernan Duran

    @version CS56 F16
*/


public class BACPanel extends JPanel{

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
    JPanel display;

    public BACPanel(){
	super(new BorderLayout());

	display = new JPanel();

	JPanel panel = new JPanel(new GridLayout());
	panel.setLayout(new GridBagLayout());
	GridBagConstraints c = new GridBagConstraints();

	c.weighty = 0.05;
	c.insets = new Insets(0,0,0,0);

	//create a weight label & text field
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
	weightUnits = new JComboBox(weightArray);
	c.gridx = 0;
	c.gridy = 2;
	panel.add(new JLabel("Units "), c);
	c.gridx = 1;
	c.gridy = 2;
	panel.add(weightUnits, c);

	//create a hours text field and panel
	c.gridx = 0;
	c.gridy = 4;
	JLabel hoursLabel = new JLabel("Hours Drinking ");
	panel.add(hoursLabel, c);
	c.gridx = 1;
	c.gridy = 4;
	hoursField = new JTextField();
	hoursField.setColumns(10);
	panel.add(hoursField, c);

	//create a male/female combo box
	String genderArray[] = {"Male", "Female     "};
	gender = new JComboBox(genderArray);
	c.gridx = 0;
	c.gridy = 6;
	JLabel genderLabel = new JLabel("Gender");
	panel.add(genderLabel,c);
	c.gridx = 1;
	c.gridy = 6;
	panel.add(gender,c);
	//create a beer label
	String number[]  = {"0","1","2","3","4","5","6","7","8","9",
			    "10","11","12","13","14","15","16","17",
			    "18","19","20","21","22","23","24","25         "};

	beer = new JComboBox(number);
	c.gridx = 0;
	c.gridy = 8;
	JLabel beerLabel = new JLabel("# of Beers");
	panel.add(beerLabel,c);
	c.gridx = 1;
	c.gridy = 8;
	panel.add(beer,c);

	//create a type of beer label
	String types[] = {"Coors Light", "Milwaukee's Best Ice",
			  "Keystone Ice", "Big Flats Light Beer",
			  "Natural Ice", "Natural Light",
			  "Bud Light Platinum", "Miller Lite","Other"};

	double typePercentages[] = {0,.042, .059, .059, .039,.059, .042,
				    .06, .042, .05};
	int amountOfBrands = 9;
	beerType = new JComboBox(types);
	c.gridx = 0;
	c.gridy = 10;
	JLabel beerTypeLabel = new JLabel("Brand of Beer");
	panel.add(beerTypeLabel,c);
	c.gridx = 1;
	c.gridy = 10;
	panel.add(beerType,c);
	//Create ammount of beer label can, 40, Bullet, keg
	
	String bamounts[] = {"Can","40","Bullet", "Keg"};
	double bbamounts[] = {12, 40, 16, 1984};
	beerAmount = new JComboBox(bamounts);
	int amountofAmounts = 4;
	JLabel beerAmountLabel = new JLabel("Amount of Beer");
	c.gridx = 0;
	c.gridy = 11;
	panel.add(beerAmountLabel,c);
	c.gridx = 1;
	panel.add(beerAmount,c);
	
	//create a wine label
	wine = new JComboBox(number);
	c.gridx = 0;
	c.gridy = 12;
	JLabel wineLabel = new JLabel("Glasses of Wine");
	panel.add(wineLabel,c);
	c.gridx = 1;
	c.gridy = 12;
	panel.add(wine,c);


	//create a type of wine label
	String wtypes[] = {"Moscato d'Asti", "Muscadet",
			   "Pinot Grigio", "Bordeaux",
			   "Sauvignon Blanc", "Pinot Noir",
			   "Shiraz", "Zinfandel","Other"};
	double wtypePercentages[] = {.055, .095, .14, .135, .125, .13,
				     .13, .18, .12};
	int wamountOfBrands = 9;
	wineType = new JComboBox(wtypes);
	c.gridx = 0;
	c.gridy = 14;
	JLabel wineTypeLabel = new JLabel("Type of Wine", JLabel.RIGHT);
	panel.add(wineTypeLabel,c);
	c.gridx = 1;
	c.gridy = 14;
	panel.add(wineType,c);

	//amount of wine label, glass, bottle, bag, barrel

	String wamounts[] = {"Glass","Bottle","Bag", "Barrel"};
	double wwamounts[] = {5, 25.4, 169.05, 4032};
	wineAmount = new JComboBox(wamounts);
	int wamountofAmounts = 4;
	JLabel wineAmountLabel = new JLabel("Amount of Wine");
	c.gridx = 0;
	c.gridy = 15;
	panel.add(wineAmountLabel,c);
	c.gridx = 1;
	panel.add(wineAmount,c);
	
	//create a Hard Liquor label
	hardLiquor = new JComboBox(number);
	c.gridx = 0;
	c.gridy = 16;
	JLabel hardLiquorLabel = new JLabel("Hard Liquor Shots");
	panel.add(hardLiquorLabel,c);
	c.gridx = 1;
	c.gridy = 16;
	panel.add(hardLiquor,c);
	
	//create a type of liquor label
	String ltypes[] = {"Bourbon", "Brandy",
			   "Everclear", "Gin",
			   "Rum", "Sake",
			   "Tequila", "Whiskey","Other"};
	double ltypePercentages[] = {.51, .4, .8, .375, .42, .15,
				     .47, .533, .45};
	int lamountOfBrands = 9;
	liqType = new JComboBox(ltypes);
	c.gridx = 0;
	c.gridy = 18;
	JLabel liqTypeLabel = new JLabel("Type of Liquor");
	panel.add(liqTypeLabel,c);
	c.gridx = 1;
	c.gridy = 18;
	panel.add(liqType,c);
	c.gridx = 1;
	c.gridy = 20;

	//create an amount of liquor label shot, doubleshot, bottle, handle 

	String lamounts[] = {"Shot","Doubleshot","Bottle", "Handle"};
	double llamounts[] = {1.5, 3,25.6 ,59.2};
	liqAmount = new JComboBox(lamounts);
	int lamountofAmounts = 4;
	JLabel liqAmountLabel = new JLabel("Amount of Liqour");
	c.gridx = 0;
	c.gridy = 21;
	panel.add(liqAmountLabel,c);
	c.gridx = 1;
	panel.add(liqAmount,c);
	
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
		    String gender1 = (String) gender.getSelectedItem();
		    int hours;
		    int weight;
		    try
			{
			    hours = Integer.parseInt(hoursField.getText());
			    weight = Integer.parseInt(weightField.getText());
							    }
		    catch (NumberFormatException nfe)
			{
			    hours = -1;
			    weight = -1;
			}
		    
		    boolean isKilograms = false;
		    String lbsOrKg = (String) weightUnits.getSelectedItem();
		    String bType = (String) beerType.getSelectedItem();
		    String wType = (String) wineType.getSelectedItem();
		    String lType = (String) liqType.getSelectedItem();
		    String bAmount = (String) beerAmount.getSelectedItem();
		    String wAmount = (String) wineAmount.getSelectedItem();
		    String lAmount = (String) liqAmount.getSelectedItem();
		    int beer1 = Integer.parseInt
			((String) beer.getSelectedItem());
		    int wine1 = Integer.parseInt
			((String) wine.getSelectedItem());
		    int hardLiquor1 = Integer.parseInt
			((String) hardLiquor.getSelectedItem());
		    
		    int index = 0;
		    for(int j = 0; j < amountOfBrands; j++)
			if(types[j].equals(bType))
			    index = j;
		    double beerAlcoholPercentage = typePercentages[index];

		    index = 0;
		    for(int j = 0; j < bamountofAmounts; j++)
			if(bamounts[j].equals(bAmount))
			    index = j;
		    double beerOunces = bbamounts[index];
			
		    
		    
		    int windex = 0;
		    for(int j = 0; j < wamountOfBrands; j++)
			if(wtypes[j].equals(wType))
			    windex = j;
		    double wineAlcoholPercentage = wtypePercentages[windex];

		    windex = 0;
		    for(int j = 0; j < wamountofAmounts; j++)
			if(wamounts[j].equals(wAmount))
			    windex = j;
		    double wineOunces = wwamounts[windex];
		    
		    int lindex = 0;
		    for(int j = 0; j < lamountOfBrands; j++)
			if(ltypes[j].equals(lType))
			    lindex = j;
		    double liqAlcoholPercentage = ltypePercentages[lindex];

		    lindex = 0;
		    for(int j = 0; j < lamountofAmounts; j++)
			if(lamounts[j].equals(lAmount))
			    lindex = j;
		    double liqOunces = llamounts[lindex];
		    
		    isMale = gender1.equals("Male") ? true : false ;
		    isKilograms = lbsOrKg.equals("Kilograms") ? true : false ;
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




