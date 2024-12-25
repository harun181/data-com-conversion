package Data_Comes;

import java.awt.event.KeyEvent;
import java.lang.Math; 
import java.util.*;
import java.io.*;

import javax.swing.JOptionPane;
public class Data_Com extends javax.swing.JFrame {
      
     String operation;
     String A;
     String B;
     private Object math;
    public Data_Com() {
        initComponents();
    }

    @SuppressWarnings("unchecked")

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();
        convert = new javax.swing.JButton();
        result1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        s2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        s3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        result = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        s1 = new javax.swing.JTextField();
        convert1 = new javax.swing.JButton();
        convert2 = new javax.swing.JButton();
        convert3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(null);

        reset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 153, 51));
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        jPanel2.add(reset);
        reset.setBounds(722, 363, 160, 50);

        convert.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        convert.setForeground(new java.awt.Color(0, 51, 255));
        convert.setText("CALCULATE");
        convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convertActionPerformed(evt);
            }
        });
        jPanel2.add(convert);
        convert.setBounds(510, 360, 170, 50);

        result1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(result1);
        result1.setBounds(110, 282, 170, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 0, 51));
        jLabel2.setText("OUTPUT :");
        jPanel2.add(jLabel2);
        jLabel2.setBounds(10, 267, 70, 51);

        s2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        s2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                s2ActionPerformed(evt);
            }
        });
        jPanel2.add(s2);
        s2.setBounds(110, 214, 300, 40);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 255));
        jLabel4.setText(" INPUT :");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(10, 210, 90, 51);

        s3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(s3);
        s3.setBounds(570, 160, 300, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 255));
        jLabel3.setText("FLAG :");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(480, 150, 70, 51);

        combobox.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        combobox.setForeground(new java.awt.Color(204, 0, 153));
        combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an Option", "Hamming Distance", "parity check", "Bit Stuffing", "Bit Destuffing", "Character Stuffing", "Character Destuffing" }));
        jPanel2.add(combobox);
        combobox.setBounds(210, 100, 460, 40);

        jLabel1.setBackground(new java.awt.Color(0, 0, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 0, 255));
        jLabel1.setText("                                  B D C L C I");
        jPanel2.add(jLabel1);
        jLabel1.setBounds(230, 30, 390, 60);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARC\\Documents\\Tutul\\Versity\\DCom\\Data_Com_Conversation\\image\\logo.png")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel2.add(jLabel6);
        jLabel6.setBounds(730, 0, 150, 140);

        jPanel2.add(jLabel5);
        jLabel5.setBounds(10, 0, 150, 150);

        result.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(result);
        result.setBounds(298, 282, 300, 40);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 255));
        jLabel7.setText(" INPUT :");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(10, 150, 90, 51);

        s1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jPanel2.add(s1);
        s1.setBounds(110, 160, 300, 40);

        convert1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        convert1.setForeground(new java.awt.Color(0, 51, 255));
        convert1.setText("Hamming Dist");
        convert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convert1ActionPerformed(evt);
            }
        });
        jPanel2.add(convert1);
        convert1.setBounds(70, 360, 170, 50);

        convert2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        convert2.setForeground(new java.awt.Color(0, 51, 255));
        convert2.setText("Parity Check");
        convert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convert2ActionPerformed(evt);
            }
        });
        jPanel2.add(convert2);
        convert2.setBounds(300, 360, 170, 50);

        convert3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        convert3.setForeground(new java.awt.Color(0, 51, 255));
        convert3.setText("Bit Stuffing");
        convert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                convert3ActionPerformed(evt);
            }
        });
        jPanel2.add(convert3);
        convert3.setBounds(700, 280, 170, 50);

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\ARC\\Documents\\Tutul\\Versity\\DCom\\Data_Com_Conversation\\image\\bg.png")); // NOI18N
        jLabel8.setText("jLabel8");
        jPanel2.add(jLabel8);
        jLabel8.setBounds(0, 0, 890, 450);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 890, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }

    private void s2ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {
      s3.setText(null);
          s2.setText(null);
          result1.setText(null);
          s1.setText(null);
          result.setText(null);
          
         
          
    }

    private void convertActionPerformed(java.awt.event.ActionEvent evt) {
          
        
           if(combobox.getSelectedItem().equals("Hamming Distance"))
           {
                if((s2.getText().equals("")) || (s1.getText().equals("")) )
      {
          JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
                else
                {
               
          String str1 =s1.getText();
           String str2 =s2.getText();
            if(str1.length()!=str2.length())
      {
          JOptionPane.showMessageDialog(null, "You must enter value same length",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
            else
            {
          int distance = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++;
            }
        }
        String distance1 = Integer.toString(distance);
        result1.setText("Humming Distance");
        result.setText(distance1);
        
           }
           }
           }
            
  if(combobox.getSelectedItem().equals("parity check"))
           {
               if((s1.getText().equals("")) )
       {
           JOptionPane.showMessageDialog(null, "You must enter value to compute input 1 ",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
       }
               else
               {
 int a=Integer.parseInt(s1.getText());
 
      
      
       
  String str3 =Integer.toBinaryString(a);
   s2.setText("Binary: "+str3);
   int counter = 0;
   
          for (int i = 0; i < str3.length(); i++) 
          {
            if (str3.charAt(i) == '1')
            {
                counter++;
            }
          }
            if(counter%2==0)
            {
                result1.setText("Parity");
           result.setText("Even Parity");
          
           } 
            else
                
            {
                result1.setText("Parity");
                result.setText("Odd parity");
                
            }
           }
           }
   if(combobox.getSelectedItem().equals("Bit Stuffing"))
  {
      if((s1.getText().equals("")))
      {
          JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
      else
      {
           String flag=s3.getText();
       String data = s1.getText();
        String res = new String();
        String out=new String();
          int counter = 0,i;
           for(i=0;i<data.length();i++)
           {
                 if(data.charAt(i) == '1')
                        {
                            counter++;
                            res = res + data.charAt(i);
                        }
                   else
                        {
                            res = res + data.charAt(i);
                            counter = 0;
                        }
                  if(counter == 5)
                        {
                            res = res + '0';
                            counter = 0;
                        }
           }
           result1.setText("Bit Stuffing");
           result.setText(flag+res+flag);
  }
  }
   if(combobox.getSelectedItem().equals("Bit Destuffing"))
   {
       if((s1.getText().equals("")) || (s3.getText().equals("")) )
       {
           JOptionPane.showMessageDialog(null, "You must enter value to compute input 1 and flag ",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
       }
     
        else
        {
            
       String res = s1.getText();
       String flag=s3.getText();
        //String res = new String();
        String out=new String();
       int counter=0,i;
        for(i=0;i<res.length();i++)
                {
                   
                    if(res.charAt(i) == '1')
                        {
                            
                            counter++;
                            out = out + res.charAt(i);
                           
                        }
                    else
                        {
                             out = out + res.charAt(i);
                             counter = 0;
                        }
                   if(counter == 5)
                        {
                              if((i+2)!=res.length())
                              out = out + res.charAt(i+2);
                              else
                              out=out + '1';
                              i=i+2;
                              counter = 1;
                        }
               }
         result1.setText("Bit Destuffing");
        result.setText(flag+out+flag);
   }
   }
   if(combobox.getSelectedItem().equals("Character Stuffing"))
  {
      if((s1.getText().equals("")))
      {
          JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
      else
      {
           String flag=s3.getText();
       String data = s1.getText();
       String data1 = s2.getText();
        String res = new String();
        String out=new String();
          int i,j;
           for(i=0,j=0;i<data.length();i++)
           {
                 if(data.charAt(i) ==data1.charAt(j))
                        {
                           
                            res = res + data.charAt(i);
                             res = res + 'k';
                        }
                   else
                        {
                            res = res + data.charAt(i);
                            
                        }
                  
           }
           result1.setText("Character Stuffing");
           result.setText(flag+res+flag);
  }
  }
   if(combobox.getSelectedItem().equals("Character Destuffing"))
  {
      if(!"".equals(s1.getText()) || !"".equals(s2.getText()) || !"".equals(s3.getText()))
         
      {
          JOptionPane.showMessageDialog(null, "wait till update again. This option will work after next update. we are trying to add this button in future. thank you",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
      else if((s1.getText().equals("")) && (s2.getText().equals("")) && (s3.getText().equals("")))
      {
          JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
  }
  
    }

    private void convert1ActionPerformed(java.awt.event.ActionEvent evt) {
         
        
           if(combobox.getSelectedItem().equals("Hamming Distance"))
           {
               if((s2.getText().equals("")) )
      {
          JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
               else
               {
                
          String str1 =s1.getText();
           String str2 =s2.getText();
            if(str1.length()!=str2.length())
      {
          JOptionPane.showMessageDialog(null, "You must enter value same length",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
      }
            else
            {
          int distance = 0;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                distance++;
            }
        }
        String distance1 = Integer.toString(distance);
        result1.setText("Humming Distance");
        result.setText(distance1);
        
           }
           }
           }
    }

    private void convert2ActionPerformed(java.awt.event.ActionEvent evt) {
 if(combobox.getSelectedItem().equals("parity check"))
           {
                if((s1.getText().equals("")) )
       {
           JOptionPane.showMessageDialog(null, "You must enter value to compute input 1 ",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
       }
                else
                {
 int a=Integer.parseInt(s1.getText());
  
  String str3 =Integer.toBinaryString(a);
   s2.setText("Binary: "+str3);
   int counter = 0;
   
          for (int i = 0; i < str3.length(); i++) 
          {
            if (str3.charAt(i) == '1')
            {
                counter++;
            }
          }
            if(counter%2==0)
            {
               
                 result1.setText("Parity Check");
           result.setText("Even Parity");
          
           } 
            else
            {
                result1.setText("Parity Check");
                result.setText("Odd parity");
                
            }
           }   
           }
    }

    private void convert3ActionPerformed(java.awt.event.ActionEvent evt) {
  if(combobox.getSelectedItem().equals("Bit Stuffing"))
  {
       if((s1.getText().equals("")) && (s3.getText().equals("")) )
       {
           JOptionPane.showMessageDialog(null, "You must enter value to compute",
                  "DST System",JOptionPane.INFORMATION_MESSAGE);
       }
       else
       {
       String data = s1.getText();
        String res = new String();
        String out=new String();
          int counter = 0,i;
           for(i=0;i<data.length();i++)
           {
                 if(data.charAt(i) == '1')
                        {
                            counter++;
                            res = res + data.charAt(i);
                        }
                   else
                        {
                            res = res + data.charAt(i);
                            counter = 0;
                        }
                  if(counter == 5)
                        {
                            res = res + '0';
                            counter = 0;
                        }
           }
           result1.setText("Bit Stuffing");
           result.setText(res);
           
       }
  }
  
		
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
 Scanner sn=new Scanner(System.in);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Data_Com().setVisible(true);
            }
        });
    }

    private javax.swing.JComboBox<String> combobox;
    private javax.swing.JButton convert;
    private javax.swing.JButton convert1;
    private javax.swing.JButton convert2;
    private javax.swing.JButton convert3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JButton reset;
    private javax.swing.JTextField result;
    private javax.swing.JTextField result1;
    private javax.swing.JTextField s1;
    private javax.swing.JTextField s2;
    private javax.swing.JTextField s3;
}
