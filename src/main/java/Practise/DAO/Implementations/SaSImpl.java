package Practise.DAO.Implementations;

import Practise.DAO.SumAndSubtraction;
import Practise.Model.Numbers;


/**
 * Created by Alexander on 14/05/2017.
 */
public class SaSImpl implements SumAndSubtraction {

    @Override
    public int sum(Numbers numbers) {
        int result;

        result = numbers.getA() + numbers.getB();

        return result;
    }

    @Override
    public int subtract(Numbers numbers) {
        int result;

        result = numbers.getA() - numbers.getB();

        return result;
    }
}
