package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerService;
import Entities.Customer;

public class NeroCustomermanager extends BaseCustomerManager {
    @Override
    public void Save(Customer customer) {
        super.Save(customer);
    }
}
