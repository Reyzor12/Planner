package ru.eleron.osa.lris.planner;

import javafx.application.Application;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ru.eleron.osa.lris.planner.utils.SceneLoader;

public class StartApp extends Application {

    private static final Logger log = LogManager.getLogger();

    public static void main(String[] args){
        log.info("beans loading...");
        ApplicationContext context = new ClassPathXmlApplicationContext("springContext.xml");
        log.info("javafx starting...");
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        SceneLoader.stage = primaryStage;
        SceneLoader.loadScene("view/StartApp.fxml",800,600);
    }
}
