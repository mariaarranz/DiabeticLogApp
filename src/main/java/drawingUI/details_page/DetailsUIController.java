package drawingUI.details_page;

import drawingUI.details_page.*;
import drawingUI.logtypePanel;
import drawingUI.main_panels.enter_details_Panel;

import javax.swing.*;

public class DetailsUIController
{
    personalTab ptab = new personalTab();
    diabetesTab dtab = new diabetesTab();
    doctorTab doctab = new doctorTab();
    detailsPanel dpanel = new detailsPanel(ptab, dtab, doctab);

    buttonPanel butpanel = new buttonPanel();

    logtypePanel lpanel = new logtypePanel();

    public DetailsUIController(JFrame frame)
    {
        frame.getContentPane().add(new enter_details_Panel(dpanel, butpanel, lpanel));
    }


}
