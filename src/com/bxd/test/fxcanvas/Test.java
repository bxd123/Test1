//package com.bxd.test.fxcanvas;
//
//import javafx.embed.swt.FXCanvas;
//import javafx.scene.Group;
//import javafx.scene.Scene;
//import javafx.scene.control.Button;
//import jdk.nashorn.tools.Shell;
//
//import java.awt.*;
//
//public class Test {
//    private static Scene createScene() {
//        Group group = new Group();
//        Scene scene = new Scene(group);
//        Button button = new Button("JFX Button");
//        group.getChildren().add(button);
//        return scene;
//    }
//
//    public static void main(String[] args) {
//        Display display = new Display();
//
//        Dialog dialog = new Dialog();
//        Shell shell = new Shell(display);
//        shell.setLayout(new FillLayout());
//        FXCanvas canvas = new FXCanvas(shell, SWT.NONE);
//        Scene scene = createScene();
//        canvas.setScene(scene);
//        shell.open();
//        while (!shell.isDisposed()) {
//            if (!display.readAndDispatch()) display.sleep();
//        }
//        display.dispose();
//    }
//}
//