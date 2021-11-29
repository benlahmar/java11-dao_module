package com.dao;

import java.util.List;

public interface IDaog<T, K> {

	public void add(T t);
	public T findById(K k);
	public List<T> all();
	//public <V> T findById2(V v);
	
}
