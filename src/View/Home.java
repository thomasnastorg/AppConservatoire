package View;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import static Controleur.DataSQL.getUsers;

public class Home {

    private JPanel JPmain;
    private JButton modifierButton;
    private JButton supprimerButton;
    private JTextField textField1;
    private JTable showClient;
    private JTable showCours;

    private void ReciveAd(){
        DefaultTableModel model = new DefaultTableModel();
        Object[] columnsName = new Object[6];
        columnsName[0] = "Nom";
        columnsName[1] = "Prénom";
        columnsName[2] = "Tel";
        columnsName[3] = "Adresse";
        columnsName[4] = "Mail";
        columnsName[5] = "Niveaux";


        model.setColumnIdentifiers(columnsName);

        Object[] rowData = new Object[6];

        for (int i = 0; i < getUsers().size(); i++){
            rowData[0] = getUsers().get(i).getNom();
            rowData[1] = getUsers().get(i).getPrenom();
            rowData[2] = getUsers().get(i).getTel();
            rowData[3] = getUsers().get(i).getAdresse();
            rowData[4] = getUsers().get(i).getMail();
            rowData[5] = getUsers().get(i).getNiveaux();
            model.addRow(rowData);
        }

        //System.out.println(getUsers().size());
        //System.out.println(getUsers().get(1));

        try {
            showClient.setModel(model);
        }catch (Exception h){
            System.out.println(h);
        }
    }
    public JPanel getRootPanel(){
        return JPmain;
    }

    public Home(){
        ReciveAd();
        showClient.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                num =  showClient.getValueAt(showClient.getSelectedRow(),0).toString();
                nom =  showClient.getValueAt(showClient.getSelectedRow(),1).toString();
                prenom =  showClient.getValueAt(showClient.getSelectedRow(),2).toString();
                adrss =  showClient.getValueAt(showClient.getSelectedRow(),3).toString();
                System.out.println(num+ " " + nom +" " + prenom +" " + adrss);

                try {
                    showClient.setModel(comptClient(Integer.parseInt(num)));
                }catch (Exception h){
                    System.out.println(h);
                }
            }
        });
    }
}
