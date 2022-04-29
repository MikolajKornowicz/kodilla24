package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Facade {

    private static final Logger LOGGER = LoggerFactory.getLogger(Facade.class);
    private EmployeeDao employeeDao;
    private CompanyDao companyDao;

    public Facade(EmployeeDao employeeDao, CompanyDao companyDao) {
        this.employeeDao = employeeDao;
        this.companyDao = companyDao;
    }

    public List<Employee> searchForEmployee (String name){
        LOGGER.info("Searching for: " + name + "in the employees  database");
        List<Employee> employeeList = employeeDao.retrieveBySurname(name);
        if (employeeList.size() > 0){
            LOGGER.info("Employee list retrieved successfully");
        } else {
            LOGGER.warn("Error with an employee list");
        }
        return employeeList;
    }

    public List<Company> searchForCompany (String name){
        LOGGER.info("Searching for: " + name + "in the companies  database");
        List<Company> companyList = companyDao.retrieveByChars(name);
        if (companyList.size() > 0){
            LOGGER.info("Company list retrieved successfully");
        } else {
            LOGGER.warn("Error with a company list");
        }
        return companyList;
    }
}
