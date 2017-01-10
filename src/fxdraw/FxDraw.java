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
  
  public final int w=600, h=600;
  
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
      
      gc.setLineWidth(1);
      gc.setStroke(Color.RED);
      for (int i = 10; i < 200; i+=5) {
        gc.strokeLine(i, i, w-i, i);
        gc.strokeLine(w-i, i, w-i, h-i);
        gc.strokeLine(w-i, h-i, i, h-i);
        gc.strokeLine(i, h-i, i, i);
      }
      gc.setLineWidth(2);
      for (int i = 0; i < 60; i+=5) {
        gc.setStroke( Color.rgb( (int)(Math.random()*256), (int)(Math.random()*256), (int)(Math.random()*256) ) );
        gc.strokeOval(220+i, 220+i, 100, 100);
      }

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
