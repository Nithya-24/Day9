package empWage;

public class Main {

	 public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program! ");
	        ForCompany company1 = new ForCompany("ABC",50,22,150);
	        company1.calculateMonthlyWage();
	        ForCompany company2 = new ForCompany("Company B",40,26,230);
	        company2.calculateMonthlyWage();
	    }
	}