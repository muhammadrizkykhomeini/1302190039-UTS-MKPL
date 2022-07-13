package lib;

public class Salary extends Employee {

	private int monthlySalary;
	private int otherMonthlyIncome;
	private int annualDeductible;

   	public Salary (){
 
        super();
    }

	public void setMonthlySalary(int grade) {	
		if (grade == 1) {
			monthlySalary = 3000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 2) {
			monthlySalary = 5000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}else if (grade == 3) {
			monthlySalary = 7000000;
			if (isForeigner) {
				monthlySalary = (int) (3000000 * 1.5);
			}
		}
	}

	public void setAnnualDeductible(int deductible) {	
		this.annualDeductible = deductible;
		
	}

	public void setAdditionalIncome(int income) {	
		this.otherMonthlyIncome = income;
		
	}
} 
