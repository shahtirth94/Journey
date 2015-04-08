package test;


public class Questions
{
	private String questions;
	
	public Questions()
	{
		questions = "";
	}
	
	public Questions(String questions)
	{
		this.questions = questions;
	}
	
	

	public String getQuestions()
	{
		return questions;
	}

	public void setQuestions(String questions)
	{
		this.questions = questions;
	}

	
	
	@Override
	public String toString()
	{
		return "Questions: " + questions;
	}
	
	
}

