package Practise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 * Created by Alexander on 14/05/2017.
 */
@Component
public class Main {

    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    NumbersController numbersController = new NumbersController();


public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml");
        applicationContext.getBean("main", Main.class).start();

    }

    private void start() {

        LOGGER.info("Initialisation of Numbers");
        numbersController.init().forEach(System.out::println);

        LOGGER.info("Executing...");
        numbersController.execute().forEach(System.out::println);
    }

    @Autowired
    public void setNumbersController(NumbersController numbersController) {
        this.numbersController = numbersController;
    }
}
