import javafx.application.*;
import javafx.fxml.*;
import javafx.scene.*;
import javafx.stage.*;
import javafx.util.Callback;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class appStarter extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(appStarter.class.getResource("../resources/searchpage.fxml"));

        primaryStage.setScene(new Scene(root));
        primaryStage.show();

//        ApplicationContext context = new AnnotationConfigApplicationContext(AppSpringConfig.class);
//
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("../resources/searchpage.fxml"));
//        loader.setControllerFactory(context::getBean);
//        Parent root = loader.load();
//        primaryStage.setScene(new Scene(root));
//        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
