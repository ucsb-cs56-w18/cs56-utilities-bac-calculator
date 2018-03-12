package edu.ucsb.cs56.projects.utilities.choicePoints;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

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
    JComboBox backColor;
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
        Arrays.sort(weightArray); //Sorts array in alphabetical order: all arrays with at least one letter are alphabetically sorted
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
        Arrays.sort(genderArray);
	gender = new JComboBox(genderArray);
	c.gridx = 0;
	c.gridy = 6;
	JLabel genderLabel = new JLabel("Gender");
	panel.add(genderLabel,c);
	c.gridx = 1;
	c.gridy = 6;
	panel.add(gender,c);

        String colorArray[] = {"Blue", "Red", "Yellow", "Green", "Orange", "Cyan", "Black", "Gray", "Pink"};
        Arrays.sort(colorArray);
        backColor = new JComboBox(colorArray);
        c.gridx = 2;
        c.gridy = 0;
        JLabel colorLabel = new JLabel("Background Color");
        panel.add(colorLabel,c);
        c.gridx = 5;
        c.gridy = 0;
        panel.add(backColor,c);


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
	
	
	//create a type of beer label
	//String types[] = {"Coors Light", "Milwaukee's Best Ice",
	//		  "Keystone Ice", "Big Flats Light Beer",
	//		  "Natural Ice", "Natural Light",
	//		  "Bud Light Platinum", "Miller Lite", "Smirnoff Ice",
	//		  "Blue Moon", "IPA", "Other"};
        //Arrays.sort(types);

	//double typePercentages[] = {.042, .059, .059, .039,.059, .042,
	//			    .06, .042, .05, .05, .054, .07};

	int amountOfBrands = 12;
	String [] types = new String [12];
	double [] typePercentages = new double [12];
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
	panel.add(beerTypeLabel,c);
	c.gridx = 1;
	c.gridy = 10;
	panel.add(beerType,c);
	//Create ammount of beer label can, 40, Bullet, keg
	
	String bamounts[] = {"Can","40","Bullet", "Keg"};
        Arrays.sort(bamounts);
	double bbamounts[] = {12, 40, 16, 1984};
	beerAmount = new JComboBox(bamounts);
	int bamountofAmounts = 4;
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

	//create a type of wine label
	//String wtypes[] = {"Moscato d'Asti", "Muscadet",
	//		   "Pinot Grigio", "Bordeaux",
	//		   "Sauvignon Blanc", "Pinot Noir",
	//		   "Shiraz", "Zinfandel", "Chardonnay",
	//		   "Merlot", "Cabernet", "Other"};
	//double wtypePercentages[] = {.055, .095, .14, .135, .125, .13,
	//			     .13, .18, .12, .145, .14, .135);
	
	

	int wamountOfBrands = 12;
        String [] wtypes = new String [12];
        double [] wtypePercentages = new double [12];
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
	panel.add(wineTypeLabel,c);
	c.gridx = 1;
	c.gridy = 14;
	panel.add(wineType,c);

	//amount of wine label, glass, bottle, bag, barrel

	String wamounts[] = {"Glass","Bottle","Bag", "Barrel"};
        Arrays.sort(wamounts);
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
			   "Tequila", "Whiskey", "Moonshine", "Vodka", "Scotch", "Other"};
	double ltypePercentages[] = {.51, .4, .8, .375, .42, .15,
				     .47, .533, .45, .75, .4, .4};
	int lamountOfBrands = 9;
        Arrays.sort(ltypes);
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
        Arrays.sort(lamounts);
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
                    String color1 = (String) backColor.getSelectedItem();
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
                    }
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




