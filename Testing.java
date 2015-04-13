package test;
/**Class: Testing
* @author John Tran
* @version 1.0 
* Course : ITEC 3860 Spring 2015 
* Written: January 10, 2015 
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
	public String getLocationQuestion(int locationNumber)
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
		quest4.setQuestions("Do we titans.......");
		quest5.setQuestions("What is our favorite food to chew on?");
		quest6.setQuestions("Why was I in put in jail in the first place?");
		quest7.setQuestions("The bear roars with a fierce look in his eyes wanting a......");
		quest8.setQuestions("What is our favorite food to eat?");
		quest9.setQuestions("What is a good treat for me to eat?");
		quest10.setQuestions("How do I like my meal?");
		quest11.setQuestions("Who is our mortal enemy?");
		quest12.setQuestions("What do I love to drink?");
		quest13.setQuestions("What do we love to do?");
		quest14.setQuestions("Who do we arrest?");
		quest15.setQuestions("What is the TV show that I'm in?");
		quest16.setQuestions("What does a artist need to view the world and be himself?");
		quest17.setQuestions("My god is this mount......");
		quest18.setQuestions("What do I like to eat?");
		quest19.setQuestions("What are we mummy do for a living?");
		quest20.setQuestions("What to do I guard in this temple?");
		quest21.setQuestions("How do you stop a me?");
		quest22.setQuestions("How did I get to this moon?");
		quest23.setQuestions("What do I rule over?");
		quest24.setQuestions("We alien love to.....");
		quest25.setQuestions("I would love something to eat like.......");
		quest26.setQuestions("Why can I talk?");
		quest27.setQuestions("What do we headhunter do?");
		quest28.setQuestions("How did I grow this big?");
		quest29.setQuestions("Me zombie love..........");
		quest30.setQuestions("I the elegant manshark love to eat....");
		
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
		
		//the list of answers for the question
		answers Answers1 = new answers(1, "Grading all day");
		answers Answers2 = new answers(2, "students brains");
		answers Answers3 = new answers(3, "To guard the president");
		answers Answers4 = new answers(4, "crush mountains");
		answers Answers5 = new answers(5,"Human's bone");
		answers Answers6 = new answers(6, "Killing people");
		answers Answers7 = new answers(7, "Your sandwich");
		answers Answers8 = new answers(8, "goats");
		answers Answers9 = new answers(9, "bones");
		answers Answers10 = new answers(10, "flaming hot");
		answers Answers11 = new answers(11, "Giant cats");
		answers Answers12 = new answers(12, "blood");
		answers Answers13 = new answers(13, "plunder");
		answers Answers14 = new answers(14, "terrorist");
		answers Answers15 = new answers(15, "Shark tank");
		answers Answers16 = new answers(16, "Ivory Tower");
		answers Answers17 = new answers(17, "cold");
		answers Answers18 = new answers(18, "I can't eat since i'm dead");
		answers Answers19 = new answers(19, "sleeping for 1000 years");
		answers Answers20 = new answers(20, "treasure");
		answers Answers21 = new answers(21, "hitting the brakes");
		answers Answers22 = new answers(22, "x-15");
		answers Answers23 = new answers(23, "time");
		answers Answers24 = new answers(24, "witch doctor's magic");
		answers Answers25 = new answers(25, "probe");
		answers Answers26 = new answers(26, "raw meat");
		answers Answers27 = new answers(27, "strink heads");
		answers Answers28 = new answers(28, "radiation");
		answers Answers29 = new answers(29, "brains......");
		answers Answers30 = new answers(30, "human steak with a side of wine");
		
		
		
		
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
					"\n" + Answers2+ "\n" + Answers26;
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
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers30 +"\n"+ Answers14 +
					"\n" + Answers3+ "\n" + Answers8;
		
		}
		else if((locationNumber+1) == quest9.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers18 +"\n"+ Answers22 +
					"\n" + Answers25+ "\n" + Answers9;
		}
		else if((locationNumber+1) == quest10.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers8 +"\n"+ Answers10 +
					"\n" + Answers11+ "\n" + Answers17;
		}
		else if((locationNumber+1) == quest11.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+ Answers11 +"\n"+ Answers13 +
					"\n" + Answers29 + "\n" + Answers7;
		}
		else if((locationNumber+1) == quest12.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers12 +"\n"+ Answers1 +
					"\n" + Answers19+ "\n" + Answers12;
		}
		else if((locationNumber+1) == quest13.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers27 +"\n"+ Answers16 +
					"\n" + Answers13+ "\n" + Answers23;
		}
		else if((locationNumber+1) == quest14.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers8 +"\n"+ Answers27 +
					"\n" + Answers10+ "\n" + Answers14;
		}
		else if((locationNumber+1) == quest15.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers24 +"\n"+ Answers4 +
					"\n" + Answers15+ "\n" + Answers11;
		}
		else if((locationNumber+1) == quest16.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers16 +"\n"+ Answers8 +
					"\n" + Answers22+ "\n" + Answers20;
		}
		else if((locationNumber+1) == quest17.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers17 +"\n"+ Answers2 +
					"\n" + Answers7+ "\n" + Answers11;
		}
		else if((locationNumber+1) == quest18.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers8 +"\n"+ Answers9 +
					"\n" + Answers18+ "\n" + Answers21;
		}
		else if((locationNumber+1) == quest19.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers29 +"\n"+ Answers19 +
					"\n" + Answers9+ "\n" + Answers6;
		}
		else if((locationNumber+1) == quest20.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers1 +"\n"+ Answers30 +
					"\n" + Answers10+ "\n" + Answers20;
		}
		else if((locationNumber+1) == quest21.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers11 +"\n"+ Answers12 +
					"\n" + Answers21+ "\n" + Answers22;
		}
		else if((locationNumber+1) == quest22.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers22 +"\n"+ Answers19 +
					"\n" + Answers13 + "\n" + Answers22;
		}
		else if((locationNumber+1) == quest23.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers25 +"\n"+ Answers5 +
					"\n" + Answers28 + "\n" + Answers23;
		}
		else if((locationNumber+1) == quest24.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers11 +"\n"+ Answers10 +
					"\n" + Answers24+ "\n" + Answers29;
		}
		else if((locationNumber+1) == quest25.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers25 +"\n"+ Answers7 +
					"\n" + Answers1+ "\n" + Answers17;
		}
		else if((locationNumber+1) == quest26.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers16 +"\n"+ Answers6 +
					"\n" + Answers20+ "\n" + Answers26;
		}
		else if((locationNumber+1) == quest27.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers4 +"\n"+ Answers27 +
					"\n" + Answers2+ "\n" + Answers22;
		}
		else if((locationNumber+1) == quest28.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers28 +"\n"+ Answers13 +
					"\n" + Answers19+ "\n" + Answers30;
		}
		else if((locationNumber+1) == quest29.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers8 +"\n"+ Answers29 +
					"\n" + Answers25+ "\n" + Answers18;
		}
		else if((locationNumber+1) == quest30.getqID())
		{
			result = "Your question is " + q.get(locationNumber) + "\n"+Answers10 +"\n"+ Answers30 +
					"\n" + Answers21+ "\n" + Answers11;
		}
		return result;
		
	}
}
