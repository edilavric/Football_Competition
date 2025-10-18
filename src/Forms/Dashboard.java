/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Forms;

//import java.awt.Color;
import java.awt.*;
import java.sql.Connection;
import java.util.Date;
import javax.swing.*;
import java.sql.*;
import java.util.Calendar;

/**
 *
 * @author lavri
 */

public class Dashboard extends javax.swing.JFrame {
    public  enum Team{
        ALL,
        BARCELONA,
        REAL_MADRID,
        LIVERPOOL,
        MANCHESTER_CITY,
        MILAN,
        BAYERN_MUNICH;
        public static Team selectedTeam=Team.ALL;
        
    }


    /**
     * Creates new form Dashboard
     */
    public GridBagConstraints gbc = new GridBagConstraints();
    public Dashboard() {
        initComponents();
        setTitle("InfoScore");
        setExtendedState(JFrame.MAXIMIZED_BOTH);
        setLayout(new BorderLayout());
        ///Panou principal
        FullPanel.setLayout(new BorderLayout());
        
        ///BUTONUL CANCEL
        CancelBut.setVisible(false);
        
        ///PENTRU ADD BUTTON
        AddMeciuriBut.setVisible(false);
        AddJucatoriBut.setVisible(false);
        AddStaffBut.setVisible(false);
        AdaugaBut.setVisible(false);
        Gazda.setVisible(false);
        Oaspete.setVisible(false);
        Data.setVisible(false);
        GazdaText.setVisible(false);
        OaspeteText.setVisible(false);
        DataText.setVisible(false);
        
        Nume.setVisible(false);
        Prenume.setVisible(false);
        Functie.setVisible(false);
        IncepereContract.setVisible(false);
        SfarsitContract.setVisible(false);
        Telefon.setVisible(false);
        Experienta.setVisible(false);
        Echipa.setVisible(false);
        NumeText.setVisible(false);
        PrenumeText.setVisible(false);
        FunctieText.setVisible(false);
        IncepereContractText.setVisible(false);
        SfarsitContractText.setVisible(false);
        TelefonText.setVisible(false);
        ExperientaText.setVisible(false);
        EchipaText.setVisible(false);
        
        Nume.setVisible(false);
        Prenume.setVisible(false);
        DataNastere.setVisible(false);
        Forma.setVisible(false);
        Pozitie.setVisible(false);
        Valoare.setVisible(false);
        Picior.setVisible(false);
        Echipa.setVisible(false);
        Disponibilitate.setVisible(false);
        NumeText.setVisible(false);
        PrenumeText.setVisible(false);
        DataNastereText.setVisible(false);
        FormaText.setVisible(false);
        PozitieText.setVisible(false);
        ValoareText.setVisible(false);
        PiciorText.setVisible(false);
        EchipaText.setVisible(false);
        DisponibilitateText.setVisible(false);
        
        ///PENTRU Delete Button
        DeleteMeciuriBut.setVisible(false);
        DeleteStaffBut.setVisible(false);
        DeleteJucatoriBut.setVisible(false);
        StergeBut.setVisible(false);
        
        ///PENTRU Update Button
        UpdateMeciuriBut.setVisible(false);
        UpdateStaffBut.setVisible(false);
        UpdateJucatoriBut.setVisible(false);
        ModificaBut.setVisible(false);

        
        ///Panelul din stanga daca nu este administrator
        if(!LogIn.getUsername().equals("eduardo")){
            UpdateBut.setVisible(false);
            AddBut.setVisible(false);
            DeleteBut.setVisible(false);
            //Panelul din stanga
            LeftPanel.setLayout(new GridBagLayout());
//            GridBagConstraints gbc = new GridBagConstraints();
            gbc.insets = new Insets(5, 5,5, 5);  // Spacing between components

            // First row
            gbc.gridx = 0; gbc.gridy = 0;
            barca.setHorizontalAlignment(SwingConstants.CENTER);
            LeftPanel.add(barca, gbc);

            gbc.gridx = 1;
            real.setHorizontalAlignment(SwingConstants.CENTER);
            LeftPanel.add(real, gbc);

            gbc.gridx = 2;
            liv.setHorizontalAlignment(SwingConstants.CENTER);
            LeftPanel.add(liv, gbc);

            // Second row
            gbc.gridx = 0; gbc.gridy = 1;   
            city.setHorizontalAlignment(SwingConstants.CENTER);
            LeftPanel.add(city, gbc);

            gbc.gridx = 1;
            acm.setHorizontalAlignment(SwingConstants.CENTER);
            LeftPanel.add(acm, gbc);

            gbc.gridx = 2;
            bay.setHorizontalAlignment(SwingConstants.CENTER);
            LeftPanel.add(bay, gbc);
            
            gbc.gridx=1;gbc.gridy=2;
            all_teams.setHorizontalAlignment(SwingConstants.CENTER);
            LeftPanel.add(all_teams, gbc);
            
            // Back button spanning all columns
            gbc.gridx = 0; gbc.gridy = 3;
            gbc.gridwidth = 3;
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weighty = 1.0;  // Push button to bottom
            gbc.anchor = GridBagConstraints.SOUTH;
            LeftPanel.add(BackBut, gbc);
        }
        else{
                //Panelul din stanga daca e administrator
               LeftPanel.setLayout(new GridBagLayout());
               GridBagConstraints gbc = new GridBagConstraints();
               gbc.insets = new Insets(10, 10, 10, 10);  // Spacing between components

               // First row
               gbc.gridx = 0; gbc.gridy = 0;
               barca.setHorizontalAlignment(SwingConstants.CENTER);
               LeftPanel.add(barca, gbc);

               gbc.gridx = 1;
               real.setHorizontalAlignment(SwingConstants.CENTER);
               LeftPanel.add(real, gbc);

               gbc.gridx = 2;
               liv.setHorizontalAlignment(SwingConstants.CENTER);
               LeftPanel.add(liv, gbc);

               // Second row
               gbc.gridx = 0; gbc.gridy = 1;
               city.setHorizontalAlignment(SwingConstants.CENTER);
               LeftPanel.add(city, gbc);

               gbc.gridx = 1;
               acm.setHorizontalAlignment(SwingConstants.CENTER);
               LeftPanel.add(acm, gbc);

               gbc.gridx = 2;
               bay.setHorizontalAlignment(SwingConstants.CENTER);
               LeftPanel.add(bay, gbc);

               gbc.gridx=1;gbc.gridy=2;
               all_teams.setHorizontalAlignment(SwingConstants.CENTER);
               LeftPanel.add(all_teams, gbc);
               
               ///PENTRU ADD DELETE SI UPDATE
               AddMeciuriBut.setVisible(false);
               AddJucatoriBut.setVisible(false);
               AddStaffBut.setVisible(false);


               // Configurare pentru randul cu cele 3 butoane
               gbc.gridy = 15;
               gbc.gridwidth = 1;  // Resetam la 1 pentru butoanele individuale
               gbc.weighty = 2.5;  // Imping butoanele in jos
               gbc.weightx = 1;  // Distribuie spatiul orizontal egal
               gbc.fill = GridBagConstraints.NONE;  // Nu extinde butoanele
               gbc.insets = new Insets(0, 5, 5, 5);  // Adauga spatiu intre butoane

               // Cele 3 butoane pe acelasi rand
               gbc.gridx = 0;
               gbc.anchor = GridBagConstraints.SOUTHWEST;
               LeftPanel.add(DeleteBut, gbc);

               gbc.gridx = 1;
               gbc.anchor = GridBagConstraints.SOUTH;
               LeftPanel.add(AddBut, gbc);

               gbc.gridx = 2;
               gbc.anchor = GridBagConstraints.SOUTHEAST;
               LeftPanel.add(UpdateBut, gbc);

               // Butonul Back pe randul urmator
               gbc.gridx = 0;
               gbc.gridy = 16;
               gbc.gridwidth = 3;  // Span peste toate coloanele
               gbc.fill = GridBagConstraints.HORIZONTAL;
               gbc.weighty = 0.1;  // Valoare mai mica pentru a-l tine aproape de celelalte butoane
               gbc.anchor = GridBagConstraints.SOUTH;
               gbc.insets = new Insets(0, 0, 5, 0);  // Resetam insets pentru Back button
               LeftPanel.add(BackBut, gbc);

        }
        
        ///Panel dreapta
        RightPanel.setLayout(new GridLayout(6,2,10,10));
        ///Pt butoane
        RightPanel.add(ClasamentBut,BorderLayout.WEST);
        RightPanel.add(ClasamentImg,BorderLayout.EAST);
        RightPanel.add(RezultateBut,BorderLayout.WEST);
        RightPanel.add(RezultateImg,BorderLayout.EAST);
        RightPanel.add(MeciuriBut,BorderLayout.WEST);
        RightPanel.add(MeciuriImg,BorderLayout.EAST);
        RightPanel.add(JucatoriBut,BorderLayout.WEST);
        RightPanel.add(JucatoriImg,BorderLayout.EAST);
        RightPanel.add(EchipeBut,BorderLayout.WEST);
        RightPanel.add(EchipeImg,BorderLayout.EAST);
        RightPanel.add(StaffBut,BorderLayout.WEST);
        RightPanel.add(StaffImg,BorderLayout.EAST);
        
        ///Panel central
        CenterPanel.setLayout(new BorderLayout());
        //Pt tabel
        CenterPanel.add(jScrollPane1,BorderLayout.CENTER);        
        //Combinam LeftPanel, CenterPanel si RightPanel
        FullPanel.add(LeftPanel,BorderLayout.WEST);
        FullPanel.add(RightPanel,BorderLayout.EAST);
        FullPanel.add(CenterPanel,BorderLayout.CENTER);
         ///Adaugam FullPanel in JFrame
       add(FullPanel,BorderLayout.CENTER);
       ///FACEM INVIZIBILE JTABLE SI JSCROLLPANE
       jScrollPane1.setPreferredSize(CenterPanel.getSize());
        jScrollPane1.setVisible(true);
        jTable1.setVisible(true);
        CenterPanel.setVisible(false);
        
        
        
    
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        FullPanel = new javax.swing.JPanel();
        LeftPanel = new javax.swing.JPanel();
        BackBut = new javax.swing.JButton();
        barca = new javax.swing.JLabel();
        real = new javax.swing.JLabel();
        city = new javax.swing.JLabel();
        liv = new javax.swing.JLabel();
        acm = new javax.swing.JLabel();
        bay = new javax.swing.JLabel();
        UpdateBut = new javax.swing.JButton();
        AddBut = new javax.swing.JButton();
        DeleteBut = new javax.swing.JButton();
        all_teams = new javax.swing.JLabel();
        AddMeciuriBut = new javax.swing.JButton();
        AddJucatoriBut = new javax.swing.JButton();
        AddStaffBut = new javax.swing.JButton();
        CancelBut = new javax.swing.JButton();
        Gazda = new javax.swing.JLabel();
        Data = new javax.swing.JLabel();
        Oaspete = new javax.swing.JLabel();
        GazdaText = new javax.swing.JTextField();
        OaspeteText = new javax.swing.JTextField();
        DataText = new javax.swing.JTextField();
        AdaugaBut = new javax.swing.JButton();
        Nume = new javax.swing.JLabel();
        Prenume = new javax.swing.JLabel();
        Functie = new javax.swing.JLabel();
        IncepereContract = new javax.swing.JLabel();
        SfarsitContract = new javax.swing.JLabel();
        Telefon = new javax.swing.JLabel();
        Experienta = new javax.swing.JLabel();
        Echipa = new javax.swing.JLabel();
        NumeText = new javax.swing.JTextField();
        PrenumeText = new javax.swing.JTextField();
        FunctieText = new javax.swing.JTextField();
        IncepereContractText = new javax.swing.JTextField();
        SfarsitContractText = new javax.swing.JTextField();
        TelefonText = new javax.swing.JTextField();
        ExperientaText = new javax.swing.JTextField();
        EchipaText = new javax.swing.JTextField();
        DataNastere = new javax.swing.JLabel();
        DataNastereText = new javax.swing.JTextField();
        Forma = new javax.swing.JLabel();
        FormaText = new javax.swing.JTextField();
        Pozitie = new javax.swing.JLabel();
        PozitieText = new javax.swing.JTextField();
        Picior = new javax.swing.JLabel();
        PiciorText = new javax.swing.JTextField();
        Disponibilitate = new javax.swing.JLabel();
        DisponibilitateText = new javax.swing.JTextField();
        Valoare = new javax.swing.JLabel();
        ValoareText = new javax.swing.JTextField();
        DeleteMeciuriBut = new javax.swing.JButton();
        DeleteJucatoriBut = new javax.swing.JButton();
        DeleteStaffBut = new javax.swing.JButton();
        StergeBut = new javax.swing.JButton();
        UpdateMeciuriBut = new javax.swing.JButton();
        UpdateJucatoriBut = new javax.swing.JButton();
        UpdateStaffBut = new javax.swing.JButton();
        ModificaBut = new javax.swing.JButton();
        CenterPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        RightPanel = new javax.swing.JPanel();
        ClasamentBut = new javax.swing.JButton();
        RezultateBut = new javax.swing.JButton();
        MeciuriBut = new javax.swing.JButton();
        JucatoriBut = new javax.swing.JButton();
        EchipeBut = new javax.swing.JButton();
        StaffBut = new javax.swing.JButton();
        RezultateImg = new javax.swing.JLabel();
        ClasamentImg = new javax.swing.JLabel();
        MeciuriImg = new javax.swing.JLabel();
        StaffImg = new javax.swing.JLabel();
        EchipeImg = new javax.swing.JLabel();
        JucatoriImg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        FullPanel.setBackground(new java.awt.Color(179, 216, 156));
        FullPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LeftPanel.setBackground(new java.awt.Color(29, 120, 116));
        LeftPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        LeftPanel.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                LeftPanelMouseWheelMoved(evt);
            }
        });
        LeftPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        BackBut.setBackground(new java.awt.Color(80, 255, 177));
        BackBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        BackBut.setForeground(new java.awt.Color(255, 255, 255));
        BackBut.setText("Back");
        BackBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        BackBut.setFocusTraversalPolicyProvider(true);
        BackBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButActionPerformed(evt);
            }
        });
        LeftPanel.add(BackBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, 90, -1));

        barca.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        barca.setForeground(java.awt.Color.white);
        barca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/barca.png"))); // NOI18N
        barca.setText("FC Barcelona");
        barca.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        barca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        barca.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        barca.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barcaMousePressed(evt);
            }
        });
        LeftPanel.add(barca, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 110, -1));

        real.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        real.setForeground(new java.awt.Color(255, 255, 255));
        real.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/realm.png"))); // NOI18N
        real.setText("FC Real Madrid");
        real.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        real.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        real.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        real.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                realMousePressed(evt);
            }
        });
        LeftPanel.add(real, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        city.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        city.setForeground(java.awt.Color.white);
        city.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mancity.png"))); // NOI18N
        city.setText("FC Man. City");
        city.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        city.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        city.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        city.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cityMousePressed(evt);
            }
        });
        LeftPanel.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        liv.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        liv.setForeground(new java.awt.Color(255, 255, 255));
        liv.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/liv.png"))); // NOI18N
        liv.setText("Liverpool");
        liv.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        liv.setFocusable(false);
        liv.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        liv.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        liv.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                livMousePressed(evt);
            }
        });
        LeftPanel.add(liv, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        acm.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        acm.setForeground(java.awt.Color.white);
        acm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/acm.png"))); // NOI18N
        acm.setText("AC Milan");
        acm.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        acm.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        acm.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        acm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                acmMousePressed(evt);
            }
        });
        LeftPanel.add(acm, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        bay.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        bay.setForeground(java.awt.Color.white);
        bay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bay.png"))); // NOI18N
        bay.setText("FC Bayern Mun.");
        bay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bay.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        bay.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        bay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                bayMousePressed(evt);
            }
        });
        LeftPanel.add(bay, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        UpdateBut.setBackground(new java.awt.Color(80, 255, 177));
        UpdateBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        UpdateBut.setForeground(new java.awt.Color(255, 255, 255));
        UpdateBut.setText("Update");
        UpdateBut.setActionCommand("");
        UpdateBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateBut.setFocusTraversalPolicyProvider(true);
        UpdateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateButActionPerformed(evt);
            }
        });
        LeftPanel.add(UpdateBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 420, -1, -1));

        AddBut.setBackground(new java.awt.Color(80, 255, 177));
        AddBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddBut.setForeground(new java.awt.Color(255, 255, 255));
        AddBut.setText("Add");
        AddBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddBut.setFocusTraversalPolicyProvider(true);
        AddBut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                AddButMousePressed(evt);
            }
        });
        AddBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddButActionPerformed(evt);
            }
        });
        LeftPanel.add(AddBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 420, -1, -1));

        DeleteBut.setBackground(new java.awt.Color(80, 255, 177));
        DeleteBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DeleteBut.setForeground(new java.awt.Color(255, 255, 255));
        DeleteBut.setText("Delete");
        DeleteBut.setActionCommand("");
        DeleteBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteBut.setFocusTraversalPolicyProvider(true);
        DeleteBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteButActionPerformed(evt);
            }
        });
        LeftPanel.add(DeleteBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 420, 100, -1));

        all_teams.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        all_teams.setForeground(java.awt.Color.white);
        all_teams.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/all_teams.png"))); // NOI18N
        all_teams.setText("all teams");
        all_teams.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        all_teams.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        all_teams.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        all_teams.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                all_teamsMousePressed(evt);
            }
        });
        LeftPanel.add(all_teams, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 210, -1, -1));

        AddMeciuriBut.setBackground(new java.awt.Color(80, 255, 177));
        AddMeciuriBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddMeciuriBut.setForeground(new java.awt.Color(255, 255, 255));
        AddMeciuriBut.setText("Meciuri");
        AddMeciuriBut.setActionCommand("");
        AddMeciuriBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddMeciuriBut.setFocusTraversalPolicyProvider(true);
        AddMeciuriBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddMeciuriButActionPerformed(evt);
            }
        });
        LeftPanel.add(AddMeciuriBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 600, -1, -1));

        AddJucatoriBut.setBackground(new java.awt.Color(80, 255, 177));
        AddJucatoriBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddJucatoriBut.setForeground(new java.awt.Color(255, 255, 255));
        AddJucatoriBut.setText("Jucatori");
        AddJucatoriBut.setActionCommand("");
        AddJucatoriBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddJucatoriBut.setFocusTraversalPolicyProvider(true);
        AddJucatoriBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddJucatoriButActionPerformed(evt);
            }
        });
        LeftPanel.add(AddJucatoriBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 640, -1, -1));

        AddStaffBut.setBackground(new java.awt.Color(80, 255, 177));
        AddStaffBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AddStaffBut.setForeground(new java.awt.Color(255, 255, 255));
        AddStaffBut.setText("Staff");
        AddStaffBut.setActionCommand("");
        AddStaffBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AddStaffBut.setFocusTraversalPolicyProvider(true);
        AddStaffBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddStaffButActionPerformed(evt);
            }
        });
        LeftPanel.add(AddStaffBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 690, 80, -1));

        CancelBut.setBackground(new java.awt.Color(80, 255, 177));
        CancelBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        CancelBut.setForeground(new java.awt.Color(255, 255, 255));
        CancelBut.setText("Cancel");
        CancelBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        CancelBut.setFocusTraversalPolicyProvider(true);
        CancelBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelButActionPerformed(evt);
            }
        });
        LeftPanel.add(CancelBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 470, 100, -1));

        Gazda.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Gazda.setForeground(java.awt.Color.white);
        Gazda.setText("Gazda:");
        LeftPanel.add(Gazda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 60, 30));

        Data.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Data.setForeground(java.awt.Color.white);
        Data.setText("Data:");
        LeftPanel.add(Data, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 790, 50, 30));

        Oaspete.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Oaspete.setForeground(java.awt.Color.white);
        Oaspete.setText("Oaspete:");
        LeftPanel.add(Oaspete, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 760, 80, 30));

        GazdaText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        GazdaText.setForeground(java.awt.Color.darkGray);
        GazdaText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        GazdaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GazdaTextActionPerformed(evt);
            }
        });
        LeftPanel.add(GazdaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 730, 180, 20));

        OaspeteText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        OaspeteText.setForeground(java.awt.Color.darkGray);
        OaspeteText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        OaspeteText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OaspeteTextActionPerformed(evt);
            }
        });
        LeftPanel.add(OaspeteText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 760, 180, 20));

        DataText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        DataText.setForeground(java.awt.Color.darkGray);
        DataText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DataText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataTextActionPerformed(evt);
            }
        });
        LeftPanel.add(DataText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 790, 180, 20));

        AdaugaBut.setBackground(new java.awt.Color(80, 255, 177));
        AdaugaBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        AdaugaBut.setForeground(new java.awt.Color(255, 255, 255));
        AdaugaBut.setText("Adauga");
        AdaugaBut.setActionCommand("");
        AdaugaBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        AdaugaBut.setFocusTraversalPolicyProvider(true);
        AdaugaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdaugaButActionPerformed(evt);
            }
        });
        LeftPanel.add(AdaugaBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 520, -1, 30));

        Nume.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Nume.setForeground(java.awt.Color.white);
        Nume.setText("Nume:");
        LeftPanel.add(Nume, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 820, 60, 20));

        Prenume.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Prenume.setForeground(java.awt.Color.white);
        Prenume.setText("Prenume:");
        LeftPanel.add(Prenume, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 850, 80, 20));

        Functie.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Functie.setForeground(java.awt.Color.white);
        Functie.setText("Functie:");
        LeftPanel.add(Functie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 880, 80, -1));

        IncepereContract.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        IncepereContract.setForeground(java.awt.Color.white);
        IncepereContract.setText("Incepere Contract:");
        LeftPanel.add(IncepereContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 920, 130, 20));

        SfarsitContract.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        SfarsitContract.setForeground(java.awt.Color.white);
        SfarsitContract.setText("Sfarsit contract:");
        LeftPanel.add(SfarsitContract, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 950, -1, 20));

        Telefon.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Telefon.setForeground(java.awt.Color.white);
        Telefon.setText("Telefon:");
        LeftPanel.add(Telefon, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 980, 70, 20));

        Experienta.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Experienta.setForeground(java.awt.Color.white);
        Experienta.setText("Experienta:");
        LeftPanel.add(Experienta, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1010, 100, 20));

        Echipa.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Echipa.setForeground(java.awt.Color.white);
        Echipa.setText("Echipa:");
        LeftPanel.add(Echipa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1040, 60, 20));

        NumeText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        NumeText.setForeground(java.awt.Color.darkGray);
        NumeText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        NumeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NumeTextActionPerformed(evt);
            }
        });
        LeftPanel.add(NumeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 820, 180, 20));

        PrenumeText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        PrenumeText.setForeground(java.awt.Color.darkGray);
        PrenumeText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PrenumeText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrenumeTextActionPerformed(evt);
            }
        });
        LeftPanel.add(PrenumeText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 850, 180, 20));

        FunctieText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        FunctieText.setForeground(java.awt.Color.darkGray);
        FunctieText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FunctieText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FunctieTextActionPerformed(evt);
            }
        });
        LeftPanel.add(FunctieText, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 880, 180, 20));

        IncepereContractText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        IncepereContractText.setForeground(java.awt.Color.darkGray);
        IncepereContractText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        IncepereContractText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IncepereContractTextActionPerformed(evt);
            }
        });
        LeftPanel.add(IncepereContractText, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 920, 150, 20));

        SfarsitContractText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        SfarsitContractText.setForeground(java.awt.Color.darkGray);
        SfarsitContractText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        SfarsitContractText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SfarsitContractTextActionPerformed(evt);
            }
        });
        LeftPanel.add(SfarsitContractText, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 950, 140, 20));

        TelefonText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        TelefonText.setForeground(java.awt.Color.darkGray);
        TelefonText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        TelefonText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelefonTextActionPerformed(evt);
            }
        });
        LeftPanel.add(TelefonText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 980, 140, 20));

        ExperientaText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ExperientaText.setForeground(java.awt.Color.darkGray);
        ExperientaText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ExperientaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExperientaTextActionPerformed(evt);
            }
        });
        LeftPanel.add(ExperientaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1010, 140, 20));

        EchipaText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        EchipaText.setForeground(java.awt.Color.darkGray);
        EchipaText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        EchipaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EchipaTextActionPerformed(evt);
            }
        });
        LeftPanel.add(EchipaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1040, 140, 20));

        DataNastere.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        DataNastere.setForeground(java.awt.Color.white);
        DataNastere.setText("Data nastere:");
        LeftPanel.add(DataNastere, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1080, 80, 20));

        DataNastereText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        DataNastereText.setForeground(java.awt.Color.darkGray);
        DataNastereText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DataNastereText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DataNastereTextActionPerformed(evt);
            }
        });
        LeftPanel.add(DataNastereText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1080, 140, 20));

        Forma.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Forma.setForeground(java.awt.Color.white);
        Forma.setText("Forma:");
        LeftPanel.add(Forma, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1120, 50, 20));

        FormaText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        FormaText.setForeground(java.awt.Color.darkGray);
        FormaText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        FormaText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FormaTextActionPerformed(evt);
            }
        });
        LeftPanel.add(FormaText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1120, 140, 20));

        Pozitie.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Pozitie.setForeground(java.awt.Color.white);
        Pozitie.setText("Pozitie:");
        LeftPanel.add(Pozitie, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1160, 50, 20));

        PozitieText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        PozitieText.setForeground(java.awt.Color.darkGray);
        PozitieText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PozitieText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PozitieTextActionPerformed(evt);
            }
        });
        LeftPanel.add(PozitieText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1160, 140, 20));

        Picior.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Picior.setForeground(java.awt.Color.white);
        Picior.setText("Picior:");
        LeftPanel.add(Picior, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1190, 50, 20));

        PiciorText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        PiciorText.setForeground(java.awt.Color.darkGray);
        PiciorText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        PiciorText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PiciorTextActionPerformed(evt);
            }
        });
        LeftPanel.add(PiciorText, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 1190, 140, 20));

        Disponibilitate.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Disponibilitate.setForeground(java.awt.Color.white);
        Disponibilitate.setText("Disponibilitate:");
        LeftPanel.add(Disponibilitate, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1230, 90, 20));

        DisponibilitateText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        DisponibilitateText.setForeground(java.awt.Color.darkGray);
        DisponibilitateText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        DisponibilitateText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DisponibilitateTextActionPerformed(evt);
            }
        });
        LeftPanel.add(DisponibilitateText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1230, 140, 20));

        Valoare.setFont(new java.awt.Font("Verdana", 1, 10)); // NOI18N
        Valoare.setForeground(java.awt.Color.white);
        Valoare.setText("Valoare:");
        LeftPanel.add(Valoare, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1270, 50, 20));

        ValoareText.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        ValoareText.setForeground(java.awt.Color.darkGray);
        ValoareText.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ValoareText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ValoareTextActionPerformed(evt);
            }
        });
        LeftPanel.add(ValoareText, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 1270, 140, 20));

        DeleteMeciuriBut.setBackground(new java.awt.Color(80, 255, 177));
        DeleteMeciuriBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DeleteMeciuriBut.setForeground(new java.awt.Color(255, 255, 255));
        DeleteMeciuriBut.setText("Meciuri");
        DeleteMeciuriBut.setActionCommand("");
        DeleteMeciuriBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteMeciuriBut.setFocusTraversalPolicyProvider(true);
        DeleteMeciuriBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteMeciuriButActionPerformed(evt);
            }
        });
        LeftPanel.add(DeleteMeciuriBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1390, -1, -1));

        DeleteJucatoriBut.setBackground(new java.awt.Color(80, 255, 177));
        DeleteJucatoriBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DeleteJucatoriBut.setForeground(new java.awt.Color(255, 255, 255));
        DeleteJucatoriBut.setText("Jucatori");
        DeleteJucatoriBut.setActionCommand("");
        DeleteJucatoriBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteJucatoriBut.setFocusTraversalPolicyProvider(true);
        DeleteJucatoriBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteJucatoriButActionPerformed(evt);
            }
        });
        LeftPanel.add(DeleteJucatoriBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1440, -1, -1));

        DeleteStaffBut.setBackground(new java.awt.Color(80, 255, 177));
        DeleteStaffBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        DeleteStaffBut.setForeground(new java.awt.Color(255, 255, 255));
        DeleteStaffBut.setText("Staff");
        DeleteStaffBut.setActionCommand("");
        DeleteStaffBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        DeleteStaffBut.setFocusTraversalPolicyProvider(true);
        DeleteStaffBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeleteStaffButActionPerformed(evt);
            }
        });
        LeftPanel.add(DeleteStaffBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 1490, 80, -1));

        StergeBut.setBackground(new java.awt.Color(80, 255, 177));
        StergeBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        StergeBut.setForeground(new java.awt.Color(255, 255, 255));
        StergeBut.setText("Sterge");
        StergeBut.setActionCommand("");
        StergeBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StergeBut.setFocusTraversalPolicyProvider(true);
        StergeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StergeButActionPerformed(evt);
            }
        });
        LeftPanel.add(StergeBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 1540, -1, -1));

        UpdateMeciuriBut.setBackground(new java.awt.Color(80, 255, 177));
        UpdateMeciuriBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        UpdateMeciuriBut.setForeground(new java.awt.Color(255, 255, 255));
        UpdateMeciuriBut.setText("Meciuri");
        UpdateMeciuriBut.setActionCommand("");
        UpdateMeciuriBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateMeciuriBut.setFocusTraversalPolicyProvider(true);
        UpdateMeciuriBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateMeciuriButActionPerformed(evt);
            }
        });
        LeftPanel.add(UpdateMeciuriBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 1410, -1, 30));

        UpdateJucatoriBut.setBackground(new java.awt.Color(80, 255, 177));
        UpdateJucatoriBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        UpdateJucatoriBut.setForeground(new java.awt.Color(255, 255, 255));
        UpdateJucatoriBut.setText("Jucatori");
        UpdateJucatoriBut.setActionCommand("");
        UpdateJucatoriBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateJucatoriBut.setFocusTraversalPolicyProvider(true);
        UpdateJucatoriBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateJucatoriButActionPerformed(evt);
            }
        });
        LeftPanel.add(UpdateJucatoriBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1460, -1, -1));

        UpdateStaffBut.setBackground(new java.awt.Color(80, 255, 177));
        UpdateStaffBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        UpdateStaffBut.setForeground(new java.awt.Color(255, 255, 255));
        UpdateStaffBut.setText("Staff");
        UpdateStaffBut.setActionCommand("");
        UpdateStaffBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        UpdateStaffBut.setFocusTraversalPolicyProvider(true);
        UpdateStaffBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateStaffButActionPerformed(evt);
            }
        });
        LeftPanel.add(UpdateStaffBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 1500, 80, -1));

        ModificaBut.setBackground(new java.awt.Color(80, 255, 177));
        ModificaBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ModificaBut.setForeground(new java.awt.Color(255, 255, 255));
        ModificaBut.setText("Modifca");
        ModificaBut.setActionCommand("");
        ModificaBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ModificaBut.setFocusTraversalPolicyProvider(true);
        ModificaBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificaButActionPerformed(evt);
            }
        });
        LeftPanel.add(ModificaBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 1540, -1, -1));

        FullPanel.add(LeftPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -20, 320, 1710));

        CenterPanel.setBackground(new java.awt.Color(179, 216, 156));

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 0));
        jScrollPane1.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N

        jTable1.setBackground(new java.awt.Color(179, 216, 156));
        jTable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTable1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable1.setRowHeight(25);
        jTable1.setSelectionBackground(new java.awt.Color(179, 216, 156));
        jTable1.setShowHorizontalLines(true);
        jTable1.setShowVerticalLines(true);
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout CenterPanelLayout = new javax.swing.GroupLayout(CenterPanel);
        CenterPanel.setLayout(CenterPanelLayout);
        CenterPanelLayout.setHorizontalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CenterPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(393, 393, 393))
        );
        CenterPanelLayout.setVerticalGroup(
            CenterPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CenterPanelLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        FullPanel.add(CenterPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-170, 10, 170, 670));

        RightPanel.setBackground(new java.awt.Color(239, 131, 84));
        RightPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        RightPanel.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        RightPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ClasamentBut.setBackground(new java.awt.Color(80, 255, 177));
        ClasamentBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        ClasamentBut.setForeground(new java.awt.Color(255, 255, 255));
        ClasamentBut.setText("Clasament");
        ClasamentBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ClasamentBut.setFocusTraversalPolicyProvider(true);
        ClasamentBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClasamentButActionPerformed(evt);
            }
        });
        RightPanel.add(ClasamentBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 30, 150, -1));

        RezultateBut.setBackground(new java.awt.Color(80, 255, 177));
        RezultateBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        RezultateBut.setForeground(new java.awt.Color(255, 255, 255));
        RezultateBut.setText("Rezultate");
        RezultateBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        RezultateBut.setFocusTraversalPolicyProvider(true);
        RezultateBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RezultateButActionPerformed(evt);
            }
        });
        RightPanel.add(RezultateBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 150, -1));

        MeciuriBut.setBackground(new java.awt.Color(80, 255, 177));
        MeciuriBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        MeciuriBut.setForeground(new java.awt.Color(255, 255, 255));
        MeciuriBut.setText("Meciuri");
        MeciuriBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MeciuriBut.setFocusTraversalPolicyProvider(true);
        MeciuriBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MeciuriButActionPerformed(evt);
            }
        });
        RightPanel.add(MeciuriBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 270, 140, -1));

        JucatoriBut.setBackground(new java.awt.Color(80, 255, 177));
        JucatoriBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        JucatoriBut.setForeground(new java.awt.Color(255, 255, 255));
        JucatoriBut.setText("Jucatori");
        JucatoriBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        JucatoriBut.setFocusTraversalPolicyProvider(true);
        JucatoriBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JucatoriButActionPerformed(evt);
            }
        });
        RightPanel.add(JucatoriBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 140, -1));

        EchipeBut.setBackground(new java.awt.Color(80, 255, 177));
        EchipeBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        EchipeBut.setForeground(new java.awt.Color(255, 255, 255));
        EchipeBut.setText("Echipe");
        EchipeBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        EchipeBut.setFocusTraversalPolicyProvider(true);
        EchipeBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EchipeButActionPerformed(evt);
            }
        });
        RightPanel.add(EchipeBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 140, -1));

        StaffBut.setBackground(new java.awt.Color(80, 255, 177));
        StaffBut.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        StaffBut.setForeground(new java.awt.Color(255, 255, 255));
        StaffBut.setText("Staff");
        StaffBut.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        StaffBut.setFocusTraversalPolicyProvider(true);
        StaffBut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StaffButActionPerformed(evt);
            }
        });
        RightPanel.add(StaffBut, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 690, 140, -1));

        RezultateImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/scoreboard(1).png"))); // NOI18N
        RightPanel.add(RezultateImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 140, 140, 90));

        ClasamentImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/trophy.png"))); // NOI18N
        RightPanel.add(ClasamentImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 130, 120));

        MeciuriImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/football-channel.png"))); // NOI18N
        RightPanel.add(MeciuriImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 240, -1, 100));

        StaffImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/football-team.png"))); // NOI18N
        RightPanel.add(StaffImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 670, -1, 120));

        EchipeImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/club.png"))); // NOI18N
        RightPanel.add(EchipeImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 480, 120, 120));

        JucatoriImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/shoot.png"))); // NOI18N
        RightPanel.add(JucatoriImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 340, -1, 130));

        FullPanel.add(RightPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, -10, 380, 1700));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(FullPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(FullPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 1691, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 100, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RezultateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RezultateButActionPerformed
        // TODO add your handling code here:
       
       CenterPanel.setVisible(true);
     // Actualizare numele coloanelor pentru a include si data
    String[] columnNames = {"GAZDA", "GOLURI", "OASPETE", "DATA"};
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columnNames, 0);
    try (Connection conn = DatabaseConnection.getConnection()) {
        String query="";
        if(Team.selectedTeam==Team.ALL){
            query = """
            SELECT e1.nume as gazda, 
                   p1.nr_goluri as goluri_gazda, 
                   p2.nr_goluri as goluri_oaspete,
                   e2.nume as oaspete,
                   m.data as data_meci
            FROM (SELECT id_participare, rol, nr_goluri, id_meci, id_echipa FROM participare)p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data<CURRENT_DATE()
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String gazdaNume = rs.getString("gazda");
                    int goluriGazda = rs.getInt("goluri_gazda");
                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    String scor = goluriGazda + " - " + goluriOaspete;
                
                
                    // Formatare data intr-un format mai prietenos 
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                
                    // Adaugare rand in tabel cu data
                    model.addRow(new Object[]{gazdaNume, scor, oaspeteNume, dataFormatata});
                }
            }
        }else if(Team.selectedTeam==Team.BARCELONA){
            query = """
            SELECT e1.nume as gazda, 
                   p1.nr_goluri as goluri_gazda, 
                   p2.nr_goluri as goluri_oaspete,
                   e2.nume as oaspete,
                   m.data as data_meci
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data<CURRENT_DATE() 
            AND (e1.id_echipa=1 OR e2.id_echipa=1)
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String gazdaNume = rs.getString("gazda");
                    int goluriGazda = rs.getInt("goluri_gazda");
                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    String scor = goluriGazda + " - " + goluriOaspete;
                
                
                    // Formatare data intr-un format mai prietenos 
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                
                    // Adaugare rand in tabel cu data
                    model.addRow(new Object[]{gazdaNume, scor, oaspeteNume, dataFormatata});
                }
            }
            
        }else if(Team.selectedTeam==Team.REAL_MADRID){
            query = """
            SELECT e1.nume as gazda, 
                   p1.nr_goluri as goluri_gazda, 
                   p2.nr_goluri as goluri_oaspete,
                   e2.nume as oaspete,
                   m.data as data_meci
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data<CURRENT_DATE() 
            AND (e1.id_echipa=2 OR e2.id_echipa=2)
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String gazdaNume = rs.getString("gazda");
                    int goluriGazda = rs.getInt("goluri_gazda");
                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    String scor = goluriGazda + " - " + goluriOaspete;
                
                
                    // Formatare data intr-un format mai prietenos 
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                
                    // Adaugare rand in tabel cu data
                    model.addRow(new Object[]{gazdaNume, scor, oaspeteNume, dataFormatata});
                }
            }
            
        }else if(Team.selectedTeam==Team.MANCHESTER_CITY){
            query = """
            SELECT e1.nume as gazda, 
                   p1.nr_goluri as goluri_gazda, 
                   p2.nr_goluri as goluri_oaspete,
                   e2.nume as oaspete,
                   m.data as data_meci
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data<CURRENT_DATE() 
            AND (e1.id_echipa=3 OR e2.id_echipa=3)
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String gazdaNume = rs.getString("gazda");
                    int goluriGazda = rs.getInt("goluri_gazda");
                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    String scor = goluriGazda + " - " + goluriOaspete;
                
                
                    // Formatare data intr-un format mai prietenos 
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                
                    // Adaugare rand in tabel cu data
                    model.addRow(new Object[]{gazdaNume, scor, oaspeteNume, dataFormatata});
                }
            }
            
        }else if(Team.selectedTeam==Team.LIVERPOOL){
            query = """
            SELECT e1.nume as gazda, 
                   p1.nr_goluri as goluri_gazda, 
                   p2.nr_goluri as goluri_oaspete,
                   e2.nume as oaspete,
                   m.data as data_meci
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data<CURRENT_DATE() 
            AND (e1.id_echipa=4 OR e2.id_echipa=4)
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String gazdaNume = rs.getString("gazda");
                    int goluriGazda = rs.getInt("goluri_gazda");
                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    String scor = goluriGazda + " - " + goluriOaspete;
                
                
                    // Formatare data intr-un format mai prietenos 
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                
                    // Adaugare rand in tabel cu data
                    model.addRow(new Object[]{gazdaNume, scor, oaspeteNume, dataFormatata});
                }
            }
            
        }else if(Team.selectedTeam==Team.MILAN){
            query = """
            SELECT e1.nume as gazda, 
                   p1.nr_goluri as goluri_gazda, 
                   p2.nr_goluri as goluri_oaspete,
                   e2.nume as oaspete,
                   m.data as data_meci
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data<CURRENT_DATE() 
            AND (e1.id_echipa=5 OR e2.id_echipa=5)
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String gazdaNume = rs.getString("gazda");
                    int goluriGazda = rs.getInt("goluri_gazda");
                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    String scor = goluriGazda + " - " + goluriOaspete;
                
                
                    // Formatare data intr-un format mai prietenos 
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                
                    // Adaugare rand in tabel cu data
                    model.addRow(new Object[]{gazdaNume, scor, oaspeteNume, dataFormatata});
                }
            }
            
        }else if(Team.selectedTeam==Team.BAYERN_MUNICH){
            query = """
            SELECT e1.nume as gazda, 
                   p1.nr_goluri as goluri_gazda, 
                   p2.nr_goluri as goluri_oaspete,
                   e2.nume as oaspete,
                   m.data as data_meci
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data<CURRENT_DATE() 
            AND (e1.id_echipa=6 OR e2.id_echipa=6)
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String gazdaNume = rs.getString("gazda");
                    int goluriGazda = rs.getInt("goluri_gazda");
                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    String scor = goluriGazda + " - " + goluriOaspete;
                
                
                    // Formatare data intr-un format mai prietenos 
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                
                    // Adaugare rand in tabel cu data
                    model.addRow(new Object[]{gazdaNume, scor, oaspeteNume, dataFormatata});
                }
            }
            
        }
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Eroare la încărcarea datelor: " + e.getMessage(),
            "Eroare", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
    // Setare model pentru tabel
    jTable1.setModel(model);
    jTable1.setSize(CenterPanel.getWidth(),CenterPanel.getHeight());
    javax.swing.table.JTableHeader header = jTable1.getTableHeader();
    javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
    header.setDefaultRenderer(centerRenderer);
    header.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK)); // Adauga bordura header
    
    // Centrare text în celule
    centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
    for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    jTable1.setFillsViewportHeight(true);
    jScrollPane1.setPreferredSize(new Dimension(CenterPanel.getWidth(), CenterPanel.getHeight()));
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    jTable1.setFillsViewportHeight(true);
    }//GEN-LAST:event_RezultateButActionPerformed

    private void MeciuriButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MeciuriButActionPerformed
        // TODO add your handling code here:
        CenterPanel.setVisible(true);
    String[] columnNames = {"GAZDA", "OASPETE", "DATA","STADION"};
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columnNames, 0);
    try (Connection conn = DatabaseConnection.getConnection()) {
        String query="";
        if(Team.selectedTeam==Team.ALL){
            query = """
            SELECT 
                    e1.nume as gazda,
                   e2.nume as oaspete,
                   m.data as data_meci,
                   (SELECT s.nume FROM stadion s WHERE s.id_echipa=e1.id_echipa) AS Stadion
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci  
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data>CURRENT_DATE()
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String stadion=rs.getString("Stadion");
                 
                    String gazdaNume = rs.getString("gazda");
//                    int goluriGazda = rs.getInt("goluri_gazda");
//                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                    model.addRow(new Object[]{gazdaNume, oaspeteNume, dataFormatata,stadion});
                }
            }
        }else if(Team.selectedTeam==Team.BARCELONA){
            query = """
            SELECT 
                    e1.nume as gazda, 
                      
                   e2.nume as oaspete,
                   m.data as data_meci,
                   
                   s.nume as Stadion
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            JOIN stadion s ON s.id_echipa=e1.id_echipa
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data>CURRENT_DATE()
            AND( e1.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=1) OR e2.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=1) )
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String stadion=rs.getString("Stadion");
                 
                    String gazdaNume = rs.getString("gazda");
//                    int goluriGazda = rs.getInt("goluri_gazda");
//                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                    model.addRow(new Object[]{gazdaNume, oaspeteNume, dataFormatata,stadion});
                }
            }
            
            
        }else if(Team.selectedTeam==Team.REAL_MADRID){
            query = """
            SELECT 
                    e1.nume as gazda, 
                      
                   e2.nume as oaspete,
                   m.data as data_meci,
                   
                   s.nume as Stadion
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            JOIN stadion s ON s.id_echipa=e1.id_echipa
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data>CURRENT_DATE()
            AND( e1.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=2) OR e2.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=2) )
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String stadion=rs.getString("Stadion");
                 
                    String gazdaNume = rs.getString("gazda");
//                    int goluriGazda = rs.getInt("goluri_gazda");
//                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                    model.addRow(new Object[]{gazdaNume, oaspeteNume, dataFormatata,stadion});
                }
            }
            
            
        }else if(Team.selectedTeam==Team.LIVERPOOL){
            query = """
            SELECT 
                    e1.nume as gazda, 
                      
                   e2.nume as oaspete,
                   m.data as data_meci,
                   
                   s.nume as Stadion
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            JOIN stadion s ON s.id_echipa=e1.id_echipa
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data>CURRENT_DATE()
            AND( e1.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=4) OR e2.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=4) )
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String stadion=rs.getString("Stadion");
                 
                    String gazdaNume = rs.getString("gazda");
//                    int goluriGazda = rs.getInt("goluri_gazda");
//                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                    model.addRow(new Object[]{gazdaNume, oaspeteNume, dataFormatata,stadion});
                }
            }
            
            
        }else if(Team.selectedTeam==Team.MANCHESTER_CITY){
            query = """
            SELECT 
                    e1.nume as gazda, 
                      
                   e2.nume as oaspete,
                   m.data as data_meci,
                   
                   s.nume as Stadion
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            JOIN stadion s ON s.id_echipa=e1.id_echipa
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data>CURRENT_DATE()
            AND( e1.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=3) OR e2.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=3) )
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String stadion=rs.getString("Stadion");
                 
                    String gazdaNume = rs.getString("gazda");
//                    int goluriGazda = rs.getInt("goluri_gazda");
//                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                    model.addRow(new Object[]{gazdaNume, oaspeteNume, dataFormatata,stadion});
                }
            }
            
            
        }else if(Team.selectedTeam==Team.MILAN){
            query = """
            SELECT 
                    e1.nume as gazda, 
                      
                   e2.nume as oaspete,
                   m.data as data_meci,
                   
                   s.nume as Stadion
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            JOIN stadion s ON s.id_echipa=e1.id_echipa
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data>CURRENT_DATE()
            AND( e1.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=5) OR e2.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=5) )
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String stadion=rs.getString("Stadion");
                 
                    String gazdaNume = rs.getString("gazda");
//                    int goluriGazda = rs.getInt("goluri_gazda");
//                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                    model.addRow(new Object[]{gazdaNume, oaspeteNume, dataFormatata,stadion});
                }
            }
            
            
        }else if(Team.selectedTeam==Team.BAYERN_MUNICH){
            query = """
            SELECT 
                    e1.nume as gazda, 
                      
                   e2.nume as oaspete,
                   m.data as data_meci,
                   
                   s.nume as Stadion
            FROM participare p1
            JOIN echipa e1 ON p1.id_echipa = e1.id_echipa
            JOIN participare p2 ON p1.id_meci = p2.id_meci
            JOIN echipa e2 ON p2.id_echipa = e2.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            JOIN stadion s ON s.id_echipa=e1.id_echipa
            WHERE p1.rol = 'gazda' AND p2.rol = 'oaspete' AND m.data>CURRENT_DATE()
            AND( e1.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=6) OR e2.id_echipa=(SELECT id_echipa FROM echipa WHERE id_echipa=6) )
            ORDER BY m.data DESC
            """;
            
            try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
                java.sql.ResultSet rs = pst.executeQuery()) {
                while (rs.next()) {
                    String stadion=rs.getString("Stadion");
                 
                    String gazdaNume = rs.getString("gazda");
//                    int goluriGazda = rs.getInt("goluri_gazda");
//                    int goluriOaspete = rs.getInt("goluri_oaspete");
                    String oaspeteNume = rs.getString("oaspete");
                    java.sql.Date dataMeci = rs.getDate("data_meci");
                    java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                    String dataFormatata = sdf.format(dataMeci);
                    model.addRow(new Object[]{gazdaNume, oaspeteNume, dataFormatata,stadion});
                }
            }
            
            
        }
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Eroare la încărcarea datelor: " + e.getMessage(),
            "Eroare", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    
    // Setare model pentru tabel
    jTable1.setModel(model);
    javax.swing.table.JTableHeader header = jTable1.getTableHeader();
    javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
    header.setDefaultRenderer(centerRenderer);
    header.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK)); // Adauga bordura header
    // Centrare text în celule
    centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
    for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    
    jTable1.setFillsViewportHeight(true);
    jScrollPane1.setPreferredSize(new Dimension(CenterPanel.getWidth(), CenterPanel.getHeight()));
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }//GEN-LAST:event_MeciuriButActionPerformed

    private void JucatoriButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JucatoriButActionPerformed
        // TODO add your handling code here:
        CenterPanel.setVisible(true);
        //LeftPanel.setVisible(false);
        String[] columnNames={"Nume","Prenume","data nastere","forma","pozitie","valoare(€)","picior","disponibilitate"};
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columnNames, 0);
        try(Connection conn=DatabaseConnection.getConnection()){
            String query="";
            if(Team.selectedTeam==Team.ALL){
                query="SELECT nume,prenume,data_nastere,forma,pozitie,valoare,picior,disponibilitate FROM jucator";
                 
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("nume");
                        String prenume=rs.getString("prenume");
                        Date data=rs.getDate("data_nastere");
                        String forma=rs.getString("forma");
                        String pozitie=rs.getString("pozitie");
                        long valoare=rs.getLong("valoare");
                        String picior=rs.getString("picior");
                        String disponibilitate=rs.getString("disponibilitate");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        if(forma==null){
                            forma="-";
                        }
                        model.addRow(new Object[]{nume,prenume,dataFormatata,forma,pozitie,valoare,picior,disponibilitate});
                  
                    }
                }      
            }else if(Team.selectedTeam==Team.BARCELONA){
                query="""
                      SELECT j.nume, j.prenume, j.data_nastere, j.forma, j.pozitie, j.valoare,
                      j.picior, j.disponibilitate 
                      FROM jucator j
                      WHERE j.id_echipa=ANY(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=1)
                      """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("j.nume");
                        String prenume=rs.getString("j.prenume");
                        Date data=rs.getDate("j.data_nastere");
                        String forma=rs.getString("j.forma");
                        String pozitie=rs.getString("j.pozitie");
                        long valoare=rs.getLong("j.valoare");
                        String picior=rs.getString("j.picior");
                        String disponibilitate=rs.getString("j.disponibilitate");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        if(forma==null){
                            forma="-";
                        }
                        model.addRow(new Object[]{nume,prenume,dataFormatata,forma,pozitie,valoare,picior,disponibilitate});
                  
                    }
                }      
            }else if(Team.selectedTeam==Team.REAL_MADRID){
                query="""
                      SELECT j.nume, j.prenume, j.data_nastere, j.forma, j.pozitie, j.valoare,
                      j.picior, j.disponibilitate 
                      FROM jucator j
                      WHERE j.id_echipa=ANY(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=2)
                      """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("j.nume");
                        String prenume=rs.getString("j.prenume");
                        Date data=rs.getDate("j.data_nastere");
                        String forma=rs.getString("j.forma");
                        String pozitie=rs.getString("j.pozitie");
                        long valoare=rs.getLong("j.valoare");
                        String picior=rs.getString("j.picior");
                        String disponibilitate=rs.getString("j.disponibilitate");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        if(forma==null){
                            forma="-";
                        }
                        model.addRow(new Object[]{nume,prenume,dataFormatata,forma,pozitie,valoare,picior,disponibilitate});
                  
                    }
                }      
            }else if(Team.selectedTeam==Team.MANCHESTER_CITY){
                query="""
                      SELECT j.nume, j.prenume, j.data_nastere, j.forma, j.pozitie, j.valoare,
                      j.picior, j.disponibilitate 
                      FROM jucator j
                      WHERE j.id_echipa=ANY(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=3)
                      """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("j.nume");
                        String prenume=rs.getString("j.prenume");
                        Date data=rs.getDate("j.data_nastere");
                        String forma=rs.getString("j.forma");
                        String pozitie=rs.getString("j.pozitie");
                        long valoare=rs.getLong("j.valoare");
                        String picior=rs.getString("j.picior");
                        String disponibilitate=rs.getString("j.disponibilitate");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        if(forma==null){
                            forma="-";
                        }
                        model.addRow(new Object[]{nume,prenume,dataFormatata,forma,pozitie,valoare,picior,disponibilitate});
                  
                    }
                }      
            }else if(Team.selectedTeam==Team.LIVERPOOL){
                query="""
                      SELECT j.nume, j.prenume, j.data_nastere, j.forma, j.pozitie, j.valoare,
                      j.picior, j.disponibilitate 
                      FROM jucator j
                      WHERE j.id_echipa=ANY(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=4)
                      """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("j.nume");
                        String prenume=rs.getString("j.prenume");
                        Date data=rs.getDate("j.data_nastere");
                        String forma=rs.getString("j.forma");
                        String pozitie=rs.getString("j.pozitie");
                        long valoare=rs.getLong("j.valoare");
                        String picior=rs.getString("j.picior");
                        String disponibilitate=rs.getString("j.disponibilitate");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        if(forma==null){
                            forma="-";
                        }
                        model.addRow(new Object[]{nume,prenume,dataFormatata,forma,pozitie,valoare,picior,disponibilitate});
                  
                    }
                }      
            }else if(Team.selectedTeam==Team.MILAN){
                query="""
                      SELECT j.nume, j.prenume, j.data_nastere, j.forma, j.pozitie, j.valoare,
                      j.picior, j.disponibilitate 
                      FROM jucator j
                      WHERE j.id_echipa=ANY(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=5)
                      """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("j.nume");
                        String prenume=rs.getString("j.prenume");
                        Date data=rs.getDate("j.data_nastere");
                        String forma=rs.getString("j.forma");
                        String pozitie=rs.getString("j.pozitie");
                        long valoare=rs.getLong("j.valoare");
                        String picior=rs.getString("j.picior");
                        String disponibilitate=rs.getString("j.disponibilitate");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        if(forma==null){
                            forma="-";
                        }
                        model.addRow(new Object[]{nume,prenume,dataFormatata,forma,pozitie,valoare,picior,disponibilitate});
                  
                    }
                }      
            }else if(Team.selectedTeam==Team.BAYERN_MUNICH){
                query="""
                      SELECT j.nume, j.prenume, j.data_nastere, j.forma, j.pozitie, j.valoare,
                      j.picior, j.disponibilitate 
                      FROM jucator j
                      WHERE j.id_echipa=ANY(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=6)
                      """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("j.nume");
                        String prenume=rs.getString("j.prenume");
                        Date data=rs.getDate("j.data_nastere");
                        String forma=rs.getString("j.forma");
                        String pozitie=rs.getString("j.pozitie");
                        long valoare=rs.getLong("j.valoare");
                        String picior=rs.getString("j.picior");
                        String disponibilitate=rs.getString("j.disponibilitate");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        if(forma==null){
                            forma="-";
                        }
                        model.addRow(new Object[]{nume,prenume,dataFormatata,forma,pozitie,valoare,picior,disponibilitate});
                  
                    }
                }      
            }
        }catch(Exception e){
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, 
            "Eroare la încărcarea datelor: " + e.getMessage(),
            "Eroare", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        jTable1.setModel(model);
        // Centrare text în celule
    javax.swing.table.JTableHeader header = jTable1.getTableHeader();
    javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
    header.setDefaultRenderer(centerRenderer);
    header.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK)); // Adauga bordura header
    centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
    for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    jTable1.setRowHeight(25);
    jScrollPane1.setPreferredSize(new Dimension(CenterPanel.getWidth(), CenterPanel.getHeight()));
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        
    }//GEN-LAST:event_JucatoriButActionPerformed

    private void EchipeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EchipeButActionPerformed
        // TODO add your handling code here:
       CenterPanel.setVisible(true);
       String[] columnNames={"Nume","Numar jucatori","data infiintare","Presedintele clublui"};
       javax.swing.table.DefaultTableModel model=new javax.swing.table.DefaultTableModel(columnNames,0);
       model.setColumnIdentifiers(columnNames);
       try(Connection conn= DatabaseConnection.getConnection()){
           String query="";
           if(Team.selectedTeam==Team.ALL){
                query="""
                            SELECT echipa.nume,echipa.nr_jucatori,echipa.data_infiintare,presedinte.nume,presedinte.prenume
                        FROM echipa
                        JOIN presedinte ON (echipa.id_presedinte=presedinte.id_presedinte)
                        """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("echipa.nume");
                        int nr_jucatori=rs.getInt("echipa.nr_jucatori");
                        Date data=rs.getDate("echipa.data_infiintare");
                        String p_nume_prenume=rs.getString("presedinte.nume")+ " "+rs.getString("presedinte.prenume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        model.addRow(new Object[]{nume,nr_jucatori,dataFormatata,p_nume_prenume});
                    }
                }
           }else if(Team.selectedTeam==Team.BARCELONA){
               query="""
                            SELECT echipa.nume,echipa.nr_jucatori,echipa.data_infiintare,presedinte.nume,presedinte.prenume
                        FROM echipa
                        JOIN presedinte ON (echipa.id_presedinte=presedinte.id_presedinte)
                        WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=1)
                        """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("echipa.nume");
                        int nr_jucatori=rs.getInt("echipa.nr_jucatori");
                        Date data=rs.getDate("echipa.data_infiintare");
                        String p_nume_prenume=rs.getString("presedinte.nume")+ " "+rs.getString("presedinte.prenume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        model.addRow(new Object[]{nume,nr_jucatori,dataFormatata,p_nume_prenume});
                    }
                }
               
           }else if(Team.selectedTeam==Team.REAL_MADRID){
               query="""
                            SELECT echipa.nume,echipa.nr_jucatori,echipa.data_infiintare,presedinte.nume,presedinte.prenume
                        FROM echipa
                        JOIN presedinte ON (echipa.id_presedinte=presedinte.id_presedinte)
                        WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=2)
                        """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("echipa.nume");
                        int nr_jucatori=rs.getInt("echipa.nr_jucatori");
                        Date data=rs.getDate("echipa.data_infiintare");
                        String p_nume_prenume=rs.getString("presedinte.nume")+ " "+rs.getString("presedinte.prenume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        model.addRow(new Object[]{nume,nr_jucatori,dataFormatata,p_nume_prenume});
                    }
                }
               
           }else if(Team.selectedTeam==Team.LIVERPOOL){
               query="""
                            SELECT echipa.nume,echipa.nr_jucatori,echipa.data_infiintare,presedinte.nume,presedinte.prenume
                        FROM echipa
                        JOIN presedinte ON (echipa.id_presedinte=presedinte.id_presedinte)
                        WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=4)
                        """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("echipa.nume");
                        int nr_jucatori=rs.getInt("echipa.nr_jucatori");
                        Date data=rs.getDate("echipa.data_infiintare");
                        String p_nume_prenume=rs.getString("presedinte.nume")+ " "+rs.getString("presedinte.prenume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        model.addRow(new Object[]{nume,nr_jucatori,dataFormatata,p_nume_prenume});
                    }
                }
               
           }else if(Team.selectedTeam==Team.MANCHESTER_CITY){
               query="""
                            SELECT echipa.nume,echipa.nr_jucatori,echipa.data_infiintare,presedinte.nume,presedinte.prenume
                        FROM echipa
                        JOIN presedinte ON (echipa.id_presedinte=presedinte.id_presedinte)
                        WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=3)
                        """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("echipa.nume");
                        int nr_jucatori=rs.getInt("echipa.nr_jucatori");
                        Date data=rs.getDate("echipa.data_infiintare");
                        String p_nume_prenume=rs.getString("presedinte.nume")+ " "+rs.getString("presedinte.prenume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        model.addRow(new Object[]{nume,nr_jucatori,dataFormatata,p_nume_prenume});
                    }
                }
               
           }else if(Team.selectedTeam==Team.MILAN){
               query="""
                            SELECT echipa.nume,echipa.nr_jucatori,echipa.data_infiintare,presedinte.nume,presedinte.prenume
                        FROM echipa
                        JOIN presedinte ON (echipa.id_presedinte=presedinte.id_presedinte)
                        WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=5)
                        """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("echipa.nume");
                        int nr_jucatori=rs.getInt("echipa.nr_jucatori");
                        Date data=rs.getDate("echipa.data_infiintare");
                        String p_nume_prenume=rs.getString("presedinte.nume")+ " "+rs.getString("presedinte.prenume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        model.addRow(new Object[]{nume,nr_jucatori,dataFormatata,p_nume_prenume});
                    }
                }
               
           }else if(Team.selectedTeam==Team.BAYERN_MUNICH){
               query="""
                            SELECT echipa.nume,echipa.nr_jucatori,echipa.data_infiintare,presedinte.nume,presedinte.prenume
                        FROM echipa
                        JOIN presedinte ON (echipa.id_presedinte=presedinte.id_presedinte)
                        WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=6)
                        """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("echipa.nume");
                        int nr_jucatori=rs.getInt("echipa.nr_jucatori");
                        Date data=rs.getDate("echipa.data_infiintare");
                        String p_nume_prenume=rs.getString("presedinte.nume")+ " "+rs.getString("presedinte.prenume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata = sdf.format(data);
                        model.addRow(new Object[]{nume,nr_jucatori,dataFormatata,p_nume_prenume});
                    }
                }
               
           }
       }catch(Exception e){
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this, 
            "Eroare la încărcarea datelor: " + e.getMessage(),
            "Eroare", 
            javax.swing.JOptionPane.ERROR_MESSAGE); 
       }
       jTable1.setModel(model);
       javax.swing.table.JTableHeader header = jTable1.getTableHeader();
        javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
        header.setDefaultRenderer(centerRenderer);
        // Centrare text în celule
    centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
    for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }    
    jTable1.setRowHeight(25);
    jTable1.setFillsViewportHeight(true);
    jScrollPane1.setPreferredSize(new Dimension(CenterPanel.getWidth(), CenterPanel.getHeight()));
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
    }//GEN-LAST:event_EchipeButActionPerformed

    private void StaffButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StaffButActionPerformed
        // TODO add your handling code here:
        CenterPanel.setVisible(true);
        //LeftPanel.setVisible(false);
        String[] columnNames={"Nume","Numele echipei","Functie","Contract inceput","Contract sfarsit","telefon","experienta(ani)"};
        javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columnNames, 0);
        model.setColumnIdentifiers(columnNames);
//        model.addRow(columnNames);
        try(Connection conn=DatabaseConnection.getConnection()){
            String query="";
            if(Team.selectedTeam==Team.ALL){
                query="""
                         SELECT staff.nume,staff.prenume,staff.functie,staff.incepere_contract,staff.sfarsit_contract,staff.telefon,
                         staff.experienta,echipa.nume FROM staff
                         JOIN echipa ON (staff.id_echipa=echipa.id_echipa)
                         """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("staff.nume")+" "+rs.getString("staff.prenume");
                        //String prenume=rs.getString("staff.prenume");
                        String functie=rs.getString("staff.functie");
                        Date data_angajare=rs.getDate("staff.incepere_contract");
                        Date data_plecare=rs.getDate("staff.sfarsit_contract");
                        String telefon=rs.getString("staff.telefon");
                        int experienta=rs.getInt("staff.experienta");
                        String nume_echipa=rs.getString("echipa.nume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata1 = sdf.format(data_angajare);
                        if(data_plecare==null){
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,"-",telefon,experienta}); 
                        }
                        else 
                        {
                            String dataFormatata2=sdf.format(data_plecare);
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,dataFormatata2,telefon,experienta});
                        }
                    }
                }
            }else if(Team.selectedTeam==Team.BARCELONA){
                query="""
                         SELECT staff.nume,staff.prenume,staff.functie,staff.incepere_contract,staff.sfarsit_contract,staff.telefon,
                         staff.experienta,echipa.nume FROM staff
                         JOIN echipa ON (staff.id_echipa=echipa.id_echipa)
                         WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=1)
                         """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("staff.nume")+" "+rs.getString("staff.prenume");
                        //String prenume=rs.getString("staff.prenume");
                        String functie=rs.getString("staff.functie");
                        Date data_angajare=rs.getDate("staff.incepere_contract");
                        Date data_plecare=rs.getDate("staff.sfarsit_contract");
                        String telefon=rs.getString("staff.telefon");
                        int experienta=rs.getInt("staff.experienta");
                        String nume_echipa=rs.getString("echipa.nume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata1 = sdf.format(data_angajare);
                        if(data_plecare==null){
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,"-",telefon,experienta}); 
                        }
                        else 
                        {
                            String dataFormatata2=sdf.format(data_plecare);
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,dataFormatata2,telefon,experienta});
                        }
                    }
                }
            }else if(Team.selectedTeam==Team.REAL_MADRID){
                query="""
                         SELECT staff.nume,staff.prenume,staff.functie,staff.incepere_contract,staff.sfarsit_contract,staff.telefon,
                         staff.experienta,echipa.nume FROM staff
                         JOIN echipa ON (staff.id_echipa=echipa.id_echipa)
                         WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=2)
                         """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("staff.nume")+" "+rs.getString("staff.prenume");
                        //String prenume=rs.getString("staff.prenume");
                        String functie=rs.getString("staff.functie");
                        Date data_angajare=rs.getDate("staff.incepere_contract");
                        Date data_plecare=rs.getDate("staff.sfarsit_contract");
                        String telefon=rs.getString("staff.telefon");
                        int experienta=rs.getInt("staff.experienta");
                        String nume_echipa=rs.getString("echipa.nume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata1 = sdf.format(data_angajare);
                        if(data_plecare==null){
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,"-",telefon,experienta}); 
                        }
                        else 
                        {
                            String dataFormatata2=sdf.format(data_plecare);
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,dataFormatata2,telefon,experienta});
                        }
                    }
                }
            }else if(Team.selectedTeam==Team.MANCHESTER_CITY){
                query="""
                         SELECT staff.nume,staff.prenume,staff.functie,staff.incepere_contract,staff.sfarsit_contract,staff.telefon,
                         staff.experienta,echipa.nume FROM staff
                         JOIN echipa ON (staff.id_echipa=echipa.id_echipa)
                         WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=3)
                         """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("staff.nume")+" "+rs.getString("staff.prenume");
                        //String prenume=rs.getString("staff.prenume");
                        String functie=rs.getString("staff.functie");
                        Date data_angajare=rs.getDate("staff.incepere_contract");
                        Date data_plecare=rs.getDate("staff.sfarsit_contract");
                        String telefon=rs.getString("staff.telefon");
                        int experienta=rs.getInt("staff.experienta");
                        String nume_echipa=rs.getString("echipa.nume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata1 = sdf.format(data_angajare);
                        if(data_plecare==null){
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,"-",telefon,experienta}); 
                        }
                        else 
                        {
                            String dataFormatata2=sdf.format(data_plecare);
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,dataFormatata2,telefon,experienta});
                        }
                    }
                }
            }else if(Team.selectedTeam==Team.LIVERPOOL){
                query="""
                         SELECT staff.nume,staff.prenume,staff.functie,staff.incepere_contract,staff.sfarsit_contract,staff.telefon,
                         staff.experienta,echipa.nume FROM staff
                         JOIN echipa ON (staff.id_echipa=echipa.id_echipa)
                         WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=4)
                         """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("staff.nume")+" "+rs.getString("staff.prenume");
                        //String prenume=rs.getString("staff.prenume");
                        String functie=rs.getString("staff.functie");
                        Date data_angajare=rs.getDate("staff.incepere_contract");
                        Date data_plecare=rs.getDate("staff.sfarsit_contract");
                        String telefon=rs.getString("staff.telefon");
                        int experienta=rs.getInt("staff.experienta");
                        String nume_echipa=rs.getString("echipa.nume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata1 = sdf.format(data_angajare);
                        if(data_plecare==null){
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,"-",telefon,experienta}); 
                        }
                        else 
                        {
                            String dataFormatata2=sdf.format(data_plecare);
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,dataFormatata2,telefon,experienta});
                        }
                    }
                }
            }else if(Team.selectedTeam==Team.MILAN){
                query="""
                         SELECT staff.nume,staff.prenume,staff.functie,staff.incepere_contract,staff.sfarsit_contract,staff.telefon,
                         staff.experienta,echipa.nume FROM staff
                         JOIN echipa ON (staff.id_echipa=echipa.id_echipa)
                         WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=5)
                         """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("staff.nume")+" "+rs.getString("staff.prenume");
                        //String prenume=rs.getString("staff.prenume");
                        String functie=rs.getString("staff.functie");
                        Date data_angajare=rs.getDate("staff.incepere_contract");
                        Date data_plecare=rs.getDate("staff.sfarsit_contract");
                        String telefon=rs.getString("staff.telefon");
                        int experienta=rs.getInt("staff.experienta");
                        String nume_echipa=rs.getString("echipa.nume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata1 = sdf.format(data_angajare);
                        if(data_plecare==null){
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,"-",telefon,experienta}); 
                        }
                        else 
                        {
                            String dataFormatata2=sdf.format(data_plecare);
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,dataFormatata2,telefon,experienta});
                        }
                    }
                }
            }else if(Team.selectedTeam==Team.BAYERN_MUNICH){
                query="""
                         SELECT staff.nume,staff.prenume,staff.functie,staff.incepere_contract,staff.sfarsit_contract,staff.telefon,
                         staff.experienta,echipa.nume FROM staff
                         JOIN echipa ON (staff.id_echipa=echipa.id_echipa)
                         WHERE echipa.id_echipa=(SELECT e.id_echipa FROM echipa e WHERE e.id_echipa=6)
                         """;
                try(java.sql.PreparedStatement pst=conn.prepareStatement(query);
                    java.sql.ResultSet rs=pst.executeQuery()){
                    while(rs.next()){
                        String nume=rs.getString("staff.nume")+" "+rs.getString("staff.prenume");
                        //String prenume=rs.getString("staff.prenume");
                        String functie=rs.getString("staff.functie");
                        Date data_angajare=rs.getDate("staff.incepere_contract");
                        Date data_plecare=rs.getDate("staff.sfarsit_contract");
                        String telefon=rs.getString("staff.telefon");
                        int experienta=rs.getInt("staff.experienta");
                        String nume_echipa=rs.getString("echipa.nume");
                        // Formatare data intr-un format mai prietenos 
                        java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd-MM-yyyy");
                        String dataFormatata1 = sdf.format(data_angajare);
                        if(data_plecare==null){
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,"-",telefon,experienta}); 
                        }
                        else 
                        {
                            String dataFormatata2=sdf.format(data_plecare);
                            model.addRow(new Object[]{nume,nume_echipa,functie,dataFormatata1,dataFormatata2,telefon,experienta});
                        }
                    }
                }
            }
        }catch(Exception e){
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this,"Eroare la incarcarea datelor"+e.getMessage(),"Eroare"
            ,javax.swing.JOptionPane.ERROR_MESSAGE); 
        }
        jTable1.setModel(model);
    javax.swing.table.JTableHeader header = jTable1.getTableHeader();
    javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
    header.setDefaultRenderer(centerRenderer);
    header.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK)); // Adauga bordura header
    // Centrare text în celule
    centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
    for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    jTable1.setRowHeight(25);
    jTable1.setFillsViewportHeight(true);
    jScrollPane1.setPreferredSize(new Dimension(CenterPanel.getWidth(), CenterPanel.getHeight()));
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
        
    }//GEN-LAST:event_StaffButActionPerformed

    private void ClasamentButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClasamentButActionPerformed
        // TODO add your handling code here:
    CenterPanel.setVisible(true);
    String[] columnNames = {"POZITIE", "ECHIPA", "MJ", "PCT", "GM", "GP", "GOLAVERAJ"};
    javax.swing.table.DefaultTableModel model = new javax.swing.table.DefaultTableModel(columnNames,0);
    model.setColumnIdentifiers(columnNames);
    try (Connection conn = DatabaseConnection.getConnection()) {
        String query = """
            SELECT 
                e.id_echipa,
                e.nume,
                COUNT(*) as meciuri_jucate,
                SUM(CASE 
                    WHEN p1.nr_goluri > p2.nr_goluri THEN 3
                    WHEN p1.nr_goluri = p2.nr_goluri THEN 1
                    ELSE 0
                END) as puncte_totale,
                SUM(p1.nr_goluri) as goluri_marcate,
                SUM(p2.nr_goluri) as goluri_primite
            FROM     echipa e   
            JOIN participare p1 ON e.id_echipa = p1.id_echipa
            JOIN meciuri m ON p1.id_meci = m.id_meci
            JOIN participare p2 ON m.id_meci = p2.id_meci AND p2.id_echipa != p1.id_echipa
            GROUP BY e.id_echipa, e.nume
            ORDER BY puncte_totale DESC, (SUM(p1.nr_goluri) - SUM(p2.nr_goluri)) DESC
            """;
            
        try (java.sql.PreparedStatement pst = conn.prepareStatement(query);
             java.sql.ResultSet rs = pst.executeQuery()) {
            
            int pozitie = 1;
            while (rs.next()) {
                String numeEchipa = rs.getString("nume");
                int meciuriJucate = rs.getInt("meciuri_jucate");
                int puncte = rs.getInt("puncte_totale");
                int goluriMarcate = rs.getInt("goluri_marcate");
                int goluriPrimite = rs.getInt("goluri_primite");
                int golaveraj = goluriMarcate - goluriPrimite;
                
                // Adaugare rand in model
                model.addRow(new Object[]{
                    pozitie,
                    numeEchipa,
                    meciuriJucate,
                    puncte,
                    goluriMarcate,
                    goluriPrimite,
                    golaveraj
                });
                pozitie++;
            }
        }
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, 
            "Eroare la încărcarea datelor: " + e.getMessage(),
            "Eroare", 
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    jTable1.setModel(model);
    jScrollPane1.setColumnHeaderView(jTable1.getTableHeader());
    //Pentru header
    javax.swing.table.JTableHeader header = jTable1.getTableHeader();
    javax.swing.table.DefaultTableCellRenderer centerRenderer = new javax.swing.table.DefaultTableCellRenderer();
    header.setDefaultRenderer(centerRenderer);
    header.setBorder(javax.swing.BorderFactory.createLineBorder(java.awt.Color.BLACK)); // Adauga bordura header
    // Centrare text în celule
    centerRenderer.setHorizontalAlignment(javax.swing.JLabel.CENTER);
    for (int i = 0; i < jTable1.getColumnCount(); i++) {
        jTable1.getColumnModel().getColumn(i).setCellRenderer(centerRenderer);
    }
    
    jTable1.setRowHeight(25);
    jTable1.setFillsViewportHeight(true);
    jScrollPane1.setPreferredSize(new Dimension(CenterPanel.getWidth(), CenterPanel.getHeight()));
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
    jScrollPane1.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
        
    }//GEN-LAST:event_ClasamentButActionPerformed

    private void LeftPanelMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_LeftPanelMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_LeftPanelMouseWheelMoved

    private void CancelButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelButActionPerformed
        // TODO add your handling code here:
        ///PENTRU ADD BUTTON
        if(AddButPressed){
            AddButPressed=false;
            AddMeciuriBut.setVisible(false);
            AddJucatoriBut.setVisible(false);
            AddStaffBut.setVisible(false);
            AdaugaBut.setVisible(false);
            
            Gazda.setVisible(false);
            Oaspete.setVisible(false);
            Data.setVisible(false);
            GazdaText.setVisible(false);
            GazdaText.setText("");
            OaspeteText.setVisible(false);
            OaspeteText.setText("");
            DataText.setVisible(false);
            DataText.setText("");
            Meciuri=false;
            
            Nume.setVisible(false);
            Prenume.setVisible(false);
            Functie.setVisible(false);
            IncepereContract.setVisible(false);
            SfarsitContract.setVisible(false);
            Telefon.setVisible(false);
            Experienta.setVisible(false);
            Echipa.setVisible(false);
            NumeText.setText("");
            NumeText.setVisible(false);
            PrenumeText.setText("");
            PrenumeText.setVisible(false);
            FunctieText.setText("");
            FunctieText.setVisible(false);
            IncepereContractText.setText("");
            IncepereContractText.setVisible(false);
            SfarsitContractText.setText("");
            SfarsitContractText.setVisible(false);
            TelefonText.setText("");
            TelefonText.setVisible(false);
            ExperientaText.setText("");
            ExperientaText.setVisible(false);
            EchipaText.setText("");
            EchipaText.setVisible(false);
            Staff=false;
            
            Jucatori=false;
            Nume.setVisible(false);
            Prenume.setVisible(false);
            DataNastere.setVisible(false);
            Forma.setVisible(false);
            Pozitie.setVisible(false);
            Valoare.setVisible(false);
            Picior.setVisible(false);
            Echipa.setVisible(false);
            Disponibilitate.setVisible(false);
            NumeText.setVisible(false);
            PrenumeText.setVisible(false);
            DataNastereText.setVisible(false);
            FormaText.setVisible(false);
            PozitieText.setVisible(false);
            ValoareText.setVisible(false);
            PiciorText.setVisible(false);
            EchipaText.setVisible(false);
            DisponibilitateText.setVisible(false);
            
            DeleteBut.setVisible(true);
            AddBut.setVisible(true);
            UpdateBut.setVisible(true);
            
        }else if(DeleteButPressed){
            ///PENTRU DELETE BUTTON
            DeleteMeciuriBut.setVisible(false);
            DeleteStaffBut.setVisible(false);
            DeleteJucatoriBut.setVisible(false);
            
            Gazda.setVisible(false);
            Oaspete.setVisible(false);
            Data.setVisible(false);
            GazdaText.setVisible(false);
            OaspeteText.setVisible(false);
            DataText.setVisible(false);
            StergeBut.setVisible(false);
            
            Nume.setVisible(false);
            Prenume.setVisible(false);
            Functie.setVisible(false);
            Echipa.setVisible(false);
            NumeText.setVisible(false);
            PrenumeText.setVisible(false);
            FunctieText.setVisible(false);
            EchipaText.setVisible(false);
            
            Jucatori=false;
            Nume.setVisible(false);
            Prenume.setVisible(false);
            Echipa.setVisible(false);
            Pozitie.setVisible(false);
            NumeText.setVisible(false);
            PrenumeText.setVisible(false);
            EchipaText.setVisible(false);
            PozitieText.setVisible(false);
              
        }else if(UpdateButPressed){
            ///PENTRU UPDATE BUTTON
            UpdateMeciuriBut.setVisible(false);
            UpdateStaffBut.setVisible(false);
            UpdateJucatoriBut.setVisible(false);
            ModificaBut.setVisible(false);
            Gazda.setVisible(false);
            Oaspete.setVisible(false);
            Data.setVisible(false);
            GazdaText.setVisible(false);
            OaspeteText.setVisible(false);
            DataText.setVisible(false);
            
            Jucatori=false;
            Nume.setVisible(false);
            Prenume.setVisible(false);
            DataNastere.setVisible(false);
            Forma.setVisible(false);
            Pozitie.setVisible(false);
            Valoare.setVisible(false);
            Picior.setVisible(false);
            Echipa.setVisible(false);
            Disponibilitate.setVisible(false);
            NumeText.setVisible(false);
            PrenumeText.setVisible(false);
            DataNastereText.setVisible(false);
            FormaText.setVisible(false);
            PozitieText.setVisible(false);
            ValoareText.setVisible(false);
            PiciorText.setVisible(false);
            EchipaText.setVisible(false);
            DisponibilitateText.setVisible(false);
            
            Nume.setVisible(false);
            Prenume.setVisible(false);
            Functie.setVisible(false);
            IncepereContract.setVisible(false);
            SfarsitContract.setVisible(false);
            Telefon.setVisible(false);
            Experienta.setVisible(false);
            Echipa.setVisible(false);
            NumeText.setText("");
            NumeText.setVisible(false);
            PrenumeText.setText("");
            PrenumeText.setVisible(false);
            FunctieText.setText("");
            FunctieText.setVisible(false);
            IncepereContractText.setText("");
            IncepereContractText.setVisible(false);
            SfarsitContractText.setText("");
            SfarsitContractText.setVisible(false);
            TelefonText.setText("");
            TelefonText.setVisible(false);
            ExperientaText.setText("");
            ExperientaText.setVisible(false);
            EchipaText.setText("");
            EchipaText.setVisible(false);
            Staff=false;
            
            ModificaBut.setVisible(false);
            UpdateMeciuriBut.setVisible(false);
            UpdateStaffBut.setVisible(false);
           UpdateJucatoriBut.setVisible(false);

            
            
            
        }
        
        
        
        DeleteBut.setVisible(true);
        AddBut.setVisible(true);
        UpdateBut.setVisible(true);
        CancelBut.setVisible(false);

    }//GEN-LAST:event_CancelButActionPerformed
    public boolean Staff=false;
    private void AddStaffButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddStaffButActionPerformed
        // TODO add your handling code here:
        ///Curatam Meciuri si Jucatori
        Gazda.setVisible(false);
        Oaspete.setVisible(false);
        Data.setVisible(false);
        GazdaText.setVisible(false);
        GazdaText.setText("");
        OaspeteText.setVisible(false);
        OaspeteText.setText("");
        DataText.setVisible(false);
        DataText.setText("");
        Meciuri=false;
        
        Jucatori=false;
        Nume.setVisible(false);
        Prenume.setVisible(false);
        DataNastere.setVisible(false);
        Forma.setVisible(false);
        Pozitie.setVisible(false);
        Valoare.setVisible(false);
        Picior.setVisible(false);
        Echipa.setVisible(false);
        Disponibilitate.setVisible(false);
        NumeText.setVisible(false);
        PrenumeText.setVisible(false);
        DataNastereText.setVisible(false);
        FormaText.setVisible(false);
        PozitieText.setVisible(false);
        ValoareText.setVisible(false);
        PiciorText.setVisible(false);
        EchipaText.setVisible(false);
        DisponibilitateText.setVisible(false);
        
        DeleteBut.setVisible(false);
        AddBut.setVisible(false);
        UpdateBut.setVisible(false);
        
        Staff=true;
        Nume.setVisible(true);
            Prenume.setVisible(true);
            Functie.setVisible(true);
            IncepereContract.setVisible(true);
            SfarsitContract.setVisible(true);
            Telefon.setVisible(true);
            Experienta.setVisible(true);
            Echipa.setVisible(true);
            NumeText.setVisible(true);
            PrenumeText.setVisible(true);
            FunctieText.setVisible(true);
            IncepereContractText.setVisible(true);
            SfarsitContractText.setVisible(true);
            TelefonText.setVisible(true);
            ExperientaText.setVisible(true);
            EchipaText.setVisible(true);
            AdaugaBut.setVisible(true);
            gbc.insets = new Insets(5, 5,5, 5);  // Spacing between components
           //Nume si Text
           gbc.gridy=5;
           gbc.gridx=0;
           LeftPanel.add(Nume,gbc);
           gbc.gridx=1;
           LeftPanel.add(NumeText,gbc);
           
           //Prenume si Text
           gbc.gridy=6;
           gbc.gridx=0;
           LeftPanel.add(Prenume,gbc);
           gbc.gridx=1;
           LeftPanel.add(PrenumeText,gbc);
           
           //Functie si Text
           gbc.gridy=7;
           gbc.gridx=0;
           LeftPanel.add(Functie,gbc);
           gbc.gridx=1;
           LeftPanel.add(FunctieText,gbc);
           
           //Incepere Contract si Text
           gbc.gridy=8;
           gbc.gridx=0;
           LeftPanel.add(IncepereContract,gbc);
           gbc.gridx=1;
           LeftPanel.add(IncepereContractText,gbc);
           
           //Sfarsit Contract si Text
           gbc.gridy=9;
           gbc.gridx=0;
           LeftPanel.add(SfarsitContract,gbc);
           gbc.gridx=1;
           LeftPanel.add(SfarsitContractText,gbc);
           
           //Telefon si Text
           gbc.gridy=10;
           gbc.gridx=0;
           LeftPanel.add(Telefon,gbc);
           gbc.gridx=1;
           LeftPanel.add(TelefonText,gbc);
           
           //Experienta si Text
           gbc.gridy=11;
           gbc.gridx=0;
           LeftPanel.add(Experienta,gbc);
           gbc.gridx=1;
           LeftPanel.add(ExperientaText,gbc);
           
           //Echipa si Text
           gbc.gridy=12;
           gbc.gridx=0;
           LeftPanel.add(Echipa,gbc);
           gbc.gridx=1;
           LeftPanel.add(EchipaText,gbc);
           ///Butonul de adaugare
            gbc.gridx = 0;
            gbc.gridy = 13;
            gbc.gridwidth = 3;  // Span peste toate coloanele
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
            gbc.anchor = GridBagConstraints.SOUTH;
            gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
            LeftPanel.add(AdaugaBut, gbc);
           
           
        
    }//GEN-LAST:event_AddStaffButActionPerformed
    public boolean Jucatori=false;
    private void AddJucatoriButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddJucatoriButActionPerformed
        // TODO add your handling code here:
        //Curatam Staff si Meciuri
        Nume.setVisible(false);
        Prenume.setVisible(false);
        Functie.setVisible(false);
        IncepereContract.setVisible(false);
        SfarsitContract.setVisible(false);
        Telefon.setVisible(false);
        Experienta.setVisible(false);
        Echipa.setVisible(false);
        NumeText.setText("");
        NumeText.setVisible(false);
        PrenumeText.setText("");
        PrenumeText.setVisible(false);
        FunctieText.setText("");
        FunctieText.setVisible(false);
        IncepereContractText.setText("");
        IncepereContractText.setVisible(false);
        SfarsitContractText.setText("");
        SfarsitContractText.setVisible(false);
        TelefonText.setText("");
        TelefonText.setVisible(false);
        ExperientaText.setText("");
        ExperientaText.setVisible(false);
        EchipaText.setText("");
        EchipaText.setVisible(false);
        Staff=false;
        Gazda.setVisible(false);
        Oaspete.setVisible(false);
        Data.setVisible(false);
        GazdaText.setVisible(false);
        GazdaText.setText("");
        OaspeteText.setVisible(false);
        OaspeteText.setText("");
        DataText.setVisible(false);
        DataText.setText("");
        Meciuri=false;
        
        DeleteBut.setVisible(false);
        AddBut.setVisible(false);
        UpdateBut.setVisible(false);
        
        AdaugaBut.setVisible(true);
        Jucatori=true;
        Nume.setVisible(true);
            Prenume.setVisible(true);
            DataNastere.setVisible(true);
            Forma.setVisible(true);
            Pozitie.setVisible(true);
            Valoare.setVisible(true);
            Picior.setVisible(true);
            Echipa.setVisible(true);
            Disponibilitate.setVisible(true);
            NumeText.setVisible(true);
            PrenumeText.setVisible(true);
            DataNastereText.setVisible(true);
            FormaText.setVisible(true);
            PozitieText.setVisible(true);
            ValoareText.setVisible(true);
            PiciorText.setVisible(true);
            EchipaText.setVisible(true);
            DisponibilitateText.setVisible(true);
            
            gbc.insets = new Insets(5, 5,5, 5);  // Spacing between components
           //Nume si Text
           gbc.gridy=5;
           gbc.gridx=0;
           LeftPanel.add(Nume,gbc);
           gbc.gridx=1;
           LeftPanel.add(NumeText,gbc);
           
           //Prenume si Text
           gbc.gridy=6;
           gbc.gridx=0;
           LeftPanel.add(Prenume,gbc);
           gbc.gridx=1;
           LeftPanel.add(PrenumeText,gbc);
           
           //Data nastere si Text
           gbc.gridy=7;
           gbc.gridx=0;
           LeftPanel.add(DataNastere,gbc);
           gbc.gridx=1;
           LeftPanel.add(DataNastereText,gbc);
           
           //Forma si Text
           gbc.gridy=8;
           gbc.gridx=0;
           LeftPanel.add(Forma,gbc);
           gbc.gridx=1;
           LeftPanel.add(FormaText,gbc);
           
           //Pozitie si Text
           gbc.gridy=9;
           gbc.gridx=0;
           LeftPanel.add(Pozitie,gbc);
           gbc.gridx=1;
           LeftPanel.add(PozitieText,gbc);
           
           //Valoare si Text
           gbc.gridy=10;
           gbc.gridx=0;
           LeftPanel.add(Valoare,gbc);
           gbc.gridx=1;
           LeftPanel.add(ValoareText,gbc);
           
           //Picior si Text
           gbc.gridy=11;
           gbc.gridx=0;
           LeftPanel.add(Picior,gbc);
           gbc.gridx=1;
           LeftPanel.add(PiciorText,gbc);
           
           //Echipa si Text
           gbc.gridy=12;
           gbc.gridx=0;
           LeftPanel.add(Echipa,gbc);
           gbc.gridx=1;
           LeftPanel.add(EchipaText,gbc);
           
           //Disponibilitate si Text
           gbc.gridy=13;
           gbc.gridx=0;
           LeftPanel.add(Disponibilitate,gbc);
           gbc.gridx=1;
           LeftPanel.add(DisponibilitateText,gbc);
           
           ///Butonul de adaugare
            gbc.gridx = 0;
            gbc.gridy = 14;
            gbc.gridwidth = 3;  // Span peste toate coloanele
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
            gbc.anchor = GridBagConstraints.SOUTH;
            gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
            LeftPanel.add(AdaugaBut, gbc);
        
    }//GEN-LAST:event_AddJucatoriButActionPerformed
    public boolean Meciuri=false; 
    private void AddMeciuriButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddMeciuriButActionPerformed
        // TODO add your handling code here:
        ///Curatam Staff si Jucatori
        Nume.setVisible(false);
        Prenume.setVisible(false);
        Functie.setVisible(false);
        IncepereContract.setVisible(false);
        SfarsitContract.setVisible(false);
        Telefon.setVisible(false);
        Experienta.setVisible(false);
        Echipa.setVisible(false);
        NumeText.setText("");
        NumeText.setVisible(false);
        PrenumeText.setText("");
        PrenumeText.setVisible(false);
        FunctieText.setText("");
        FunctieText.setVisible(false);
        IncepereContractText.setText("");
        IncepereContractText.setVisible(false);
        SfarsitContractText.setText("");
        SfarsitContractText.setVisible(false);
        TelefonText.setText("");
        TelefonText.setVisible(false);
        ExperientaText.setText("");
        ExperientaText.setVisible(false);
        EchipaText.setText("");
        EchipaText.setVisible(false);
        Staff=false;
        
        DeleteBut.setVisible(false);
        AddBut.setVisible(false);
        UpdateBut.setVisible(false);
        
        Jucatori=false;
        Nume.setVisible(false);
        Prenume.setVisible(false);
        DataNastere.setVisible(false);
        Forma.setVisible(false);
        Pozitie.setVisible(false);
        Valoare.setVisible(false);
        Picior.setVisible(false);
        Echipa.setVisible(false);
        Disponibilitate.setVisible(false);
        NumeText.setVisible(false);
        PrenumeText.setVisible(false);
        DataNastereText.setVisible(false);
        FormaText.setVisible(false);
        PozitieText.setVisible(false);
        ValoareText.setVisible(false);
        PiciorText.setVisible(false);
        EchipaText.setVisible(false);
        DisponibilitateText.setVisible(false);
            
        Meciuri=true;
        Gazda.setVisible(true);
        Oaspete.setVisible(true);
        Data.setVisible(true);
        GazdaText.setVisible(true);
        OaspeteText.setVisible(true);
        DataText.setVisible(true);
        AdaugaBut.setVisible(true);
        gbc.insets = new Insets(5, 5,5, 5);  // Spacing between components
        ///Gazda si Textul
        gbc.gridy=5;
        gbc.gridx=0;
        
        LeftPanel.add(Gazda,gbc);
        gbc.gridx=1;
        LeftPanel.add(GazdaText,gbc);
        
        ///Oaspete si Textul
        gbc.gridy=6;
        gbc.gridx=0;
        LeftPanel.add(Oaspete,gbc);
        gbc.gridx=1;
        LeftPanel.add(OaspeteText,gbc);
        
        ///Data si Textul
        gbc.gridy=7;
        gbc.gridx=0;
        LeftPanel.add(Data,gbc);
        gbc.gridx=1;
        LeftPanel.add(DataText,gbc);
        
        ///Butonul de adaugare
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 3;  // Span peste toate coloanele
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty = 0.1;  // Valoare mai mica pentru a-l tine aproape de celelalte butoane
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(0, 0, 5, 0);  // Resetam insets pentru Back button
        LeftPanel.add(AdaugaBut, gbc);
    }//GEN-LAST:event_AddMeciuriButActionPerformed

    private void all_teamsMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_all_teamsMousePressed
        // TODO add your handling code here:
        Team.selectedTeam=Team.ALL;
    }//GEN-LAST:event_all_teamsMousePressed
    public boolean DeleteButPressed=false;
    private void DeleteButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteButActionPerformed
        // TODO add your handling code here:
        DeleteButPressed=true;
        CancelBut.setVisible(true);
        DeleteMeciuriBut.setVisible(true);
        DeleteStaffBut.setVisible(true);
        DeleteJucatoriBut.setVisible(true);
        
        DeleteBut.setVisible(false);
        AddBut.setVisible(false);
        UpdateBut.setVisible(false);
        
        gbc.gridy = 3;
        gbc.gridwidth = 1;  // Resetăm la 1 pentru butoanele individuale
        //gbc.weighty = 2.5;  // Împinge butoanele în jos
        gbc.weightx = 0.1;  // Distribuie spațiul orizontal egal
        gbc.fill = GridBagConstraints.NONE;  // Nu extinde butoanele
        gbc.insets = new Insets(0, 5, 5, 5);  // Adaugă spațiu între butoane

        // Cele 3 butoane pe același rând
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        LeftPanel.add(DeleteMeciuriBut, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.SOUTH;
        LeftPanel.add(DeleteStaffBut, gbc);

        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        LeftPanel.add(DeleteJucatoriBut, gbc);
        
         // Butonul Cancel pe rândul următor
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;  // Span peste toate coloanele
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
        LeftPanel.add(CancelBut, gbc);
        
        
        
        
        
    }//GEN-LAST:event_DeleteButActionPerformed
    public boolean AddButPressed=false;  
    private void AddButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddButActionPerformed
        // TODO add your handling code here:
        AddButPressed=true;
        CancelBut.setVisible(true);
        AddMeciuriBut.setVisible(true);
        AddJucatoriBut.setVisible(true);
        AddStaffBut.setVisible(true);
        DeleteBut.setVisible(false);
        AddBut.setVisible(false);
        UpdateBut.setVisible(false);
        //AdaugaStaffBut.setVisible(true);
        // Configurare pentru rândul cu cele 3 butoane
        gbc.gridy = 3;
        gbc.gridwidth = 1;  // Resetăm la 1 pentru butoanele individuale
        //gbc.weighty = 2.5;  // Împinge butoanele în jos
        gbc.weightx = 0.1;  // Distribuie spațiul orizontal egal
        gbc.fill = GridBagConstraints.NONE;  // Nu extinde butoanele
        gbc.insets = new Insets(0, 5, 5, 5);  // Adaugă spațiu între butoane

        // Cele 3 butoane pe același rând
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        LeftPanel.add(AddMeciuriBut, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.SOUTH;
        LeftPanel.add(AddStaffBut, gbc);

        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        LeftPanel.add(AddJucatoriBut, gbc);
        

        // Butonul Cancel pe rândul următor
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;  // Span peste toate coloanele
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
        LeftPanel.add(CancelBut, gbc);

    }//GEN-LAST:event_AddButActionPerformed

    private void AddButMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AddButMousePressed
        // TODO add your handling code here:
        //AddButPressed=true;
    }//GEN-LAST:event_AddButMousePressed
    public boolean UpdateButPressed=false;
    private void UpdateButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateButActionPerformed
        // TODO add your handling code here:
        UpdateButPressed=true;
        CancelBut.setVisible(true);
        UpdateMeciuriBut.setVisible(true);
        UpdateJucatoriBut.setVisible(true);
        UpdateStaffBut.setVisible(true);
        DeleteBut.setVisible(false);
        AddBut.setVisible(false);
        UpdateBut.setVisible(false);
        //AdaugaStaffBut.setVisible(true);
        // Configurare pentru rândul cu cele 3 butoane
        gbc.gridy = 3;
        gbc.gridwidth = 1;  // Resetăm la 1 pentru butoanele individuale
        //gbc.weighty = 2.5;  // Împinge butoanele în jos
        gbc.weightx = 0.1;  // Distribuie spațiul orizontal egal
        gbc.fill = GridBagConstraints.NONE;  // Nu extinde butoanele
        gbc.insets = new Insets(0, 5, 5, 5);  // Adaugă spațiu între butoane

        // Cele 3 butoane pe același rând
        gbc.gridx = 0;
        gbc.anchor = GridBagConstraints.SOUTHWEST;
        LeftPanel.add(UpdateMeciuriBut, gbc);

        gbc.gridx = 1;
        gbc.anchor = GridBagConstraints.SOUTH;
        LeftPanel.add(UpdateStaffBut, gbc);

        gbc.gridx = 2;
        gbc.anchor = GridBagConstraints.SOUTHEAST;
        LeftPanel.add(UpdateJucatoriBut, gbc);
        

        // Butonul Cancel pe rândul următor
        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 3;  // Span peste toate coloanele
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
        LeftPanel.add(CancelBut, gbc);
        
        
    }//GEN-LAST:event_UpdateButActionPerformed

    private void bayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_bayMousePressed
        // TODO add your handling code here:
        Team.selectedTeam=Team.BAYERN_MUNICH;
    }//GEN-LAST:event_bayMousePressed

    private void acmMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_acmMousePressed
        // TODO add your handling code here:
        Team.selectedTeam=Team.MILAN;
    }//GEN-LAST:event_acmMousePressed

    private void livMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_livMousePressed
        // TODO add your handling code here:
        Team.selectedTeam=Team.LIVERPOOL;
    }//GEN-LAST:event_livMousePressed

    private void cityMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cityMousePressed
        // TODO add your handling code here:
        Team.selectedTeam=Team.MANCHESTER_CITY;
    }//GEN-LAST:event_cityMousePressed

    private void realMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_realMousePressed
        // TODO add your handling code here:
        Team.selectedTeam=Team.REAL_MADRID;
        //if(Team.selectedTeam==Team.BARCELONA)
    }//GEN-LAST:event_realMousePressed

    private void barcaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barcaMousePressed
        // TODO add your handling code here:
        Team.selectedTeam=Team.BARCELONA;
        //if(Team.selectedTeam==Team.BARCELONA)
        //System.out.print("sal");
    }//GEN-LAST:event_barcaMousePressed

    private void BackButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackButActionPerformed
        // TODO add your handling code here:
        LogIn lognin=new LogIn();
        lognin.setVisible(true);
        this.setVisible(false);
        Team.selectedTeam=Team.ALL;
    }//GEN-LAST:event_BackButActionPerformed

    private void GazdaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GazdaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_GazdaTextActionPerformed

    private void OaspeteTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OaspeteTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_OaspeteTextActionPerformed

    private void DataTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataTextActionPerformed

    private void AdaugaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdaugaButActionPerformed
        // TODO add your handling code here:
        if(Meciuri){
    // Validăm ca toate campurile sunt completate
    if (GazdaText.getText().trim().isEmpty() || 
        OaspeteText.getText().trim().isEmpty() || 
        DataText.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Toate campurile trebuie completate!",
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    // Validam data
    try {
        java.sql.Date dataMeci = java.sql.Date.valueOf(DataText.getText());
        java.sql.Date dataCurenta = new java.sql.Date(System.currentTimeMillis());
    
        if (dataMeci.before(dataCurenta)) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Data meciului trebuie sa fie in viitor!",
                "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
    } catch (IllegalArgumentException e) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Data introdusa nu este valida! Folositi formatul YYYY-MM-DD",
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    try (Connection conn = DatabaseConnection.getConnection()) {
        conn.setAutoCommit(false);
    
        // Validam ca echipa gazda exista
        String queryGazda = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
        PreparedStatement psGazda = conn.prepareStatement(queryGazda);
        psGazda.setString(1, GazdaText.getText().trim());
        ResultSet rsGazda = psGazda.executeQuery();
    
        if (!rsGazda.next()) {
            throw new Exception("Echipa gazda '" + GazdaText.getText() + "' nu exista in baza de date!");
        }
        int idGazda = rsGazda.getInt("id_echipa");
    
        // Validam ca echipa oaspete exista
        String queryOaspete = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
        PreparedStatement psOaspete = conn.prepareStatement(queryOaspete);
        psOaspete.setString(1, OaspeteText.getText().trim());
        ResultSet rsOaspete = psOaspete.executeQuery();
    
        if (!rsOaspete.next()) {
            throw new Exception("Echipa oaspete '" + OaspeteText.getText() + "' nu exista in baza de date!");
        }
        int idOaspete = rsOaspete.getInt("id_echipa");
    
        // Verificam ca echipele sunt diferite
        if (idGazda == idOaspete) {
            throw new Exception("Echipa gazda nu poate fi aceeasi cu echipa oaspete!");
        }

        // Verificam daca exista deja un meci cu aceeasi configuratie gazda-oaspete
        String queryVerificareRoluri = """
            SELECT COUNT(*) as numar_meciuri
            FROM meciuri m
            JOIN participare p1 ON m.id_meci = p1.id_meci AND p1.rol = 'gazda'
            JOIN participare p2 ON m.id_meci = p2.id_meci AND p2.rol = 'oaspete'
            WHERE p1.id_echipa = ? AND p2.id_echipa = ?
        """;
        PreparedStatement psVerificareRoluri = conn.prepareStatement(queryVerificareRoluri);
        psVerificareRoluri.setInt(1, idGazda);
        psVerificareRoluri.setInt(2, idOaspete);
        ResultSet rsVerificareRoluri = psVerificareRoluri.executeQuery();

        if (rsVerificareRoluri.next() && rsVerificareRoluri.getInt("numar_meciuri") > 0) {
            throw new Exception("Exista deja un meci programat cu " + GazdaText.getText() + 
                " gazda si " + OaspeteText.getText() + " oaspete!");
        }
        
        // Obtinem id-ul stadionului echipei gazde
        String queryStadion = "SELECT id_stadion FROM stadion WHERE id_echipa = ?";
        PreparedStatement psStadion = conn.prepareStatement(queryStadion);
        psStadion.setInt(1, idGazda);
        ResultSet rsStadion = psStadion.executeQuery();
        
        if (!rsStadion.next()) {
            throw new Exception("Nu s-a gasit stadionul echipei gazda!");
        }
        int idStadion = rsStadion.getInt("id_stadion");
        
        // Verificam daca exista deja un meci programat la aceeasi data pe acelasi stadion
        String queryVerificareMeci = "SELECT m.id_meci FROM meciuri m WHERE m.id_stadion = ? AND m.data = ?";
        PreparedStatement psVerificare = conn.prepareStatement(queryVerificareMeci);
        psVerificare.setInt(1, idStadion);
        psVerificare.setDate(2, java.sql.Date.valueOf(DataText.getText()));
        ResultSet rsVerificare = psVerificare.executeQuery();
        
        if (rsVerificare.next()) {
            throw new Exception("Exista deja un meci programat la aceasta data pe acest stadion!");
        }
        
        // Inseram meciul si obtinem ID-ul generat
        String insertMeci = "INSERT INTO meciuri (data, id_stadion) VALUES (?, ?)";
        PreparedStatement psMeci = conn.prepareStatement(insertMeci, Statement.RETURN_GENERATED_KEYS);
        psMeci.setDate(1, java.sql.Date.valueOf(DataText.getText()));
        psMeci.setInt(2, idStadion);
        psMeci.executeUpdate();
        
        ResultSet generatedKeys = psMeci.getGeneratedKeys();
        if (!generatedKeys.next()) {
            throw new Exception("Nu s-a putut obtine ID-ul meciului creat!");
        }
        int idMeci = generatedKeys.getInt(1);
        
        // Inseram participarea pentru gazda
        String insertParticipareGazda = "INSERT INTO participare (id_echipa, id_meci, rol, nr_goluri) VALUES (?, ?, 'gazda', NULL)";
        PreparedStatement psPartGazda = conn.prepareStatement(insertParticipareGazda);
        psPartGazda.setInt(1, idGazda);
        psPartGazda.setInt(2, idMeci);
        psPartGazda.executeUpdate();
        
        // Inseram participarea pentru oaspete
        String insertParticipareOaspete = "INSERT INTO participare (id_echipa, id_meci, rol, nr_goluri) VALUES (?, ?, 'oaspete', NULL)";
        PreparedStatement psPartOaspete = conn.prepareStatement(insertParticipareOaspete);
        psPartOaspete.setInt(1, idOaspete);
        psPartOaspete.setInt(2, idMeci);
        psPartOaspete.executeUpdate();
        
        conn.commit();
        
        // Curatam campurile dupa adaugarea cu succes
        GazdaText.setText("");
        OaspeteText.setText("");
        DataText.setText("");
        
        javax.swing.JOptionPane.showMessageDialog(this,
            "Meciul a fost adaugat cu succes!",
            "Succes",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,
            "Eroare la adaugarea meciului: " + e.getMessage(),
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
    else if(Staff){
        ///validam ca toate campurile sa fie completate
        if (NumeText.getText().trim().isEmpty() || 
            PrenumeText.getText().trim().isEmpty() || 
            FunctieText.getText().trim().isEmpty()||
            IncepereContractText.getText().trim().isEmpty() ||
            SfarsitContractText.getText().trim().isEmpty() ||
            TelefonText.getText().trim().isEmpty()    ||
            ExperientaText.getText().trim().isEmpty() ||
            EchipaText.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Toate campurile trebuie completate!",
                "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        ///Validare pentru telefon
        String telefon=TelefonText.getText().trim();
        if (!telefon.matches("\\d{10}")) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Numarul de telefon trebuie sa contina exact 10 cifre!",
                "Eroare",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }
        try {
        // Validare date contract
        java.sql.Date dataInceput = java.sql.Date.valueOf(IncepereContractText.getText());
        java.sql.Date dataSfarsit = java.sql.Date.valueOf(SfarsitContractText.getText());
        java.sql.Date dataCurenta = new java.sql.Date(System.currentTimeMillis());
        
        // Verifica daca data de inceput este în viitor
        if (dataInceput.before(dataCurenta)) {
            throw new Exception("Data de inceput a contractului trebuie sa fie in viitor!");
        }
        
        // Calculeaza diferenta de 2 ani
        Calendar calInceput = Calendar.getInstance();
        calInceput.setTime(dataInceput);
        Calendar calSfarsit = Calendar.getInstance();
        calSfarsit.setTime(dataSfarsit);
        
        // Calculam diferenta in ani
        int ani = calSfarsit.get(Calendar.YEAR) - calInceput.get(Calendar.YEAR);
        if (calSfarsit.get(Calendar.MONTH) < calInceput.get(Calendar.MONTH) ||
            (calSfarsit.get(Calendar.MONTH) == calInceput.get(Calendar.MONTH) &&
             calSfarsit.get(Calendar.DAY_OF_MONTH) < calInceput.get(Calendar.DAY_OF_MONTH))) {
            ani--;
        }
        
        if (ani < 2) {
            throw new Exception("Contractul trebuie sa fie de minim 2 ani!");
        }
        
        // Validare experienta sa fie numar
        int experienta;
        try {
            experienta = Integer.parseInt(ExperientaText.getText().trim());
            if (experienta < 0) {
                throw new Exception("Experiența trebuie să fie un număr pozitiv!");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Experienta trebuie sa fie un numar!");
        }
        
        try (Connection conn = DatabaseConnection.getConnection()) {
            // Verificam daca echipa exista
            String queryEchipa = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
            PreparedStatement psEchipa = conn.prepareStatement(queryEchipa);
            psEchipa.setString(1, EchipaText.getText().trim());
            ResultSet rsEchipa = psEchipa.executeQuery();
            
            if (!rsEchipa.next()) {
                throw new Exception("Echipa introdusa nu exista in baza de date!");
            }
            int idEchipa = rsEchipa.getInt("id_echipa");
            
            // Inseram noul membru staff
            String insertStaff = """
                INSERT INTO staff (nume, prenume, functie, incepere_contract, 
                                 sfarsit_contract, telefon, experienta, id_echipa)
                VALUES (?, ?, ?, ?, ?, ?, ?, ?)
            """;
            
            PreparedStatement psStaff = conn.prepareStatement(insertStaff);
            psStaff.setString(1, NumeText.getText().trim());
            psStaff.setString(2, PrenumeText.getText().trim());
            psStaff.setString(3, FunctieText.getText().trim());
            psStaff.setDate(4, dataInceput);
            psStaff.setDate(5, dataSfarsit);
            psStaff.setString(6, telefon);
            psStaff.setInt(7, experienta);
            psStaff.setInt(8, idEchipa);
            
            psStaff.executeUpdate();
            
            // Curatam campurile dupa adaugarea cu succes
            NumeText.setText("");
            PrenumeText.setText("");
            FunctieText.setText("");
            IncepereContractText.setText("");
            SfarsitContractText.setText("");
            TelefonText.setText("");
            ExperientaText.setText("");
            EchipaText.setText("");
            
            javax.swing.JOptionPane.showMessageDialog(this,
                "Membru staff adaugat cu succes!",
                "Succes",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
                
        }
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,
            "Eroare la adaugarea membrului staff: " + e.getMessage(),
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }else if(Jucatori){
        ///Validam ca toate campurile sa fie completate
        if (NumeText.getText().trim().isEmpty() || 
            PrenumeText.getText().trim().isEmpty() || 
            DataNastereText.getText().trim().isEmpty()||
            FormaText.getText().trim().isEmpty() ||
            PozitieText.getText().trim().isEmpty() ||
            ValoareText.getText().trim().isEmpty()    ||
            PiciorText.getText().trim().isEmpty() ||
            EchipaText.getText().trim().isEmpty() ||
            DisponibilitateText.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Toate campurile trebuie completate!",
                "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
        }

        try{
            //Validare valoare
            double valoare;
            try {
                valoare=Double.parseDouble(ValoareText.getText().trim());
                if (valoare < 0) {
                    throw new Exception("Valoarea trebuie sa fie un numar pozitiv!");
                }
            }catch (NumberFormatException e) {
                throw new Exception("Valoarea trebuie sa fie un numar!");
            }
            
            try (Connection conn = DatabaseConnection.getConnection()) {
            // Verificam daca echipa exista
            String queryEchipa = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
            PreparedStatement psEchipa = conn.prepareStatement(queryEchipa);
            psEchipa.setString(1, EchipaText.getText().trim());
            ResultSet rsEchipa = psEchipa.executeQuery();
            
            if (!rsEchipa.next()) {
                throw new Exception("Echipa introdusa nu exista în baza de date!");
            }
            int idEchipa = rsEchipa.getInt("id_echipa");
            // Verificam conditia pentru forma cand jucatorul este accidentat
            String forma = FormaText.getText().trim();
            String disponibilitate = DisponibilitateText.getText().trim().toLowerCase();
            
            if (disponibilitate.equals("accidentat")) {
                forma = null;
            }
            ///Adaugam noul jucator:
            String addJucator="""
                              INSERT INTO jucator(nume,prenume,data_nastere,forma,pozitie,valoare,picior,id_echipa,disponibilitate)
                              VALUES (?,?,?,?,?,?,?,?,?)
                              """;
            PreparedStatement psJucator=conn.prepareStatement(addJucator);
            psJucator.setString(1,NumeText.getText().trim());
            psJucator.setString(2,PrenumeText.getText().trim());
            psJucator.setString(3,DataNastereText.getText().trim());
            psJucator.setString(4,forma);
            psJucator.setString(5,PozitieText.getText().trim());
            psJucator.setDouble(6,valoare);
            psJucator.setString(7,PiciorText.getText().trim());
            psJucator.setInt(8,idEchipa);
            psJucator.setString(9,disponibilitate);
            
            int result = psJucator.executeUpdate();
            
            NumeText.setText("");
            PrenumeText.setText("");
            DataNastereText.setText("");
            FormaText.setText("");
            PozitieText.setText("");
            ValoareText.setText("");
            PiciorText.setText("");
            EchipaText.setText("");
            DisponibilitateText.setText("");
        
            javax.swing.JOptionPane.showMessageDialog(this,
                "Jucator adaugat cu succes!",
                "Succes",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
            
        }
            
        }catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,
            "Eroare la adaugarea jucatorului: " + e.getMessage(),
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        }
        
    }

    
    }//GEN-LAST:event_AdaugaButActionPerformed

    private void NumeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NumeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NumeTextActionPerformed

    private void PrenumeTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrenumeTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PrenumeTextActionPerformed

    private void FunctieTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FunctieTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FunctieTextActionPerformed

    private void IncepereContractTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IncepereContractTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IncepereContractTextActionPerformed

    private void SfarsitContractTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SfarsitContractTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SfarsitContractTextActionPerformed

    private void TelefonTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TelefonTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TelefonTextActionPerformed

    private void ExperientaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExperientaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ExperientaTextActionPerformed

    private void EchipaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EchipaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EchipaTextActionPerformed

    private void DataNastereTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DataNastereTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DataNastereTextActionPerformed

    private void FormaTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FormaTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FormaTextActionPerformed

    private void PozitieTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PozitieTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PozitieTextActionPerformed

    private void PiciorTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PiciorTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PiciorTextActionPerformed

    private void DisponibilitateTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DisponibilitateTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DisponibilitateTextActionPerformed

    private void ValoareTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ValoareTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ValoareTextActionPerformed

    private void DeleteMeciuriButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteMeciuriButActionPerformed
        // TODO add your handling code here:
        //Curatam Staff si Jucatori
        Staff=false;
        Nume.setVisible(false);
        Prenume.setVisible(false);
        Functie.setVisible(false);
        Echipa.setVisible(false);
        NumeText.setVisible(false);
        PrenumeText.setVisible(false);
        FunctieText.setVisible(false);
        EchipaText.setVisible(false);
        
        
        
       Meciuri=true;
       Gazda.setVisible(true);
       Oaspete.setVisible(true);
       Data.setVisible(true);
       GazdaText.setVisible(true);
       OaspeteText.setVisible(true);
       DataText.setVisible(true);
       StergeBut.setVisible(true);
       
       
       gbc.insets = new Insets(5, 5,5, 5);  // Spacing between components
        ///Gazda si Textul
        gbc.gridy=5;
        gbc.gridx=0;
        
        LeftPanel.add(Gazda,gbc);
        gbc.gridx=1;
        LeftPanel.add(GazdaText,gbc);
        
        ///Oaspete si Textul
        gbc.gridy=6;
        gbc.gridx=0;
        LeftPanel.add(Oaspete,gbc);
        gbc.gridx=1;
        LeftPanel.add(OaspeteText,gbc);
        
        ///Data si Textul
        gbc.gridy=7;
        gbc.gridx=0;
        LeftPanel.add(Data,gbc);
        gbc.gridx=1;
        LeftPanel.add(DataText,gbc);
        
        ///Butonul de stergere
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 3;  // Span peste toate coloanele
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
        LeftPanel.add(StergeBut, gbc);
       
       
        
    }//GEN-LAST:event_DeleteMeciuriButActionPerformed

    private void DeleteJucatoriButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteJucatoriButActionPerformed
        // TODO add your handling code here:
        //Curat Staff si Meciuri
        Gazda.setVisible(false);
        Oaspete.setVisible(false);
        Data.setVisible(false);
        GazdaText.setVisible(false);
        GazdaText.setText("");
        OaspeteText.setVisible(false);
        OaspeteText.setText("");
        DataText.setVisible(false);
        DataText.setText("");
        Meciuri=false;
        
        Staff=false;
        Nume.setVisible(false);
        Prenume.setVisible(false);
        Functie.setVisible(false);
        Echipa.setVisible(false);
        NumeText.setVisible(false);
        PrenumeText.setVisible(false);
        FunctieText.setVisible(false);
        EchipaText.setVisible(false);
        
        
        Jucatori=true;
        Nume.setVisible(true);
        Prenume.setVisible(true);
        Echipa.setVisible(true);
        Pozitie.setVisible(true);
        NumeText.setVisible(true);
        PrenumeText.setVisible(true);
        EchipaText.setVisible(true);
        PozitieText.setVisible(true);
        StergeBut.setVisible(true);
        
        
        gbc.insets = new Insets(5, 5,5, 5);  // Spacing between components
        ///Nume si Textul
        gbc.gridy=5;
        gbc.gridx=0;
        
        LeftPanel.add(Nume,gbc);
        gbc.gridx=1;
        LeftPanel.add(NumeText,gbc);
        
        ///Prenume si Textul
        gbc.gridy=6;
        gbc.gridx=0;
        LeftPanel.add(Prenume,gbc);
        gbc.gridx=1;
        LeftPanel.add(PrenumeText,gbc);
        
        ///Echipa si Textul
        gbc.gridy=7;
        gbc.gridx=0;
        LeftPanel.add(Echipa,gbc);
        gbc.gridx=1;
        LeftPanel.add(EchipaText,gbc);
        
        ///Pozitie si Textul
        gbc.gridy=8;
        gbc.gridx=0;
        LeftPanel.add(Pozitie,gbc);
        gbc.gridx=1;
        LeftPanel.add(PozitieText,gbc);
        
        
        ///Butonul de stergere
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 3;  // Span peste toate coloanele
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
        LeftPanel.add(StergeBut, gbc);
    }//GEN-LAST:event_DeleteJucatoriButActionPerformed

    private void DeleteStaffButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeleteStaffButActionPerformed
        // TODO add your handling code here:
        ///Curatam Jucatori si Meciuri
        Gazda.setVisible(false);
        Oaspete.setVisible(false);
        Data.setVisible(false);
        GazdaText.setVisible(false);
        GazdaText.setText("");
        OaspeteText.setVisible(false);
        OaspeteText.setText("");
        DataText.setVisible(false);
        DataText.setText("");
        Meciuri=false;
        
        Jucatori=false;
        Nume.setVisible(false);
        Prenume.setVisible(false);
        Echipa.setVisible(false);
        Pozitie.setVisible(false);
        NumeText.setVisible(false);
        PrenumeText.setVisible(false);
        EchipaText.setVisible(false);
        PozitieText.setVisible(false);
        
        DeleteBut.setVisible(false);
        AddBut.setVisible(false);
        UpdateBut.setVisible(false);
        
        Staff=true;
        Nume.setVisible(true);
        Prenume.setVisible(true);
        Functie.setVisible(true);
        Echipa.setVisible(true);
        NumeText.setVisible(true);
        PrenumeText.setVisible(true);
        FunctieText.setVisible(true);
        EchipaText.setVisible(true);
        StergeBut.setVisible(true);
        
        
        //Nume si Text
        gbc.gridy=5;
        gbc.gridx=0;
        LeftPanel.add(Nume,gbc);
        gbc.gridx=1;
        LeftPanel.add(NumeText,gbc);
           
        //Prenume si Text
        gbc.gridy=6;
        gbc.gridx=0;
        LeftPanel.add(Prenume,gbc);
        gbc.gridx=1;
        LeftPanel.add(PrenumeText,gbc);
           
        //Functie si Text
        gbc.gridy=7;
        gbc.gridx=0;
        LeftPanel.add(Functie,gbc);
        gbc.gridx=1;
        LeftPanel.add(FunctieText,gbc);
           
        //Echipa si Text
        gbc.gridy=8;
        gbc.gridx=0;
        LeftPanel.add(Echipa,gbc);
        gbc.gridx=1;
        LeftPanel.add(EchipaText,gbc);
        
        ///Butonul de stergere
        gbc.gridx = 0;
        gbc.gridy = 9;
        gbc.gridwidth = 3;  // Span peste toate coloanele
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
        LeftPanel.add(StergeBut, gbc);
        
    }//GEN-LAST:event_DeleteStaffButActionPerformed

    private void StergeButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StergeButActionPerformed
        // TODO add your handling code here:
        if(Meciuri){
            if (GazdaText.getText().trim().isEmpty() || 
            OaspeteText.getText().trim().isEmpty() || 
            DataText.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Toate campurile trebuie completate!",
                "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
            }
            try (Connection conn = DatabaseConnection.getConnection()) {
                //  gasim ID-urile echipelor
                String queryEchipe = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
        
                // gasim ID-ul echipei gazda
                PreparedStatement psGazda = conn.prepareStatement(queryEchipe);
                psGazda.setString(1, GazdaText.getText().trim());
                ResultSet rsGazda = psGazda.executeQuery();
        
                if (!rsGazda.next()) {
                    throw new Exception("Echipa gazda nu exista!");
                }
                int idGazda = rsGazda.getInt("id_echipa");
        
                // gasim ID-ul echipei oaspete
                PreparedStatement psOaspete = conn.prepareStatement(queryEchipe);
                psOaspete.setString(1, OaspeteText.getText().trim());
                ResultSet rsOaspete = psOaspete.executeQuery();
        
                if (!rsOaspete.next()) {
                    throw new Exception("Echipa oaspete nu exista!");
                }
                int idOaspete = rsOaspete.getInt("id_echipa");
        
                if (idGazda == idOaspete) {
                    throw new Exception("Echipa gazda nu poate fi aceeasi cu echipa oaspete!");
                }
                ///Validam data
                try {
                    java.sql.Date dataMeci = java.sql.Date.valueOf(DataText.getText());
                }catch (IllegalArgumentException e) {
                    javax.swing.JOptionPane.showMessageDialog(this,
                        "Data introdusa nu este valida! Folositi formatul YYYY-MM-DD",
                        "Eroare",
                    javax.swing.JOptionPane.ERROR_MESSAGE);
                    return;
                }
                // gasim meciul specific al echipelor si al datei
                String queryMeci = """
                    SELECT m.id_meci 
                    FROM meciuri m 
                    JOIN participare p1 ON m.id_meci = p1.id_meci 
                    JOIN participare p2 ON m.id_meci = p2.id_meci 
                    WHERE m.data = ? 
                    AND (p1.id_echipa = ? AND p1.rol='gazda')
                    AND (p2.id_echipa=? AND  p2.rol='oaspete')

                """;
        
                PreparedStatement psMeci = conn.prepareStatement(queryMeci);
                psMeci.setDate(1, java.sql.Date.valueOf(DataText.getText()));
                psMeci.setInt(2, idGazda);
                psMeci.setInt(3, idOaspete);

        
                ResultSet rsMeci = psMeci.executeQuery();
        
                if (!rsMeci.next()) {
                    throw new Exception("Nu exista meci intre echipele specificate la aceasta data!");
                }
        
                int idMeci = rsMeci.getInt("id_meci");
        
                // Stergem mai intai inregistrarile din participare
                String deleteParticipare = "DELETE FROM participare WHERE id_meci = ?";
                PreparedStatement psDeleteParticipare = conn.prepareStatement(deleteParticipare);
                psDeleteParticipare.setInt(1, idMeci);
                psDeleteParticipare.executeUpdate();
        
                // Stergem meciul
                String deleteMeci = "DELETE FROM meciuri WHERE id_meci = ?";
                PreparedStatement psDeleteMeci = conn.prepareStatement(deleteMeci);
                psDeleteMeci.setInt(1, idMeci);
                int result = psDeleteMeci.executeUpdate();
        
                if (result > 0) {
                    javax.swing.JOptionPane.showMessageDialog(this,
                        "Meciul a fost sters cu succes!",
                        "Succes",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
            
                // Curățăm câmpurile după ștergere
                GazdaText.setText("");
                OaspeteText.setText("");
                DataText.setText("");
            
        }
            }catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Eroare la ștergerea meciului: " + e.getMessage(),
                    "Eroare",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            }
            
        }else if(Staff){
            // Verific sa vad daca toate campurile sunt completate
            if (NumeText.getText().trim().isEmpty() || 
            PrenumeText.getText().trim().isEmpty() || 
            FunctieText.getText().trim().isEmpty() ||
            EchipaText.getText().trim().isEmpty()) {
            javax.swing.JOptionPane.showMessageDialog(this,
                "Toate campurile trebuie completate!",
                "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
            return;
            }
            try (Connection conn = DatabaseConnection.getConnection()) {
            // Verific daca echipa exista
                String queryEchipa = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
                PreparedStatement psEchipa = conn.prepareStatement(queryEchipa);
                psEchipa.setString(1, EchipaText.getText().trim());
                ResultSet rsEchipa = psEchipa.executeQuery();
        
                if (!rsEchipa.next()) {
                    throw new Exception("Echipa introdusa nu exista in baza de date!");
                }
                int idEchipa = rsEchipa.getInt("id_echipa");
            // Caut si sterg membrul staff
                String deleteStaff = """
                    DELETE FROM staff 
                    WHERE LOWER(nume) = LOWER(?) 
                    AND LOWER(prenume) = LOWER(?) 
                    AND LOWER(functie) = LOWER(?)
                    AND id_echipa = ?
                """;
        
                PreparedStatement psDeleteStaff = conn.prepareStatement(deleteStaff);
                psDeleteStaff.setString(1, NumeText.getText().trim());
                psDeleteStaff.setString(2, PrenumeText.getText().trim());
                psDeleteStaff.setString(3, FunctieText.getText().trim());
                psDeleteStaff.setInt(4, idEchipa);
        
                int result = psDeleteStaff.executeUpdate();
        
                if (result > 0) {
                // Curat campurile 
                    NumeText.setText("");
                    PrenumeText.setText("");
                    FunctieText.setText("");
                    EchipaText.setText("");
            
                    javax.swing.JOptionPane.showMessageDialog(this,
                        "Membru staff sters cu succes!",
                        "Succes",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    throw new Exception("Nu exista un membru staff cu datele specificate!");
                }
        
            } catch (Exception e) {
            e.printStackTrace();
            javax.swing.JOptionPane.showMessageDialog(this,
                "Eroare la stergerea membrului staff: " + e.getMessage(),
                "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
            }
                     
        }else if(Jucatori){
            /// Validam ca toate campurile necesare sa fie completate
            if (NumeText.getText().trim().isEmpty() || 
                PrenumeText.getText().trim().isEmpty() || 
                EchipaText.getText().trim().isEmpty() || 
                PozitieText.getText().trim().isEmpty()) {
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Toate campurile (Nume, Prenume, Echipa, Pozitie) trebuie completate!",
                    "Eroare",
                javax.swing.JOptionPane.ERROR_MESSAGE);
                return;
            }
            try {
            try (Connection conn = DatabaseConnection.getConnection()) {
            // Verificam daca echipa exista
                String queryEchipa = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
                PreparedStatement psEchipa = conn.prepareStatement(queryEchipa);
                psEchipa.setString(1, EchipaText.getText().trim());
                ResultSet rsEchipa = psEchipa.executeQuery();

                if (!rsEchipa.next()) {
                    throw new Exception("Echipa introdusa nu exista în baza de date!");
                }
                int idEchipa = rsEchipa.getInt("id_echipa");

            // Verificam daca jucatorul exista
                String queryJucator = """
                                  SELECT * FROM jucator 
                                  WHERE LOWER(nume) = LOWER(?) 
                                  AND LOWER(prenume) = LOWER(?) 
                                  AND id_echipa = ? 
                                  AND LOWER(pozitie) = LOWER(?)
                                  """;
                PreparedStatement psJucator = conn.prepareStatement(queryJucator);
                psJucator.setString(1, NumeText.getText().trim());
                psJucator.setString(2, PrenumeText.getText().trim());
                psJucator.setInt(3, idEchipa);
                psJucator.setString(4, PozitieText.getText().trim());
                ResultSet rsJucator = psJucator.executeQuery();

                if (!rsJucator.next()) {
                    throw new Exception("Jucatorul specificat nu exista în baza de date!");
                }

            // Stergem jucatorul
                String deleteJucator = """
                                   DELETE FROM jucator 
                                   WHERE LOWER(nume) = LOWER(?) 
                                   AND LOWER(prenume) = LOWER(?) 
                                   AND id_echipa = ? 
                                   AND LOWER(pozitie) = LOWER(?)
                                   """;
                PreparedStatement psDelete = conn.prepareStatement(deleteJucator);
                psDelete.setString(1, NumeText.getText().trim());
                psDelete.setString(2, PrenumeText.getText().trim());
                psDelete.setInt(3, idEchipa);
                psDelete.setString(4, PozitieText.getText().trim());

                int result = psDelete.executeUpdate();

                if (result > 0) {
                    NumeText.setText("");
                    PrenumeText.setText("");
                    EchipaText.setText("");
                    PozitieText.setText("");

                    javax.swing.JOptionPane.showMessageDialog(this,
                        "Jucator sters cu succes!",
                        "Succes",
                    javax.swing.JOptionPane.INFORMATION_MESSAGE);
                } else {
                    throw new Exception("Jucatorul nu a putut fi sters. Verificati datele introduse!");
                }
            }
            }catch (Exception e) {
                e.printStackTrace();
                javax.swing.JOptionPane.showMessageDialog(this,
                    "Eroare la stergerea jucatorului: " + e.getMessage(),
                    "Eroare",
                javax.swing.JOptionPane.ERROR_MESSAGE);
            } 
        }   
          
    }//GEN-LAST:event_StergeButActionPerformed

    private void UpdateMeciuriButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateMeciuriButActionPerformed
        // TODO add your handling code here:
        ///Curatam Staff si Jucatori
        Nume.setVisible(false);
        Prenume.setVisible(false);
        Functie.setVisible(false);
        IncepereContract.setVisible(false);
        SfarsitContract.setVisible(false);
        Telefon.setVisible(false);
        Experienta.setVisible(false);
        Echipa.setVisible(false);
        NumeText.setText("");
        NumeText.setVisible(false);
        PrenumeText.setText("");
        PrenumeText.setVisible(false);
        FunctieText.setText("");
        FunctieText.setVisible(false);
        IncepereContractText.setText("");
        IncepereContractText.setVisible(false);
        SfarsitContractText.setText("");
        SfarsitContractText.setVisible(false);
        TelefonText.setText("");
        TelefonText.setVisible(false);
        ExperientaText.setText("");
        ExperientaText.setVisible(false);
        EchipaText.setText("");
        EchipaText.setVisible(false);
        Staff=false;
        
        DeleteBut.setVisible(false);
        AddBut.setVisible(false);
        UpdateBut.setVisible(false);
        
        Jucatori=false;
        Nume.setVisible(false);
        Prenume.setVisible(false);
        DataNastere.setVisible(false);
        Forma.setVisible(false);
        Pozitie.setVisible(false);
        Valoare.setVisible(false);
        Picior.setVisible(false);
        Echipa.setVisible(false);
        Disponibilitate.setVisible(false);
        NumeText.setVisible(false);
        PrenumeText.setVisible(false);
        DataNastereText.setVisible(false);
        FormaText.setVisible(false);
        PozitieText.setVisible(false);
        ValoareText.setVisible(false);
        PiciorText.setVisible(false);
        EchipaText.setVisible(false);
        DisponibilitateText.setVisible(false);
        
        Meciuri=true;
        Gazda.setVisible(true);
        Oaspete.setVisible(true);
        Data.setVisible(true);
        GazdaText.setVisible(true);
        OaspeteText.setVisible(true);
        DataText.setVisible(true);
        ModificaBut.setVisible(true);
        gbc.insets = new Insets(5, 5,5, 5);  // Spacing between components
        
        
        ///Gazda si Textul
        gbc.gridy=5;
        gbc.gridx=0;
        LeftPanel.add(Gazda,gbc);
        gbc.gridx=1;
        LeftPanel.add(GazdaText,gbc);
        
        ///Oaspete si Textul
        gbc.gridy=6;
        gbc.gridx=0;
        LeftPanel.add(Oaspete,gbc);
        gbc.gridx=1;
        LeftPanel.add(OaspeteText,gbc);
        
        ///Data si Textul
        gbc.gridy=7;
        gbc.gridx=0;
        LeftPanel.add(Data,gbc);
        gbc.gridx=1;
        LeftPanel.add(DataText,gbc);
        
        ///Butonul de modificare
        gbc.gridx = 0;
        gbc.gridy = 8;
        gbc.gridwidth = 3;  // Span peste toate coloanele
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weighty = 0.1;  // Valoare mai mica pentru a-l tine aproape de celelalte butoane
        gbc.anchor = GridBagConstraints.SOUTH;
        gbc.insets = new Insets(0, 0, 5, 0);  // Resetam insets pentru Back button
        LeftPanel.add(ModificaBut, gbc);
    }//GEN-LAST:event_UpdateMeciuriButActionPerformed

    private void UpdateJucatoriButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateJucatoriButActionPerformed
        // TODO add your handling code here:
        //Curatam Meciuri si Staff
        Gazda.setVisible(false);
        Oaspete.setVisible(false);
        Data.setVisible(false);
        GazdaText.setVisible(false);
        OaspeteText.setVisible(false);
        DataText.setVisible(false);
        
        Staff=false;
        Nume.setVisible(false);
            Prenume.setVisible(false);
            Functie.setVisible(false);
            IncepereContract.setVisible(false);
            SfarsitContract.setVisible(false);
            Telefon.setVisible(false);
            Experienta.setVisible(false);
            Echipa.setVisible(false);
            NumeText.setVisible(false);
            PrenumeText.setVisible(false);
            FunctieText.setVisible(false);
            IncepereContractText.setVisible(false);
            SfarsitContractText.setVisible(false);
            TelefonText.setVisible(false);
            ExperientaText.setVisible(false);
            EchipaText.setVisible(false);
        
        
        Jucatori=true;
        Nume.setVisible(true);
        Prenume.setVisible(true);

        Forma.setVisible(true);
        Pozitie.setVisible(true);
        Valoare.setVisible(true);
        Picior.setVisible(true);
        Echipa.setVisible(true);
        Disponibilitate.setVisible(true);
        NumeText.setVisible(true);
        PrenumeText.setVisible(true);
        
        FormaText.setVisible(true);
        PozitieText.setVisible(true);
        ValoareText.setVisible(true);
        PiciorText.setVisible(true);
        EchipaText.setVisible(true);
        DisponibilitateText.setVisible(true);
        ModificaBut.setVisible(true);
        
        
            
            gbc.insets = new Insets(5, 5,5, 5);  // Spacing between components
           //Nume si Text
           gbc.gridy=5;
           gbc.gridx=0;
           LeftPanel.add(Nume,gbc);
           gbc.gridx=1;
           LeftPanel.add(NumeText,gbc);
           
           //Prenume si Text
           gbc.gridy=6;
           gbc.gridx=0;
           LeftPanel.add(Prenume,gbc);
           gbc.gridx=1;
           LeftPanel.add(PrenumeText,gbc);
           

           
           //Forma si Text
           gbc.gridy=7;
           gbc.gridx=0;
           LeftPanel.add(Forma,gbc);
           gbc.gridx=1;
           LeftPanel.add(FormaText,gbc);
           
           //Pozitie si Text
           gbc.gridy=8;
           gbc.gridx=0;
           LeftPanel.add(Pozitie,gbc);
           gbc.gridx=1;
           LeftPanel.add(PozitieText,gbc);
           
           //Valoare si Text
           gbc.gridy=9;
           gbc.gridx=0;
           LeftPanel.add(Valoare,gbc);
           gbc.gridx=1;
           LeftPanel.add(ValoareText,gbc);
           
           //Picior si Text
           gbc.gridy=10;
           gbc.gridx=0;
           LeftPanel.add(Picior,gbc);
           gbc.gridx=1;
           LeftPanel.add(PiciorText,gbc);
           
           //Echipa si Text
           gbc.gridy=11;
           gbc.gridx=0;
           LeftPanel.add(Echipa,gbc);
           gbc.gridx=1;
           LeftPanel.add(EchipaText,gbc);
           
           //Disponibilitate si Text
           gbc.gridy=12;
           gbc.gridx=0;
           LeftPanel.add(Disponibilitate,gbc);
           gbc.gridx=1;
           LeftPanel.add(DisponibilitateText,gbc);
           
           ///Butonul de adaugare
            gbc.gridx = 0;
            gbc.gridy = 13;
            gbc.gridwidth = 3;  // Span peste toate coloanele
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
            gbc.anchor = GridBagConstraints.SOUTH;
            gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
            LeftPanel.add(ModificaBut, gbc);
    }//GEN-LAST:event_UpdateJucatoriButActionPerformed

    private void UpdateStaffButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateStaffButActionPerformed
        // TODO add your handling code here:
        Gazda.setVisible(false);
        Oaspete.setVisible(false);
        Data.setVisible(false);
        GazdaText.setVisible(false);
        GazdaText.setText("");
        OaspeteText.setVisible(false);
        OaspeteText.setText("");
        DataText.setVisible(false);
        DataText.setText("");
        Meciuri=false;
        
        Jucatori=false;
        Nume.setVisible(false);
        Prenume.setVisible(false);
        DataNastere.setVisible(false);
        Forma.setVisible(false);
        Pozitie.setVisible(false);
        Valoare.setVisible(false);
        Picior.setVisible(false);
        Echipa.setVisible(false);
        Disponibilitate.setVisible(false);
        NumeText.setVisible(false);
        PrenumeText.setVisible(false);
        DataNastereText.setVisible(false);
        FormaText.setVisible(false);
        PozitieText.setVisible(false);
        ValoareText.setVisible(false);
        PiciorText.setVisible(false);
        EchipaText.setVisible(false);
        DisponibilitateText.setVisible(false);
        
        DeleteBut.setVisible(false);
        AddBut.setVisible(false);
        UpdateBut.setVisible(false);
        
        Staff=true;
        Nume.setVisible(true);
            Prenume.setVisible(true);
            Functie.setVisible(true);
            //IncepereContract.setVisible(true);
            SfarsitContract.setVisible(true);
            Telefon.setVisible(true);
            Experienta.setVisible(true);
            Echipa.setVisible(true);
            NumeText.setVisible(true);
            PrenumeText.setVisible(true);
            FunctieText.setVisible(true);
            //IncepereContractText.setVisible(true);
            SfarsitContractText.setVisible(true);
            TelefonText.setVisible(true);
            ExperientaText.setVisible(true);
            EchipaText.setVisible(true);
            ModificaBut.setVisible(true);
            gbc.insets = new Insets(5, 5,5, 5);  // Spacing between components
           //Nume si Text
           gbc.gridy=5;
           gbc.gridx=0;
           LeftPanel.add(Nume,gbc);
           gbc.gridx=1;
           LeftPanel.add(NumeText,gbc);
           
           //Prenume si Text
           gbc.gridy=6;
           gbc.gridx=0;
           LeftPanel.add(Prenume,gbc);
           gbc.gridx=1;
           LeftPanel.add(PrenumeText,gbc);
           
           //Functie si Text
           gbc.gridy=7;
           gbc.gridx=0;
           LeftPanel.add(Functie,gbc);
           gbc.gridx=1;
           LeftPanel.add(FunctieText,gbc);
           
//           //Incepere Contract si Text
//           gbc.gridy=8;
//           gbc.gridx=0;
//           LeftPanel.add(IncepereContract,gbc);
//           gbc.gridx=1;
//           LeftPanel.add(IncepereContractText,gbc);
           
           //Sfarsit Contract si Text
           gbc.gridy=8;
           gbc.gridx=0;
           LeftPanel.add(SfarsitContract,gbc);
           gbc.gridx=1;
           LeftPanel.add(SfarsitContractText,gbc);
           
           //Telefon si Text
           gbc.gridy=9;
           gbc.gridx=0;
           LeftPanel.add(Telefon,gbc);
           gbc.gridx=1;
           LeftPanel.add(TelefonText,gbc);
           
           //Experienta si Text
           gbc.gridy=10;
           gbc.gridx=0;
           LeftPanel.add(Experienta,gbc);
           gbc.gridx=1;
           LeftPanel.add(ExperientaText,gbc);
           
           //Echipa si Text
           gbc.gridy=11;
           gbc.gridx=0;
           LeftPanel.add(Echipa,gbc);
           gbc.gridx=1;
           LeftPanel.add(EchipaText,gbc);
           ///Butonul de adaugare
            gbc.gridx = 0;
            gbc.gridy = 12;
            gbc.gridwidth = 3;  // Span peste toate coloanele
            gbc.fill = GridBagConstraints.HORIZONTAL;
            gbc.weighty = 0.1;  // Valoare mai mică pentru a-l ține aproape de celelalte butoane
            gbc.anchor = GridBagConstraints.SOUTH;
            gbc.insets = new Insets(0, 0, 5, 0);  // Resetăm insets pentru Back button
            LeftPanel.add(ModificaBut, gbc);
    }//GEN-LAST:event_UpdateStaffButActionPerformed

    private void ModificaButActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificaButActionPerformed
        // TODO add your handling code here:
    if (Meciuri) {
    // Validăm ca toate campurile sunt completate
    if (GazdaText.getText().trim().isEmpty() || 
        OaspeteText.getText().trim().isEmpty() || 
        DataText.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Toate campurile trebuie completate!",
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
        
    try (Connection conn = DatabaseConnection.getConnection()) {
        conn.setAutoCommit(false);

        // Validam ca echipa gazda exista
        String queryGazda = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
        PreparedStatement psGazda = conn.prepareStatement(queryGazda);
        psGazda.setString(1, GazdaText.getText().trim());
        ResultSet rsGazda = psGazda.executeQuery();

        if (!rsGazda.next()) {
            throw new Exception("Echipa gazda '" + GazdaText.getText() + "' nu exista in baza de date!");
        }
        int idGazda = rsGazda.getInt("id_echipa");

        // Validam ca echipa oaspete exista
        String queryOaspete = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
        PreparedStatement psOaspete = conn.prepareStatement(queryOaspete);
        psOaspete.setString(1, OaspeteText.getText().trim());
        ResultSet rsOaspete = psOaspete.executeQuery();

        if (!rsOaspete.next()) {
            throw new Exception("Echipa oaspete '" + OaspeteText.getText() + "' nu exista in baza de date!");
        }
        int idOaspete = rsOaspete.getInt("id_echipa");

        // Verificam ca echipele sunt diferite
        if (idGazda == idOaspete) {
            throw new Exception("Echipa gazda nu poate fi aceeasi cu echipa oaspete!");
        }

        // Validăm existența meciului dintre gazda și oaspete
        String queryMeci = """
            SELECT m.id_meci, m.id_stadion FROM meciuri m 
            INNER JOIN participare p1 ON m.id_meci = p1.id_meci AND p1.rol = 'gazda' 
            INNER JOIN participare p2 ON m.id_meci = p2.id_meci AND p2.rol = 'oaspete' 
            WHERE p1.id_echipa = ? AND p2.id_echipa = ?
        """;
        PreparedStatement psMeci = conn.prepareStatement(queryMeci);
        psMeci.setInt(1, idGazda);
        psMeci.setInt(2, idOaspete);
        ResultSet rsMeci = psMeci.executeQuery();

        if (!rsMeci.next()) {
            throw new Exception("Meciul specificat dintre gazda și oaspete nu exista!");
        }
        int idMeci = rsMeci.getInt("id_meci");

        // Validam data
        try {
            java.sql.Date dataMeci = java.sql.Date.valueOf(DataText.getText());
            java.sql.Date dataCurenta = new java.sql.Date(System.currentTimeMillis());

            if (dataMeci.before(dataCurenta)) {
                throw new Exception("Data introdusa trebuie sa fie in viitor!");
            }

            // Actualizam doar data meciului
            String updateMeci = "UPDATE meciuri SET data = ? WHERE id_meci = ?";
            PreparedStatement psUpdateMeci = conn.prepareStatement(updateMeci);
            psUpdateMeci.setDate(1, dataMeci);
            psUpdateMeci.setInt(2, idMeci);
            psUpdateMeci.executeUpdate();
        } catch (IllegalArgumentException e) {
            throw new Exception("Data introdusa nu este valida! Folositi formatul YYYY-MM-DD.");
        }

        conn.commit();

        // Curatam campurile dupa actualizare cu succes
        GazdaText.setText("");
        OaspeteText.setText("");
        DataText.setText("");

        javax.swing.JOptionPane.showMessageDialog(this,
            "Meciul a fost actualizat cu succes!",
            "Succes",
            javax.swing.JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,
            "Eroare la actualizarea meciului: " + e.getMessage(),
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }else if (Jucatori) {
    // Validăm ca toate câmpurile să fie completate, cu excepția DataNastereText
    if (NumeText.getText().trim().isEmpty() || 
        PrenumeText.getText().trim().isEmpty() ||
        FormaText.getText().trim().isEmpty() ||
        PozitieText.getText().trim().isEmpty() ||
        ValoareText.getText().trim().isEmpty() ||
        PiciorText.getText().trim().isEmpty() ||
        EchipaText.getText().trim().isEmpty() ||
        DisponibilitateText.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Toate câmpurile trebuie completate!",
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        // Validare valoare
        double valoare;
        try {
            valoare = Double.parseDouble(ValoareText.getText().trim());
            if (valoare < 0) {
                throw new Exception("Valoarea trebuie să fie un număr pozitiv!");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Valoarea trebuie să fie un număr!");
        }

        try (Connection conn = DatabaseConnection.getConnection()) {
            conn.setAutoCommit(false);

            // Verificăm dacă jucătorul există în baza de date
            String queryJucator = "SELECT id_jucator, data_nastere FROM jucator WHERE LOWER(nume) = LOWER(?) AND LOWER(prenume) = LOWER(?)";
            PreparedStatement psJucator = conn.prepareStatement(queryJucator);
            psJucator.setString(1, NumeText.getText().trim());
            psJucator.setString(2, PrenumeText.getText().trim());
            ResultSet rsJucator = psJucator.executeQuery();

            if (!rsJucator.next()) {
                throw new Exception("Jucătorul cu numele '" + NumeText.getText() + "' și prenumele '" + PrenumeText.getText() 
                        + "' nu există în baza de date!");
            }
            int idJucator = rsJucator.getInt("id_jucator");
            java.sql.Date dataNastere = rsJucator.getDate("data_nastere"); // Păstrăm data nașterii existentă

            // Verificăm dacă echipa există
            String queryEchipa = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
            PreparedStatement psEchipa = conn.prepareStatement(queryEchipa);
            psEchipa.setString(1, EchipaText.getText().trim());
            ResultSet rsEchipa = psEchipa.executeQuery();

            if (!rsEchipa.next()) {
                throw new Exception("Echipa introdusă nu există în baza de date!");
            }
            int idEchipa = rsEchipa.getInt("id_echipa");

            // Verificăm condiția pentru forma când jucătorul este accidentat
            String forma = FormaText.getText().trim();
            String disponibilitate = DisponibilitateText.getText().trim().toLowerCase();

            if (disponibilitate.equals("accidentat")) {
                forma = null;
            }

            // Actualizăm datele jucătorului fără a modifica data nașterii
            String updateJucator = """
                UPDATE jucator
                SET forma = ?, pozitie = ?, valoare = ?, picior = ?, id_echipa = ?, disponibilitate = ?
                WHERE id_jucator = ?
            """;
            PreparedStatement psUpdateJucator = conn.prepareStatement(updateJucator);
            psUpdateJucator.setString(1, forma);
            psUpdateJucator.setString(2, PozitieText.getText().trim());
            psUpdateJucator.setDouble(3, valoare);
            psUpdateJucator.setString(4, PiciorText.getText().trim());
            psUpdateJucator.setInt(5, idEchipa);
            psUpdateJucator.setString(6, disponibilitate);
            psUpdateJucator.setInt(7, idJucator);

            int result = psUpdateJucator.executeUpdate();
            conn.commit();

            // Curățăm câmpurile după actualizare cu succes
            NumeText.setText("");
            PrenumeText.setText("");
            FormaText.setText("");
            PozitieText.setText("");
            ValoareText.setText("");
            PiciorText.setText("");
            EchipaText.setText("");
            DisponibilitateText.setText("");

            javax.swing.JOptionPane.showMessageDialog(this,
                "Jucătorul a fost actualizat cu succes!",
                "Succes",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);

        }
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,
            "Eroare la actualizarea jucătorului: " + e.getMessage(),
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
    }else if (Staff) {
    // Validăm ca toate câmpurile să fie completate, cu excepția IncepereContractText
    if (NumeText.getText().trim().isEmpty() || 
        PrenumeText.getText().trim().isEmpty() || 
        FunctieText.getText().trim().isEmpty() || 
        SfarsitContractText.getText().trim().isEmpty() || 
        TelefonText.getText().trim().isEmpty() || 
        ExperientaText.getText().trim().isEmpty() || 
        EchipaText.getText().trim().isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Toate câmpurile trebuie completate!",
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    // Validare pentru telefon
    String telefon = TelefonText.getText().trim();
    if (!telefon.matches("\\d{10}")) {
        javax.swing.JOptionPane.showMessageDialog(this,
            "Numărul de telefon trebuie să conțină exact 10 cifre!",
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
        return;
    }
    
    try {
        // Validare dată sfârșit contract
        java.sql.Date dataSfarsit = java.sql.Date.valueOf(SfarsitContractText.getText());
        java.sql.Date dataCurenta = new java.sql.Date(System.currentTimeMillis());
        
        // Verificăm dacă data de sfârșit este în viitor
        if (dataSfarsit.before(dataCurenta)) {
            throw new Exception("Data de sfârșit a contractului trebuie să fie în viitor!");
        }

        // Validare experiență să fie un număr
        int experienta;
        try {
            experienta = Integer.parseInt(ExperientaText.getText().trim());
            if (experienta < 0) {
                throw new Exception("Experiența trebuie să fie un număr pozitiv!");
            }
        } catch (NumberFormatException e) {
            throw new Exception("Experiența trebuie să fie un număr!");
        }
        
        try (Connection conn = DatabaseConnection.getConnection()) {
            conn.setAutoCommit(false);

            // Verificăm dacă membrul staff există în baza de date
            String queryStaff = "SELECT id_staff, incepere_contract FROM staff WHERE LOWER(nume) = LOWER(?) AND LOWER(prenume) = LOWER(?)";
            PreparedStatement psStaff = conn.prepareStatement(queryStaff);
            psStaff.setString(1, NumeText.getText().trim());
            psStaff.setString(2, PrenumeText.getText().trim());
            ResultSet rsStaff = psStaff.executeQuery();

            if (!rsStaff.next()) {
                throw new Exception("Membrul staff cu numele '" + NumeText.getText() + "' și prenumele '" + PrenumeText.getText() + "' nu există în baza de date!");
            }
            int idStaff = rsStaff.getInt("id_staff");
            java.sql.Date dataInceput = rsStaff.getDate("incepere_contract"); // Păstrăm data de început existentă

            // Verificăm dacă echipa există
            String queryEchipa = "SELECT id_echipa FROM echipa WHERE LOWER(nume) = LOWER(?)";
            PreparedStatement psEchipa = conn.prepareStatement(queryEchipa);
            psEchipa.setString(1, EchipaText.getText().trim());
            ResultSet rsEchipa = psEchipa.executeQuery();

            if (!rsEchipa.next()) {
                throw new Exception("Echipa introdusă nu există în baza de date!");
            }
            int idEchipa = rsEchipa.getInt("id_echipa");

            // Actualizăm datele membrului staff fără a modifica data de început a contractului
            String updateStaff = """
                UPDATE staff
                SET functie = ?, sfarsit_contract = ?, telefon = ?, experienta = ?, id_echipa = ?
                WHERE id_staff = ?
            """;
            PreparedStatement psUpdateStaff = conn.prepareStatement(updateStaff);
            psUpdateStaff.setString(1, FunctieText.getText().trim());
            psUpdateStaff.setDate(2, dataSfarsit);
            psUpdateStaff.setString(3, telefon);
            psUpdateStaff.setInt(4, experienta);
            psUpdateStaff.setInt(5, idEchipa);
            psUpdateStaff.setInt(6, idStaff);

            int result = psUpdateStaff.executeUpdate();
            conn.commit();

            // Curățăm câmpurile după actualizare cu succes
            NumeText.setText("");
            PrenumeText.setText("");
            FunctieText.setText("");
            SfarsitContractText.setText("");
            TelefonText.setText("");
            ExperientaText.setText("");
            EchipaText.setText("");

            javax.swing.JOptionPane.showMessageDialog(this,
                "Membrul staff a fost actualizat cu succes!",
                "Succes",
                javax.swing.JOptionPane.INFORMATION_MESSAGE);
        }
    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this,
            "Eroare la actualizarea membrului staff: " + e.getMessage(),
            "Eroare",
            javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}




   


    }//GEN-LAST:event_ModificaButActionPerformed
      
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
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AdaugaBut;
    private javax.swing.JButton AddBut;
    private javax.swing.JButton AddJucatoriBut;
    private javax.swing.JButton AddMeciuriBut;
    private javax.swing.JButton AddStaffBut;
    private javax.swing.JButton BackBut;
    private javax.swing.JButton CancelBut;
    private javax.swing.JPanel CenterPanel;
    private javax.swing.JButton ClasamentBut;
    private javax.swing.JLabel ClasamentImg;
    private javax.swing.JLabel Data;
    private javax.swing.JLabel DataNastere;
    private javax.swing.JTextField DataNastereText;
    private javax.swing.JTextField DataText;
    private javax.swing.JButton DeleteBut;
    private javax.swing.JButton DeleteJucatoriBut;
    private javax.swing.JButton DeleteMeciuriBut;
    private javax.swing.JButton DeleteStaffBut;
    private javax.swing.JLabel Disponibilitate;
    private javax.swing.JTextField DisponibilitateText;
    private javax.swing.JLabel Echipa;
    private javax.swing.JTextField EchipaText;
    private javax.swing.JButton EchipeBut;
    private javax.swing.JLabel EchipeImg;
    private javax.swing.JLabel Experienta;
    private javax.swing.JTextField ExperientaText;
    private javax.swing.JLabel Forma;
    private javax.swing.JTextField FormaText;
    private javax.swing.JPanel FullPanel;
    private javax.swing.JLabel Functie;
    private javax.swing.JTextField FunctieText;
    private javax.swing.JLabel Gazda;
    private javax.swing.JTextField GazdaText;
    private javax.swing.JLabel IncepereContract;
    private javax.swing.JTextField IncepereContractText;
    private javax.swing.JButton JucatoriBut;
    private javax.swing.JLabel JucatoriImg;
    public javax.swing.JPanel LeftPanel;
    private javax.swing.JButton MeciuriBut;
    private javax.swing.JLabel MeciuriImg;
    private javax.swing.JButton ModificaBut;
    private javax.swing.JLabel Nume;
    private javax.swing.JTextField NumeText;
    private javax.swing.JLabel Oaspete;
    private javax.swing.JTextField OaspeteText;
    private javax.swing.JLabel Picior;
    private javax.swing.JTextField PiciorText;
    private javax.swing.JLabel Pozitie;
    private javax.swing.JTextField PozitieText;
    private javax.swing.JLabel Prenume;
    private javax.swing.JTextField PrenumeText;
    private javax.swing.JButton RezultateBut;
    private javax.swing.JLabel RezultateImg;
    private javax.swing.JPanel RightPanel;
    private javax.swing.JLabel SfarsitContract;
    private javax.swing.JTextField SfarsitContractText;
    private javax.swing.JButton StaffBut;
    private javax.swing.JLabel StaffImg;
    private javax.swing.JButton StergeBut;
    private javax.swing.JLabel Telefon;
    private javax.swing.JTextField TelefonText;
    private javax.swing.JButton UpdateBut;
    private javax.swing.JButton UpdateJucatoriBut;
    private javax.swing.JButton UpdateMeciuriBut;
    private javax.swing.JButton UpdateStaffBut;
    private javax.swing.JLabel Valoare;
    private javax.swing.JTextField ValoareText;
    private javax.swing.JLabel acm;
    private javax.swing.JLabel all_teams;
    private javax.swing.JLabel barca;
    private javax.swing.JLabel bay;
    private javax.swing.JLabel city;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel liv;
    private javax.swing.JLabel real;
    // End of variables declaration//GEN-END:variables
}
