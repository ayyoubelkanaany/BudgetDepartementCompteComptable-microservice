package ma.gestionBudget.model.ws.provided.vo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;
import javax.persistence.Id;


public class BudgetDepartementCompteComptableVo implements Serializable{
	
	private Long id;

	private String refBudgetDepartement;
	
	private String refComptable;
	
	private String montant;
	
	public BudgetDepartementCompteComptableVo(){
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

	public String getMontant() {
		return montant;
	}

	public void setMontant(String montant) {
		this.montant = montant;
	}
	
	
}
