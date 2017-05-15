package Practise;

import Practise.DAO.Comparing;
import Practise.DAO.MultiplicationAndDivision;
import Practise.DAO.SumAndSubtraction;
import Practise.Model.Numbers;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Alexander on 14/05/2017.
 */

public class NumbersController {

    private Comparing comparing;
    private MultiplicationAndDivision multiplicationAndDivision;
    private SumAndSubtraction sumAndSubtraction;
    private final static Logger LOGGER = LoggerFactory.getLogger(NumbersController.class);

    private List<Numbers> numbersList = new ArrayList<>();

    public NumbersController() {
    }

    public List<Numbers> init(){

        Numbers numbers1 = new Numbers(2, 4);
        Numbers numbers2 = new Numbers(5, 14);
        Numbers numbers3 = new Numbers(-3, 8);

        numbersList.add(numbers1);
        numbersList.add(numbers2);
        numbersList.add(numbers3);

        return numbersList;
    }

    public List<Double> execute() {
        List<Double> results = new ArrayList<>();
        List<Boolean> resultsB = new ArrayList<>();

        for (Numbers number : numbersList){
            results.add((double) sumAndSubtraction.sum(number));
            results.add((double) sumAndSubtraction.subtract(number));
            results.add(multiplicationAndDivision.division(number));
            results.add(multiplicationAndDivision.multiplication(number));
        }

        for (Numbers number : numbersList){
            resultsB.add(comparing.greater(number));
        }

        resultsB.forEach(System.out::println);

        return results;
    }

    public Comparing getComparing() {
        return comparing;
    }


    public void setComparing(Comparing comparing) {
        this.comparing = comparing;
    }

    public MultiplicationAndDivision getMultiplicationAndDivision() {
        return multiplicationAndDivision;
    }


    public void setMultiplicationAndDivision(MultiplicationAndDivision multiplicationAndDivision) {
        this.multiplicationAndDivision = multiplicationAndDivision;
    }

    public SumAndSubtraction getSumAndSubtraction() {
        return sumAndSubtraction;
    }


    public void setSumAndSubtraction(SumAndSubtraction sumAndSubtraction) {
        this.sumAndSubtraction = sumAndSubtraction;
    }

    public List<Numbers> getNumbersList() {
        return numbersList;
    }

    public void setNumbersList(List<Numbers> numbersList) {
        this.numbersList = numbersList;
    }

    @Override
    public String toString() {
        return "NumbersController{" +
                "comparing=" + comparing +
                ", multiplicationAndDivision=" + multiplicationAndDivision +
                ", sumAndSubtraction=" + sumAndSubtraction +
                ", numbersList=" + numbersList +
                '}';
    }
}
