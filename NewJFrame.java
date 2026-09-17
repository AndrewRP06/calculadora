/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package a1.calculadora2;
import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import javax.swing.JTextField;
import java.awt.Insets;
import java.math.*;
import javax.swing.ButtonGroup;
import javax.swing.JRadioButton;
/**
 *
 * @author ALUMNOS
 */
public class NewJFrame extends javax.swing.JFrame {
    final private JTextField display;
    private double primerNumero;
    private String operacion;
    private boolean nuevaEntrada = true;
    private final JRadioButton radioGrados;
    private final JRadioButton radioRadianes;
    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        //initComponents();
       setTitle("Prueba Calculadora");
       setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       setSize(400,400);
       setLocationRelativeTo(null);
       setLayout(new GridBagLayout());
       
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.BOTH;
        
        //Area de calculo
        display = new JTextField(12);       
        display.setEditable(false);
        gbc.gridx = 1;
        gbc.gridy = 0 ;
        gbc.gridwidth = 3;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        getContentPane().add(display , gbc);
        
        
      gbc.gridwidth = 1;
        JButton boton1 = new JButton("1");
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(boton1, gbc);
 
        JButton boton2 = new JButton("2");
        gbc.gridx = 2;
        gbc.gridy = 1;
        add(boton2, gbc);
 
        JButton boton3 = new JButton("3");
        gbc.gridx = 3;
        gbc.gridy = 1;
        add(boton3, gbc);
 
        JButton boton4 = new JButton("4");
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(boton4, gbc);
 
        JButton boton5 = new JButton("5");
        gbc.gridx = 2;
        gbc.gridy = 2;
        add(boton5, gbc);
 
        JButton boton6 = new JButton("6");
        gbc.gridx = 3;
        gbc.gridy = 2;
        add(boton6, gbc);
 
        JButton boton7 = new JButton("7");
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(boton7, gbc);
 
        JButton boton8 = new JButton("8");
        gbc.gridx = 2;
        gbc.gridy = 3;
        add(boton8, gbc);
 
        JButton boton9 = new JButton("9");
        gbc.gridx = 3;
        gbc.gridy = 3;
        add(boton9, gbc);
 
        JButton botonSigno = new JButton("-");
        gbc.gridx = 1;
        gbc.gridy = 4;
        add(botonSigno, gbc);
 
        JButton boton0 = new JButton("0");
        gbc.gridx = 2;
        gbc.gridy = 4;
        add(boton0, gbc);
 
        JButton botonComa = new JButton(",");
        gbc.gridx = 3;
        gbc.gridy = 4;
        add(botonComa, gbc);
 
        JButton botonSuma = new JButton("+");
        gbc.gridx = 4;
        gbc.gridy = 0;
        add(botonSuma, gbc);
 
        JButton botonResta = new JButton("-");
        gbc.gridx = 4;
        gbc.gridy = 1;
        add(botonResta, gbc);
 
        JButton botonMultiplica = new JButton("*");
        gbc.gridx = 4;
        gbc.gridy = 2;
        add(botonMultiplica, gbc);
 
        JButton botonDivide = new JButton("/");
        gbc.gridx = 4;
        gbc.gridy = 3;
        add(botonDivide, gbc);
 
        JButton botonIgual = new JButton("=");
        gbc.gridx = 4;
        gbc.gridy = 4;
        add(botonIgual, gbc);
        
        
        JButton botonSenos = new JButton("SEN");
        gbc.gridx = 5;
        gbc.gridy = 0;
        add(botonSenos, gbc);
 
        JButton botonconSenos = new JButton("COS");
        gbc.gridx = 5;
        gbc.gridy = 1;
        add(botonconSenos, gbc);
        
        JButton BotonTangentes = new JButton("TAN");
        gbc.gridx = 5;
        gbc.gridy = 2;
        add(BotonTangentes, gbc);
        
        JButton BotonAC = new JButton("AC");
        gbc.gridx = 5;
        gbc.gridy = 3;
        add(BotonAC, gbc);
        
        radioGrados = new JRadioButton("Grados", true); // empieza seleccionado
        radioRadianes = new JRadioButton("Radianes");
 
        ButtonGroup grupoAngulo = new ButtonGroup();
        grupoAngulo.add(radioGrados);
        grupoAngulo.add(radioRadianes);
 
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(radioGrados, gbc);
 
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(radioRadianes, gbc);
        
        
        
        boton0.addActionListener(e -> escribirNumero("0"));
        boton1.addActionListener(e -> escribirNumero("1"));
        boton2.addActionListener(e -> escribirNumero("2"));
        boton3.addActionListener(e -> escribirNumero("3"));
        boton4.addActionListener(e -> escribirNumero("4"));
        boton5.addActionListener(e -> escribirNumero("5"));
        boton6.addActionListener(e -> escribirNumero("6"));
        boton7.addActionListener(e -> escribirNumero("7"));
        boton8.addActionListener(e -> escribirNumero("8"));
        boton9.addActionListener(e -> escribirNumero("9"));
        botonComa.addActionListener(e -> escribirComa());
        botonSigno.addActionListener(e -> cambiarSigno());
        BotonAC.addActionListener(e -> borrarTodo());
        botonSuma.addActionListener(e -> seleccionarOperacion("+"));
        botonResta.addActionListener(e -> seleccionarOperacion("-"));
        botonMultiplica.addActionListener(e -> seleccionarOperacion("*"));
        botonDivide.addActionListener(e -> seleccionarOperacion("/"));
        botonIgual.addActionListener(e -> calcular());
        
        // Sen, cos y tan calculan al momento (operaciones de un solo numero),
        // usando el radio button (Grados/Radianes) para decidir si convertir o no.
        botonSenos.addActionListener(e -> {
            if (display.getText().isEmpty() || display.getText().equals("-")) return;
            double numero = leerDisplay();
            double resultado = Math.sin(aRadianes(numero));
            display.setText(formatear(resultado));
            nuevaEntrada = true;
        });
        
        botonconSenos.addActionListener(e -> {
            if (display.getText().isEmpty() || display.getText().equals("-")) return;
            double numero = leerDisplay();
            double resultado = Math.cos(aRadianes(numero));
            display.setText(formatear(resultado));
            nuevaEntrada = true;
        });
        
        BotonTangentes.addActionListener(e -> {
            if (display.getText().isEmpty() || display.getText().equals("-")) return;
            double numero = leerDisplay();
            double resultado = Math.tan(aRadianes(numero));
            display.setText(formatear(resultado));
            nuevaEntrada = true;
        });
        
        
        
    }
        private void escribirNumero(String numero) {
        if (nuevaEntrada) {
            display.setText(numero);
            nuevaEntrada = false;
        } else {
            display.setText(display.getText() + numero);
        }
    }
 
    private void escribirComa() {
        if (nuevaEntrada) {
            display.setText("0,");
            nuevaEntrada = false;
        } else if (!display.getText().contains(",")) {
            display.setText(display.getText() + ",");
        }
    }
 
    private void cambiarSigno() {
        String texto = display.getText();
 
        if (nuevaEntrada || texto.isEmpty()) {
            display.setText("-");
            nuevaEntrada = false;
        } else if (texto.startsWith("-")) {
            display.setText(texto.substring(1));
        } else {
            display.setText("-" + texto);
        }
    }
 
    private void seleccionarOperacion(String nuevaOperacion) {
        if (display.getText().isEmpty() || display.getText().equals("-")) {
            return;
        }
 
        primerNumero = leerDisplay();
        operacion = nuevaOperacion;
        nuevaEntrada = true;
    }
 
    private void calcular() {
        if (operacion == null || nuevaEntrada || display.getText().equals("-")) {
            return;
        }
 
        double segundoNumero = leerDisplay();
        double resultado = 0;
 
        switch (operacion) {
            case "+" -> resultado = primerNumero + segundoNumero;
            case "-" -> resultado = primerNumero - segundoNumero;
            case "*" -> resultado = primerNumero * segundoNumero;
            case "/" -> {
                if (segundoNumero == 0) {
                    display.setText("Error");
                    operacion = null;
                    nuevaEntrada = true;
                    return;
                }
                resultado = primerNumero / segundoNumero;
            }
        }
 
        display.setText(formatear(resultado));
        operacion = null;
        nuevaEntrada = true;
    }
 
    private double leerDisplay() {
        return Double.parseDouble(display.getText().replace(",", "."));
    }
 
    // Convierte a radianes solo si esta marcado "Grados"; si esta marcado
    // "Radianes", devuelve el numero tal cual (ya se asume que esta en radianes).
    private double aRadianes(double numero) {
        if (radioGrados.isSelected()) {
            return Math.toRadians(numero);
        }
        return numero;
    }
 
    private String formatear(double numero) {
        if (numero == (long) numero) {
            return String.valueOf((long) numero);
        }
        return String.valueOf(numero).replace(".", ",");
    }
    private void borrarTodo() {
    display.setText("");
    primerNumero = 0;
    operacion = null;
    nuevaEntrada = true;
}
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> new NewJFrame().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
