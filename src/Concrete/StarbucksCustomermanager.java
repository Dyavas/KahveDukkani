package Concrete;

import Abstract.BaseCustomerManager;
import Abstract.CustomerCheckService;
import Abstract.CustomerService;
import Entities.Customer;

public class StarbucksCustomermanager extends BaseCustomerManager {
    private CustomerCheckService customerCheckService;

    public StarbucksCustomermanager(CustomerCheckService customerCheckService) {
        this.customerCheckService = customerCheckService;
    }

    @Override
    public void Save(Customer customer) {
        if (this.customerCheckService.checkIfRealPerson(customer)){
            super.Save(customer);
        }else {
            System.out.println("not a Valid person"+customer.getFirstName()+customer.getLastName());
        }

    }
}
