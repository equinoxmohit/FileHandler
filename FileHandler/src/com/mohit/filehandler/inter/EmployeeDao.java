/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.filehandler.inter;

import com.mohit.filehandler.entity.Employee;
import java.util.ArrayList;

/**
 *
 * @author Mohit
 */
public interface EmployeeDao {

    boolean addEmployee(Employee em);

    ArrayList<Employee> getEmployee();

    boolean checkId(Employee em);

    boolean checkEmail(Employee em);

}
