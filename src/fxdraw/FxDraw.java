/*
 * FxDraw: un esempio di tracciamento linee su una Canvas.
 */

package fxdraw;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author Sandro
 */
public class FxDraw extends Application {
  
  public final int w=1024, h=768;
  
  @Override
  public void start(Stage stage) {
      stage.setTitle("FxDraw");
      Group root = new Group();
      Canvas canvas = new Canvas(w, h);
      GraphicsContext gc = canvas.getGraphicsContext2D();

      gc.setLineWidth(2);
      gc.setStroke(Color.BLUE);
      gc.strokeLine(10, 10, w-10, h-10);
      gc.strokeLine(10, h-10, w-10, 10);

      root.getChildren().add(canvas);
      stage.setScene(new Scene(root));
      stage.show();
  }

  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
    launch(args);
  }
  
}
