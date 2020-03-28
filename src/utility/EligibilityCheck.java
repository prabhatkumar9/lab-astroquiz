package utility;

import org.apache.tomcat.jni.User;

public class EligibilityCheck extends  BasicEligibility implements EligibilityInterface{
	
	public boolean basicEligibilityCheck(User user){
		if(checkUser(user)) {
			return true;
		}else {
			return false;
		}
		
	}

	@Override
	public boolean checkUser(User user) {
		if(18 <= user.getAge() <= 35 && 155 <= user.getheight()<=170 && 55<= user.getWeight() <= 90 && user.getCountry.equals("ProGrad")) {
			return true;
		}
		else {
			return false;
		}
		
	}

	@Override
	public boolean checkQuizAnswer(String points) {
		int point = Integer.parseInt(points);
		if(point>=80) {
			return true;
		}else {
			return false;
		}
	}	
}






