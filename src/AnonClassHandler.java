import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
        Text text = new Text(200, 200, "Programming is fun");
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

        btnUp.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                text.setY(text.getY()>10 ? text.getY() -5: 10);
            }
        });
        btnDown.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                text.setY(text.getY()<pane.getHeight() ? text.getY() + 5: pane.getHeight());
            }
        });
        btnLeft.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                text.setX(text.getX()>5 ? text.getX()-5: 5);
            }
        });
        btnRight.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                text.setX(text.getX()<pane.getWidth()-110 ? text.getX()+5: 290);
            }
        });

        Scene scene = new Scene(borderPane, 400, 350);
        stage.setTitle("Anon Class Handler");
        stage.setScene(scene);
        stage.show();
    }
}