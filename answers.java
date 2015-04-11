package test;

/**Class: answers
* @author John Tran
* @version 1.0 
* Course : ITEC 3860 Spring 2015 
* Written: January 10, 2015 
* 
* 
* This class: holds information about the aID and answers for the other class to use. 
* 
* Purpose: create qID and answers for the other class to use. 
*/ 
public class answers
{
	//instance variable
	private String answers;
	private int aID;

	//no argument constructor
	public answers()
	{
		answers = "";
		aID = 0;
	}
	
	//argument constructor
	public answers(int aID, String answers)
	{
		this.answers = answers;
		this.aID = aID;
	}

	/**
	 * Method name: getAnswers()
	 * @return answers
	 * description: get the answers information
	 */
	public String getAnswers()
	{
		return answers;
	}

	/**
	 * Method name: setAnswers()
	 * @param answers
	 * Description: set the information for answers
	 */
	public void setAnswers(String answers)
	{
		this.answers = answers;
	}

	/**
	 * Method name: getaID
	 * @return getaID
	 * Description: get the information from ID
	 */
	public int getaID()
	{
		return aID;
	}

	/**
	 * Method name: setaID
	 * @param aID
	 * Description: set the number for aID
	 */
	public void setaID(int aID)
	{
		this.aID = aID;
	}

	@Override
	public String toString()
	{
		return "answers: " + answers;
	}
	
	
}
