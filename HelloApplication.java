package com.example.java_gugakordzakhia;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.SQLException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Button addFly = new Button("Add");
        addFly.setLayoutX(100);
        addFly.setLayoutY(130);

        TextField direction = new TextField();
        Text directionText = new Text(10, 30, "Direction");
        directionText.setFont(new Font(20));
        direction.setLayoutX(100);
        direction.setLayoutY(10);

        TextField datePicker = new TextField();
        Text datePickerText = new Text(10, 60, "Pick Time");
        datePickerText.setFont(new Font(20));
        datePicker.setLayoutX(100);
        datePicker.setLayoutY(40);

        TextField seats = new TextField();
        Text seatsText = new Text(10, 90, "Seats");
        seatsText.setFont(new Font(20));
        seats.setLayoutX(100);
        seats.setLayoutY(70);

        TextField price = new TextField();
        Text priceText = new Text(10, 120, "Price");
        priceText.setFont(new Font(20));
        price.setLayoutX(100);
        price.setLayoutY(100);

        PieChart pieChart = new PieChart();
        pieChart.setLayoutX(150);
        pieChart.setData(getObservableList());

        Group root = new Group();
        root.getChildren().add(addFly);
        root.getChildren().add(direction);
        root.getChildren().add(directionText);
        root.getChildren().add(datePicker);
        root.getChildren().add(datePickerText);
        root.getChildren().add(seats);
        root.getChildren().add(seatsText);
        root.getChildren().add(price);
        root.getChildren().add(priceText);
        root.getChildren().add(pieChart);

        Scene scene = new Scene(root, 600, 400, Color.CYAN);
        stage.setScene(scene);
        stage.setTitle("Nini");
        stage.show();

        addFly.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
            String flyDirection = direction.getText();
            String dateTime = datePicker.getText();
            String countSeats = seats.getText();
            String countPrice = price.getText();
            }
        });
    }

        public ObservableList<PieChart.Data> getObservableList() {
        ObservableList<PieChart.Data> observableList = FXCollections.observableArrayList();
        observableList.addAll(
                new PieChart.Data("Miami", 20),
                new PieChart.Data("Madrid", 44),
                new PieChart.Data("Batumi", 9),
                new PieChart.Data("Munich", 26),
                new PieChart.Data("Nice", 3),
                new PieChart.Data("Vena", 35));

        return observableList;

    }

    public static void main(String[] args) throws SQLException {
        launch();
    }
}