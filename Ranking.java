package com.relacion.entidades;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import com.relacion.entidades.*;
@Entity
public class Ranking {
	@Id
	@GeneratedValue
	private int id;
	private String numero;
	
	@OneToMany
	private List <Skill> skill;
	@OneToMany
	private List<Persona> persona;
	
	public Ranking(String numero) {
		super();
		this.numero = numero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Ranking [id=" + id + ", numero=" + numero + "]";
	}

	public List<Skill> getSkill() {
		return skill;
	}

	public void setSkill(List<Skill> skill) {
		this.skill = skill;
	}

	public List<Persona> getPersona() {
		return persona;
	}

	public void setPersona(List<Persona> persona) {
		this.persona = persona;
	}

	
	
	
}
