//// Fig. 15.14: FileChooserTest.java
// // App to test classes FileChooser and DirectoryChooser.
//         import javafx.application.Application;
//         import javafx.fxml.FXMLLoader;
//         import javafx.scene.Parent;
//         import javafx.scene.Scene;
//         import javafx.stage.Stage;
//
//         public class FileChooserTest extends Application {
// @Override
// public void start(Stage stage) throws Exception {
//         Parent root =
//                 FXMLLoader.load(getClass().getResource("FileChooserTest.fxml")46
//                 Scene scene = new Scene(root);
//         stage.setTitle("File Chooser Test"); // displayed in title bar
//         stage.setScene(scene);
//         stage.show();
//         }
//
//         public static void main(String[] args) {
//         launch(args);
//         }
// }