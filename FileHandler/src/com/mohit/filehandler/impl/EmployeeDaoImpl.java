/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.filehandler.impl;

import com.mohit.filehandler.entity.Employee;
import com.mohit.filehandler.inter.EmployeeDao;
import java.util.ArrayList;

/**
 *
 * @author Mohit
 */
public class EmployeeDaoImpl implements EmployeeDao {

    ArrayList<Employee> arrayList = new ArrayList<>();

    @Override
    public boolean addEmployee(Employee em) {
        return arrayList.add(em);
    }

    @Override
    public ArrayList<Employee> getEmployee() {
        return arrayList;
    }

    @Override
    public boolean checkId(Employee em) {
        for (Employee e : arrayList) {
            if (e.getId() == em.getId()) {
                return true;
            }

        }
        return false;
    }

    @Override
    public boolean checkEmail(Employee em) {
        for (Employee e : arrayList) {
            if (e.getEmail().equals(em.getEmail())) {
                return true;
            }

        }
        return false;
    }
}
