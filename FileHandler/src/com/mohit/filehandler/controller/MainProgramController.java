/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mohit.filehandler.controller;

import com.mohit.filehandler.entity.Employee;
import com.mohit.filehandler.impl.EmployeeDaoImpl;
import com.mohit.filehandler.inter.EmployeeDao;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Mohit
 */
public class MainProgramController {

    EmployeeDao emDao = new EmployeeDaoImpl();

    public void FileHandler() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("D:\\git\\FileHandler\\FileHandler\\src\\com\\mohit\\filehandler\\controller\\data.txt"));
            String line = "";

            while ((line = br.readLine()) != null) {

                String[] splitter = line.split(",");
                if (splitter.length >= 5) {
                    Employee em = new Employee();
                    em.setId(Integer.parseInt(splitter[0]));
                    em.setFirstName(splitter[1]);
                    em.setLastName(splitter[2]);
                    em.setEmail(splitter[3]);
                    if (Integer.parseInt(splitter[4]) == 1) {
                        em.setStatus(true);
                    } else {
                        em.setStatus(false);
                    }

                    if (!(emDao.checkId(em) && emDao.checkEmail(em))) {
                        emDao.addEmployee(em);
                    }
                }

            }

        } catch (IOException io) {
            System.out.println(io.getLocalizedMessage());
        }

    }
    
    public void showAll()
    {
        for(Employee em:emDao.getEmployee())
        {
            System.out.println("The id of the employee is:\t"+em.getId());
            System.out.println("The first name of the employee is:\t"+em.getFirstName());
            System.out.println("The last name of the employee is:\t"+em.getLastName());
            System.out.println("The email of the employee is:\t"+em.getEmail());
            System.out.println("The availability of the employee is:\t"+em.isStatus());
        
        }
    }

}
