package com.FirstJPA;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NamedQuery;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args )
    {
		/*
		 * EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
		 * 
		 * EntityManager em=emf.createEntityManager();
		 * 
		 * em.getTransaction().begin();
		 * 
		 * System.out.println("Connected to database");
		 * 
		 * Coder c=new Coder(); c.setCid(103); c.setCname("Dia"); c.setTech("Java");
		 * 
		 * em.persist(c);
		 * 
		 * Coder c1=new Coder(); c1.setCid(102); c1.setCname("Pia");
		 * c1.setTech("JavaFS");
		 * 
		 * em.persist(c1);
		 */
		 
		 
        
		/*
		 * Coder c3=em.find(Coder.class, 101); System.out.println(c3);
		 * 
		 * c3.setCname("Sia"); c3.setTech("Python");
		 * 
		 * //em.persist(c3);
		 * 
		 * em.detach(c3);
		 * 
		 * c3.setCname("Ria");
		 * 
		 * System.out.println(c3); em.merge(c3); em.flush();
		 */
        
        //em.persist(c3);
        
        
        
        //Coder c4=em.find(Coder.class, 102);
       // System.out.println(c4);
        
        //em.remove(c4);
       // em.persist(c4); Not Possible
        
		/*
		 * Query q=em.createQuery("select  c from Coder c");
		 * 
		 * List<Coder> lc= q.getResultList();
		 * 
		 * System.out.println(lc);
		 * 
		 * Query q1=em.createQuery("select  c from Coder c where cid=103");
		 * 
		 * Coder c1= (Coder) q1.getSingleResult();
		 * 
		 * System.out.println(c1.getCname());
		 * 
		 * Query q2=em.createQuery("update Coder set cname='Pia'  where cid=103 ");
		 * 
		 * int i= q2.executeUpdate();
		 * 
		 * System.out.println("Record Updated "+i);
		 * 
		 * TypedQuery<Coder> tq=em.createQuery("select  c from Coder c where cid=103",
		 * Coder.class);
		 * 
		 * Coder c5=tq.getSingleResult();
		 * 
		 * System.out.println(c5);
		 * 
		 * Query nq= em.createNamedQuery("myquery");
		 * 
		 * List<Coder> lc1= nq.getResultList(); System.out.println(lc1);
		 */
        
        
        //em.getTransaction().commit();
    }
}
