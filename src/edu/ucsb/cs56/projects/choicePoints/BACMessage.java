package edu.ucsb.cs56.projects.utilities.choicePoints;

/** Message for BAC Gui
    @author Dominic Kirby and Hernan Duran
    @version F16 CS56
*/

public final class BACMessage{

    // Constructor
    private BACMessage(){}

    /**
        Return a string containing information about a users blood
        alcohol level.
        @param BAC is the blood alcohol level
        @return message is a string representing information about
        the blood alcohol level.
    */
    public static String GuiMessage(double BAC){
        double BACPercent       = BAC*100;
	
        double hoursBeforeSober = (BAC - 0.08)/0.015;
	
        String message          = "Blood Alcohol Content is: "
	                         + String.format("%1$.3f", BAC) + "\n\n";
	
        String borderLine       = "Symptoms/Impairment: "
                                 + "Slight impairment of balance, "
                                 + "speech, vision, reaction time,and hearing. "
                                 + "Euphoria. Judgment and self- control "
                                 + "are reduced. Caution, reason and "
	                         + "memory are impaired.\n\n";
	
        String aboveLegalLimit  = "You're above the legal limit of 0.08! "
	                         + "Do not drive!!\n\n";
	
        String sobriety         = String.format("It will take you "
			        + "approximately %.2f hours before you can "
				+ "legally drive again.", hoursBeforeSober);
                                
        String assurance        = "You are legally permitted to drive.";


        if(BAC == 0)
            message += "You're sober!! :)\n\n";

        else if (BAC == -1)
            return "Please input the correct numbers.";

        else if(BAC > 0 && BAC <.04)
            message +="Symptoms/Impairment: No loss of coordination, "
                + "slight euphoria and loss of shyness. "
                + "Depressant effects are not apparent.\n\n";

        else if(BAC >= .04 && BAC <.07)
            message += "Symptoms/Impairment: Feeling of well-being, "
                + "relaxation lower inhibitions, sensation of warmth. "
                + "Euphoria. Some minor impairment of reasoning and memory, "
                + "lowering of caution.\n\n";

        else if(BAC >= .07 && BAC < .08)
            message += borderLine;

        else if(BAC >= .08 && BAC < .10)
            message += aboveLegalLimit + borderLine;

        else if(BAC >= .10 && BAC < .13)
            message +=  aboveLegalLimit
                +"Symptoms/Impairment: Significant impairment of motor "
                + "coordination and loss of good judgment. "
                + "Speech may be slurred; balance, vision, reaction time "
                + "and hearing will be impaired. Euphoria. It's illegal to "
                + "operate a motor vehicle at this level of intoxication.\n\n";

        else if(BAC >= .13 && BAC < .16)
            message +=  aboveLegalLimit
                + "Symptoms/Impairment: Gross motor impairment and lack of "
                + "physical control. Blurred vision and major loss of balance. "
                + "Euphoria reduced and dysphoria is beginning to appear.\n\n";

        else if(BAC >= .16 && BAC < .25)
            message += aboveLegalLimit
                + "Symptoms/Impairment: Anxiety and restlessness, "
                + "nausea may appear. Appearance of a \"sloppy drunk.\"\n\n";

        else if(BAC >= .25 && BAC < .3)
            message += aboveLegalLimit
                + "Symptoms/Impairment: May need assistance in walking; "
                + "total mental confusion. "
                + "Dysphoria with nausea and some vomiting.\n\n";

        else if(BAC >= .3 && BAC < .4)
            message +=  aboveLegalLimit
                + "Symptoms/Impairment: Loss of consciousness.\n\n";
        else
            message +=  aboveLegalLimit
                + "Symptoms/Impairment: Not Recommended! Onset of coma. "
                + "Possible death due to respiratory arrest.\n\n";

        if(BAC > 0.08)
            message += sobriety;
        else
            message += assurance;
        return message;
    }
}
