package com.proxy;

public class EmployeeDaoImpl implements EmployeeDAO{
    @Override
    public void create(String client, EmployeeDO employeeDO) {
        System.out.println("create new dao");
    }

    @Override
    public void delete(String client, int employeeId) {
        System.out.println("delete with employee id "+employeeId);
    }

    @Override
    public EmployeeDO get(String client, int employeeId) {
        System.out.println("fetch records fromDO");
        return new EmployeeDO();
    }
}
