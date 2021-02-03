package ma.gestionBudget.model.ws.provided.converter;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import org.springframework.stereotype.Component;

import ma.gestionBudget.bean.BudgetDepartementCompteComptable;
import ma.gestionBudget.model.ws.provided.vo.BudgetDepartementCompteComptableVo;
import ma.gestionBudget.model.ws.required.vo.BudgetDepartementVo;
@Component
public class BDCCConverter {
	
	public BudgetDepartementCompteComptable toBean(BudgetDepartementCompteComptableVo vo) {
		if(vo==null) {
		return null;
		}
		else {
			BudgetDepartementCompteComptable BDCompteComptable = new BudgetDepartementCompteComptable();
			if(vo.getRefBudgetDepartement() != null) {
				BDCompteComptable.setRefBudgetDepartement(vo.getRefBudgetDepartement());
			}
		
			if(vo.getMontant() != null) {
				BDCompteComptable.setMontant(Double.parseDouble(vo.getMontant()));
			}
			
			
			if(vo.getId()!=null) {
				BDCompteComptable.setId(vo.getId());
			}
			if(vo.getRefComptable()!=null) {
				BDCompteComptable.setRefComptable(vo.getRefComptable());
			}
			return BDCompteComptable;
		}
	}
	
	
	public BudgetDepartementCompteComptableVo toVo(BudgetDepartementCompteComptable BDCompteComptable) {
		if(BDCompteComptable==null) {
		return null;
		}
		else {
			BudgetDepartementCompteComptableVo vo = new BudgetDepartementCompteComptableVo();
			if(BDCompteComptable.getRefBudgetDepartement() != null) {
				vo.setRefBudgetDepartement(BDCompteComptable.getRefBudgetDepartement());
			}
		
			if(BDCompteComptable.getMontant() != null) {
				vo.setMontant(BDCompteComptable.getMontant().toString());
			}
			
			
			if(BDCompteComptable.getId()!=null) {
				vo.setId(BDCompteComptable.getId());
			}
			if(BDCompteComptable.getRefComptable()!=null) {
				vo.setRefComptable(BDCompteComptable.getRefComptable());
			}
			return vo;
		}
	}
	
	
	////////les list 
	public List<BudgetDepartementCompteComptable> toListBean(List<BudgetDepartementCompteComptableVo> vos) {
		if(vos==null || vos.isEmpty()) {
		return null;
		}
		
		else {
			
			List<BudgetDepartementCompteComptable> BDCompteComptables = new ArrayList<BudgetDepartementCompteComptable>();
			for(int i=0;i<vos.size();i++) {
				BDCompteComptables.add(toBean(vos.get(i)));
			}
			return BDCompteComptables;
		}
	}
	
	
	public List<BudgetDepartementCompteComptableVo> toListVo(List<BudgetDepartementCompteComptable>  BDCompteComptable) {
		if(BDCompteComptable==null || BDCompteComptable.isEmpty()) {
		return null;
		}
		else {
			
			List<BudgetDepartementCompteComptableVo> vos = new ArrayList<BudgetDepartementCompteComptableVo>();
			for(int j=0;j<BDCompteComptable.size();j++) {
				vos.add(toVo(BDCompteComptable.get(j)));
			}
			return vos;
		}
	}
}
