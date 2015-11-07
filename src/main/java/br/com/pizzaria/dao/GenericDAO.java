package br.com.pizzaria.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class GenericDAO<T> {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	protected Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	public T obter(Class<T> clazz, long id) {
		return getSession().get(clazz, id);
	}
	
	public List<T> carregarTodos(Class<T> clazz) {
		Criteria criteria = getSession().createCriteria(clazz);
		return criteria.list();
	}
	
	public void persistir(T objeto) {
		getSession().saveOrUpdate(objeto);
	}
	
	public void deletar(T objeto) {
		getSession().delete(objeto);
	}
}