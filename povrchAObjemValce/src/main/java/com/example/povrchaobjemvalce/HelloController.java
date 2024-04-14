package com.example.povrchaobjemvalce;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {

    @FXML
    private TextField polomer;

    @FXML
    private TextField vyska;

    @FXML
    private Button objem;

    @FXML
    private Button povrch;

    @FXML
    private Label vysledek;

    @FXML
    private TextField polomer2;

    @FXML
    private Button povrch2;

    @FXML
    private Button objem2;

    @FXML
    private Label vysledek2;



    @FXML
    void initialize() {

        objem.setOnAction(event -> {
            double r = Double.parseDouble(polomer.getText());
            double h = Double.parseDouble(vyska.getText());
            double objemV = Math.PI * r * r * h;
            vysledek.setText(""+ formatujCislo(objemV));
        });


        povrch.setOnAction(event -> {
            double r = Double.parseDouble(polomer.getText());
            double h = Double.parseDouble(vyska.getText());
            double povrchV = 2 * Math.PI * r * (r + h);
            vysledek.setText("" + formatujCislo(povrchV));
        });

        povrch2.setOnAction(event -> {
            double r2 = Double.parseDouble(polomer2.getText());
            double povrchK = 4 * Math.PI * r2 * r2;
            vysledek2.setText("" + formatujCislo(povrchK));
        });

        objem2.setOnAction(event -> {
            double o2 = Double.parseDouble(polomer2.getText());
            double objemK = (4/3) * Math.PI * (o2 * o2 * o2);
            vysledek2.setText("" + formatujCislo(objemK));
        });

    }
    private String formatujCislo(double cislo) {
        return String.format("%.2f", cislo);
    }



}