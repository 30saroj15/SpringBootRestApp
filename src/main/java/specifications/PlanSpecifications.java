package specifications;

import java.util.Date;

import org.springframework.data.jpa.domain.Specification;

import com.sa.entity.InsurancePlanDetailsEntity;
import com.sa.entity.InsurancePlanDetailsEntity_;

public class PlanSpecifications {

	public static Specification<InsurancePlanDetailsEntity> equalPlanName(String planName) {
		if (planName == null)
			return null;
		return (root, query, cb) -> {
			return cb.equal(root.get(InsurancePlanDetailsEntity_.PLAN_NAME), planName);
		};
	}

	public static Specification<InsurancePlanDetailsEntity> equalsPlanStatus(String planStatus) {
		if (planStatus == null)
			return null;
		return (root, query, cb) -> {
			return cb.equal(root.get(InsurancePlanDetailsEntity_.PLAN_STATUS), planStatus);
		};
	}

	public static Specification<InsurancePlanDetailsEntity> equalPlanStratDate(String string) {
		if (string == null)
			return null;
		return (root, query, cb) -> {
			return cb.equal(root.get(InsurancePlanDetailsEntity_.PLAN_START_DATE), string);
		};
	}
	public static Specification<InsurancePlanDetailsEntity>equalPlanEndDate(Date planEndDate){
		if(planEndDate == null)
			return null;
		return(root,query,cb)->{
		return cb.equal(root.get(InsurancePlanDetailsEntity_.PLAN_END_DATE),planEndDate);
		};
	}

}
