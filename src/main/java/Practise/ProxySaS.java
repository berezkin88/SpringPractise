package Practise;

import Practise.DAO.Implementations.SaSImpl;
import Practise.DAO.SumAndSubtraction;
import Practise.Model.Numbers;

/**
 * Created by Alexander on 20/05/2017.
 */
public class ProxySaS implements SumAndSubtraction {

    private SaSImpl saS;

    @Override
    public int sum(Numbers numbers) {
        System.out.println("ProxySaS before sum");
        return saS.sum(numbers);
    }

    @Override
    public int subtract(Numbers numbers) {
        return saS.subtract(numbers);
    }

    public void setSaS(SaSImpl saS) {
        this.saS = saS;
    }
}
