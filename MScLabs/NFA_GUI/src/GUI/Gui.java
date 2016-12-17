package GUI;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Gui extends javax.swing.JFrame {
    
    static Integer [][][] t = {
            {{0,1},{0,2},{0,3},{0,4},{0,5},{0,6},{0,7},{0,8},{0,9},{0,10}},
            {{11},{1},{1},{1},{1},{1},{1},{1},{1},{1}},
            {{2},{11},{2},{2},{2},{2},{2},{2},{2},{2}},
            {{3},{3},{11},{3},{3},{3},{3},{3},{3},{3}},
            {{4},{4},{4},{11},{4},{4},{4},{4},{4},{4}},
            {{5},{5},{5},{5},{11},{5},{5},{5},{5},{5}},
            {{6},{6},{6},{6},{6},{11},{6},{6},{6},{6}},
            {{7},{7},{7},{7},{7},{7},{11},{7},{7},{7}},
            {{8},{8},{8},{8},{8},{8},{8},{11},{8},{8}},
            {{9},{9},{9},{9},{9},{9},{9},{9},{11},{9}},
            {{10},{10},{10},{10},{10},{10},{10},{10},{10},{11}},
            {{11},{11},{11},{11},{11},{11},{11},{11},{11},{11}},
        }; 
    
    static String fileContent = "";
    static String[] inputStrings = null;
    int currentStringIndex = 0;
    static String currentString;
    
    public Gui() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        textarea = new javax.swing.JTextArea();
        nextChar = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        nextString = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        Open = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();

        fileChooser.setFileFilter(new MyCustomFilter());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textarea.setColumns(20);
        textarea.setRows(5);
        jScrollPane1.setViewportView(textarea);

        nextChar.setText("Next Char");
        nextChar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextCharActionPerformed(evt);
            }
        });

        jTextField2.setText("jTextField2");

        nextString.setText("Next String");
        nextString.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextStringActionPerformed(evt);
            }
        });

        jTextField1.setText("jTextField1");

        jMenu1.setText("File");

        Open.setText("Open");
        Open.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenActionPerformed(evt);
            }
        });
        jMenu1.add(Open);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jMenu1.add(Exit);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nextString, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nextChar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2)
                            .addComponent(jTextField1))))
                .addGap(1753, 1753, 1753))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nextChar, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jTextField1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField2)
                    .addComponent(nextString, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                .addContainerGap(485, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    class MyCustomFilter extends javax.swing.filechooser.FileFilter {
        @Override
        public boolean accept(File file) {
            // Allow only directories, or files with ".txt" extension
            return file.isDirectory() || file.getAbsolutePath().endsWith(".txt");
        }
        @Override
        public String getDescription() {
            // This description will be displayed in the dialog,
            // hard-coded = ugly, should be done via I18N
            return "Text documents (*.txt)";
        }
    } 
    
    private void init() {
}
 
    private void nextCharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextCharActionPerformed
        
        List<String> lista = new ArrayList<>();              
        
        String[] inputStrings = fileContent.split("#");        
        for(String y : inputStrings) {
            lista.add(y);
        }
            
        for(String x : lista) {
            int n = 0;
            List<Integer> stan = new ArrayList<>();
            stan.add(0);
            
        for(char c : x.toCharArray()) {         
            switch(c){
                case '0':
                    n=0;
                    break;
                case '1':
                    n=1;
                    break;
                case '2':
                    n=2;
                    break;
                case '3':
                    n=3;
                    break;
                case '4':
                    n=4;
                    break;
                case '5':
                    n=5;
                    break;
                case '6':
                    n=6;
                    break;
                case '7':
                    n=7;
                    break;
                case '8':
                    n=8;
                    break;
                case '9':
                    n=9;
                    break;
                default:
                    System.out.println("Podałeś nieprawidłowy znak!");
                    break;
            }
                
            List<Integer> stanTemp = new ArrayList<>();
            for(int st : stan){
                stanTemp.addAll(Arrays.asList(t[st][n]));
            }
            
            stan=stanTemp;
            jTextField2.setText("Znak: " + c + ", Stan po: " + stan);
        }  
        
        if(stan.contains(11)) {
            jTextField2.setText("Zdanie " + x + " jest akceptowalne");
        }
        else {
            jTextField2.setText("Zdanie " + x + " nie jest akceptowalne");
        }  
    }


    }//GEN-LAST:event_nextCharActionPerformed

    private void OpenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenActionPerformed
        int returnVal = fileChooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            try {
                // What to do with the file, e.g. display it in a TextArea
                textarea.read( new FileReader( file.getAbsolutePath() ), null );
                fileContent = textarea.getText();
                inputStrings = fileContent.split("#");
                currentString = inputStrings[currentStringIndex];
                jTextField2.setText("Obecnie przetwarzany String to: " + currentString);
            } catch (IOException ex) {
                System.out.println("Problem z dostepem do pliku " + file.getAbsolutePath());
            }
        } else {
            System.out.println("File access cancelled by user.");
        }
    }//GEN-LAST:event_OpenActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void nextStringActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextStringActionPerformed
        
        if (currentStringIndex >= inputStrings.length) {
            currentStringIndex = 0;
        } else {
            currentStringIndex++;
        }
        
        currentString = inputStrings[currentStringIndex];
        
        jTextField2.setText("Obecnie przetwarzany String to: " + currentString);
    }//GEN-LAST:event_nextStringActionPerformed

    public static void main(String args[]) {
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Gui().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Open;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton nextChar;
    private javax.swing.JButton nextString;
    private javax.swing.JTextArea textarea;
    // End of variables declaration//GEN-END:variables
}