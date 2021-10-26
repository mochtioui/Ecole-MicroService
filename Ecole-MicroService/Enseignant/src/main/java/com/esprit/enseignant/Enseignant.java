package com.esprit.enseignant;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.List;

@Entity
public class Enseignant implements Serializable {

	@Id
    @GeneratedValue
    private int id;
    private String name;
    private String type;
    private String adress;
    
    
    
    public Enseignant(String name, String type, String adress) {
		super();
		this.name=name;
		this.type=type;
		this.adress=adress;
			}


    public Enseignant() {
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}

