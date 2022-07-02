/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package gui_multiscene;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;

/**
 *
 * @author zahwa
 */
public class FXMLDocumentController implements Initializable {
    OpenScene bukaScene = new OpenScene();
    
    @FXML
    private BorderPane mainPane;
    
    @FXML
    private void handleButtonHalamanDataPengguna(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLSceneData");
        mainPane.setCenter(halaman);
        System.out.println("Button halaman Data Calon Pendonor is clicked!");
    }
    
    
    @FXML
    private void handleButtonHalamanStatistik(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLSceneStatistik");
        mainPane.setCenter(halaman);
        System.out.println("Button halaman Statistik is clicked!");
    }
    
    @FXML
    private void handleButtonHalamanKelolaData(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLSceneKelola");
        mainPane.setCenter(halaman);
        System.out.println("Button halaman Kelola Data is clicked!");
    }
    
    @FXML
    private void handleButtonHalamanCariData(ActionEvent event) {
        Pane halaman = bukaScene.getPane("FXMLSceneCari");
        mainPane.setCenter(halaman);
        System.out.println("Button halaman Cari Data is clicked!");
    }
    
    @FXML
    private void handleButtonHalamanKonfirmasi(ActionEvent event) {
        Pane halaman;
        halaman = bukaScene.getPane("FXMLSceneKonfirmasi");
        mainPane.setCenter(halaman);
        System.out.println("Button halaman Konfirmasi permintaan is clicked!");
    }
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
