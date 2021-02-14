package com.egorov.homeworks.homework11;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void main(String[] args) {
        Mouse firstMouse = new Mouse("Mouse #1", 415);
        Mouse secondMouse = new Mouse("Mouse #2", 999);
        Mouse thirdMouse = new Mouse("Mouse #3", 567);
        Mouse fourthMouse = new Mouse("Mouse #4", 24);
        Mouse fifthMouse = new Mouse("Mouse #5", 13);
        Mouse jerry = new Mouse("Jerry", 460);
        Cat tom = new Cat();

        tom.eat(firstMouse);
        tom.eat(secondMouse);
        tom.eat(thirdMouse);
        tom.eat(fourthMouse);
        tom.eat(fifthMouse);
        tom.eat(jerry);

        logger.info("Natural way - " + tom.naturalWay());
        tom.laxative();
        logger.info("Laxative effects - " + tom.substance);
        logger.info("Is the Jerry here? - " + tom.stomach.contains(jerry));


    }
}
