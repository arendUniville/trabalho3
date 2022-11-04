import javax.swing.*;
import java.awt.*;

public class CriarTarefa extends JFrame {

    public CriarTarefa(){
        setTitle("Caixa de entrada");
        setSize(400,500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        configurarJanela();
        setVisible(true);
    }

    public void configurarJanela(){

        JPanel painel = new JPanel();
        GroupLayout TheBox = new GroupLayout(painel);
        painel.setLayout(TheBox);
        TheBox.setAutoCreateGaps(true);
        TheBox.setAutoCreateContainerGaps(true);


        JLabel labelCaixaEntrada = new JLabel("Caixa de entrada");

        JButton NovaTarefa = new JButton("Nova Tarefa");

        JCheckBox tarefa1 = new JCheckBox("Compra carvão");
        JCheckBox tarefa2 = new JCheckBox("Compra carvão");
        JCheckBox tarefa3 = new JCheckBox("Compra carvão");
        JCheckBox tarefa4 = new JCheckBox("Compra carvão");
        JCheckBox tarefa5 = new JCheckBox("Compra carvão");


        TheBox.setVerticalGroup(
            TheBox.createSequentialGroup()
                .addGroup(TheBox.createParallelGroup()
                    .addComponent(labelCaixaEntrada)
                    .addComponent(NovaTarefa)
                )

                .addGroup(TheBox.createSequentialGroup()
                    .addComponent(tarefa1)
                    .addComponent(tarefa2)
                    .addComponent(tarefa3)
                    .addComponent(tarefa4)
                    .addComponent(tarefa5)
                )
                                
                
        );

        TheBox.setHorizontalGroup(
            TheBox.createParallelGroup()
                .addGroup(TheBox.createSequentialGroup()
                    .addComponent(labelCaixaEntrada)
                    .addComponent(NovaTarefa)
                )

                .addComponent(tarefa1)
                .addComponent(tarefa2)
                .addComponent(tarefa3)
                .addComponent(tarefa4)
                .addComponent(tarefa5)
                
                                
        );
        add(painel);
    }
}
