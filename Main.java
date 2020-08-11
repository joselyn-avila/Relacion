package com.relacion;
import java.util.*;
import javax.persistence.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

import com.relacion.entidades.Persona;
import com.relacion.entidades.Skill;
import com.relacion.entidades.Ranking;

public class Main {

	
		static final StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
				.configure() // configures settings from hibernate.cfg.xml
				.build();
		static SessionFactory sessionFactory = new MetadataSources( registry ).buildMetadata().buildSessionFactory();
public static void main(String[] args) {
	
		Persona per1= new Persona("Carlos");
		ingresarPersona(per1);
		
		Skill skl1= new Skill("Programacion Web");
		ingresarSkill(skl1);
		
		Ranking rak1= new Ranking("5");
		ingresarRanking(rak1);
		
		
		List<Persona> personas = getPersona();
		for (Persona temp:personas) {
			System.out.println(temp);
		}
		List<Skill> skill = getSkill();
		for (Skill temp:skill) {
			System.out.println(temp);
		}
		List<Ranking> ranking = getRanking();
		for (Ranking temp:ranking) {
			System.out.println(temp);
		}
		
}
		

	static List<Persona>getPersona(){
		Session session = sessionFactory.openSession();
		List<Persona> personas = session.createQuery("from Persona",Persona.class).list();
		return personas;
	}
	static List<Skill>getSkill(){
		Session session = sessionFactory.openSession();
		List<Skill> skills = session.createQuery("from Skill",Skill.class).list();
		return skills;
}	
	static List<Ranking>getRanking(){
		Session session = sessionFactory.openSession();
		List<Ranking> rankings = session.createQuery("from Ranking",Ranking.class).list();
		return rankings;
}	
	
static void ingresarPersona(Persona persona) {
		
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(persona);
		
		session.getTransaction().commit();
		session.close();
		System.out.println(persona.getId());
	}
static void ingresarSkill(Skill skill) {
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(skill);
	
	session.getTransaction().commit();
	session.close();
	System.out.println(skill.getId());
}
static void ingresarRanking(Ranking ranking) {
	
	Session session = sessionFactory.openSession();
	session.beginTransaction();
	session.save(ranking);
	
	session.getTransaction().commit();
	session.close();
	System.out.println(ranking.getId());
}
}
