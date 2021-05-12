/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculadora;

import javax.swing.JTextField;

/**
 *
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class LogicaCalculadora {

    public double primero;
    public double segundo;
    public String operador;

    public void AñadirNumero(JTextField cas, String digito) {
        cas.setText(cas.getText() + digito);
    }

    public void suma(JTextField cas) {
        this.primero = Double.parseDouble(cas.getText());
        this.operador = "+";
        cas.setText("");
    }

    public void resta(JTextField cas) {
        this.primero = Double.parseDouble(cas.getText());
        this.operador = "-";
        cas.setText("");

    }

    public void multiplicacion(JTextField cas) {

        this.primero = Double.parseDouble(cas.getText());
        this.operador = "*";
        cas.setText("");

    }

    public void division(JTextField cas) {

        this.primero = Double.parseDouble(cas.getText());
        this.operador = "/";
        cas.setText("");

    }
    public void porcentaje(JTextField cas) {

        this.primero = Double.parseDouble(cas.getText());
        this.operador = "%";
        cas.setText("");

    }

    public void punto(JTextField cas, String digito) {
        if (!(cas.getText().contains("."))) {
            cas.setText(cas.getText() + digito);
        }
    }

    public void eliminar(JTextField cas) {
        String texto = cas.getText().substring(0, cas.getText().length() - 1);
        cas.setText(texto);
    }

    /*OPERACIONES BASICAS*/
    public void resultado(JTextField cas) {
        this.segundo = Double.parseDouble(cas.getText());

        switch (this.operador) {
            case "+" :
                cas.setText(Double.toString(this.primero + this.segundo));
                break;
            case "-" :
                cas.setText(Double.toString(this.primero - this.segundo));
                break;
            case "*":
                cas.setText(Double.toString(this.primero * this.segundo));
                break;
            case "/" :
                cas.setText(Double.toString(this.primero / this.segundo));
                break;
            case "%":
                cas.setText(Double.toString((this.primero* this.segundo) /100));
                break;
            default : {
            }
        }

    }
}
