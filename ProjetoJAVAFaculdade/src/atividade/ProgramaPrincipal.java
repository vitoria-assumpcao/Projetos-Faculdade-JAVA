package atividade;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Dimension;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.border.BevelBorder;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProgramaPrincipal extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel contentPane;
    private JTextField textFieldResultado;
    private JTextField textFieldNumero1;
    private JTextField textFieldNumero2;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    ProgramaPrincipal frame = new ProgramaPrincipal();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public ProgramaPrincipal() {
        setTitle("Atividade Prática I - Vitória Assumpção");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 600, 250);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(contentPane);
        contentPane.setLayout(new BorderLayout(0, 0));

        JPanel panel1 = new JPanel();
        panel1.setBackground(Color.PINK);
        panel1.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        contentPane.add(panel1, BorderLayout.NORTH);
        panel1.setLayout(new BorderLayout(0, 0));

        textFieldResultado = new JTextField();
        textFieldResultado.setEditable(false);
        textFieldResultado.setFont(new Font("Tahoma", Font.BOLD, 30));
        textFieldResultado.setPreferredSize(new Dimension(600, 70));
        panel1.add(textFieldResultado);
        textFieldResultado.setColumns(10);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel2.setBackground(Color.PINK);
        FlowLayout flowLayout = (FlowLayout) panel2.getLayout();
        flowLayout.setVgap(30);
        flowLayout.setAlignment(FlowLayout.LEFT);
        contentPane.add(panel2, BorderLayout.CENTER);

        JLabel lblNumero1 = new JLabel("Primeiro Número:");
        lblNumero1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel2.add(lblNumero1);

        textFieldNumero1 = new JTextField();
        textFieldNumero1.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel2.add(textFieldNumero1);
        textFieldNumero1.setColumns(10);

        JLabel lblNumero2 = new JLabel("Segundo Número:");
        lblNumero2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel2.add(lblNumero2);

        textFieldNumero2 = new JTextField();
        textFieldNumero2.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel2.add(textFieldNumero2);
        textFieldNumero2.setColumns(10);

        JPanel panel3 = new JPanel();
        panel3.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
        panel3.setBackground(Color.PINK);
        FlowLayout flowLayout_1 = (FlowLayout) panel3.getLayout();
        flowLayout_1.setAlignment(FlowLayout.LEFT);
        contentPane.add(panel3, BorderLayout.SOUTH);

        JButton botaoDividir = new JButton("Dividir");
        botaoDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1Aux = Double.parseDouble(textFieldNumero1.getText());
                    double numero2Aux = Double.parseDouble(textFieldNumero2.getText());

                    if (numero2Aux == 0) {
                        throw new ArithmeticException("Não é possível realizar a divisão por zero");

                    }

                    textFieldResultado.setText(String.valueOf(numero1Aux/numero2Aux));
                }
                catch (NumberFormatException ex) {
                    System.out.println("Os valores inseridos são inválidos");
                    textFieldResultado.setText("");
                    textFieldNumero1.setText("");
                    textFieldNumero2.setText("");
                }
                catch (ArithmeticException ex) {
                    System.out.println("Erro: " + ex.getMessage());
                    textFieldResultado.setText("");
                    textFieldNumero1.setText("");
                    textFieldNumero2.setText("");
                }


            }
        });

        botaoDividir.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel3.add(botaoDividir);

        JButton botaoLimpar = new JButton("Limpar");
        botaoLimpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                textFieldResultado.setText("");
                textFieldNumero1.setText("");
                textFieldNumero2.setText("");
            }
        });
        botaoLimpar.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel3.add(botaoLimpar);


    }

}
