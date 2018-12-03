package testes;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.*;
import javafx.scene.paint.Paint;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import static javafx.application.Application.launch;

public class Menu extends Application {

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Sistema de Consuo de Combustível de Automóveis");

        GridPane grid = new GridPane();
        //grid.setBackground(new BackgroundFill(Paint.valueOf(6fcdb6)));
        grid.setAlignment(Pos.TOP_CENTER);
        grid.setHgap(30);
        grid.setVgap(30);
        grid.setPadding(new Insets(25, 25, 25, 25));
        grid.setGridLinesVisible(true);

        Button cadAuto = new Button("CADASTRAR AUTOMÓVEL");
        cadAuto.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        Button editAuto = new Button("EDITAR AUTOMÓVEL");
        editAuto.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        VBox vbBtn = new VBox(30);
        vbBtn.setAlignment(Pos.BOTTOM_CENTER);
        vbBtn.getChildren().add(cadAuto);
        vbBtn.getChildren().add(editAuto);
        grid.add(vbBtn, 1, 1);




        Button abastAuto = new Button("ABASTECER AUTOMÓVEL");
        abastAuto.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        Button listAuto = new Button("LISTAR TODOS AUTOMÓVEIS");
        listAuto.setFont(Font.font("Tahoma", FontWeight.NORMAL, 20));

        VBox vbBtn2 = new VBox(30);
        vbBtn2.setAlignment(Pos.BOTTOM_CENTER);
        vbBtn2.getChildren().add(abastAuto);
        vbBtn2.getChildren().add(listAuto);
        grid.add(vbBtn2, 2, 1);



        Scene scene = new Scene(grid, 700, 500);
        primaryStage.setScene(scene);

        primaryStage.show();
    }

}
