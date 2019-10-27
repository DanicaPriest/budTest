package budTest.Service;

import budTest.Model.WorldBank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BudTestService {
    @Autowired
    RestTemplate restTemplate;

    public WorldBank getCountry(String code){
        String url ="http://api.worldbank.org/v2/country/" + code +"?format=json";
        WorldBank country = restTemplate.getForObject(url, WorldBank.class);
        return country;
    }

}
