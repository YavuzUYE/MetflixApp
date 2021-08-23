
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
public class DetailİnformationWindow extends javax.swing.JFrame {
    private String Selected;
    private final ArrayList<String> directorList= new ArrayList();
    private final ArrayList<String> actorList= new ArrayList();
    private final ArrayList<String> scenaristList= new ArrayList();
    private final ArrayList<String> productionList= new ArrayList();
    
    /**
     * Creates new form İnformationWindow
     */
    public DetailİnformationWindow(String Selected) throws FileNotFoundException {
        initComponents();
        readFile(directorList,"Director.txt");
        readFile(actorList,"Actor.txt");
        readFile(scenaristList,"Scenarist.txt");
        readFile(productionList,"Production.txt");
        this.Selected = Selected;
        if(Selected.equals("1"))
        {
            jLabel8.setText(directorList.get(0));
            jLabel9.setText(directorList.get(1));
            jLabel10.setText(directorList.get(2));
            jLabel11.setText(directorList.get(3));
            jLabel12.setText(directorList.get(4));
            jLabel13.setText(directorList.get(5));
            jLabel14.setText(directorList.get(6));
            
            jLabel22.setText(scenaristList.get(0));
            jLabel23.setText(scenaristList.get(1));
            jLabel24.setText(scenaristList.get(2));
            jLabel25.setText(scenaristList.get(3));
            jLabel26.setText(scenaristList.get(4));
            jLabel27.setText(scenaristList.get(5));
            jLabel28.setText(scenaristList.get(6));
            
            jLabel36.setText(actorList.get(0));
            jLabel37.setText(actorList.get(1));
            jLabel38.setText(actorList.get(2));
            jLabel39.setText(actorList.get(3));
            jLabel40.setText(actorList.get(4));
            jLabel41.setText(actorList.get(5));
            jLabel42.setText(actorList.get(6));
            
            jLabel48.setText(productionList.get(0));
            jLabel49.setText(productionList.get(1));
            jLabel50.setText(productionList.get(2));
            jLabel51.setText(productionList.get(3));
            jLabel52.setText(productionList.get(4));
        }
        else if(Selected.equals("2"))
        {
            jLabel8.setText(directorList.get(7));
            jLabel9.setText(directorList.get(8));
            jLabel10.setText(directorList.get(9));
            jLabel11.setText(directorList.get(10));
            jLabel12.setText(directorList.get(11));
            jLabel13.setText(directorList.get(12));
            jLabel14.setText(directorList.get(13));
            
            jLabel22.setText(scenaristList.get(7));
            jLabel23.setText(scenaristList.get(8));
            jLabel24.setText(scenaristList.get(9));
            jLabel25.setText(scenaristList.get(10));
            jLabel26.setText(scenaristList.get(11));
            jLabel27.setText(scenaristList.get(12));
            jLabel28.setText(scenaristList.get(13));
            
            jLabel36.setText(actorList.get(7));
            jLabel37.setText(actorList.get(8));
            jLabel38.setText(actorList.get(9));
            jLabel39.setText(actorList.get(10));
            jLabel40.setText(actorList.get(11));
            jLabel41.setText(actorList.get(12));
            jLabel42.setText(actorList.get(13));
            
            jLabel48.setText(productionList.get(5));
            jLabel49.setText(productionList.get(6));
            jLabel50.setText(productionList.get(7));
            jLabel51.setText(productionList.get(8));
            jLabel52.setText(productionList.get(9));
        }
        else if(Selected.equals("3"))
        {
            jLabel8.setText(directorList.get(14));
            jLabel9.setText(directorList.get(15));
            jLabel10.setText(directorList.get(16));
            jLabel11.setText(directorList.get(17));
            jLabel12.setText(directorList.get(18));
            jLabel13.setText(directorList.get(19));
            jLabel14.setText(directorList.get(20));
            
            jLabel22.setText(scenaristList.get(14));
            jLabel23.setText(scenaristList.get(15));
            jLabel24.setText(scenaristList.get(16));
            jLabel25.setText(scenaristList.get(17));
            jLabel26.setText(scenaristList.get(18));
            jLabel27.setText(scenaristList.get(19));
            jLabel28.setText(scenaristList.get(20));
            
            jLabel36.setText(actorList.get(14));
            jLabel37.setText(actorList.get(15));
            jLabel38.setText(actorList.get(16));
            jLabel39.setText(actorList.get(17));
            jLabel40.setText(actorList.get(18));
            jLabel41.setText(actorList.get(19));
            jLabel42.setText(actorList.get(20));
            
            jLabel48.setText(productionList.get(10));
            jLabel49.setText(productionList.get(11));
            jLabel50.setText(productionList.get(12));
            jLabel51.setText(productionList.get(13));
            jLabel52.setText(productionList.get(14));
        }
        else if(Selected.equals("4"))
        {
            jLabel8.setText(directorList.get(21));
            jLabel9.setText(directorList.get(22));
            jLabel10.setText(directorList.get(23));
            jLabel11.setText(directorList.get(24));
            jLabel12.setText(directorList.get(25));
            jLabel13.setText(directorList.get(26));
            jLabel14.setText(directorList.get(27));
            
            jLabel22.setText(scenaristList.get(21));
            jLabel23.setText(scenaristList.get(22));
            jLabel24.setText(scenaristList.get(23));
            jLabel25.setText(scenaristList.get(24));
            jLabel26.setText(scenaristList.get(25));
            jLabel27.setText(scenaristList.get(26));
            jLabel28.setText(scenaristList.get(27));
            
            jLabel36.setText(actorList.get(21));
            jLabel37.setText(actorList.get(22));
            jLabel38.setText(actorList.get(23));
            jLabel39.setText(actorList.get(24));
            jLabel40.setText(actorList.get(25));
            jLabel41.setText(actorList.get(26));
            jLabel42.setText(actorList.get(27));
            
            jLabel48.setText(productionList.get(15));
            jLabel49.setText(productionList.get(16));
            jLabel50.setText(productionList.get(17));
            jLabel51.setText(productionList.get(18));
            jLabel52.setText(productionList.get(19));
        }
        else if(Selected.equals("5"))
        {
            jLabel8.setText(directorList.get(28));
            jLabel9.setText(directorList.get(29));
            jLabel10.setText(directorList.get(30));
            jLabel11.setText(directorList.get(31));
            jLabel12.setText(directorList.get(32));
            jLabel13.setText(directorList.get(33));
            jLabel14.setText(directorList.get(34));
            
            jLabel22.setText(scenaristList.get(28));
            jLabel23.setText(scenaristList.get(29));
            jLabel24.setText(scenaristList.get(30));
            jLabel25.setText(scenaristList.get(31));
            jLabel26.setText(scenaristList.get(32));
            jLabel27.setText(scenaristList.get(33));
            jLabel28.setText(scenaristList.get(34));
            
            jLabel36.setText(actorList.get(28));
            jLabel37.setText(actorList.get(29));
            jLabel38.setText(actorList.get(30));
            jLabel39.setText(actorList.get(31));
            jLabel40.setText(actorList.get(32));
            jLabel41.setText(actorList.get(33));
            jLabel42.setText(actorList.get(34));
            
            jLabel48.setText(productionList.get(20));
            jLabel49.setText(productionList.get(21));
            jLabel50.setText(productionList.get(22));
            jLabel51.setText(productionList.get(23));
            jLabel52.setText(productionList.get(24));
        }
        else if(Selected.equals("6"))
        {
            jLabel8.setText(directorList.get(35));
            jLabel9.setText(directorList.get(36));
            jLabel10.setText(directorList.get(37));
            jLabel11.setText(directorList.get(38));
            jLabel12.setText(directorList.get(39));
            jLabel13.setText(directorList.get(40));
            jLabel14.setText(directorList.get(41));
            
            jLabel22.setText(scenaristList.get(35));
            jLabel23.setText(scenaristList.get(36));
            jLabel24.setText(scenaristList.get(37));
            jLabel25.setText(scenaristList.get(38));
            jLabel26.setText(scenaristList.get(39));
            jLabel27.setText(scenaristList.get(40));
            jLabel28.setText(scenaristList.get(41));
            
            jLabel36.setText(actorList.get(35));
            jLabel37.setText(actorList.get(36));
            jLabel38.setText(actorList.get(37));
            jLabel39.setText(actorList.get(38));
            jLabel40.setText(actorList.get(39));
            jLabel41.setText(actorList.get(40));
            jLabel42.setText(actorList.get(41));
            
            jLabel48.setText(productionList.get(25));
            jLabel49.setText(productionList.get(26));
            jLabel50.setText(productionList.get(27));
            jLabel51.setText(productionList.get(28));
            jLabel52.setText(productionList.get(29));
        }
        else if(Selected.equals("7"))
        {
            jLabel8.setText(directorList.get(42));
            jLabel9.setText(directorList.get(43));
            jLabel10.setText(directorList.get(44));
            jLabel11.setText(directorList.get(45));
            jLabel12.setText(directorList.get(46));
            jLabel13.setText(directorList.get(47));
            jLabel14.setText(directorList.get(48));
            
            jLabel22.setText(scenaristList.get(42));
            jLabel23.setText(scenaristList.get(43));
            jLabel24.setText(scenaristList.get(44));
            jLabel25.setText(scenaristList.get(45));
            jLabel26.setText(scenaristList.get(46));
            jLabel27.setText(scenaristList.get(47));
            jLabel28.setText(scenaristList.get(48));
            
            jLabel36.setText(actorList.get(42));
            jLabel37.setText(actorList.get(43));
            jLabel38.setText(actorList.get(44));
            jLabel39.setText(actorList.get(45));
            jLabel40.setText(actorList.get(46));
            jLabel41.setText(actorList.get(47));
            jLabel42.setText(actorList.get(48));
            
            jLabel48.setText(productionList.get(30));
            jLabel49.setText(productionList.get(31));
            jLabel50.setText(productionList.get(32));
            jLabel51.setText(productionList.get(33));
            jLabel52.setText(productionList.get(34));
        }
        else if(Selected.equals("8"))
        {
            jLabel8.setText(directorList.get(49));
            jLabel9.setText(directorList.get(50));
            jLabel10.setText(directorList.get(51));
            jLabel11.setText(directorList.get(52));
            jLabel12.setText(directorList.get(53));
            jLabel13.setText(directorList.get(54));
            jLabel14.setText(directorList.get(55));
            
            jLabel22.setText(scenaristList.get(49));
            jLabel23.setText(scenaristList.get(50));
            jLabel24.setText(scenaristList.get(51));
            jLabel25.setText(scenaristList.get(52));
            jLabel26.setText(scenaristList.get(53));
            jLabel27.setText(scenaristList.get(54));
            jLabel28.setText(scenaristList.get(55));
            
            jLabel36.setText(actorList.get(49));
            jLabel37.setText(actorList.get(50));
            jLabel38.setText(actorList.get(51));
            jLabel39.setText(actorList.get(52));
            jLabel40.setText(actorList.get(53));
            jLabel41.setText(actorList.get(54));
            jLabel42.setText(actorList.get(55));
            
            jLabel48.setText(productionList.get(35));
            jLabel49.setText(productionList.get(36));
            jLabel50.setText(productionList.get(37));
            jLabel51.setText(productionList.get(38));
            jLabel52.setText(productionList.get(39));
        }
        else if(Selected.equals("9"))
        {
            jLabel8.setText(directorList.get(56));
            jLabel9.setText(directorList.get(57));
            jLabel10.setText(directorList.get(58));
            jLabel11.setText(directorList.get(59));
            jLabel12.setText(directorList.get(60));
            jLabel13.setText(directorList.get(61));
            jLabel14.setText(directorList.get(62));
            
            jLabel22.setText(scenaristList.get(56));
            jLabel23.setText(scenaristList.get(57));
            jLabel24.setText(scenaristList.get(58));
            jLabel25.setText(scenaristList.get(59));
            jLabel26.setText(scenaristList.get(60));
            jLabel27.setText(scenaristList.get(61));
            jLabel28.setText(scenaristList.get(62));
            
            jLabel36.setText(actorList.get(56));
            jLabel37.setText(actorList.get(57));
            jLabel38.setText(actorList.get(58));
            jLabel39.setText(actorList.get(59));
            jLabel40.setText(actorList.get(60));
            jLabel41.setText(actorList.get(61));
            jLabel42.setText(actorList.get(62));
            
            jLabel48.setText(productionList.get(40));
            jLabel49.setText(productionList.get(41));
            jLabel50.setText(productionList.get(42));
            jLabel51.setText(productionList.get(43));
            jLabel52.setText(productionList.get(44));
        }
        else if(Selected.equals("10"))
        {
            jLabel8.setText(directorList.get(63));
            jLabel9.setText(directorList.get(64));
            jLabel10.setText(directorList.get(65));
            jLabel11.setText(directorList.get(66));
            jLabel12.setText(directorList.get(67));
            jLabel13.setText(directorList.get(68));
            jLabel14.setText(directorList.get(69));
            
            jLabel22.setText(scenaristList.get(63));
            jLabel23.setText(scenaristList.get(64));
            jLabel24.setText(scenaristList.get(65));
            jLabel25.setText(scenaristList.get(66));
            jLabel26.setText(scenaristList.get(67));
            jLabel27.setText(scenaristList.get(68));
            jLabel28.setText(scenaristList.get(69));
            
            jLabel36.setText(actorList.get(63));
            jLabel37.setText(actorList.get(64));
            jLabel38.setText(actorList.get(65));
            jLabel39.setText(actorList.get(66));
            jLabel40.setText(actorList.get(67));
            jLabel41.setText(actorList.get(68));
            jLabel42.setText(actorList.get(69));
            
            jLabel48.setText(productionList.get(45));
            jLabel49.setText(productionList.get(46));
            jLabel50.setText(productionList.get(47));
            jLabel51.setText(productionList.get(48));
            jLabel52.setText(productionList.get(49));
        }
        else if(Selected.equals("11"))
        {
            jLabel8.setText(directorList.get(70));
            jLabel9.setText(directorList.get(71));
            jLabel10.setText(directorList.get(72));
            jLabel11.setText(directorList.get(73));
            jLabel12.setText(directorList.get(74));
            jLabel13.setText(directorList.get(75));
            jLabel14.setText(directorList.get(76));
            
            jLabel22.setText(scenaristList.get(70));
            jLabel23.setText(scenaristList.get(71));
            jLabel24.setText(scenaristList.get(72));
            jLabel25.setText(scenaristList.get(73));
            jLabel26.setText(scenaristList.get(74));
            jLabel27.setText(scenaristList.get(75));
            jLabel28.setText(scenaristList.get(76));
            
            jLabel36.setText(actorList.get(70));
            jLabel37.setText(actorList.get(71));
            jLabel38.setText(actorList.get(72));
            jLabel39.setText(actorList.get(73));
            jLabel40.setText(actorList.get(74));
            jLabel41.setText(actorList.get(75));
            jLabel42.setText(actorList.get(76));
            
            jLabel48.setText(productionList.get(50));
            jLabel49.setText(productionList.get(51));
            jLabel50.setText(productionList.get(52));
            jLabel51.setText(productionList.get(53));
            jLabel52.setText(productionList.get(54));
        }
        else if(Selected.equals("12"))
        {
            jLabel8.setText(directorList.get(77));
            jLabel9.setText(directorList.get(78));
            jLabel10.setText(directorList.get(79));
            jLabel11.setText(directorList.get(80));
            jLabel12.setText(directorList.get(81));
            jLabel13.setText(directorList.get(82));
            jLabel14.setText(directorList.get(83));
            
            jLabel22.setText(scenaristList.get(77));
            jLabel23.setText(scenaristList.get(78));
            jLabel24.setText(scenaristList.get(79));
            jLabel25.setText(scenaristList.get(80));
            jLabel26.setText(scenaristList.get(81));
            jLabel27.setText(scenaristList.get(82));
            jLabel28.setText(scenaristList.get(83));
            
            jLabel36.setText(actorList.get(77));
            jLabel37.setText(actorList.get(78));
            jLabel38.setText(actorList.get(79));
            jLabel39.setText(actorList.get(80));
            jLabel40.setText(actorList.get(81));
            jLabel41.setText(actorList.get(82));
            jLabel42.setText(actorList.get(83));
            
            jLabel48.setText(productionList.get(55));
            jLabel49.setText(productionList.get(56));
            jLabel50.setText(productionList.get(57));
            jLabel51.setText(productionList.get(58));
            jLabel52.setText(productionList.get(59));
        }
        else if(Selected.equals("13"))
        {
            jLabel8.setText(directorList.get(84));
            jLabel9.setText(directorList.get(85));
            jLabel10.setText(directorList.get(86));
            jLabel11.setText(directorList.get(87));
            jLabel12.setText(directorList.get(88));
            jLabel13.setText(directorList.get(89));
            jLabel14.setText(directorList.get(90));
            
            jLabel22.setText(scenaristList.get(84));
            jLabel23.setText(scenaristList.get(85));
            jLabel24.setText(scenaristList.get(86));
            jLabel25.setText(scenaristList.get(87));
            jLabel26.setText(scenaristList.get(88));
            jLabel27.setText(scenaristList.get(89));
            jLabel28.setText(scenaristList.get(90));
            
            jLabel36.setText(actorList.get(84));
            jLabel37.setText(actorList.get(85));
            jLabel38.setText(actorList.get(86));
            jLabel39.setText(actorList.get(87));
            jLabel40.setText(actorList.get(88));
            jLabel41.setText(actorList.get(89));
            jLabel42.setText(actorList.get(90));
            
            jLabel48.setText(productionList.get(60));
            jLabel49.setText(productionList.get(61));
            jLabel50.setText(productionList.get(62));
            jLabel51.setText(productionList.get(63));
            jLabel52.setText(productionList.get(64));
        }
        else if(Selected.equals("14"))
        {
            jLabel8.setText(directorList.get(91));
            jLabel9.setText(directorList.get(92));
            jLabel10.setText(directorList.get(93));
            jLabel11.setText(directorList.get(94));
            jLabel12.setText(directorList.get(95));
            jLabel13.setText(directorList.get(96));
            jLabel14.setText(directorList.get(97));
            
            jLabel22.setText(scenaristList.get(91));
            jLabel23.setText(scenaristList.get(92));
            jLabel24.setText(scenaristList.get(93));
            jLabel25.setText(scenaristList.get(94));
            jLabel26.setText(scenaristList.get(95));
            jLabel27.setText(scenaristList.get(96));
            jLabel28.setText(scenaristList.get(97));
            
            jLabel36.setText(actorList.get(91));
            jLabel37.setText(actorList.get(92));
            jLabel38.setText(actorList.get(93));
            jLabel39.setText(actorList.get(94));
            jLabel40.setText(actorList.get(95));
            jLabel41.setText(actorList.get(96));
            jLabel42.setText(actorList.get(97));
            
            jLabel48.setText(productionList.get(65));
            jLabel49.setText(productionList.get(66));
            jLabel50.setText(productionList.get(67));
            jLabel51.setText(productionList.get(68));
            jLabel52.setText(productionList.get(69));
        }
        else if(Selected.equals("15"))
        {
            jLabel8.setText(directorList.get(98));
            jLabel9.setText(directorList.get(99));
            jLabel10.setText(directorList.get(100));
            jLabel11.setText(directorList.get(101));
            jLabel12.setText(directorList.get(102));
            jLabel13.setText(directorList.get(103));
            jLabel14.setText(directorList.get(104));
            
            jLabel22.setText(scenaristList.get(98));
            jLabel23.setText(scenaristList.get(99));
            jLabel24.setText(scenaristList.get(100));
            jLabel25.setText(scenaristList.get(101));
            jLabel26.setText(scenaristList.get(102));
            jLabel27.setText(scenaristList.get(103));
            jLabel28.setText(scenaristList.get(104));
            
            jLabel36.setText(actorList.get(98));
            jLabel37.setText(actorList.get(99));
            jLabel38.setText(actorList.get(100));
            jLabel39.setText(actorList.get(101));
            jLabel40.setText(actorList.get(102));
            jLabel41.setText(actorList.get(103));
            jLabel42.setText(actorList.get(104));
            
            jLabel48.setText(productionList.get(70));
            jLabel49.setText(productionList.get(71));
            jLabel50.setText(productionList.get(72));
            jLabel51.setText(productionList.get(73));
            jLabel52.setText(productionList.get(74));
        }
        else if(Selected.equals("16"))
        {
            jLabel8.setText(directorList.get(105));
            jLabel9.setText(directorList.get(106));
            jLabel10.setText(directorList.get(107));
            jLabel11.setText(directorList.get(108));
            jLabel12.setText(directorList.get(109));
            jLabel13.setText(directorList.get(110));
            jLabel14.setText(directorList.get(111));
            
            jLabel22.setText(scenaristList.get(105));
            jLabel23.setText(scenaristList.get(106));
            jLabel24.setText(scenaristList.get(107));
            jLabel25.setText(scenaristList.get(108));
            jLabel26.setText(scenaristList.get(109));
            jLabel27.setText(scenaristList.get(110));
            jLabel28.setText(scenaristList.get(111));
            
            jLabel36.setText(actorList.get(105));
            jLabel37.setText(actorList.get(106));
            jLabel38.setText(actorList.get(107));
            jLabel39.setText(actorList.get(108));
            jLabel40.setText(actorList.get(109));
            jLabel41.setText(actorList.get(110));
            jLabel42.setText(actorList.get(111));
            
            jLabel48.setText(productionList.get(75));
            jLabel49.setText(productionList.get(76));
            jLabel50.setText(productionList.get(77));
            jLabel51.setText(productionList.get(78));
            jLabel52.setText(productionList.get(79));
        }
        else if(Selected.equals("17"))
        {
            jLabel8.setText(directorList.get(112));
            jLabel9.setText(directorList.get(113));
            jLabel10.setText(directorList.get(114));
            jLabel11.setText(directorList.get(115));
            jLabel12.setText(directorList.get(116));
            jLabel13.setText(directorList.get(117));
            jLabel14.setText(directorList.get(118));
            
            jLabel22.setText(scenaristList.get(112));
            jLabel23.setText(scenaristList.get(113));
            jLabel24.setText(scenaristList.get(114));
            jLabel25.setText(scenaristList.get(115));
            jLabel26.setText(scenaristList.get(116));
            jLabel27.setText(scenaristList.get(117));
            jLabel28.setText(scenaristList.get(118));
            
            jLabel36.setText(actorList.get(112));
            jLabel37.setText(actorList.get(113));
            jLabel38.setText(actorList.get(114));
            jLabel39.setText(actorList.get(115));
            jLabel40.setText(actorList.get(116));
            jLabel41.setText(actorList.get(117));
            jLabel42.setText(actorList.get(118));
            
            jLabel48.setText(productionList.get(80));
            jLabel49.setText(productionList.get(81));
            jLabel50.setText(productionList.get(82));
            jLabel51.setText(productionList.get(83));
            jLabel52.setText(productionList.get(84));
        }
        else if(Selected.equals("18"))
        {
            jLabel8.setText(directorList.get(119));
            jLabel9.setText(directorList.get(120));
            jLabel10.setText(directorList.get(121));
            jLabel11.setText(directorList.get(122));
            jLabel12.setText(directorList.get(123));
            jLabel13.setText(directorList.get(124));
            jLabel14.setText(directorList.get(125));
            
            jLabel22.setText(scenaristList.get(119));
            jLabel23.setText(scenaristList.get(120));
            jLabel24.setText(scenaristList.get(121));
            jLabel25.setText(scenaristList.get(122));
            jLabel26.setText(scenaristList.get(123));
            jLabel27.setText(scenaristList.get(124));
            jLabel28.setText(scenaristList.get(125));
            
            jLabel36.setText(actorList.get(119));
            jLabel37.setText(actorList.get(120));
            jLabel38.setText(actorList.get(121));
            jLabel39.setText(actorList.get(122));
            jLabel40.setText(actorList.get(123));
            jLabel41.setText(actorList.get(124));
            jLabel42.setText(actorList.get(125));
            
            jLabel48.setText(productionList.get(85));
            jLabel49.setText(productionList.get(86));
            jLabel50.setText(productionList.get(87));
            jLabel51.setText(productionList.get(88));
            jLabel52.setText(productionList.get(89));
        }
        else if(Selected.equals("19"))
        {
            jLabel8.setText(directorList.get(126));
            jLabel9.setText(directorList.get(127));
            jLabel10.setText(directorList.get(128));
            jLabel11.setText(directorList.get(129));
            jLabel12.setText(directorList.get(130));
            jLabel13.setText(directorList.get(131));
            jLabel14.setText(directorList.get(132));
            
            jLabel22.setText(scenaristList.get(126));
            jLabel23.setText(scenaristList.get(127));
            jLabel24.setText(scenaristList.get(128));
            jLabel25.setText(scenaristList.get(129));
            jLabel26.setText(scenaristList.get(130));
            jLabel27.setText(scenaristList.get(131));
            jLabel28.setText(scenaristList.get(132));
            
            jLabel36.setText(actorList.get(126));
            jLabel37.setText(actorList.get(127));
            jLabel38.setText(actorList.get(128));
            jLabel39.setText(actorList.get(129));
            jLabel40.setText(actorList.get(130));
            jLabel41.setText(actorList.get(131));
            jLabel42.setText(actorList.get(132));
            
            jLabel48.setText(productionList.get(90));
            jLabel49.setText(productionList.get(91));
            jLabel50.setText(productionList.get(92));
            jLabel51.setText(productionList.get(93));
            jLabel52.setText(productionList.get(94));
        }
        else if(Selected.equals("20"))
        {
            jLabel8.setText(directorList.get(133));
            jLabel9.setText(directorList.get(134));
            jLabel10.setText(directorList.get(135));
            jLabel11.setText(directorList.get(136));
            jLabel12.setText(directorList.get(137));
            jLabel13.setText(directorList.get(138));
            jLabel14.setText(directorList.get(139));
            
            jLabel22.setText(scenaristList.get(133));
            jLabel23.setText(scenaristList.get(134));
            jLabel24.setText(scenaristList.get(135));
            jLabel25.setText(scenaristList.get(136));
            jLabel26.setText(scenaristList.get(137));
            jLabel27.setText(scenaristList.get(138));
            jLabel28.setText(scenaristList.get(139));
            
            jLabel36.setText(actorList.get(133));
            jLabel37.setText(actorList.get(134));
            jLabel38.setText(actorList.get(135));
            jLabel39.setText(actorList.get(136));
            jLabel40.setText(actorList.get(137));
            jLabel41.setText(actorList.get(138));
            jLabel42.setText(actorList.get(139));
            
            jLabel48.setText(productionList.get(95));
            jLabel49.setText(productionList.get(96));
            jLabel50.setText(productionList.get(97));
            jLabel51.setText(productionList.get(98));
            jLabel52.setText(productionList.get(99));
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
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("IdDirector");

        jLabel2.setText("Name");

        jLabel3.setText("Surname");

        jLabel4.setText("Age");

        jLabel5.setText("Jobs");

        jLabel6.setText("Nationality");

        jLabel7.setText("Gender");

        jLabel8.setText("jLabel8");

        jLabel9.setText("jLabel9");

        jLabel10.setText("jLabel10");

        jLabel11.setText("jLabel11");

        jLabel12.setText("jLabel12");

        jLabel13.setText("jLabel13");

        jLabel14.setText("jLabel14");

        jLabel16.setText("IdScenarist");

        jLabel17.setText("Name");

        jLabel18.setText("Surname");

        jLabel19.setText("Age");

        jLabel20.setText("Jobs");

        jLabel21.setText("Nationality");

        jLabel15.setText("Gender");

        jLabel22.setText("jLabel22");

        jLabel23.setText("jLabel23");

        jLabel24.setText("jLabel24");

        jLabel25.setText("jLabel25");

        jLabel26.setText("jLabel26");

        jLabel27.setText("jLabel27");

        jLabel28.setText("jLabel28");

        jLabel29.setText("IdActor");

        jLabel30.setText("Name");

        jLabel31.setText("Surname");

        jLabel32.setText("Age");

        jLabel33.setText("Jobs");

        jLabel34.setText("Nationality");

        jLabel35.setText("Gender");

        jLabel36.setText("jLabel36");

        jLabel37.setText("jLabel37");

        jLabel38.setText("jLabel38");

        jLabel39.setText("jLabel39");

        jLabel40.setText("jLabel40");

        jLabel41.setText("jLabel41");

        jLabel42.setText("jLabel42");

        jLabel43.setText("IdProduction");

        jLabel44.setText("Product");

        jLabel45.setText("Production Company Name");

        jLabel46.setText("Budget");

        jLabel47.setText("Revenue");

        jLabel48.setText("jLabel48");

        jLabel49.setText("jLabel49");

        jLabel50.setText("jLabel50");

        jLabel51.setText("jLabel51");

        jLabel52.setText("jLabel52");

        jLabel53.setText("Detail İnformation");

        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(62, 62, 62)
                                                        .addComponent(jLabel31))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGap(5, 5, 5)
                                                        .addComponent(jLabel37)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                                                        .addComponent(jLabel38)))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel39)
                                                    .addComponent(jLabel32, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel33, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(jLabel40))
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel46)
                                                    .addComponent(jLabel41)
                                                    .addComponent(jLabel51)
                                                    .addComponent(jLabel34)))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel13)
                                                    .addComponent(jLabel6))))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(14, 14, 14)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel47)
                                                    .addComponent(jLabel52)))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel42)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel7)
                                                        .addComponent(jLabel35))
                                                    .addComponent(jLabel14)))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(6, 6, 6)
                                                .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(jLabel9)
                                                        .addGap(98, 98, 98))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel3))
                                                            .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGap(6, 6, 6)
                                                                        .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                    .addGroup(layout.createSequentialGroup()
                                                                        .addGap(4, 4, 4)
                                                                        .addComponent(jLabel23)))
                                                                .addGap(24, 24, 24)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                    .addComponent(jLabel24)
                                                                    .addComponent(jLabel18))))
                                                        .addGap(25, 25, 25)))
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel25)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel26)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jLabel27)
                                                        .addGap(12, 12, 12))
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(26, 26, 26)
                                                        .addComponent(jLabel21))))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(12, 12, 12)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel12)
                                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(69, 69, 69)))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel28)
                                            .addComponent(jLabel15)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel36)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel43)
                                            .addComponent(jLabel48))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel44)
                                            .addComponent(jLabel49))
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel50)
                                            .addComponent(jLabel45)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jLabel2)))
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel10)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel11))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(150, 150, 150)
                                        .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jButton1)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel53, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel13)
                    .addComponent(jLabel14)
                    .addComponent(jLabel9)
                    .addComponent(jLabel12))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel20)
                    .addComponent(jLabel21)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(jLabel24)
                    .addComponent(jLabel25)
                    .addComponent(jLabel26)
                    .addComponent(jLabel27)
                    .addComponent(jLabel28)
                    .addComponent(jLabel23))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29)
                    .addComponent(jLabel30)
                    .addComponent(jLabel31)
                    .addComponent(jLabel32)
                    .addComponent(jLabel33)
                    .addComponent(jLabel34)
                    .addComponent(jLabel35))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(jLabel38)
                    .addComponent(jLabel39)
                    .addComponent(jLabel40)
                    .addComponent(jLabel41)
                    .addComponent(jLabel42)
                    .addComponent(jLabel37))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel43)
                    .addComponent(jLabel44)
                    .addComponent(jLabel45)
                    .addComponent(jLabel46)
                    .addComponent(jLabel47))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel48)
                    .addComponent(jLabel49)
                    .addComponent(jLabel50)
                    .addComponent(jLabel51)
                    .addComponent(jLabel52))
                .addGap(28, 28, 28)
                .addComponent(jButton1)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        setVisible(false);
        dispose();        // TODO add your handling code here:
        try {
            new MovieWindow().setVisible(true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(DetailİnformationWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton1MouseClicked
    private static void readFile(List<String> originalList, String fileName) throws FileNotFoundException {
        List<String> candidateList = new ArrayList<>(1000);
        Scanner fileInput = new Scanner(new File(fileName));
        while (fileInput.hasNextLine()) {
            candidateList.add(fileInput.nextLine());
        }
        originalList.addAll(candidateList);
    }
    /**
     * @param args the command line arguments
     */
    

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
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration//GEN-END:variables
}
