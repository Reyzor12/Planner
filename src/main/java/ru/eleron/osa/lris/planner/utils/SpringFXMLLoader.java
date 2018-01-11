package ru.eleron.osa.lris.planner.utils;

import javafx.fxml.FXMLLoader;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

public class SpringFXMLLoader {

    private static final Logger log = LogManager.getLogger();

    private static final ApplicationContext CONTEXT = new ClassPathXmlApplicationContext("springContext.xml");

    public Object load(String url){
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(clazz->CONTEXT.getBean(clazz));
        loader.setLocation(getClass().getClassLoader().getResource(url));
        try{
            return loader.load();
        } catch (IOException e) {
            log.error("can't load scene " + url,e);
        }
        return null;
    }
}
