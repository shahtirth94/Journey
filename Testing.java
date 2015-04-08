package test;

import java.util.ArrayList;
import java.util.Random;

public class Testing
{
	public static void main(String []args)
	{
		ArrayList<Questions> q = new ArrayList<Questions>();
		ArrayList<answers> AnswersList = new ArrayList<answers>();
		
		
		Questions quest1 = new Questions();
		Questions quest2 = new Questions();
		Questions quest3 = new Questions();
		Questions quest4 = new Questions();
		Questions quest5 = new Questions();
		Questions quest6 = new Questions();
		Questions quest7 = new Questions();
		Questions quest8 = new Questions();
		
		
		quest1.setQuestions("asdasd");
		quest2.setQuestions("cat");
		quest3.setQuestions("sssaaassss");
		quest4.setQuestions("1111122");
		quest5.setQuestions("2222211");
		quest6.setQuestions("2323232");
		quest7.setQuestions("555552222");
		quest8.setQuestions("333344444");
		
		q.add(quest1);
		q.add(quest2);
		q.add(quest3);
		q.add(quest4);
		q.add(quest5);
		q.add(quest6);
		q.add(quest7);
		q.add(quest8);;
		
		QuestionsList pq = new QuestionsList();
		pq.setQuestionsList(q);
		
		
		
		
		System.out.println(pq.RandomQ());
		
		
	}
}
