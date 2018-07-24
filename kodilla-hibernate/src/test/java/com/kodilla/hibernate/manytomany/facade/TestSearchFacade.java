package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSearchFacade {
    @Autowired
    private SearchFacade searchFacade;

    @Test
    public void testFindCompanyByFragmentOfTheName(){
        //Given
            //In Companies database among others are 10 times "Milicja Obywatelska"
            //In Employess there is fella with lastname "Smith"

        //When
        List<Company> companiesList = new ArrayList<>();
        try {
            companiesList = searchFacade.searchCompaniesWithTheFragmentOfTheName("Oby");
        }
        catch (SearchException se) {

        }

        List<Employee> employeesList = new ArrayList<>();
        try {
            employeesList = searchFacade.searchEmployeesWithTheFragmentOfTheName("Smi");
        }
        catch (SearchException se) {

        }

        //Then
        Assert.assertEquals("Milicja Obywatelska", companiesList.get(0).getName());
        Assert.assertEquals(10, companiesList.size());
        Assert.assertEquals("Smith", employeesList.get(0).getLastname());
    }
}
