package budTest.Controller;

import budTest.Model.WorldBank;
import budTest.Service.BudTestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/budTest")
public class budTestController {
    @Autowired
    BudTestService budTestService;

    @RequestMapping("/")
    public WorldBank getCountry (@RequestParam (value="code")String code){
        return budTestService.getCountry(code);
    }
}
