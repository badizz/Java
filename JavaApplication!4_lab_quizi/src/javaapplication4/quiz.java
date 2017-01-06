package javaapplication4;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class quiz extends JFrame 
{
    JButton[] buttons = new JButton[12];
    public JTextField tf;
    
    quiz()
    {
        tf = new JTextField(15);
        int i=0 ;
        
        for(i = 0; i < 10; i++) {
            buttons[i] = new JButton(String.valueOf(i));
        }
        
        buttons[10]= new JButton("Call");
        buttons[11]= new JButton("End");
       
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        
        MyEventHandler meh = new MyEventHandler();
        
        c.add(tf);
        
        for(i=0 ; i<12 ; i++)
             c.add(buttons[i]);

        for(i=0 ; i<12 ; i++)
             buttons[i].addActionListener(meh);

        
        
    }
    
    
    public class MyEventHandler implements ActionListener
            {
                public void actionPerformed(ActionEvent ae)
                {
                    if(ae.getSource()==buttons[10])
                    {
                        
                           if(Integer.parseInt(tf.getText()) > 0 )
                           {
                                if(tf.getText() != "Call end...");
                                    tf.setText(tf.getText()+" calling...");
                           }
                           else
                           {
                               tf.setText("");
                           }
                               
                               
                       
                        
                    }
                    else if(ae.getSource()==buttons[11])
                    {
                        tf.setText(""); 
                        tf.setText("Call end...");
                    }
                    else
                        for(int j=0 ;  j<10 ; j++)
                        {
                            if(ae.getSource()==buttons[j])
                               if(tf.getText()!=null)
                               {
                                   if(tf.getText().equals("Call end..."))
                                       tf.setText("");
                                   tf.setText(tf.getText()+j);
                               }
//                               else if(tf.getText().equals("Call end..."))
//                               {
//                                   continue;
//                               }
                        }
                    
                }
            }
    
    
    public static void main(String[] args) 
    {
       quiz q = new quiz();
       q.setSize(190,200);
       q.setVisible(true);
       q.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
    }
    
}
