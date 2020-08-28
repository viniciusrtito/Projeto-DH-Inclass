package br.com.mgoficina.service;

import java.util.List;
import java.util.UUID;


public interface IService <T> {
	
	public T create(T entidade);
	public T findById(UUID id);
	public List<T> findAll();
	public boolean update(T entidade);
	public boolean delete(UUID id);

}
