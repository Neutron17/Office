package neutron.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.passay.*;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class LoginController implements Initializable {
    @FXML
    TextField passField = new TextField();
    @FXML
    TextField unameField = new TextField();
    @FXML
    Label outLabel = new Label();

    @FXML
    void handleSubmit() {
        if (passField.getText().isEmpty() || passField.getText().contains(" ")
                || unameField.getText().isEmpty() || unameField.getText().contains(" ")) {
            outLabel.setText("Password or username cannot be empty or contain any whitespaces");
            return;
        }
        List<Rule> rules = new ArrayList<>();
        rules.add(new LengthRule(8,40));
        rules.add(new CharacterRule(EnglishCharacterData.UpperCase,1));
        rules.add(new CharacterRule(EnglishCharacterData.LowerCase,1));
        rules.add(new CharacterRule(EnglishCharacterData.Digit,1));
        rules.add(new WhitespaceRule());

        PasswordValidator validator = new PasswordValidator(rules);
        PasswordData password = new PasswordData(passField.getText());
        RuleResult result = validator.validate(password);

        if (result.isValid()) {
            System.out.println("Valid");
        } else {
            System.out.println("Not Valid ");
            outLabel.setText(""+validator.getMessages(result));
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
