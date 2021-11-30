package com.dao.imp;

import java.util.ArrayList;
import java.util.List;

import com.dao.IQuizDao;
import com.entities.Question;
import com.entities.Quiz;
import com.entities.Response;

public class QuizDao implements IQuizDao {

	public static List<Quiz> data;
	
	
	public QuizDao() {
		super();
		data=new ArrayList<>();
	}

	@Override
	public void add(Quiz t) {
		data.add(t);
		
	}

	@Override
	public Quiz findById(Long k) {
		Quiz q = data.stream().filter(x-> x.getId()==k).findFirst().get();
		return q;
	}

	@Override
	public List<Quiz> all() {
		// TODO Auto-generated method stub
		return data;
	}

	@Override
	public List<Quiz> loadData() {
		
		for(int i=1;i<10;i++)
		{
			Quiz q =new Quiz(i,"quiz "+i);
			for(int j=0;j<20;j++)
			{
				Question qt=new Question(j, "question "+j, false);
				for(int k=1;k<5;k++)
				{
					Response rep=new Response(k, "Reponse "+k, false);
					qt.getReponses().add(rep);
				}
				q.getQuestions().add(qt);
			}
			data.add(q);
			
		}
		//data.forEach(x->System.out.println(x));
		return data;
	}

}
