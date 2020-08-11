package com.relacion.entidades;
import com.relacion.entidades.Ranking;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Skill {
	@Id
	@GeneratedValue

	
	private int id;
	
	private String nombre;
	
	@OneToMany(mappedBy ="Skill")
	private Ranking ranking;
	
	public Skill(String nombre) {
		super();
		this.nombre = nombre;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Skill [id=" + id + ", nombre=" + nombre + "]";
	}
	
	public Ranking getRanking() {
		return ranking;
	}
	public void setRanking(Ranking ranking) {
		this.ranking = ranking;
	}

	
	

}
