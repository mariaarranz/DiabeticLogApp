

import drawingUI.calendar_page.CalendarUIController;
import drawingUI.calendar_page.DatePicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    static GraphicsConfiguration gc; // Class field containing config info

    public static void main(String[] args) {
        //JFrame email_frame= new JFrame(gc); // Create a new JFrame
        //email_frame.setSize(500,300);

       // EmailUIController uiemail = new EmailUIController(email_frame);

        //email_frame.setVisible(true);
        // This next line closes the program when the frame is closed
       // email_frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //////////////////////////////////////////////////////////////////////////////////////////////////////

        /////////////////////////////////////////////////////////////////////////////////////////////////////////
        JFrame cframe= new JFrame(gc); // Create a new JFrame
        cframe.setSize(600,700);

        CalendarUIController uical = new CalendarUIController(cframe);

        cframe.setVisible(true);
        //This next line closes the program when the frame is closed
        cframe.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
