import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class HandleEvent extends Application{

    @Override
    public void start(Stage stage) {

        HBox pane = new HBox();
        pane.setAlignment(Pos.CENTER);

        Button btnOK = new Button("OK");
        Button btnCancel = new Button("Cancel");


        OKHandlerClass okClass = new OKHandlerClass();
        CancelHandlerClass cancelClass = new CancelHandlerClass();

        btnOK.setOnAction(okClass);
        btnCancel.setOnAction(cancelClass);

        pane.getChildren().addAll(btnOK, btnCancel);

        Scene scene = new Scene(pane, 200, 100);
        stage.setTitle("Basic Handlers");
        stage.setScene(scene);
        stage.show();
    }

    class OKHandlerClass implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {
            System.out.println("OK button was clicked");
        }
    }

    class CancelHandlerClass implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent e) {
            System.out.println("Cancel button was clicked");
        }
    }
}