package empWage;

public class ForCompany {
	
	 String companyName;
	    int wagePerHour;
	    int maxWorkingDays;
	    int maxWorkingHours;

	    public ForCompany(String companyName, int wagePerHour, int maxWorkingDays, int maxWorkingHours){
	        this.companyName = companyName;
	        this.wagePerHour = wagePerHour;
	        this.maxWorkingDays = maxWorkingDays;
	        this.maxWorkingHours = maxWorkingHours;
	    }

	    void calculateMonthlyWage(){
	        EmployeeWage employee = new EmployeeWage(wagePerHour,maxWorkingDays,maxWorkingHours);
	        employee.calculateMonthlyWage();
	        System.out.println("Monthly wage for the employee working in "+companyName+" is Rs. " + employee.monthlyWage + "\n");

	    }




}


