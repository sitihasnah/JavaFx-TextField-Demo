//Demonstrate a text field
package textfielddemo;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


/**
 *
 * @author Siti Hasnah
 */
public class TextFieldDemo implements ActionListener {

    JTextField myTF;
    JLabel myLabel;
    
    TextFieldDemo(){
        //1. create a new JFrame container
        JFrame myFrame = new JFrame("A TextField Example");
        
        //2. Specify FlowLayout for the layout manager
        myFrame.setLayout(new FlowLayout());
        
        //3. Give the frame an inital size
        myFrame.setSize(400, 200);
        
        //4. Terminate the programe when we close the apps
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //5. Create a text field instance
        myTF =new JTextField(10);
        
        //6. Add action listener
        myTF.addActionListener(this);
        
        
        //7. Add the button to content pane
        myFrame.add(myTF);
     
        
        //8. create a text-based panel
        myLabel =  new JLabel("");
        
        //9. Add the label to the frame
        myFrame.add(myLabel);
        
        //10. Display the frame
        myFrame.setVisible(true);
        
        
    }
    //Handle the button
    public void actionPerformed(ActionEvent ae) {
        //obtain the current text and display it in a label
        myLabel.setText("Current contents: " + myTF.getText());
        
        
    }
    
    public static void main(String[] args) {
       //create the frame on the event dispatching thread
       SwingUtilities.invokeLater(new Runnable () {
           public void run() {
               new TextFieldDemo();
           }
       });
    }
    
}

      
    
    