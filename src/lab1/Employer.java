/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1;

/**
 *
 * @author jseib
 */
public class Employer {
    private Employee employee;

    public Employer() {
    }

    public Employer(Employee employee) {
        this.employee = employee;
    }
    
    public void hireEmployee(String firstName,String lastName, String ssn) {
        employee = new Employee();
        employee.setFirstName(firstName);
        employee.setLastName(lastName);
        employee.setSsn(ssn);
        employee.participateInHiringProcess();
    }
    
    public String getStatus() {
        return employee.getStatus();
    }
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }
    
    
}
