package com.proxy;

public interface EmployeeDAO {
    public void create(String client, EmployeeDO employeeDO) throws Exception;

    public void delete(String client, int employeeId) throws Exception;

    public EmployeeDO get(String client, int employeeId) throws Exception;
}
