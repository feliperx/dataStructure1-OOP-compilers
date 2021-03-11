package aula12_JFrame.exercicios;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;

/**
 *
 * @author felipex
 */
public class Exercicio02 extends JFrame {

    private static final long serialVersionUID = 1L;
    private JLabel valorVenda, finalVenda;
    private JTextField venda, precoFinal;
    private JRadioButton dinheiro, cheque, cartao;
    private ButtonGroup compras;
    private static Exercicio02 frame;
    private static float precoFinalDaCompra;

    public Exercicio02() {
        inicializarComponentes();
    }

    private float descontoDinheiro(float valor) {
        return valor - (valor * 0.05f);
    }

    private float acrescimoCheque(float valor) {
        return valor + (valor * 0.05f);
    }

    private float acrescimoCartao(float valor) {
        return valor + (valor * 0.10f);
    }

    private void setLabelPrecoFinal(float novoPreco) {
        precoFinal.setText(String.valueOf(novoPreco));
    }

    private void criarEventos() {

        dinheiro.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (dinheiro.isSelected()) {
                    setLabelPrecoFinal(descontoDinheiro(precoFinalDaCompra));
                }
            }
        });
        cheque.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (cheque.isSelected()) {
                    setLabelPrecoFinal(acrescimoCheque(precoFinalDaCompra));
                }
            }
        });
        cartao.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent arg0) {
                if (cartao.isSelected()) {
                    setLabelPrecoFinal(acrescimoCartao(precoFinalDaCompra));
                }
            }
        });
        venda.addCaretListener(new CaretListener() {
            @Override
            public void caretUpdate(CaretEvent e) {
                try {
                    setLabelPrecoFinal(precoFinalDaCompra);
                    precoFinalDaCompra = Float.parseFloat(venda.getText());

                    if (cheque.isSelected()) {
                        setLabelPrecoFinal(acrescimoCheque(precoFinalDaCompra));
                    } else if (cartao.isSelected()) {
                        setLabelPrecoFinal(acrescimoCartao(precoFinalDaCompra));
                    } else if (dinheiro.isSelected()) {
                        setLabelPrecoFinal(descontoDinheiro(precoFinalDaCompra));
                    }

                } catch (NumberFormatException e1) {

                }
            }
        });
    }

    private void inicializarComponentes() {

        setTitle("VENDAS");
        setBounds(0, 0, 320, 250);
        setLayout(null);

        valorVenda = new JLabel("Valor da venda: ");
        venda = new JTextField();

        dinheiro = new JRadioButton("Dinheiro");
        cheque = new JRadioButton("Cheque");
        cartao = new JRadioButton("Cartão");

        compras = new ButtonGroup();
        compras.add(dinheiro);
        compras.add(cheque);
        compras.add(cartao);

        finalVenda = new JLabel("Preço final da venda: ");

        precoFinal = new JTextField();
        precoFinal.setEditable(false);

        venda.setBounds(150, 30, 120, 25);
        valorVenda.setBounds(30, 30, 120, 30);
        dinheiro.setBounds(35, 80, 160, 25);
        cheque.setBounds(35, 105, 160, 25);
        cartao.setBounds(35, 130, 160, 25);
        finalVenda.setBounds(20, 80, 220, 220);
        precoFinal.setBounds(180, 180, 120, 25);

        add(dinheiro);
        add(valorVenda);
        add(cartao);
        add(venda);
        add(cheque);
        add(finalVenda);
        add(precoFinal);

        criarEventos();
        setLabelPrecoFinal(0.0f);
    }

    public static void main(String[] args) {

        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                frame = new Exercicio02();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                Dimension tela = Toolkit.getDefaultToolkit().getScreenSize();
                frame.setLocation((tela.width - frame.getSize().width) / 2, (tela.height - frame.getSize().height) / 2);
                frame.setVisible(true);
            }
        });
    }
}
