
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
public class TvSeriesİnformationWindow extends javax.swing.JFrame {
    private String TvSeriesSelected;
    private final ArrayList<String> tvserinfoList= new ArrayList();

    /**
     * Creates new form TvSeriesİnformationWindow
     */
    public TvSeriesİnformationWindow(String TvSeriesSelected) throws FileNotFoundException {
        initComponents();
        readFile(tvserinfoList,"İnformation.txt");
        this.TvSeriesSelected = TvSeriesSelected;
        
        if(TvSeriesSelected.equals("1"))
        {
            jLabel11.setText(tvserinfoList.get(100));
            jLabel12.setText(tvserinfoList.get(101));
            jLabel13.setText(tvserinfoList.get(102));
            jLabel14.setText(tvserinfoList.get(103));
            jLabel15.setText(tvserinfoList.get(104));
            jLabel16.setText(tvserinfoList.get(105));
            jLabel17.setText(tvserinfoList.get(106));
            jLabel18.setText(tvserinfoList.get(107));
            jLabel19.setText(tvserinfoList.get(108));
            jLabel20.setText(tvserinfoList.get(109));
            jLabel21.setText(tvserinfoList.get(110));
        }
        else if(TvSeriesSelected.equals("2"))
        {
            jLabel11.setText(tvserinfoList.get(111));
            jLabel12.setText(tvserinfoList.get(112));
            jLabel13.setText(tvserinfoList.get(113));
            jLabel14.setText(tvserinfoList.get(114));
            jLabel15.setText(tvserinfoList.get(115));
            jLabel16.setText(tvserinfoList.get(116));
            jLabel17.setText(tvserinfoList.get(117));
            jLabel18.setText(tvserinfoList.get(118));
            jLabel19.setText(tvserinfoList.get(119));
            jLabel20.setText(tvserinfoList.get(120));
            jLabel21.setText(tvserinfoList.get(121));
        }
        else if(TvSeriesSelected.equals("3"))
        {
            jLabel11.setText(tvserinfoList.get(122));
            jLabel12.setText(tvserinfoList.get(123));
            jLabel13.setText(tvserinfoList.get(124));
            jLabel14.setText(tvserinfoList.get(125));
            jLabel15.setText(tvserinfoList.get(126));
            jLabel16.setText(tvserinfoList.get(127));
            jLabel17.setText(tvserinfoList.get(128));
            jLabel18.setText(tvserinfoList.get(129));
            jLabel19.setText(tvserinfoList.get(130));
            jLabel20.setText(tvserinfoList.get(131));
            jLabel21.setText(tvserinfoList.get(132));
        }
        else if(TvSeriesSelected.equals("4"))
        {
            jLabel11.setText(tvserinfoList.get(133));
            jLabel12.setText(tvserinfoList.get(134));
            jLabel13.setText(tvserinfoList.get(135));
            jLabel14.setText(tvserinfoList.get(136));
            jLabel15.setText(tvserinfoList.get(137));
            jLabel16.setText(tvserinfoList.get(138));
            jLabel17.setText(tvserinfoList.get(139));
            jLabel18.setText(tvserinfoList.get(140));
            jLabel19.setText(tvserinfoList.get(141));
            jLabel20.setText(tvserinfoList.get(142));
            jLabel21.setText(tvserinfoList.get(143));
        }
        else if(TvSeriesSelected.equals("5"))
        {
            jLabel11.setText(tvserinfoList.get(144));
            jLabel12.setText(tvserinfoList.get(145));
            jLabel13.setText(tvserinfoList.get(146));
            jLabel14.setText(tvserinfoList.get(147));
            jLabel15.setText(tvserinfoList.get(148));
            jLabel16.setText(tvserinfoList.get(149));
            jLabel17.setText(tvserinfoList.get(150));
            jLabel18.setText(tvserinfoList.get(151));
            jLabel19.setText(tvserinfoList.get(152));
            jLabel20.setText(tvserinfoList.get(153));
            jLabel21.setText(tvserinfoList.get(154));
        }
        else if(TvSeriesSelected.equals("6"))
        {
            jLabel11.setText(tvserinfoList.get(155));
            jLabel12.setText(tvserinfoList.get(156));
            jLabel13.setText(tvserinfoList.get(157));
            jLabel14.setText(tvserinfoList.get(158));
            jLabel15.setText(tvserinfoList.get(159));
            jLabel16.setText(tvserinfoList.get(160));
            jLabel17.setText(tvserinfoList.get(161));
            jLabel18.setText(tvserinfoList.get(162));
            jLabel19.setText(tvserinfoList.get(163));
            jLabel20.setText(tvserinfoList.get(164));
            jLabel21.setText(tvserinfoList.get(165));
        }
        else if(TvSeriesSelected.equals("7"))
        {
            jLabel11.setText(tvserinfoList.get(166));
            jLabel12.setText(tvserinfoList.get(167));
            jLabel13.setText(tvserinfoList.get(168));
            jLabel14.setText(tvserinfoList.get(169));
            jLabel15.setText(tvserinfoList.get(170));
            jLabel16.setText(tvserinfoList.get(171));
            jLabel17.setText(tvserinfoList.get(172));
            jLabel18.setText(tvserinfoList.get(173));
            jLabel19.setText(tvserinfoList.get(174));
            jLabel20.setText(tvserinfoList.get(175));
            jLabel21.setText(tvserinfoList.get(176));
        }
        else if(TvSeriesSelected.equals("8"))
        {
            jLabel11.setText(tvserinfoList.get(177));
            jLabel12.setText(tvserinfoList.get(178));
            jLabel13.setText(tvserinfoList.get(179));
            jLabel14.setText(tvserinfoList.get(180));
            jLabel15.setText(tvserinfoList.get(181));
            jLabel16.setText(tvserinfoList.get(182));
            jLabel17.setText(tvserinfoList.get(183));
            jLabel18.setText(tvserinfoList.get(184));
            jLabel19.setText(tvserinfoList.get(185));
            jLabel20.setText(tvserinfoList.get(186));
            jLabel21.setText(tvserinfoList.get(187));
        }
        else if(TvSeriesSelected.equals("9"))
        {
            jLabel11.setText(tvserinfoList.get(188));
            jLabel12.setText(tvserinfoList.get(189));
            jLabel13.setText(tvserinfoList.get(190));
            jLabel14.setText(tvserinfoList.get(191));
            jLabel15.setText(tvserinfoList.get(192));
            jLabel16.setText(tvserinfoList.get(193));
            jLabel17.setText(tvserinfoList.get(194));
            jLabel18.setText(tvserinfoList.get(195));
            jLabel19.setText(tvserinfoList.get(196));
            jLabel20.setText(tvserinfoList.get(197));
            jLabel21.setText(tvserinfoList.get(198));
        }
        else if(TvSeriesSelected.equals("10"))
        {
            jLabel11.setText(tvserinfoList.get(199));
            jLabel12.setText(tvserinfoList.get(200));
            jLabel13.setText(tvserinfoList.get(201));
            jLabel14.setText(tvserinfoList.get(202));
            jLabel15.setText(tvserinfoList.get(203));
            jLabel16.setText(tvserinfoList.get(204));
            jLabel17.setText(tvserinfoList.get(205));
            jLabel18.setText(tvserinfoList.get(206));
            jLabel19.setText(tvserinfoList.get(207));
            jLabel20.setText(tvserinfoList.get(208));
            jLabel21.setText(tvserinfoList.get(209));
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

        jLabel17 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel23 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel17.setText("jLabel17");

        jLabel7.setText("Classification");

        jLabel18.setText("jLabel18");

        jLabel8.setText("Subtitle");

        jLabel19.setText("jLabel19");

        jLabel9.setText("Dubbing");

        jLabel20.setText("jLabel20");

        jLabel10.setText("Season");

        jLabel1.setText("İdMovie");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel2.setText("Name");

        jLabel13.setText("jLabel13");

        jLabel3.setText("Category");

        jLabel14.setText("jLabel14");

        jLabel4.setText("Release Date");

        jLabel15.setText("jLabel15");

        jLabel5.setText("Country");

        jLabel16.setText("jLabel16");

        jLabel6.setText("Rating");

        jLabel21.setText("jLabel21");

        jLabel22.setText("Epsiode");

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel23.setText("TvSeriesİnformation");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
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
                    .addComponent(jLabel10)
                    .addComponent(jLabel22))
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel23)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
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
                            .addComponent(jLabel19))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(25, 25, 25))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel23)
                .addGap(13, 13, 13)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel21)
                    .addComponent(jLabel22)
                    .addComponent(jButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setVisible(false);
        dispose(); 
        try {
            new MovieWindow().setVisible(true);// TODO add your handling code here:
        } catch (FileNotFoundException ex) {
            Logger.getLogger(TvSeriesİnformationWindow.class.getName()).log(Level.SEVERE, null, ex);
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
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
