import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Border;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class AnonClassHandler extends Application {

    @Override
    public void start(Stage stage) {
        Text text = new Text(40, 40, "Programming is fun");
        Pane pane = new Pane(text);

        Button btnUp = new Button("Up");
        Button btnDown = new Button("Down");
        Button btnLeft = new Button("Left");
        Button btnRight = new Button("Right");

        HBox hBox = new HBox(btnUp, btnDown, btnLeft, btnRight);

        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);

        BorderPane borderPane = new BorderPane(pane);
        borderPane.setBottom(hBox);

        
        Scene scene = new Scene(borderPane, 400, 350);
        stage.setTitle("Anon Class Handler");
        stage.setScene(scene);
        stage.show();
    }
}