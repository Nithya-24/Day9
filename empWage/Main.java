package empWage;

public class Main {

	 public static void main(String[] args) {
	        System.out.println("Welcome to Employee Wage Computation Program! ");
	        ForCompany company1 = new ForCompany("ABC",12,13,200);
	        company1.calculateMonthlyWage();
	        ForCompany company2 = new ForCompany("XYZ",10,11,200);
	        company2.calculateMonthlyWage();
	    }
	}