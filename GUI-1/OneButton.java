import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class OneButton{
    public static void main(String args[]){
        JFrame frame = new JFrame("My First GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        Container container = frame.getContentPane();
        container.add(new JButton("PAGE_START"), BorderLayout.PAGE_START);
        container.add(new JButton("PAGE_END"), BorderLayout.PAGE_END);
        JButton button = new JButton("Press");
        container.add(button, BorderLayout.LINE_START);
        container.add(new JButton("LINE_END"), BorderLayout.LINE_END);
        container.add(new JButton("CENTER"), BorderLayout.CENTER);
        frame.getContentPane().add(button);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (button.getText().contentEquals("Press")) {
                    button.setText("OK");
                    button.setBackground(Color.RED);
                }
                else
                    button.setText("Press");
            }
        });
        frame.setVisible(true);
       }
    }