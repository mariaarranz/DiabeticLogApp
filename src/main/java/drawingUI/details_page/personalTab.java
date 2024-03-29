package drawingUI.details_page;

import javax.swing.*;
import java.awt.*;

public class personalTab extends JPanel{

    JLabel fnamelabel = new JLabel("First Name: ");
    JTextField fnametext = new JTextField(20);

    JLabel lnamelabel = new JLabel("Last Name: ");
    JTextField lnametext = new JTextField(20);

    JLabel emaillabel = new JLabel("Email: ");
    JTextField emailtext = new JTextField(20);

    JLabel addresslabel = new JLabel("Address: ");
    JTextField addresstext = new JTextField(20);

    JLabel phonelabel = new JLabel("Emergency Phone: ");
    JTextField phonetext = new JTextField(20);

    public personalTab(){
        // https://www.codejava.net/java-se/swing/jpanel-basic-tutorial-and-examples
        JPanel newPanel = new JPanel(new GridBagLayout());
        GridBagConstraints constraints = new GridBagConstraints();
        constraints.fill = GridBagConstraints.HORIZONTAL;
        constraints.insets = new Insets(10, 10, 10, 10);

        //First Name Field -----------------------------------------------------------------------------
        constraints.gridx = 0;
        constraints.gridy = 0;
        newPanel.add(fnamelabel, constraints);

        constraints.gridx = 1;
        newPanel.add(fnametext, constraints);

        //Last Name Field -----------------------------------------------------------------------------
        constraints.gridx = 0;
        constraints.gridy = 1;
        newPanel.add(lnamelabel, constraints);

        constraints.gridx = 1;
        newPanel.add(lnametext, constraints);

        //Email Field -----------------------------------------------------------------------------
        constraints.gridx = 0;
        constraints.gridy = 2;
        newPanel.add(emaillabel, constraints);

        constraints.gridx = 1;
        newPanel.add(emailtext, constraints);

        //Address Field -----------------------------------------------------------------------------
        constraints.gridx = 0;
        constraints.gridy = 3;
        newPanel.add(addresslabel, constraints);

        constraints.gridx = 1;
        newPanel.add(addresstext, constraints);

        //Phone Number Field -----------------------------------------------------------------------------
        constraints.gridx = 0;
        constraints.gridy = 4;
        newPanel.add(phonelabel, constraints);

        constraints.gridx = 1;
        newPanel.add(phonetext, constraints);

        add(newPanel);
    }

}
