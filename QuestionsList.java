package test;

import java.util.ArrayList;
import java.util.Random;

public class QuestionsList 
{
	private ArrayList<Questions> QuestionsList;
	private Random RandomsGen;

	public QuestionsList()
	{
		QuestionsList = new ArrayList<Questions>();
		RandomsGen = new Random();
	}
	
	public QuestionsList(ArrayList<Questions> questionsList)
	{
		
		QuestionsList = questionsList;
	}

	public ArrayList<Questions> getQuestionsList()
	{
		return QuestionsList;
	
	}

	public void setQuestionsList(ArrayList<Questions> string)
	{
		QuestionsList = string;
	}

	public Random getRandomsGen()
	{
		return RandomsGen;
	}

	public void setRandomsGen(Random randomsGen)
	{
		RandomsGen = randomsGen;
	}

    public Questions RandomQ()
    {
    	
		int index = RandomsGen.nextInt(QuestionsList.size());
		Questions questions = QuestionsList.get(index);
		return questions;
    	
    }
	
	
}
