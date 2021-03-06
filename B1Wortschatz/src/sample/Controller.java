package sample;
import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Controller extends General{

    @FXML
    private Label translation;

    @FXML
    private Button showTranslationButton;

    @FXML
    private Button nextButton;

    @FXML
    void initialize() {
        nextButton.setOnAction(e-> update("b1Words.txt"));
        showTranslationButton.setOnAction(e-> showAnswer());
    }

    public void goToCreateCard(ActionEvent actionEvent) throws IOException {
        Stage stagee = (Stage) translation.getScene().getWindow();
        // do what you have to do
        stagee.close();
        Stage stage = new Stage();
        Pane layout = FXMLLoader.load(getClass().getResource("newcard.fxml"));
        stage.setScene(new Scene(layout));
        stage.show();
    }

    @Override
    void goBack(ActionEvent event) throws IOException {
        super.goBack(event);
    }

    @Override
    public void showAnswer(){
        translation.setVisible(true);
    }
}