package factory_method;

public class GetPlanFactory {
	//use getPlan method to get object of type Plan   
	public Plan getPlan(String planType){  
		if(planType == null){  
			return null;  
		}  
		if(planType.equalsIgnoreCase("DOMESTIC PLAN")) {  
			return new DomesticPlan();  
		}   
		else if(planType.equalsIgnoreCase("COMMERCIAL PLAN")){  
			return new CommercialPlan();  
		}   
		else if(planType.equalsIgnoreCase("INSTITUTIONAL PLAN")) {  
			return new InstitutionalPlan();  
		}  
		return null;  
	}  

}
