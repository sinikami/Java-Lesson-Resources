package study;

import study.tools.print;
import sun.jvm.hotspot.types.JBooleanField;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.peer.ContainerPeer;
import java.lang.annotation.Target;

/**
 * Created by ikocos on 01/04/2017.
 */
public class GUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello JAVA");
        //frame.setLocation();
        frame.setLocation(300, 300);

        frame.setPreferredSize(new Dimension(500, 300));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container container = frame.getContentPane();
        JPanel jPanel1 = new JPanel();
        JPanel jPanel2 = new JPanel();
        JPanel jPanel3 = new JPanel();


        GridLayout gridLayout = new GridLayout(3, 2);
        FlowLayout flowLayout = new FlowLayout();
        BoxLayout boxLayout = new BoxLayout(jPanel2, BoxLayout.X_AXIS);
        String title[] = {"이름", "나이", "성별"};
        Object[][] data = {{"홍길동", 24, "남"}, {"홍길동", 21, "남"}, {"홍길동", 20, "남"}, {"이순신", 20, "남"}, {"이순신", 20, "남"}, {"이순신", 20, "남"}};
        //JTable jTable = new JTable(data, title);
        DefaultTableModel defaultTableModel = new DefaultTableModel(title, 0);
        JTable jTable = new JTable(defaultTableModel);
        // jTable.setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS);

        JScrollPane jScrollPane = new JScrollPane(jTable);

        // container.setLayout(boxLayout);

        jPanel1.setLayout(flowLayout);
        jPanel2.setLayout(flowLayout);
        jPanel3.setLayout(gridLayout);

       /* JLabel label= new JLabel("Hello!",SwingConstants.CENTER);
        JButton jButton = new JButton("OK");
        JTextField jTextField = new JTextField();

        container.add(jTextField,BorderLayout.CENTER);
        container.add(jButton,BorderLayout.EAST);
        container.add(label,BorderLayout.SOUTH);*/

        JButton jButton = new JButton("Insert");
        JButton remove = new JButton("Remove");
        JButton cancel = new JButton("Cancel");
        jPanel1.add(jPanel2, SwingConstants.CENTER);

        jPanel1.add(cancel, SwingConstants.CENTER);
        jPanel1.add(remove, SwingConstants.CENTER);
        jPanel1.add(jButton, SwingConstants.CENTER);


        JTextField name = new JTextField(6);
        name.setName("name");
        jPanel2.add(new JLabel("이름"));
        jPanel2.add(name);
        jPanel2.add(new JLabel("나이"));
        jPanel2.add(new JTextField(3));
        jPanel2.add(new JLabel("성별"));
        jPanel2.add(new JTextField(1));
        //jPanel2.add(jScrollPane,SwingConstants.CENTER);
        //jPanel2.add(new JButton("코끼리"));

        jPanel3.add(new JLabel("이름"));
        jPanel3.add(new JTextField());
        jPanel3.add(new JLabel("주소"));
        jPanel3.add(new JTextField());
        jPanel3.add(new JLabel("전화번호"));
        jPanel3.add(new JTextField());

        container.add(jPanel1, BorderLayout.SOUTH);
        // container.add(jPanel2,BorderLayout.SOUTH);
        container.add(jScrollPane, BorderLayout.CENTER);

        frame.pack();
        frame.setLocationRelativeTo(null);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        frame.setVisible(true);
        // ConfirmActionListener confirmActionListener = new ConfirmActionListener(jTextField,label);

        // jButton.addActionListener(confirmActionListener);
        jButton.addActionListener(new InsertRow(jTable, jPanel2));
        remove.addActionListener(new RemoveRow(jTable));
        cancel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // frame.dispose();
                System.exit(0);
            }
        });
    }
}

class ConfirmActionListener implements ActionListener {
    JLabel jLabel;
    JTextField jTextField;

    public ConfirmActionListener(JTextField jTextField, JLabel jLabel) {
        this.jLabel = jLabel;
        this.jTextField = jTextField;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String name = jTextField.getText();

        jLabel.setText("hello! " + name);
        System.out.println(e.getActionCommand());

    }
}

class InsertRow implements ActionListener {
    JTable jTable;
    JPanel jPanel;

    public InsertRow(JTable jTable, JPanel jPanel) {
        this.jTable = jTable;
        this.jPanel = jPanel;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        JTextField jTextField1 = (JTextField) jPanel.getComponent(1);
        JTextField jTextField2 = (JTextField) jPanel.getComponent(3);
        JTextField jTextField3 = (JTextField) jPanel.getComponent(5);
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        Object[] obj={jTextField1.getText(),jTextField2.getText(),jTextField3.getText()};
        defaultTableModel.addRow(obj);

        //print.r(jTextField.getText());
    }
}

class RemoveRow implements ActionListener {
    JTable jTable;

    public RemoveRow(JTable jTable) {
        this.jTable = jTable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int idx = jTable.getSelectedRow();
        if (idx == -1) return;
        DefaultTableModel defaultTableModel = (DefaultTableModel) jTable.getModel();
        // jTable.remove(idx);
        defaultTableModel.removeRow(idx);
    }
}

class PrintTable implements ActionListener {
    JTable jTable;

    public PrintTable(JTable jTable) {
        this.jTable = jTable;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TableModel tableModel = jTable.getModel();
        for (int i = 0; i < tableModel.getColumnCount(); i++) {
            print.f("%5s\t", tableModel.getColumnName(i));
        }
        print.r("");
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            for (int j = 0; j < tableModel.getColumnCount(); j++) {
                Object data = tableModel.getValueAt(i, j);
                print.f("%5s\t", data.toString());
            }
            print.r("");
        }
    }
}