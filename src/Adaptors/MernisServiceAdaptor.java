package Adaptors;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.JLFKPSPublicSoap;

public class MernisServiceAdaptor implements CustomerCheckService {
    JLFKPSPublicSoap jlfkpsPublicSoap = new JLFKPSPublicSoap();

    @Override
    public boolean checkIfRealPerson(Customer customer) {
        try {
            return jlfkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationaltyId()),customer.getFirstName(),
                    customer.getLastName(),customer.getDateOfBirth().getDayOfYear());
        } catch (Exception e) {
            e.printStackTrace();
        }return false;
    }

}
