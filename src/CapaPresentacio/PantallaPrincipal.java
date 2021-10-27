package CapaPresentacio;

import CapaAplicacio.*;
import CapaPersistencia.*;
//import CapaAplicacio.CtrlCancelarCompte;
//import CapaAplicacio.CtrlExtracteMoviments;
//import CapaAplicacio.CtrlIngres;
//import CapaAplicacio.CtrlLlistarComptes;
//import CapaAplicacio.CtrlReintegrament;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class PantallaPrincipal extends javax.swing.JFrame {
    
    /** Creates new form PantallaPrincipal */
    public PantallaPrincipal() {
        try {
            initComponents();
            this.ctrlingres=new CtrlIngres();
            this.ctrl_alta_compte=new CtrlAltaCompte();
            this.ctrl_cancelar_compte=new CtrlCancelarCompte();
            this.ctrl_reintegrar_compte=new CtrlReintegrament();
            this.ctrl_llistar_comptes=new CtrlLlistarComptes();
            this.ctrl_extracte_moviments=new CtrlExtracteMoviments();
            
        } catch (Exception ex) {
            Logger.getLogger(PantallaPrincipal.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanFerIngres = new javax.swing.JInternalFrame();
        jPanel2 = new javax.swing.JPanel();
        jLabel1NumeroCompte1 = new javax.swing.JLabel();
        jLabel2Quantitat1 = new javax.swing.JLabel();
        butAceptarIngres1 = new javax.swing.JButton();
        jtextFieldQUANT_FerIngres1 = new java.awt.TextField();
        jTextFieldNUM_FerIngres1 = new java.awt.TextField();
        butCancelarIngres1 = new javax.swing.JButton();
        label1FerIngres1 = new java.awt.Label();
        PanAltaCompte = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Nom_AltaCompte = new java.awt.TextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        NIF_AltaCompte = new java.awt.TextField();
        button1AltaCompte = new java.awt.Button();
        button2FinalitzarAltaCompte = new java.awt.Button();
        PanCancelarCompte = new javax.swing.JInternalFrame();
        jPanel3 = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        jLabel5 = new javax.swing.JLabel();
        NUM_CancelarCompte1 = new java.awt.TextField();
        NIF_CancelarCompte1 = new java.awt.TextField();
        jButton3CancelarCompte = new javax.swing.JButton();
        jButton4FinalitzarCancelarCompte = new javax.swing.JButton();
        label4 = new java.awt.Label();
        PanFerReintegrament = new javax.swing.JInternalFrame();
        jPanel4 = new javax.swing.JPanel();
        jLabel4QUANT = new javax.swing.JLabel();
        jLabel6NUM = new javax.swing.JLabel();
        jLabel7NIF = new javax.swing.JLabel();
        textField3QUANT_FerReintegrament = new java.awt.TextField();
        textField2NUM_FerReintegrament = new java.awt.TextField();
        textField1NIF_FerReintegrament = new java.awt.TextField();
        label1 = new java.awt.Label();
        butFerReintegrament = new javax.swing.JButton();
        butCancelarReintegrament = new javax.swing.JButton();
        PanLlistaComptes = new javax.swing.JInternalFrame();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton1LlistarComptes = new javax.swing.JButton();
        jButton2CancelarLlistarComptes = new javax.swing.JButton();
        NIF_LlistarComptes = new java.awt.TextField();
        PanInfo = new javax.swing.JInternalFrame();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1PanInfo = new javax.swing.JList();
        jButton1Finalitzar = new javax.swing.JButton();
        PanExtracteMoviments = new javax.swing.JInternalFrame();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton1FerExtracte = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        NUM_COMPTE_FerExtracte = new java.awt.TextField();
        DATA_FerExtracte = new java.awt.TextField();
        jButton2 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1AltaCompte = new javax.swing.JMenuItem();
        jMenuItem2CancelarCompte = new javax.swing.JMenuItem();
        jMenuItem3InfoComptes = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem4Ingressar = new javax.swing.JMenuItem();
        jMenuItem5Reintegrar = new javax.swing.JMenuItem();
        jMenuItem6Extracte = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1NumeroCompte1.setText("Número de compte:");

        jLabel2Quantitat1.setText("Quantitat a ingressar:");

        butAceptarIngres1.setText("Fer Ingres");
        butAceptarIngres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butAceptarIngres1ActionPerformed(evt);
            }
        });

        butCancelarIngres1.setText("Finalitzar");
        butCancelarIngres1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarIngres1ActionPerformed(evt);
            }
        });

        label1FerIngres1.setFont(new java.awt.Font("Dialog", 1, 14));
        label1FerIngres1.setText("Fer Ingrés");

        org.jdesktop.layout.GroupLayout jPanel2Layout = new org.jdesktop.layout.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 249, Short.MAX_VALUE)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(jLabel1NumeroCompte1)
                                .add(jLabel2Quantitat1)
                                .add(butAceptarIngres1))
                            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(jPanel2Layout.createSequentialGroup()
                                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                        .add(jtextFieldQUANT_FerIngres1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .add(jTextFieldNUM_FerIngres1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 113, Short.MAX_VALUE)))
                                .add(jPanel2Layout.createSequentialGroup()
                                    .add(29, 29, 29)
                                    .add(butCancelarIngres1))))
                        .add(jPanel2Layout.createSequentialGroup()
                            .add(77, 77, 77)
                            .add(label1FerIngres1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 189, Short.MAX_VALUE)
            .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel2Layout.createSequentialGroup()
                    .add(9, 9, 9)
                    .add(label1FerIngres1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(39, 39, 39)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                        .add(jLabel1NumeroCompte1)
                        .add(jTextFieldNUM_FerIngres1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jLabel2Quantitat1)
                        .add(jtextFieldQUANT_FerIngres1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(34, 34, 34)
                    .add(jPanel2Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(butAceptarIngres1)
                        .add(butCancelarIngres1))
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        org.jdesktop.layout.GroupLayout PanFerIngresLayout = new org.jdesktop.layout.GroupLayout(PanFerIngres.getContentPane());
        PanFerIngres.getContentPane().setLayout(PanFerIngresLayout);
        PanFerIngresLayout.setHorizontalGroup(
            PanFerIngresLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanFerIngresLayout.createSequentialGroup()
                .add(48, 48, 48)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );
        PanFerIngresLayout.setVerticalGroup(
            PanFerIngresLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanFerIngresLayout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jPanel2, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        PanAltaCompte.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel2.setText("Alta Compte");

        jLabel3.setText("Nom:");

        jLabel1.setText("NIF:");

        button1AltaCompte.setLabel("Alta Compte");
        button1AltaCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1AltaCompteActionPerformed(evt);
            }
        });

        button2FinalitzarAltaCompte.setLabel("Finalitzar");
        button2FinalitzarAltaCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button2FinalitzarAltaCompteActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(86, 86, 86)
                        .add(jLabel2))
                    .add(jPanel1Layout.createSequentialGroup()
                        .add(32, 32, 32)
                        .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(button1AltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(15, 15, 15)
                                .add(button2FinalitzarAltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(jPanel1Layout.createSequentialGroup()
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(jLabel1)
                                    .add(jLabel3))
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                    .add(Nom_AltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                    .add(NIF_AltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 110, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                                .add(4, 4, 4)))))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel1Layout.createSequentialGroup()
                .add(jLabel2)
                .add(23, 23, 23)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel1)
                    .add(NIF_AltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jLabel3)
                    .add(Nom_AltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(button1AltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(button2FinalitzarAltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(60, 60, 60))
        );

        org.jdesktop.layout.GroupLayout PanAltaCompteLayout = new org.jdesktop.layout.GroupLayout(PanAltaCompte.getContentPane());
        PanAltaCompte.getContentPane().setLayout(PanAltaCompteLayout);
        PanAltaCompteLayout.setHorizontalGroup(
            PanAltaCompteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanAltaCompteLayout.createSequentialGroup()
                .add(49, 49, 49)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PanAltaCompteLayout.setVerticalGroup(
            PanAltaCompteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanAltaCompteLayout.createSequentialGroup()
                .add(57, 57, 57)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        label3.setText("Número de compte:");

        jLabel5.setText("NIF:");

        jButton3CancelarCompte.setText("Cancel·lar Compte");
        jButton3CancelarCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3CancelarCompteActionPerformed(evt);
            }
        });

        jButton4FinalitzarCancelarCompte.setText("Finalitzar");
        jButton4FinalitzarCancelarCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4FinalitzarCancelarCompteActionPerformed(evt);
            }
        });

        label4.setFont(new java.awt.Font("Dialog", 1, 14));
        label4.setText("Cancel·lar Compte");

        org.jdesktop.layout.GroupLayout jPanel3Layout = new org.jdesktop.layout.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 269, Short.MAX_VALUE)
            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel3Layout.createSequentialGroup()
                    .addContainerGap()
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jPanel3Layout.createSequentialGroup()
                            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                                .add(label3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(jLabel5))
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(NUM_CancelarCompte1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(NIF_CancelarCompte1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)))
                        .add(jPanel3Layout.createSequentialGroup()
                            .add(15, 15, 15)
                            .add(jButton3CancelarCompte)
                            .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                            .add(jButton4FinalitzarCancelarCompte))
                        .add(jPanel3Layout.createSequentialGroup()
                            .add(72, 72, 72)
                            .add(label4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(0, 205, Short.MAX_VALUE)
            .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                .add(jPanel3Layout.createSequentialGroup()
                    .add(15, 15, 15)
                    .add(label4, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(33, 33, 33)
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(jLabel5)
                        .add(NIF_CancelarCompte1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(13, 13, 13)
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                        .add(label3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .add(NUM_CancelarCompte1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(43, 43, 43)
                    .add(jPanel3Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                        .add(jButton3CancelarCompte)
                        .add(jButton4FinalitzarCancelarCompte))
                    .addContainerGap(15, Short.MAX_VALUE)))
        );

        org.jdesktop.layout.GroupLayout PanCancelarCompteLayout = new org.jdesktop.layout.GroupLayout(PanCancelarCompte.getContentPane());
        PanCancelarCompte.getContentPane().setLayout(PanCancelarCompteLayout);
        PanCancelarCompteLayout.setHorizontalGroup(
            PanCancelarCompteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanCancelarCompteLayout.createSequentialGroup()
                .add(42, 42, 42)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(49, Short.MAX_VALUE))
        );
        PanCancelarCompteLayout.setVerticalGroup(
            PanCancelarCompteLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanCancelarCompteLayout.createSequentialGroup()
                .add(21, 21, 21)
                .add(jPanel3, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        jLabel4QUANT.setText("Quantitat a reintegrar:");

        jLabel6NUM.setText("Número de compte:");

        jLabel7NIF.setText("NIF:");

        label1.setFont(new java.awt.Font("Dialog", 1, 14));
        label1.setText("Fer Reintegrament");

        butFerReintegrament.setText("Fer Reintegrament");
        butFerReintegrament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butFerReintegramentActionPerformed(evt);
            }
        });

        butCancelarReintegrament.setText("Finalitzar");
        butCancelarReintegrament.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                butCancelarReintegramentActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel4Layout = new org.jdesktop.layout.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(75, 75, 75)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel6NUM)
                            .add(jLabel7NIF)
                            .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                                .add(butFerReintegrament)
                                .add(jLabel4QUANT)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                                .add(textField3QUANT_FerReintegrament, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(textField2NUM_FerReintegrament, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .add(textField1NIF_FerReintegrament, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                            .add(butCancelarReintegrament)))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(139, 139, 139)
                        .add(label1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel4Layout.createSequentialGroup()
                .add(20, 20, 20)
                .add(label1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel7NIF)
                    .add(textField1NIF_FerReintegrament, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(31, 31, 31)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(jLabel6NUM)
                        .add(34, 34, 34)
                        .add(jLabel4QUANT))
                    .add(jPanel4Layout.createSequentialGroup()
                        .add(textField2NUM_FerReintegrament, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .add(textField3QUANT_FerReintegrament, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .add(37, 37, 37)
                .add(jPanel4Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(butFerReintegrament)
                    .add(butCancelarReintegrament))
                .addContainerGap(58, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout PanFerReintegramentLayout = new org.jdesktop.layout.GroupLayout(PanFerReintegrament.getContentPane());
        PanFerReintegrament.getContentPane().setLayout(PanFerReintegramentLayout);
        PanFerReintegramentLayout.setHorizontalGroup(
            PanFerReintegramentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanFerReintegramentLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanFerReintegramentLayout.setVerticalGroup(
            PanFerReintegramentLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanFerReintegramentLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel4, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Llistar Comptes d'un Titular ");

        jLabel6.setText("NIF:");

        jButton1LlistarComptes.setText("Llistar Comptes");
        jButton1LlistarComptes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1LlistarComptesActionPerformed(evt);
            }
        });

        jButton2CancelarLlistarComptes.setText("Cancel·lar");
        jButton2CancelarLlistarComptes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2CancelarLlistarComptesActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel5Layout = new org.jdesktop.layout.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .add(jLabel6)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(NIF_LlistarComptes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 108, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(159, 159, 159))
            .add(jPanel5Layout.createSequentialGroup()
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .add(jButton1LlistarComptes)
                        .add(18, 18, 18)
                        .add(jButton2CancelarLlistarComptes)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(org.jdesktop.layout.GroupLayout.LEADING, jPanel5Layout.createSequentialGroup()
                        .add(56, 56, 56)
                        .add(jLabel4)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel5Layout.createSequentialGroup()
                .add(29, 29, 29)
                .add(jLabel4)
                .add(62, 62, 62)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(NIF_LlistarComptes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(jLabel6))
                .add(25, 25, 25)
                .add(jPanel5Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1LlistarComptes)
                    .add(jButton2CancelarLlistarComptes))
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout PanLlistaComptesLayout = new org.jdesktop.layout.GroupLayout(PanLlistaComptes.getContentPane());
        PanLlistaComptes.getContentPane().setLayout(PanLlistaComptesLayout);
        PanLlistaComptesLayout.setHorizontalGroup(
            PanLlistaComptesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PanLlistaComptesLayout.createSequentialGroup()
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        PanLlistaComptesLayout.setVerticalGroup(
            PanLlistaComptesLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanLlistaComptesLayout.createSequentialGroup()
                .add(23, 23, 23)
                .add(jPanel5, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 248, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jList1PanInfo);

        jButton1Finalitzar.setText("Finalitzar");
        jButton1Finalitzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1FinalitzarActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel6Layout = new org.jdesktop.layout.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel6Layout.createSequentialGroup()
                        .add(jScrollPane1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 348, Short.MAX_VALUE)
                        .addContainerGap())
                    .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel6Layout.createSequentialGroup()
                        .add(jButton1Finalitzar)
                        .add(152, 152, 152))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .add(jScrollPane1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 296, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(18, 18, 18)
                .add(jButton1Finalitzar)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        org.jdesktop.layout.GroupLayout PanInfoLayout = new org.jdesktop.layout.GroupLayout(PanInfo.getContentPane());
        PanInfo.getContentPane().setLayout(PanInfoLayout);
        PanInfoLayout.setHorizontalGroup(
            PanInfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanInfoLayout.setVerticalGroup(
            PanInfoLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel6, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Extracte Moviments");

        jLabel8.setText("Número de Compte:");

        jButton1FerExtracte.setText("Fer Extracte");
        jButton1FerExtracte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1FerExtracteActionPerformed(evt);
            }
        });

        jLabel9.setText("Data:");

        jButton2.setText("Finalitzar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        org.jdesktop.layout.GroupLayout jPanel7Layout = new org.jdesktop.layout.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(24, Short.MAX_VALUE)
                        .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                            .add(jLabel8)
                            .add(jLabel9))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(DATA_FerExtracte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(NUM_COMPTE_FerExtracte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 107, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .add(107, 107, 107))
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(88, 88, 88)
                        .add(jButton1FerExtracte)
                        .add(18, 18, 18)
                        .add(jButton2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED))
                    .add(jPanel7Layout.createSequentialGroup()
                        .add(110, 110, 110)
                        .add(jLabel7)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(jPanel7Layout.createSequentialGroup()
                .add(27, 27, 27)
                .add(jLabel7)
                .add(65, 65, 65)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel8)
                    .add(NUM_COMPTE_FerExtracte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(18, 18, 18)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.TRAILING)
                    .add(jLabel9)
                    .add(DATA_FerExtracte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 57, Short.MAX_VALUE)
                .add(jPanel7Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jButton1FerExtracte)
                    .add(jButton2))
                .add(68, 68, 68))
        );

        org.jdesktop.layout.GroupLayout PanExtracteMovimentsLayout = new org.jdesktop.layout.GroupLayout(PanExtracteMoviments.getContentPane());
        PanExtracteMoviments.getContentPane().setLayout(PanExtracteMovimentsLayout);
        PanExtracteMovimentsLayout.setHorizontalGroup(
            PanExtracteMovimentsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(PanExtracteMovimentsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        PanExtracteMovimentsLayout.setVerticalGroup(
            PanExtracteMovimentsLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, PanExtracteMovimentsLayout.createSequentialGroup()
                .addContainerGap()
                .add(jPanel7, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenu2.setText("Gestió de Comptes");

        jMenuItem1AltaCompte.setText("Alta d'un compte");
        jMenuItem1AltaCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                //jMenuItem1AltaCompteActionPerformed(evt);
                try {
                    System.out.println(CapaPersistencia.CompteBBDD.introCompteBBDD("123456789K"));
                    //CapaPersistencia.CompteBBDD.existeixCompteBBDD("2020-0000-11-1478546821");
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
        jMenu2.add(jMenuItem1AltaCompte);

        jMenuItem2CancelarCompte.setText("Cancel·lar un compte");
        jMenuItem2CancelarCompte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2CancelarCompteActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem2CancelarCompte);

        jMenuItem3InfoComptes.setText("Informació de tots els comptes");
        jMenuItem3InfoComptes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3InfoComptesActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3InfoComptes);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Gestió de Moviments");

        jMenuItem4Ingressar.setText("Ingressar diners en un compte");
        jMenuItem4Ingressar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4IngressarActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem4Ingressar);

        jMenuItem5Reintegrar.setText("Reintegrar diners d'un compte");
        jMenuItem5Reintegrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ReintegrarActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem5Reintegrar);

        jMenuItem6Extracte.setText("Extracte dels moviments d'un compte");
        jMenuItem6Extracte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ExtracteActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem6Extracte);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(PanFerIngres, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                    .add(layout.createSequentialGroup()
                        .add(PanInfo, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PanFerReintegrament, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(PanAltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(PanLlistaComptes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(PanCancelarCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(PanExtracteMoviments, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(449, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(layout.createSequentialGroup()
                                .addContainerGap()
                                .add(PanFerIngres, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .add(18, 18, 18)
                                .add(PanAltaCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(layout.createSequentialGroup()
                                .add(18, 18, 18)
                                .add(PanCancelarCompte, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PanFerReintegrament, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(PanLlistaComptes, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                    .add(layout.createSequentialGroup()
                        .add(11, 11, 11)
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(PanExtracteMoviments)
                            .add(layout.createSequentialGroup()
                                .add(PanInfo)
                                .add(307, 307, 307)))))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1AltaCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1AltaCompteActionPerformed

    this.PanAltaCompte.setVisible(true);
 
}//GEN-LAST:event_jMenuItem1AltaCompteActionPerformed

    private void jMenuItem2CancelarCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2CancelarCompteActionPerformed
        
        this.PanCancelarCompte.setVisible(true);
        
}//GEN-LAST:event_jMenuItem2CancelarCompteActionPerformed

    private void jMenuItem4IngressarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4IngressarActionPerformed

    this.PanFerIngres.setVisible(true);
 
}//GEN-LAST:event_jMenuItem4IngressarActionPerformed

    private void jMenuItem5ReintegrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ReintegrarActionPerformed
                
        this.PanFerReintegrament.setVisible(true);
}//GEN-LAST:event_jMenuItem5ReintegrarActionPerformed

    private void jMenuItem6ExtracteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ExtracteActionPerformed
    this.PanExtracteMoviments.setVisible(true);
}//GEN-LAST:event_jMenuItem6ExtracteActionPerformed

    private void button1AltaCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1AltaCompteActionPerformed
        
        try{
           String res=this.ctrl_alta_compte.Alta_Compte(NIF_AltaCompte.getText(),Nom_AltaCompte.getText());
           JOptionPane.showMessageDialog(this, "Número del nou compte: "+res, "Número del nou compte", JOptionPane.INFORMATION_MESSAGE);
        
        } catch (Exception ex){
            
             JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR Introduccio parametres", JOptionPane.ERROR_MESSAGE);
        }

}//GEN-LAST:event_button1AltaCompteActionPerformed

    private void button2FinalitzarAltaCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button2FinalitzarAltaCompteActionPerformed
        
        this.PanAltaCompte.setVisible(false);
        
}//GEN-LAST:event_button2FinalitzarAltaCompteActionPerformed

    private void butAceptarIngres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butAceptarIngres1ActionPerformed
        
        try {

            this.ctrlingres.Fer_Ingres(jTextFieldNUM_FerIngres1.getText(), jtextFieldQUANT_FerIngres1.getText());
            JOptionPane.showMessageDialog(this, "L'operació d'Ingrés s'ha realitzat correctament.", "Informació", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR Introduccio parametres", JOptionPane.ERROR_MESSAGE);
        }
       
    }//GEN-LAST:event_butAceptarIngres1ActionPerformed

    private void butCancelarIngres1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarIngres1ActionPerformed
        this.PanFerIngres.setVisible(false);
    }//GEN-LAST:event_butCancelarIngres1ActionPerformed

    private void jButton3CancelarCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3CancelarCompteActionPerformed
        
        try {

            this.ctrl_cancelar_compte.Cancelar_Compte(NIF_CancelarCompte1.getText(), NUM_CancelarCompte1.getText());
            JOptionPane.showMessageDialog(this, "L'operació de Cancel·lació s'ha realitzat correctament.", "Informació", JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR Introduccio parametres", JOptionPane.ERROR_MESSAGE);

        }
        
        
}//GEN-LAST:event_jButton3CancelarCompteActionPerformed

    private void jButton4FinalitzarCancelarCompteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4FinalitzarCancelarCompteActionPerformed
        this.PanCancelarCompte.setVisible(false);
}//GEN-LAST:event_jButton4FinalitzarCancelarCompteActionPerformed

private void butFerReintegramentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butFerReintegramentActionPerformed

    try{
        this.ctrl_reintegrar_compte.Fer_Reintegrament(textField1NIF_FerReintegrament.getText(),textField2NUM_FerReintegrament.getText(),textField3QUANT_FerReintegrament.getText());
        JOptionPane.showMessageDialog(this, "Quantitat reintegrada: "+textField3QUANT_FerReintegrament.getText(), "Informació", JOptionPane.INFORMATION_MESSAGE);
        
    } catch (Exception ex){
            
        JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR Introduccio parametres", JOptionPane.ERROR_MESSAGE);
    }
    
    
}//GEN-LAST:event_butFerReintegramentActionPerformed

private void butCancelarReintegramentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_butCancelarReintegramentActionPerformed
    this.PanFerReintegrament.setVisible(false);
}//GEN-LAST:event_butCancelarReintegramentActionPerformed

private void jMenuItem3InfoComptesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3InfoComptesActionPerformed
    this.PanLlistaComptes.setVisible(true);
}//GEN-LAST:event_jMenuItem3InfoComptesActionPerformed

private void jButton2CancelarLlistarComptesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2CancelarLlistarComptesActionPerformed
    this.PanLlistaComptes.setVisible(false);
}//GEN-LAST:event_jButton2CancelarLlistarComptesActionPerformed

private void jButton1LlistarComptesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1LlistarComptesActionPerformed
    
    try{
        
        jList1PanInfo.setListData(this.ctrl_llistar_comptes.Llistar_Comptes(NIF_LlistarComptes.getText()));
        this.PanLlistaComptes.setVisible(false);
        this.PanInfo.setVisible(true);
        
    } catch (Exception ex){
            
        JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR Introduccio parametres", JOptionPane.ERROR_MESSAGE);
    }

}//GEN-LAST:event_jButton1LlistarComptesActionPerformed

private void jButton1FinalitzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1FinalitzarActionPerformed
    this.PanInfo.setVisible(false);
}//GEN-LAST:event_jButton1FinalitzarActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
    this.PanExtracteMoviments.setVisible(false);
}//GEN-LAST:event_jButton2ActionPerformed

private void jButton1FerExtracteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1FerExtracteActionPerformed

    try{
        jList1PanInfo.setListData(this.ctrl_extracte_moviments.FerExtracte(NUM_COMPTE_FerExtracte.getText(),DATA_FerExtracte.getText()));
        this.PanExtracteMoviments.setVisible(false);
        this.PanInfo.setVisible(true);
        
    } catch (Exception ex){
            
        JOptionPane.showMessageDialog(this, ex.getMessage(), "ERROR Introduccio parametres", JOptionPane.ERROR_MESSAGE);
    }
    
}//GEN-LAST:event_jButton1FerExtracteActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private java.awt.TextField DATA_FerExtracte;
    private java.awt.TextField NIF_AltaCompte;
    private java.awt.TextField NIF_CancelarCompte1;
    private java.awt.TextField NIF_LlistarComptes;
    private java.awt.TextField NUM_COMPTE_FerExtracte;
    private java.awt.TextField NUM_CancelarCompte1;
    private java.awt.TextField Nom_AltaCompte;
    private javax.swing.JInternalFrame PanAltaCompte;
    private javax.swing.JInternalFrame PanCancelarCompte;
    private javax.swing.JInternalFrame PanExtracteMoviments;
    private javax.swing.JInternalFrame PanFerIngres;
    private javax.swing.JInternalFrame PanFerReintegrament;
    private javax.swing.JInternalFrame PanInfo;
    private javax.swing.JInternalFrame PanLlistaComptes;
    private javax.swing.JButton butAceptarIngres1;
    private javax.swing.JButton butCancelarIngres1;
    private javax.swing.JButton butCancelarReintegrament;
    private javax.swing.JButton butFerReintegrament;
    private java.awt.Button button1AltaCompte;
    private java.awt.Button button2FinalitzarAltaCompte;
    private javax.swing.JButton jButton1FerExtracte;
    private javax.swing.JButton jButton1Finalitzar;
    private javax.swing.JButton jButton1LlistarComptes;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton2CancelarLlistarComptes;
    private javax.swing.JButton jButton3CancelarCompte;
    private javax.swing.JButton jButton4FinalitzarCancelarCompte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel1NumeroCompte1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel2Quantitat1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel4QUANT;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel6NUM;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel7NIF;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList jList1PanInfo;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1AltaCompte;
    private javax.swing.JMenuItem jMenuItem2CancelarCompte;
    private javax.swing.JMenuItem jMenuItem3InfoComptes;
    private javax.swing.JMenuItem jMenuItem4Ingressar;
    private javax.swing.JMenuItem jMenuItem5Reintegrar;
    private javax.swing.JMenuItem jMenuItem6Extracte;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private java.awt.TextField jTextFieldNUM_FerIngres1;
    private java.awt.TextField jtextFieldQUANT_FerIngres1;
    private java.awt.Label label1;
    private java.awt.Label label1FerIngres1;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.TextField textField1NIF_FerReintegrament;
    private java.awt.TextField textField2NUM_FerReintegrament;
    private java.awt.TextField textField3QUANT_FerReintegrament;
    // End of variables declaration//GEN-END:variables
    
    private CtrlExtracteMoviments ctrl_extracte_moviments;
    private CtrlLlistarComptes ctrl_llistar_comptes;
    private CtrlReintegrament ctrl_reintegrar_compte;
    private CtrlCancelarCompte ctrl_cancelar_compte;
    private CtrlAltaCompte ctrl_alta_compte;
    private CtrlIngres ctrlingres;
}
