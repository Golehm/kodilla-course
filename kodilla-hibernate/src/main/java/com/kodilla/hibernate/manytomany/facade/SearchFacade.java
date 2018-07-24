package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchFacade {

    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public static String FOUND_NOTHING = "Search find nothing.";

    public List<Company> searchCompaniesWithTheFragmentOfTheName (String str) throws SearchException {
        List<Company> searchedCompanies = companyDao.findByFragmentOfTheName(str);
        if(searchedCompanies == null){
            throw new SearchException(FOUND_NOTHING);
        }
        return searchedCompanies;
    }

    public List<Employee> searchEmployeesWithTheFragmentOfTheName (String str) throws SearchException {
        List<Employee> searchedEmployees = employeeDao.findByFragmentOfTheName(str);
        if(searchedEmployees == null){
            throw new SearchException(FOUND_NOTHING);
        }
        return searchedEmployees;
    }
}
