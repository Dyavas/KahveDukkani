package com.company;

import Abstract.BaseCustomerManager;
import Adaptors.MernisServiceAdaptor;
import Concrete.NeroCustomermanager;
import Concrete.StarbucksCustomermanager;
import Entities.Customer;

import java.time.LocalDate;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        BaseCustomerManager neroCustomerManager=new NeroCustomermanager();
        BaseCustomerManager starbuckCustomerManager=new StarbucksCustomermanager(new MernisServiceAdaptor());
        Customer ahmet=new Customer(2,"ahmet","yildiz",LocalDate.of(1985,06,05),"123456987");
        Customer engin=new Customer();
        engin.setId(1);
        engin.setFirstName("Engin");
        engin.setLastName("Demirog");
        engin.setNationaltyId("123456");
        engin.setDateOfBirth(LocalDate.of(1980,05,06));
        neroCustomerManager.Save(ahmet);
        starbuckCustomerManager.Save(engin);

    }
}

