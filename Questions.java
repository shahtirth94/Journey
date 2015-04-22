/**Class: Questions
 * @author John Tran
 * @version 1.0 
 * Course : ITEC 3860 Spring 2015 
 * Written: January 10, 2015 
 * 
 * 
 * This class: create the ID and set the question.
 * 
 * Purpose: This question makes the question a String and give them an number ID. 
 */ 

public class Questions
{
	//instance variable
	private String questions;
	private int qID;

	//no argument constructor
	public Questions()
	{
		questions = "";
		qID = 0;
	}
	//argument constructor
	public Questions(int qID, String questions)
	{
		this.questions = questions;
		this.qID = qID;
	}



	/**
	 * Method name: getQuestions()
	 * Description: calls the question
	 * @return the questions
	 */
	public String getQuestions()
	{
		return questions;
	}

	/**
	 * Method name: setQuestions
	 * @param questions
	 * description: set information of the question
	 */
	public void setQuestions(String questions)
	{
		this.questions = questions;
	}

	/**
	 * Method name: getqID
	 * @return qID
	 * description: get the qID information that was set
	 */
	public int getqID()
	{
		return qID;
	}

	/**
	 * Method name: setqID
	 * @param qID
	 * description: set the qID information
	 */
	public void setqID(int qID)
	{
		this.qID = qID;
	}

	@Override
	public String toString()
	{
		return "\"" + questions + "\"";
	}


}
