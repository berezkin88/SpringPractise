package Practise.DAO.Implementations;

import Practise.DAO.MultiplicationAndDivision;
import Practise.Model.Numbers;
import org.springframework.stereotype.Component;

/**
 * Created by Alexander on 14/05/2017.
 */
@Component
public class MaDImpl implements MultiplicationAndDivision {
    @Override
    public double multiplication(Numbers numbers) {
        double result;

        result = numbers.getA()*numbers.getB();

        return result;
    }

    @Override
    public double division(Numbers numbers) {
        double result;

        result = numbers.getA()/numbers.getB();

        return result;
    }
}
