/**Class: Testing
 * @author John Tran
 * @version 1.0 
 * Course : ITEC 3860 Spring 2015 
 * Written: January 10, 2015 
 * 
 * 
 * This class: use hold answer and question
 * 
 * Purpose:to create the question and answer for the location to use
 */ 
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Testing
{
	public static String getLocationQuestion(int locationNumber)
	{
		ArrayList<Questions> q = new ArrayList<Questions>();

		//creating 30 questions
		Questions quest1 = new Questions();
		Questions quest2 = new Questions();
		Questions quest3 = new Questions();
		Questions quest4 = new Questions();
		Questions quest5 = new Questions();
		Questions quest6 = new Questions();
		Questions quest7 = new Questions();
		Questions quest8 = new Questions();
		Questions quest9 = new Questions();
		Questions quest10 = new Questions();
		Questions quest11 = new Questions();
		Questions quest12 = new Questions();
		Questions quest13 = new Questions();
		Questions quest14 = new Questions();
		Questions quest15 = new Questions();
		Questions quest16 = new Questions();
		Questions quest17 = new Questions();
		Questions quest18 = new Questions();
		Questions quest19 = new Questions();
		Questions quest20 = new Questions();
		Questions quest21 = new Questions();
		Questions quest22 = new Questions();
		Questions quest23 = new Questions();
		Questions quest24 = new Questions();
		Questions quest25 = new Questions();
		Questions quest26 = new Questions();
		Questions quest27 = new Questions();
		Questions quest28 = new Questions();
		Questions quest29 = new Questions();
		Questions quest30 = new Questions();

		//setting the questions
		quest1.setQuestions("What does an evil teacher love to do over the weekend?");
		quest2.setQuestions("What zombie Janitor eat?");
		quest3.setQuestions("Why are we in this office in the first place?");
		quest4.setQuestions("What do we titans do?");
		quest5.setQuestions("What is our favorite food to chew on?");
		quest6.setQuestions("Why was I in put in jail in the first place?");
		quest7.setQuestions("I roar with a fierce look in my eyes, wanting ......");
		quest8.setQuestions("What is our favorite food to eat?");
		quest9.setQuestions("What is a good treat for me?");
		quest10.setQuestions("How do I like my meal?");
		quest11.setQuestions("Who is our mortal enemy?");
		quest12.setQuestions("What do I love to drink?");
		quest13.setQuestions("What do we love to do?");
		quest14.setQuestions("Who do we arrest?");
		quest15.setQuestions("What is the TV show that I'm in?");
		quest16.setQuestions("What does an artist need to view the world and be himself?");
		quest17.setQuestions("What is it up here?");
		quest18.setQuestions("What do I like to eat?");
		quest19.setQuestions("What do we mummy do for a living?");
		quest20.setQuestions("What to do I guard in this temple?");
		quest21.setQuestions("How do you stop me?");
		quest22.setQuestions("How did I get to this moon?");
		quest23.setQuestions("What do I rule over?");
		quest24.setQuestions("What do we aliens love to do?");
		quest25.setQuestions("What am I (in)famous for?");
		quest26.setQuestions("Why can we talk?");
		quest27.setQuestions("What do we headhunter do?");
		quest28.setQuestions("How did I grow this big?");
		quest29.setQuestions("Me zombie love.......");
		quest30.setQuestions("I the elegant manshark love to eat....");

		quest1.setqID(1);
		quest2.setqID(2);
		quest3.setqID(3);
		quest4.setqID(4);
		quest5.setqID(5);
		quest6.setqID(6);
		quest7.setqID(7);
		quest8.setqID(8);
		quest9.setqID(9);
		quest10.setqID(10);
		quest11.setqID(11);
		quest12.setqID(12);
		quest13.setqID(13);
		quest14.setqID(14);
		quest15.setqID(15);
		quest16.setqID(16);
		quest17.setqID(17);
		quest18.setqID(18);
		quest19.setqID(19);
		quest20.setqID(20);
		quest21.setqID(21);
		quest22.setqID(22);
		quest23.setqID(23);
		quest24.setqID(24);
		quest25.setqID(25);
		quest26.setqID(26);
		quest27.setqID(27);
		quest28.setqID(28);
		quest29.setqID(29);
		quest30.setqID(30);

		//adding the question to the arraylist
		q.add(quest1);
		q.add(quest2);
		q.add(quest3);
		q.add(quest4);
		q.add(quest5);
		q.add(quest6);
		q.add(quest7);
		q.add(quest8);
		q.add(quest8);
		q.add(quest9);
		q.add(quest10);
		q.add(quest11);
		q.add(quest12);
		q.add(quest13);
		q.add(quest14);
		q.add(quest15);
		q.add(quest16);
		q.add(quest17);
		q.add(quest18);
		q.add(quest19);
		q.add(quest20);
		q.add(quest21);
		q.add(quest22);
		q.add(quest23);
		q.add(quest24);
		q.add(quest25);
		q.add(quest26);
		q.add(quest27);
		q.add(quest28);
		q.add(quest29);
		q.add(quest30);

		//the list of answers for the question
		answers Answers1 = new answers(1, "Grading all day");
		answers Answers2 = new answers(2, "Students brains");
		answers Answers3 = new answers(3, "To guard the president");
		answers Answers4 = new answers(4, "Crush mountains");
		answers Answers5 = new answers(5,"A human's bone");
		answers Answers6 = new answers(6, "Killing people");
		answers Answers7 = new answers(7, "Your sandwich");
		answers Answers8 = new answers(8, "Goats");
		answers Answers9 = new answers(9, "Bones");
		answers Answers10 = new answers(10, "Flaming hot");
		answers Answers11 = new answers(11, "Giant cats");
		answers Answers12 = new answers(12, "Blood");
		answers Answers13 = new answers(13, "Plunder");
		answers Answers14 = new answers(14, "Terrorists");
		answers Answers15 = new answers(15, "Shark tank");
		answers Answers16 = new answers(16, "Ivory Tower");
		answers Answers17 = new answers(17, "Cold");
		answers Answers18 = new answers(18, "I can't eat since i'm dead");
		answers Answers19 = new answers(19, "Sleep for 1000 years");
		answers Answers20 = new answers(20, "Treasure");
		answers Answers21 = new answers(21, "Hitting the brakes");
		answers Answers22 = new answers(22, "X-15");
		answers Answers23 = new answers(23, "Time");
		answers Answers24 = new answers(24, "Probe");
		answers Answers25 = new answers(25, "Witch doctor's magic");
		answers Answers26 = new answers(26, "Because you're hallucinating");
		answers Answers27 = new answers(27, "Sever heads");
		answers Answers28 = new answers(28, "Radiation");
		answers Answers29 = new answers(29, "Brains......");
		answers Answers30 = new answers(30, "Human steak with a side of wine");

		String result = "";

		//use to set the questions to the location
		if((locationNumber+1) == quest1.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers1 +"\n"+ Answers2 + 
					"\n" + Answers3 + "\n" + Answers30;
		}
		else if((locationNumber+1) == quest2.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers8 +"\n"+ Answers14 +
					"\n" + Answers2+ "\n" + Answers26;
		}
		else if((locationNumber+1) == quest3.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers25 +"\n"+ Answers30 +
					"\n" + Answers3+ "\n" + Answers9;
		}
		else if((locationNumber+1) == quest4.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers8 +"\n"+ Answers14 +
					"\n" + Answers4+ "\n" + Answers26;
		}
		else if((locationNumber+1) == quest5.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers10 +"\n"+ Answers16 +
					"\n" + Answers5+ "\n" + Answers9;

		}
		else if((locationNumber+1) == quest6.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers6 +"\n"+ Answers22 +
					"\n" + Answers23+ "\n" + Answers21;

		}
		else if((locationNumber+1) == quest7.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers9 +"\n"+ Answers7 +
					"\n" + Answers28+ "\n" + Answers20;

		}
		else if((locationNumber+1) == quest8.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers30 +"\n"+ Answers14 +
					"\n" + Answers3+ "\n" + Answers8;

		}
		else if((locationNumber+1) == quest9.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers18 +"\n"+ Answers22 +
					"\n" + Answers25+ "\n" + Answers9;
		}
		else if((locationNumber+1) == quest10.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers8 +"\n"+ Answers10 +
					"\n" + Answers11+ "\n" + Answers17;
		}
		else if((locationNumber+1) == quest11.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+ Answers11 +"\n"+ Answers13 +
					"\n" + Answers29 + "\n" + Answers7;
		}
		else if((locationNumber+1) == quest12.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers29 +"\n"+ Answers1 +
					"\n" + Answers19+ "\n" + Answers12;
		}
		else if((locationNumber+1) == quest13.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers27 +"\n"+ Answers16 +
					"\n" + Answers13+ "\n" + Answers23;
		}
		else if((locationNumber+1) == quest14.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers8 +"\n"+ Answers27 +
					"\n" + Answers10+ "\n" + Answers14;
		}
		else if((locationNumber+1) == quest15.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers24 +"\n"+ Answers4 +
					"\n" + Answers15+ "\n" + Answers11;
		}
		else if((locationNumber+1) == quest16.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers16 +"\n"+ Answers8 +
					"\n" + Answers22+ "\n" + Answers20;
		}
		else if((locationNumber+1) == quest17.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers17 +"\n"+ Answers2 +
					"\n" + Answers7+ "\n" + Answers11;
		}
		else if((locationNumber+1) == quest18.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers8 +"\n"+ Answers9 +
					"\n" + Answers18+ "\n" + Answers21;
		}
		else if((locationNumber+1) == quest19.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers29 +"\n"+ Answers19 +
					"\n" + Answers9+ "\n" + Answers6;
		}
		else if((locationNumber+1) == quest20.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers1 +"\n"+ Answers30 +
					"\n" + Answers10+ "\n" + Answers20;
		}
		else if((locationNumber+1) == quest21.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers11 +"\n"+ Answers12 +
					"\n" + Answers21+ "\n" + Answers22;
		}
		else if((locationNumber+1) == quest22.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers29 +"\n"+ Answers19 +
					"\n" + Answers13 + "\n" + Answers22;
		}
		else if((locationNumber+1) == quest23.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers25 +"\n"+ Answers5 +
					"\n" + Answers28 + "\n" + Answers23;
		}
		else if((locationNumber+1) == quest24.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers11 +"\n"+ Answers10 +
					"\n" + Answers24+ "\n" + Answers29;
		}
		else if((locationNumber+1) == quest25.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers25 +"\n"+ Answers7 +
					"\n" + Answers1+ "\n" + Answers17;
		}
		else if((locationNumber+1) == quest26.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers16 +"\n"+ Answers6 +
					"\n" + Answers20+ "\n" + Answers26;
		}
		else if((locationNumber+1) == quest27.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers4 +"\n"+ Answers27 +
					"\n" + Answers2+ "\n" + Answers22;
		}
		else if((locationNumber+1) == quest28.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers28 +"\n"+ Answers13 +
					"\n" + Answers19+ "\n" + Answers30;
		}
		else if((locationNumber+1) == quest29.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers8 +"\n"+ Answers29 +
					"\n" + Answers25+ "\n" + Answers18;
		}
		else if((locationNumber+1) == quest30.getqID())
		{
			result = "Your question is " + q.get(locationNumber+1) + "\n"+Answers10 +"\n"+ Answers30 +
					"\n" + Answers21+ "\n" + Answers11;
		}
		else
		{
			result = "Error";
		}
		return result;
	}
}
