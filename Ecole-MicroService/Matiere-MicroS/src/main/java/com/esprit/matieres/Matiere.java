package com.esprit.matieres;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Matiere implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int coefficient;
	private int enseignant;
	private int classe;
	
	
	public Matiere(String name, int enseignant, int coefficient, int classe) {
		super();
		this.name = name;
		this.enseignant = enseignant;
		this.coefficient = coefficient;
		this.classe = classe;
	}


	public Matiere() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getEnseignant() {
		return enseignant;
	}


	public void setEnseignant(int enseignant) {
		this.enseignant = enseignant;
	}


	public int getCoefficient() {
		return coefficient;
	}


	public void setCoefficient(int coefficient) {
		this.coefficient = coefficient;
	}


	public int getClasse() {
		return classe;
	}


	public void setClasse(int classe) {
		this.classe = classe;
	}


	@Override
	public String toString() {
		return "Matiere [id=" + id + ", name=" + name + ", enseignant=" + enseignant + ", coefficient=" + coefficient + ", classe="
				+ classe + "]";
	}

	
}
