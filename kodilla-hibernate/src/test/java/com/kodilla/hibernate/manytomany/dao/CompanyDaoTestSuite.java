package com.kodilla.hibernate.manytomany.dao;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyDaoTestSuite {
    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;

    @Test
    public void testSaveManyToMany(){
        //Given
        Employee johnSmith = new Employee("John", "Smith");
        Employee stephanieClarckson = new Employee("Stephanie", "Clarckson");
        Employee lindaKovalsky = new Employee("Linda", "Kovalsky");

        Company softwareMachine = new Company("Software Machine");
        Company dataMaesters = new Company("Data Maesters");
        Company greyMatter = new Company("Grey Matter");

        softwareMachine.getEmployees().add(johnSmith);
        dataMaesters.getEmployees().add(stephanieClarckson);
        dataMaesters.getEmployees().add(lindaKovalsky);
        greyMatter.getEmployees().add(johnSmith);
        greyMatter.getEmployees().add(lindaKovalsky);

        johnSmith.getCompanies().add(softwareMachine);
        johnSmith.getCompanies().add(greyMatter);
        stephanieClarckson.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(dataMaesters);
        lindaKovalsky.getCompanies().add(greyMatter);

        //When
        companyDao.save(softwareMachine);
        int softwareMachineId = softwareMachine.getId();
        companyDao.save(dataMaesters);
        int dataMaestersId = dataMaesters.getId();
        companyDao.save(greyMatter);
        int greyMatterId = greyMatter.getId();

        //Then
        Assert.assertNotEquals(0, softwareMachineId);
        Assert.assertNotEquals(0, dataMaestersId);
        Assert.assertNotEquals(0, greyMatterId);

        //CleanUp
        try {
            companyDao.delete(softwareMachineId);
            companyDao.delete(dataMaestersId);
            companyDao.delete(greyMatterId);
        }
        catch (Exception e){
        }
    }
    @Test
    public void testFindEmployeeByLastname(){
        //Given
        Employee waldemarJaszczuk = new Employee("Waldemar", "Jaszczuk");
        Employee antoniZubek = new Employee("Antoni", "Zubek");

        Company milicjaObywatelska = new Company("Milicja Obywatelska");

        milicjaObywatelska.getEmployees().add(waldemarJaszczuk);
        milicjaObywatelska.getEmployees().add(antoniZubek);

        waldemarJaszczuk.getCompanies().add(milicjaObywatelska);
        antoniZubek.getCompanies().add(milicjaObywatelska);

        //When
        employeeDao.save(waldemarJaszczuk);
        employeeDao.save(antoniZubek);
        List<Employee> searchedEmployee = employeeDao.findEmployeeByLastname("Jaszczuk");

        //Then
        Assert.assertEquals("Jaszczuk", searchedEmployee.get(0).getLastname());

        //CleanUp
        try {
            employeeDao.delete(waldemarJaszczuk);
            employeeDao.delete(antoniZubek);
        }
        catch (Exception e){
        }
    }
    @Test
    public void findByFirstThreeLetters(){
        //Given
        Employee waldemarJaszczuk = new Employee("Waldemar", "Jaszczuk");
        Employee antoniZubek = new Employee("Antoni", "Zubek");

        Company milicjaObywatelska = new Company("Milicja Obywatelska");

        milicjaObywatelska.getEmployees().add(waldemarJaszczuk);
        milicjaObywatelska.getEmployees().add(antoniZubek);

        waldemarJaszczuk.getCompanies().add(milicjaObywatelska);
        antoniZubek.getCompanies().add(milicjaObywatelska);

        //When
        companyDao.save(milicjaObywatelska);
        List<Company> searchedCompany = companyDao.findByFirstThreeLetters("Mil");

        //Then
        Assert.assertEquals("Milicja Obywatelska", searchedCompany.get(0).getName());

        //CleanUp
        try {
            companyDao.delete(milicjaObywatelska);
        }
        catch (Exception e){
        }
    }
}
