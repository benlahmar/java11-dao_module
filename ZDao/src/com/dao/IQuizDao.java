package com.dao;

import java.util.List;

import com.entities.Quiz;

public interface IQuizDao extends IDaog<Quiz, Long>{
		public List<Quiz> loadData();
}
