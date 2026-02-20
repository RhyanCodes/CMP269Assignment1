import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.control.Button;  

public class CourseRegistration extends Application{
    @Override
    public void start(Stage primaryStage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(20));
        grid.setVgap(10);
        grid.setHgap(10);
        Label studentName = new Label("Student Name:");
        TextField nameField = new TextField();
        Label courseName = new Label("Course Name:");
        TextField courseField = new TextField();
        Button registerButton = new Button("Register");
        
        Label text = new Label(" ");
        text.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
        registerButton.setOnMouseClicked(e -> {
            String name = nameField.getText();
            String course = courseField.getText();
            if (name.isEmpty() || course.isEmpty()) {
                text.setText("Please enter both name and course.");
                
            } else {
            text.setText("Registered " + name + " for " + course + "!");
            }
        });
        grid.add(studentName, 0, 0);
        grid.add(nameField, 1, 0);
        grid.add(courseName, 0, 1);
        grid.add(courseField, 1, 1);
        grid.add(registerButton, 1, 2);
        grid.add(text, 0, 3, 2, 1);
        Scene scene = new Scene(grid, 400, 250);
        primaryStage.setTitle("Lehman Course Registration");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        launch();
    }
}



// javac --module-path C:\Users\dabbe\Downloads\openjfx-25.0.2_windows-x64_bin-sdk\javafx-sdk-25.0.2\lib --add-modules javafx.controls CourseRegistration.java 
// java --module-path C:\Users\dabbe\Downloads\openjfx-25.0.2_windows-x64_bin-sdk\javafx-sdk-25.0.2\lib --add-modules javafx.controls CourseRegistration.java 