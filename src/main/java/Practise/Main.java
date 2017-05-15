package Practise;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


/**
 * Created by Alexander on 14/05/2017.
 */
public class Main {

    private final static Logger LOGGER = LoggerFactory.getLogger(Main.class);

    NumbersController numbersController = new NumbersController();


public static void main(String[] args) {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        applicationContext.getBean("main", Main.class).start();
    }

    private void start() {

        LOGGER.info("Initialisation of Numbers");
        numbersController.init().forEach(System.out::println);

        LOGGER.info("Executing...");
        numbersController.execute().forEach(System.out::println);
    }

    public void setNumbersController(NumbersController numbersController) {
        this.numbersController = numbersController;
    }
}
