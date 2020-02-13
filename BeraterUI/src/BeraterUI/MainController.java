package BeraterUI;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {
    @FXML
    private TextField input;
    @FXML
    private Button send;
    @FXML
    private TextArea history;

    public MainController()
    {
    }

    @FXML
    private void handleInput()
    {
        var msg = input.textProperty().getValue();
        input.textProperty().setValue("");

        history.appendText("You: " + msg + "\n");
    }
}
