package gui;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;
import model.services.DepartmentService;

public class MainViewController implements Initializable{
	
	@FXML
	private MenuItem menuItemSeller;
	
	@FXML
	private MenuItem menuItemDepartment;
	
	@FXML
	private MenuItem menuItemAbout;
	
	@FXML
	public void onMenuItemSellerAction() {
		System.out.println("onMenuItemSellerAction");
	}
	
	@FXML
	public void onMenuItemDepartmentAction() {
		loadView2("/gui/DepartmentList.fxml");
	}
	
	@FXML
	public void onMenuItemAboutAction() {
		loadView("/gui/About.fxml");
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {

	}

	private synchronized void loadView(String absoluteName) {
		try {
			//Carregar View
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVbox = loader.load();
			
			//Carregar dentro da tela principal
			Scene mainScene = Main.getMainScene();
			VBox mainVbox = (VBox)((ScrollPane)mainScene.getRoot()).getContent();
			
			//Pegando o primeiro Children
			Node mainMenu = mainVbox.getChildren().get(0);
			//Limpando
			mainVbox.getChildren().clear();
			// Adicionando old menu
			mainVbox.getChildren().add(mainMenu);
			//Adicionando new menu
			mainVbox.getChildren().addAll(newVbox.getChildren());
			
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}
	
	private synchronized void loadView2(String absoluteName) {
		try {
			//Carregar View
			FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
			VBox newVbox = loader.load();
			
			//Carregar dentro da tela principal
			Scene mainScene = Main.getMainScene();
			VBox mainVbox = (VBox)((ScrollPane)mainScene.getRoot()).getContent();
			
			//Pegando o primeiro Children
			Node mainMenu = mainVbox.getChildren().get(0);
			//Limpando
			mainVbox.getChildren().clear();
			// Adicionando old menu
			mainVbox.getChildren().add(mainMenu);
			//Adicionando new menu
			mainVbox.getChildren().addAll(newVbox.getChildren());
			
			DepartmentListController controller = loader.getController();
			controller.setDepartmentService(new DepartmentService());
			controller.updateTableView();
			
		} catch (IOException e) {
			Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), AlertType.ERROR);
		}
	}
	
}