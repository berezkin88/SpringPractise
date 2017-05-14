package Practise.DAO.Implementations;

import Practise.DAO.Comparing;
import Practise.Model.Numbers;
import org.springframework.stereotype.Component;

/**
 * Created by Alexander on 14/05/2017.
 */
@Component
public class CompImpl implements Comparing {

    @Override
    public boolean greater(Numbers numbers) {
        if (numbers.getA()>numbers.getB()){
            return true;
        }
        return false;
    }
}
