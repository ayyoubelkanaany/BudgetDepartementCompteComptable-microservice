package ma.gestionBudget.bean;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Id;


@Entity
public class BudgetDepartementCompteComptable implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String refBudgetDepartement;
	private String refComptable;
	private Double montant;
	
	
	public BudgetDepartementCompteComptable(){
		super();
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}

	public String getRefBudgetDepartement() {
		return refBudgetDepartement;
	}

	public void setRefBudgetDepartement(String refBudgetDepartement) {
		this.refBudgetDepartement = refBudgetDepartement;
	}

	public String getRefComptable() {
		return refComptable;
	}

	public void setRefComptable(String refComptable) {
		this.refComptable = refComptable;
	}

	public Double getMontant() {
		return montant;
	}

	public void setMontant(Double montant) {
		this.montant = montant;
	}
	
	
}
