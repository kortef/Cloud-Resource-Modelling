package de.ugoe.cs.oco.occi2deployment.transformation;


public class TransformatorFactory {
	public static Transformator getTransformator(String criteria){
		if(criteria.equals("OCCI2POG")){
			return new OCCI2POGTransformator();
		}
		if(criteria.equals("POG2ProvPlan")){
			return new POG2ProvPlanTransformator();
		}
		if(criteria.equals("ProvPlan2ExecProvPlan")){
			return new ProvPlan2ExecProvPlanTransformator();
		}
		if(criteria.equals("OCCI2PCG")){
			return new OCCI2PCGTransformator();
		}
		if(criteria.equals("PCG2IPG")){
			return new PCG2IGPTransformator();
		}
		return null;
	}
}
