import javafx.application.Application;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TextField;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Label;
import javafx.geometry.Pos;
public class JavaFXTemplate extends Application {
      private Button b1,b2;
	  private Button c2;
	  Label c1;
	  Label name;
	  private Scene scene1;


	private MenuBar menu;


	private TextField t1,t2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);
	}

	//feel free to remove the starter code from this method
	@Override
	public void start(Stage primaryStage) throws Exception {
		// TODO Auto-generated method stub
		primaryStage.setTitle("Welcome message");
		Label l = new Label("Username:");
		t1 = new TextField("Enter your username");
		Label id = new Label("Password:");
		t2 = new TextField("Enter your password");
		b1 = new Button("Sign Up");
		b2 = new Button("Clear");
		c1 = new Label("New User?!");
		c2 = new Button("Sign In");






		BorderPane border_pane = new BorderPane();




		VBox vbox3 = new VBox(l,t1);
		vbox3.setAlignment(Pos.TOP_LEFT);

		VBox vbox2 = new VBox(id,t2);
		vbox2.setAlignment(Pos.TOP_LEFT);


		VBox vbox4 = new VBox(c1,b1);
		vbox4.setAlignment(Pos.BOTTOM_CENTER);
		VBox vbox1 = new VBox(b2,c2);
		vbox1.setAlignment(Pos.BOTTOM_CENTER);


		VBox finalVB = new VBox(vbox3, vbox2, vbox1,vbox4);

		finalVB.setAlignment(Pos.CENTER);
		finalVB.setStyle("-fx-background-color: #82716e;");

		border_pane.setCenter(finalVB);




        t2.setEditable(true);
		b1.setOnAction(new EventHandler<ActionEvent>()

		 {
			 @Override
		public void handle(ActionEvent e) {
				 String newName = t1.getText();
				 String newid = t2.getText();
			t1.setText(newName);
			t2.setText(newid);



		}
	});
		b2.setOnAction((event)->{
			t1.clear();
			t2.clear();


		});

c2.setOnAction(e->{
	System.out.print("helo");
Stage secondStage = new Stage();
secondStage.setScene(new Scene(finalVB,344,355));
secondStage.show();
});


	Scene scene = new Scene(border_pane,700,700);
		primaryStage.setScene(scene);
		primaryStage.show();
	}

}
