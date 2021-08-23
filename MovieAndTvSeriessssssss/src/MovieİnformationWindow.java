
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class MovieİnformationWindow extends javax.swing.JFrame {
    private String MovieSelected;
    private final ArrayList<String> movinfoList= new ArrayList();
    /**
     * Creates new form İnformationWindow
     */
    public MovieİnformationWindow(String MovieSelected) throws FileNotFoundException {
        initComponents();
        readFile(movinfoList,"İnformation.txt");
        this.MovieSelected=MovieSelected;
     
        if(MovieSelected.equals("1"))
        {
            jLabel11.setText(movinfoList.get(0));
            jLabel12.setText(movinfoList.get(1));
            jLabel13.setText(movinfoList.get(2));
            jLabel14.setText(movinfoList.get(3));
            jLabel15.setText(movinfoList.get(4));
            jLabel16.setText(movinfoList.get(5));
            jLabel17.setText(movinfoList.get(6));
            jLabel18.setText(movinfoList.get(7));
            jLabel19.setText(movinfoList.get(8));
            jLabel20.setText(movinfoList.get(9));
        }
        else if(MovieSelected.equals("2"))
        {
            jLabel11.setText(movinfoList.get(10));
            jLabel12.setText(movinfoList.get(11));
            jLabel13.setText(movinfoList.get(12));
            jLabel14.setText(movinfoList.get(13));
            jLabel15.setText(movinfoList.get(14));
            jLabel16.setText(movinfoList.get(15));
            jLabel17.setText(movinfoList.get(16));
            jLabel18.setText(movinfoList.get(17));
            jLabel19.setText(movinfoList.get(18));
            jLabel20.setText(movinfoList.get(19));
        }
        else if(MovieSelected.equals("3"))
        {
            jLabel11.setText(movinfoList.get(20));
            jLabel12.setText(movinfoList.get(21));
            jLabel13.setText(movinfoList.get(22));
            jLabel14.setText(movinfoList.get(23));
            jLabel15.setText(movinfoList.get(24));
            jLabel16.setText(movinfoList.get(25));
            jLabel17.setText(movinfoList.get(26));
            jLabel18.setText(movinfoList.get(27));
            jLabel19.setText(movinfoList.get(28));
            jLabel20.setText(movinfoList.get(29));
        }
        else if(MovieSelected.equals("4"))
        {
            jLabel11.setText(movinfoList.get(30));
            jLabel12.setText(movinfoList.get(31));
            jLabel13.setText(movinfoList.get(32));
            jLabel14.setText(movinfoList.get(33));
            jLabel15.setText(movinfoList.get(34));
            jLabel16.setText(movinfoList.get(35));
            jLabel17.setText(movinfoList.get(36));
            jLabel18.setText(movinfoList.get(37));
            jLabel19.setText(movinfoList.get(38));
            jLabel20.setText(movinfoList.get(39));
        }
        else if(MovieSelected.equals("5"))
        {
            jLabel11.setText(movinfoList.get(40));
            jLabel12.setText(movinfoList.get(41));
            jLabel13.setText(movinfoList.get(42));
            jLabel14.setText(movinfoList.get(43));
            jLabel15.setText(movinfoList.get(44));
            jLabel16.setText(movinfoList.get(45));
            jLabel17.setText(movinfoList.get(46));
            jLabel18.setText(movinfoList.get(47));
            jLabel19.setText(movinfoList.get(48));
            jLabel20.setText(movinfoList.get(49));
        }
        else if(MovieSelected.equals("6"))
        {
            jLabel11.setText(movinfoList.get(50));
            jLabel12.setText(movinfoList.get(51));
            jLabel13.setText(movinfoList.get(52));
            jLabel14.setText(movinfoList.get(53));
            jLabel15.setText(movinfoList.get(54));
            jLabel16.setText(movinfoList.get(55));
            jLabel17.setText(movinfoList.get(56));
            jLabel18.setText(movinfoList.get(57));
            jLabel19.setText(movinfoList.get(58));
            jLabel20.setText(movinfoList.get(59));
        }
        else if(MovieSelected.equals("7"))
        {
            jLabel11.setText(movinfoList.get(60));
            jLabel12.setText(movinfoList.get(61));
            jLabel13.setText(movinfoList.get(62));
            jLabel14.setText(movinfoList.get(63));
            jLabel15.setText(movinfoList.get(64));
            jLabel16.setText(movinfoList.get(65));
            jLabel17.setText(movinfoList.get(66));
            jLabel18.setText(movinfoList.get(67));
            jLabel19.setText(movinfoList.get(68));
            jLabel20.setText(movinfoList.get(69));
        }
        else if(MovieSelected.equals("8"))
        {
            jLabel11.setText(movinfoList.get(70));
            jLabel12.setText(movinfoList.get(71));
            jLabel13.setText(movinfoList.get(72));
            jLabel14.setText(movinfoList.get(73));
            jLabel15.setText(movinfoList.get(74));
            jLabel16.setText(movinfoList.get(75));
            jLabel17.setText(movinfoList.get(76));
            jLabel18.setText(movinfoList.get(77));
            jLabel19.setText(movinfoList.get(78));
            jLabel20.setText(movinfoList.get(79));
        }
        else if(MovieSelected.equals("9"))
        {
            jLabel11.setText(movinfoList.get(80));
            jLabel12.setText(movinfoList.get(81));
            jLabel13.setText(movinfoList.get(82));
            jLabel14.setText(movinfoList.get(83));
            jLabel15.setText(movinfoList.get(84));
            jLabel16.setText(movinfoList.get(85));
            jLabel17.setText(movinfoList.get(86));
            jLabel18.setText(movinfoList.get(87));
            jLabel19.setText(movinfoList.get(88));
            jLabel20.setText(movinfoList.get(89));
        }
        else if(MovieSelected.equals("10"))
        {
            jLabel11.setText(movinfoList.get(90));
            jLabel12.setText(movinfoList.get(91));
            jLabel13.setText(movinfoList.get(92));
            jLabel14.setText(movinfoList.get(93));
            jLabel15.setText(movinfoList.get(94));
            jLabel16.setText(movinfoList.get(95));
            jLabel17.setText(movinfoList.get(96));
            jLabel18.setText(movinfoList.get(97));
            jLabel19.setText(movinfoList.get(98));
            jLabel20.setText(movinfoList.get(99));
        } 
    }



    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel21 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("İdMovie");

        jLabel2.setText("Name");

        jLabel3.setText("Category");

        jLabel4.setText("Release Date");

        jLabel5.setText("Country");

        jLabel6.setText("Rating");

        jLabel7.setText("Time");

        jLabel8.setText("Classification");

        jLabel9.setText("Subtitle");

        jLabel10.setText("Dubbing");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel15.setText("jLabel15");

        jLabel16.setText("jLabel16");

        jLabel17.setText("jLabel17");

        jLabel18.setText("jLabel18");

        jLabel19.setText("jLabel19");

        jLabel20.setText("jLabel20");

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel21.setText("Movie İnformation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel10))
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel20)
                            .addComponent(jLabel11)
                            .addComponent(jLabel12)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(jLabel18)
                            .addComponent(jLabel19)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(159, 159, 159)
                        .addComponent(jLabel21)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21)
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel13))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel14))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel15))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel16))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel17))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel18))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel19))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jLabel20))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setVisible(false);
        dispose();        // TODO add your handling code here:,
        try {
            new MovieWindow().setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(MovieİnformationWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    /**
     * @param args the command line arguments
     */
  
    private static void readFile(List<String> originalList, String fileName) throws FileNotFoundException {
        List<String> candidateList = new ArrayList<>(1000);
        Scanner fileInput = new Scanner(new File(fileName));
        while (fileInput.hasNextLine()) {
            candidateList.add(fileInput.nextLine());
        }
        originalList.addAll(candidateList);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
