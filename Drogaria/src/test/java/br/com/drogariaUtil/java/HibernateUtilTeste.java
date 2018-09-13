package br.com.drogariaUtil.java;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.junit.Test;

import br.com.drogaria.util.HibernateUtil;

public class HibernateUtilTeste {

	@Test
	public void conectar() {
		Session sessao = HibernateUtil.getFabricaDeSessoes().openSession();
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("estado");
		EntityManager manager = factory.createEntityManager();
		manager.close();
		factory.close();
	//	createEntityManagerFactory("estado");
		//sessao.createEntityGraph("Estado");
		sessao.close();
		System.out.println("Passou por aqui");
	}

//	private void createEntityManagerFactory(String string) {
//		// TODO Auto-generated method stub
//		
//	}
}
