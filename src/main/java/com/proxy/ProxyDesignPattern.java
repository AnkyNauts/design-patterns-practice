package com.proxy;

public class ProxyDesignPattern {

    public static void main(String[] args) {
        EmployeeDAO employeeDAO= new EmployeeDaoProxy();
        try {
            employeeDAO.create("USER",new EmployeeDO());
            System.out.println("Operation  Successful!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
