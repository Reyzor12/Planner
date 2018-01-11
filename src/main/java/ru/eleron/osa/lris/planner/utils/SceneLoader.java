package ru.eleron.osa.lris.planner.utils;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SceneLoader {

    public static Stage stage;

    private static final Logger log = LogManager.getLogger();
    private static final SpringFXMLLoader loader = new SpringFXMLLoader();

    public static void loadScene(String url,Integer width, Integer height){
        if(stage == null) return;
        Parent root = (Parent) loader.load(url);
        stage.setScene(new Scene(root,width,height));
        stage.show();
        log.info("show stage");
    }
}
