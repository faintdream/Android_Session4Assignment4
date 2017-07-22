/*
*  This program demonstrates salary structure for two employee categories,
*  1. Manager - TravelAllowance @ 15% of BASIC.
*  2. Trainee - TravelAllowance @ 10% of BASIC.
 */
package salarycalc;                                                     // package declaration

public class SalaryCalc {                                               // declaring main class SalaryCalc 

    final int BASIC = 100;                                             // declared basic salary constant

    public int getBasic() {                                             // getter method to get basic salary 
        return BASIC;
    }

    public static void main(String[] args) {                            //main section
        Manager deptAccountMgr = new Manager();                         // Manager's object created  and initialized with Manager class's default constuctor
        Trainee deptAccountTr = new Trainee();                          // Trainee's object created and initialized with Trainee class's default constructor
        System.out.println("Employee Salary Strucuture");               
        System.out.println("----------------------------------");
        System.out.println(" Manager");
        System.out.println(" Basic            : " + deptAccountMgr.getBasic());                 //getting Basic Salary  for deptAccountMgr object
        System.out.println(" Travel Allowance : " + deptAccountMgr.getTravelAllowance());       // getting Travel Allowance for deptAccountMgr object
        deptAccountMgr.setGrossSalary();                                                        // setting gross salary for deptAccountMgr object
        System.out.println(" Gross Salary     : " + deptAccountMgr.getGrossSalary());           // getting gross salary for deptAccountMgr object
        System.out.println("");                                                                 // prints a blank line as a separator
        
        System.out.println(" Trainee");                                                         // here we begin with trainee information
        System.out.println(" Basic            : " + deptAccountTr.getBasic());                  // getting basic salary for deptAccountTr object 
        System.out.println(" Travel Allowance : " + deptAccountTr.getTravelAllowance());        // getting Travel Allowace for deptAccountTr object 
        deptAccountTr.setGrossSalary();                                                         // setting gross salary for deptAccountTr object 
        System.out.println(" Gross Salary     : " + deptAccountTr.getGrossSalary());            // getting gross salary for deptAccountTr object 
    }
}

class Manager extends SalaryCalc {                                                              // c;ass Maager inherits SalaryCalc

    final double TA = 15.00;                                                                    //constant TA declared  with 15 %
    double traveAllowance;                                                                      //created variable to hold travel allowance amount
    double grossSalary;                                                                         // created variable to hold gross salary

    public double getGrossSalary() {                                                            //method to get gross salary amount
        return grossSalary;
    }

    public void setGrossSalary() {                                                              // method to set gross salary amount
        double grossSalary = super.getBasic() + this.getTravelAllowance();                      // here we add BASIC salary returned from super class with 
                                                                                                // value returened from current class's method for travel allowance
        this.grossSalary = grossSalary;
    }

    Manager() {                                                                                 // default constructor for manager class 
        traveAllowance = (super.BASIC * TA / 100);                                              // travel allowance will be set on object creation

    }

    public double getTravelAllowance() {                                                        // method to get Travel Allowance amount 
        return traveAllowance;
    }

}

class Trainee extends SalaryCalc {                                                              // class Trainee inherits SalaryCalc

    final Double TA = 10.00;                                                                    // contant declaration to hold Travel allowance @ 10%
    double travelAllowance;                                                                     // variable to hold travel allowance amount 
    double grossSalary;                                                                         // variable to hold gross salary amount 

    Trainee() {                                                                                // default constructor for Trainee class 
        travelAllowance = (super.BASIC * TA / 100);                                            // setting travle allowance amount 
    }

    public double getGrossSalary() {                                                          // method to get gross salary amount 
        return grossSalary;
    }

    public void setGrossSalary() {                                                            // method to set gross salary amount 
        double grossSalary = super.getBasic() + this.getTravelAllowance();                    // adding BASIC returned from super class's getBasic method with  
                                                                                              // value returned form this class's getTravelAllowance method
        this.grossSalary = grossSalary;                     
    }

    public double getTravelAllowance() {                                                      // method returns travel allowance amount 
        return travelAllowance;
    }

}
