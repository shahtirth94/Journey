package test;

/**
 * @author jtran_000
 *
 */
public class answers
{
	private String answers;

	public answers()
	{
		answers = "";
	}
	
	/**
	 * @param answers
	 */
	public answers(String answers)
	{
		this.answers = answers;
	}

	/**
	 * @return
	 */
	public String getAnswers()
	{
		return answers;
	}

	public void setAnswers(String answers)
	{
		this.answers = answers;
	}

	@Override
	public String toString()
	{
		return "answers: " + answers;
	}
	
	
}
