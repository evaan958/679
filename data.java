//Evaan J 
//Feb 7
//Final project - The Game of Life

public class data extends javax.swing.JFrame {

    //Creating an object
    gameGrid gameGrid ;


    
    //Creating a public static int 
    int userData ;
    int i =1;
    int w = 1;
 
    
    /**
     * Creates new form data
     */
    public data() {
        initComponents();
        gameGrid = new gameGrid ();
    }
    public data(gameGrid gameGrid1) {
        
        gameGrid = gameGrid1;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        output = new javax.swing.JLabel();
        input = new javax.swing.JTextField();
        dataButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        output.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        output.setText("Choose a number of rows");

        input.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

        dataButton.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        dataButton.setText("Next");
        dataButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(output)
                        .addGap(0, 218, Short.MAX_VALUE))
                    .addComponent(input)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(dataButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(output)
                .addGap(18, 18, 18)
                .addComponent(input, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(dataButton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void dataButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        
 

        //Parsing the data and setting it equal to an int
        userData = Integer.parseInt(input.getText());

        //Calling to run a method and sending the value of suerData
        gameGrid.data(userData);

        //Setting the jTextfeild to have no text
        input.setText("");

        //creating a series of if statements that help cordinate the questions asked for the user
        if(i==1){
            outputSet("Choose a number of columns");
            gameGrid.rowInput();
            System.out.println(gameGrid.rowValue);

        }else if (i==2){
            outputSet("Choose a number of organisms");
            gameGrid.columnInput();
            System.out.println(gameGrid.colValue);

        }else if (i==3){
            outputSet("How many generations would you like to see?");
            gameGrid.numOrganism();
            System.out.println(gameGrid.numValue);

        }else if (i==4){
            
            // w is a variable that increses when both row and column questions are asked for each organism
            outputSet("What is the row of organism " + (w) +" ?");
            gameGrid.gen();
            System.out.println(gameGrid.genValue);

        }else if (i==5){
            outputSet("What is the column of organism " + (w) +" ?");
            gameGrid.rowUpdate();
            System.out.println(gameGrid.rowUpdate);
            w++;

        }else if ( (i%2==0 && i>=6) ){
            outputSet("What is the row of organism " + (w) +" ?");
            gameGrid.colUpdate();
            System.out.println(gameGrid.colUpdate);

        }else if ( i%2==1 && i>=7){
            outputSet("What is the column of organism " + (w) +" ?");
            gameGrid.rowUpdate();
            System.out.println(gameGrid.rowUpdate);
            w++;
        }
//        }else if (i>= 4+(2*gameGrid.numValue)){
//            
//            this.setVisible(false);
//
//            System.out.println("Hello2");
//            gameGrid.lead();
//            
//        }

        if (gameGrid.numValue>0 && gameGrid.w>=gameGrid.numValue){
            this.setVisible(false);

            System.out.println("Hello2");
            gameGrid.lead();

        }
        i++;
            
        
    }                                          

    public void outputSet (String outputText){
        
        output.setText(outputText);
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(data.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new data().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton dataButton;
    private javax.swing.JTextField input;
    private javax.swing.JLabel output;
    // End of variables declaration                   


}
