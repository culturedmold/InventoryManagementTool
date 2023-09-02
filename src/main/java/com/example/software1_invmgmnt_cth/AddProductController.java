package com.example.software1_invmgmnt_cth;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.Node;

import java.io.IOException;

public class AddProductController extends Controller {
    @FXML
    private AnchorPane addProductAnchorPane;
    @FXML
    private Button cancelButton;

    @FXML
    public void cancelAddProduct(ActionEvent event) throws IOException {
        String returnView = "main-view.fxml";
        String returnTitle = "Inventory Manager";

        cancelButton(event, returnView, returnTitle);
    }
}
