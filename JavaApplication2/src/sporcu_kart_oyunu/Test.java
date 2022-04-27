package sporcu_kart_oyunu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Test extends javax.swing.JFrame {

    static ArrayList<Basketbolcu> basketbolcular = new ArrayList<>();
    static ArrayList<Pilot> pilotlar = new ArrayList<>();
    ArrayList<Basketbolcu> oyuncubasketkart = new ArrayList<>();
    ArrayList<Pilot> oyuncupilotkart = new ArrayList<>();
    ArrayList<Basketbolcu> pcbasketkart = new ArrayList<>();
    ArrayList<Pilot> pcpilotkart = new ArrayList<>();
    static ArrayList<Integer> pilotskills = new ArrayList<>();
    static ArrayList<Integer> basketskills = new ArrayList<>();
    ArrayList<Sporcu> secilenb = new ArrayList<>();
    ArrayList<Sporcu> secilenp = new ArrayList<>();
    Kullanici insan = new Kullanici(19, "", 0);
    Bilgisayar bot = new Bilgisayar(0, "BOT", 0);
    int karttipi = 0, kart = 0, k = 0;
    Basketbolcu basketci = new Basketbolcu();
    Pilot pilot = new Pilot();
    String ps, bs;

    public Test() {
        initComponents();
        btn1.setVisible(false);
        btn7.setVisible(false);
        btn4.setVisible(false);
        btn6.setVisible(false);
        btn5.setVisible(false);
        btn8.setVisible(false);
        btn3.setVisible(false);
        btn2.setVisible(false);
        btn14.setVisible(false);
        btn10.setVisible(false);
        btn9.setVisible(false);
        btn11.setVisible(false);
        btn12.setVisible(false);
        btn13.setVisible(false);
        btn16.setVisible(false);
        btn15.setVisible(false);
        btnkullanicikart.setVisible(false);
        btnbotkart.setVisible(false);
        btndeal.setVisible(false);
        uyari.setVisible(false);
        lblisim.setVisible(false);
        txtisim.setVisible(false);
        kullanici.setVisible(false);
        pc.setVisible(false);
        lbluyari.setVisible(false);
        lblbotskor.setVisible(false);
        lblinsanskor.setVisible(false);
        lblwinner.setVisible(false);
        lblgameover.setVisible(false);
        lblrewind.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblrewind = new javax.swing.JLabel();
        lblgameover = new javax.swing.JLabel();
        lblbotskor = new javax.swing.JLabel();
        lblinsanskor = new javax.swing.JLabel();
        lblwinner = new javax.swing.JLabel();
        lbluyari = new javax.swing.JLabel();
        lblskills = new javax.swing.JLabel();
        btnbotkart = new javax.swing.JButton();
        btnkullanicikart = new javax.swing.JButton();
        btn1 = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        baslik = new javax.swing.JLabel();
        txtisim = new javax.swing.JTextField();
        uyari = new javax.swing.JTextField();
        kullanici = new javax.swing.JLabel();
        pc = new javax.swing.JLabel();
        lblisim = new javax.swing.JLabel();
        btnplay = new javax.swing.JButton();
        btndeal = new javax.swing.JButton();
        background = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1536, 840));
        setResizable(false);
        getContentPane().setLayout(null);

        lblrewind.setBackground(new java.awt.Color(255, 0, 0));
        lblrewind.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lblrewind.setForeground(new java.awt.Color(255, 255, 255));
        lblrewind.setText(" TİE!");
        lblrewind.setOpaque(true);
        getContentPane().add(lblrewind);
        lblrewind.setBounds(730, 370, 70, 50);

        lblgameover.setBackground(new java.awt.Color(255, 0, 0));
        lblgameover.setFont(new java.awt.Font("Segoe Script", 1, 48)); // NOI18N
        lblgameover.setForeground(new java.awt.Color(255, 255, 255));
        lblgameover.setText("GAME OVER");
        lblgameover.setOpaque(true);
        getContentPane().add(lblgameover);
        lblgameover.setBounds(600, 290, 340, 100);

        lblbotskor.setBackground(new java.awt.Color(0, 102, 255));
        lblbotskor.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblbotskor.setForeground(new java.awt.Color(255, 255, 255));
        lblbotskor.setOpaque(true);
        getContentPane().add(lblbotskor);
        lblbotskor.setBounds(30, 350, 110, 40);

        lblinsanskor.setBackground(new java.awt.Color(255, 0, 0));
        lblinsanskor.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblinsanskor.setForeground(new java.awt.Color(255, 255, 255));
        lblinsanskor.setOpaque(true);
        getContentPane().add(lblinsanskor);
        lblinsanskor.setBounds(1390, 360, 110, 40);

        lblwinner.setBackground(new java.awt.Color(255, 0, 0));
        lblwinner.setFont(new java.awt.Font("Segoe Script", 1, 24)); // NOI18N
        lblwinner.setForeground(new java.awt.Color(255, 255, 255));
        lblwinner.setOpaque(true);
        getContentPane().add(lblwinner);
        lblwinner.setBounds(600, 410, 330, 60);

        lbluyari.setBackground(new java.awt.Color(153, 153, 153));
        lbluyari.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lbluyari.setForeground(new java.awt.Color(0, 0, 0));
        lbluyari.setOpaque(true);
        getContentPane().add(lbluyari);
        lbluyari.setBounds(580, 480, 370, 40);

        lblskills.setFont(new java.awt.Font("Ink Free", 1, 24)); // NOI18N
        lblskills.setForeground(new java.awt.Color(255, 0, 0));
        lblskills.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        getContentPane().add(lblskills);
        lblskills.setBounds(640, 370, 250, 50);

        btnbotkart.setMaximumSize(new java.awt.Dimension(180, 250));
        btnbotkart.setPreferredSize(new java.awt.Dimension(180, 250));
        getContentPane().add(btnbotkart);
        btnbotkart.setBounds(460, 270, 180, 250);
        getContentPane().add(btnkullanicikart);
        btnkullanicikart.setBounds(890, 270, 180, 250);

        btn1.setPreferredSize(new java.awt.Dimension(180, 240));
        getContentPane().add(btn1);
        btn1.setBounds(10, 10, 180, 250);

        btn2.setPreferredSize(new java.awt.Dimension(220, 250));
        getContentPane().add(btn2);
        btn2.setBounds(200, 10, 180, 250);

        btn3.setPreferredSize(new java.awt.Dimension(220, 250));
        getContentPane().add(btn3);
        btn3.setBounds(390, 10, 180, 250);
        getContentPane().add(btn4);
        btn4.setBounds(580, 10, 180, 250);
        getContentPane().add(btn5);
        btn5.setBounds(770, 10, 180, 250);
        getContentPane().add(btn6);
        btn6.setBounds(960, 10, 180, 250);
        getContentPane().add(btn7);
        btn7.setBounds(1150, 10, 180, 250);
        getContentPane().add(btn8);
        btn8.setBounds(1340, 10, 180, 250);

        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });
        getContentPane().add(btn9);
        btn9.setBounds(10, 530, 180, 250);

        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });
        getContentPane().add(btn10);
        btn10.setBounds(200, 530, 180, 250);

        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });
        getContentPane().add(btn11);
        btn11.setBounds(390, 530, 180, 250);

        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });
        getContentPane().add(btn12);
        btn12.setBounds(580, 530, 180, 250);

        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });
        getContentPane().add(btn13);
        btn13.setBounds(770, 530, 180, 250);

        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });
        getContentPane().add(btn14);
        btn14.setBounds(960, 530, 180, 250);

        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });
        getContentPane().add(btn15);
        btn15.setBounds(1150, 530, 170, 250);

        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });
        getContentPane().add(btn16);
        btn16.setBounds(1330, 530, 180, 250);

        baslik.setBackground(new java.awt.Color(255, 0, 0));
        baslik.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        baslik.setForeground(new java.awt.Color(255, 255, 255));
        baslik.setText("PILOTS & BASKETBALLERS CARD GAME");
        baslik.setOpaque(true);
        getContentPane().add(baslik);
        baslik.setBounds(380, 280, 850, 60);

        txtisim.setBackground(new java.awt.Color(255, 0, 0));
        txtisim.setForeground(new java.awt.Color(255, 255, 255));
        txtisim.setOpaque(false);
        getContentPane().add(txtisim);
        txtisim.setBounds(320, 300, 110, 30);

        uyari.setBackground(new java.awt.Color(153, 153, 153));
        uyari.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        uyari.setForeground(new java.awt.Color(0, 0, 0));
        uyari.setText("Please enter your name!");
        getContentPane().add(uyari);
        uyari.setBounds(260, 340, 230, 40);

        kullanici.setBackground(new java.awt.Color(255, 0, 0));
        kullanici.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        kullanici.setForeground(new java.awt.Color(255, 255, 255));
        kullanici.setOpaque(true);
        getContentPane().add(kullanici);
        kullanici.setBounds(1380, 280, 120, 50);

        pc.setBackground(new java.awt.Color(0, 102, 255));
        pc.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        pc.setForeground(new java.awt.Color(255, 255, 255));
        pc.setText("BOT");
        pc.setOpaque(true);
        getContentPane().add(pc);
        pc.setBounds(30, 280, 50, 40);

        lblisim.setFont(new java.awt.Font("Segoe UI Historic", 1, 18)); // NOI18N
        lblisim.setForeground(new java.awt.Color(255, 255, 255));
        lblisim.setText("Player name:");
        getContentPane().add(lblisim);
        lblisim.setBounds(180, 290, 120, 50);

        btnplay.setBackground(new java.awt.Color(255, 0, 0));
        btnplay.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        btnplay.setForeground(new java.awt.Color(255, 255, 255));
        btnplay.setText("PLAY");
        btnplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnplayActionPerformed(evt);
            }
        });
        getContentPane().add(btnplay);
        btnplay.setBounds(710, 430, 146, 71);

        btndeal.setBackground(new java.awt.Color(255, 0, 0));
        btndeal.setFont(new java.awt.Font("Segoe Script", 1, 36)); // NOI18N
        btndeal.setForeground(new java.awt.Color(255, 255, 255));
        btndeal.setText("DEAL");
        btndeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndealActionPerformed(evt);
            }
        });
        getContentPane().add(btndeal);
        btndeal.setBounds(710, 400, 190, 70);

        background.setMaximumSize(new java.awt.Dimension(1536, 840));
        background.setMinimumSize(new java.awt.Dimension(1536, 840));
        background.setPreferredSize(new java.awt.Dimension(1540, 825));
        getContentPane().add(background);
        background.setBounds(0, 0, 1540, 825);

        jPanel1.setPreferredSize(new java.awt.Dimension(1536, 840));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1536, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 840, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1536, 840);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private Pilot gamepilot() {
        Random r = new Random();
        int a = r.nextInt(pcpilotkart.size());
        while (pcpilotkart.get(a).isKartKullanildiMi() == true) {
            a = r.nextInt(pcpilotkart.size());
        }
        secilenp.add(pcpilotkart.get(a));
        int kartSira = 99;
        for (int i = 0; i < pcpilotkart.size(); i++) {
            if (pcpilotkart.get(i).getSporcuIsim().equals(secilenp.get(0).getSporcuIsim())) {
                kartSira = i;
                btnbotkart.setIcon(new javax.swing.ImageIcon(pcpilotkart.get(i).isImage()));
                pcpilotkart.get(i).setKartKullanildiMi(true);
                pilot = pcpilotkart.get(i);
            }
        }
        secilenp.removeAll(secilenp);
        switch (kartSira) {
            case 0:
                btn1.setVisible(false);
                break;
            case 1:
                btn3.setVisible(false);
                break;
            case 2:
                btn5.setVisible(false);
                break;
            default:
                btn7.setVisible(false);
                break;
        }
        return pilot;
    }

    private Basketbolcu gamebasket() {
        Random r = new Random();
        int a = r.nextInt(pcbasketkart.size());
        while (pcbasketkart.get(a).isKartKullanildiMi() == true) {
            a = r.nextInt(pcbasketkart.size());
        }
        secilenb.add(pcbasketkart.get(a));
        int kartSira = 99;
        for (int i = 0; i < pcbasketkart.size(); i++) {
            if (pcbasketkart.get(i).getSporcuIsim().equals(secilenb.get(0).getSporcuIsim())) {
                kartSira = i;
                btnbotkart.setIcon(new javax.swing.ImageIcon(pcbasketkart.get(i).isImage()));
                pcbasketkart.get(i).setKartKullanildiMi(true);
                basketci = pcbasketkart.get(i);
            }
        }
        secilenb.removeAll(secilenb);
        switch (kartSira) {
            case 0:
                btn2.setVisible(false);
                break;
            case 1:
                btn4.setVisible(false);
                break;
            case 2:
                btn6.setVisible(false);
                break;
            default:
                btn8.setVisible(false);
                break;
        }
        return basketci;
    }

    private int comparingpilots(Pilot a) {
        ps = pilotskills();
        btnkullanicikart.setVisible(true);
        btnbotkart.setVisible(true);
        btnkullanicikart.setIcon(new javax.swing.ImageIcon(a.isImage()));
        if ("       SPEED".equals(ps)) {
            if (pilot.getHiz() > a.getHiz()) {
                bot.setBilgisayarSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else if (pilot.getHiz() < a.getHiz()) {
                insan.setKullaniciSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else {
                if (kart == 8) {
                    pilotskills.remove(0);
                    comparingpilots(a);
                    return 0;
                } else {
                    return 1;
                }
            }
        } else if ("      REFLEX".equals(ps)) {
            if (pilot.getRefleks() > a.getRefleks()) {
                bot.setBilgisayarSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else if (pilot.getRefleks() < a.getRefleks()) {
                insan.setKullaniciSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else {
                if (kart == 8) {
                    pilotskills.remove(1);
                    comparingpilots(a);
                    return 0;
                } else {
                    return 1;
                }
            }
        } else {
            if (pilot.getAracKoruma() > a.getAracKoruma()) {
                bot.setBilgisayarSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else if (pilot.getAracKoruma() < a.getAracKoruma()) {
                insan.setKullaniciSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else {
                if (kart == 8) {
                    pilotskills.remove(2);
                    comparingpilots(a);
                    return 0;
                } else {
                    return 1;
                }
            }
        }
    }

    private int comparingbasket(Basketbolcu a) {
        bs = basketskills();
        btnkullanicikart.setVisible(true);
        btnbotkart.setVisible(true);
        btnkullanicikart.setIcon(new javax.swing.ImageIcon(a.isImage()));
        if ("    FREE-THROW".equals(bs)) {
            if (basketci.getSerbestAtis() > a.getSerbestAtis()) {
                bot.setBilgisayarSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else if (basketci.getSerbestAtis() < a.getSerbestAtis()) {
                insan.setKullaniciSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else {
                if (kart == 8) {
                    basketskills.remove(0);
                    comparingbasket(a);
                    return 0;
                } else {
                    return 1;
                }
            }
        } else if ("THREE-POINT SHOT".equals(bs)) {
            if (basketci.getUcluk() > a.getUcluk()) {
                bot.setBilgisayarSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else if (basketci.getUcluk() < a.getUcluk()) {
                insan.setKullaniciSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else {
                if (kart == 8) {
                    basketskills.remove(1);
                    comparingbasket(a);
                    return 0;
                } else {
                    return 1;
                }
            }
        } else {
            if (basketci.getIkilik() > a.getIkilik()) {
                bot.setBilgisayarSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else if (basketci.getIkilik() < a.getIkilik()) {
                insan.setKullaniciSkor(10);
                lblbotskor.setText("SCORE: " + Integer.toString(bot.getBilgisayarSkor()));
                lblinsanskor.setText("SCORE: " + Integer.toString(insan.getKullaniciSkor()));
                return 0;
            } else {
                if (kart == 8) {
                    basketskills.remove(2);
                    comparingbasket(a);
                    return 0;
                } else {
                    return 1;
                }
            }
        }
    }

    private void gameOver() {
        kart++;
        if (kart == 8) {
            lblgameover.setVisible(true);
            lblwinner.setVisible(true);
            lblskills.setVisible(false);
            if (insan.getKullaniciSkor() < bot.getBilgisayarSkor()) {
                lblwinner.setText("   WINNER IS BOT!");
            } else if (insan.getKullaniciSkor() > bot.getBilgisayarSkor()) {
                lblwinner.setText("  WINNER IS " + insan.getKullaniciAdi() + "!");
            } else {
                lblwinner.setText("            TIE!");
            }
        }
    }

    private String basketskills() { //rastgele basketbolcu ozelligi secme
        Random r = new Random();
        int a = r.nextInt(basketskills.size());
        switch (basketskills.get(a)) {
            case 1:
                lblskills.setText("    FREE-THROW");
                return "    FREE-THROW";
            case 2:
                lblskills.setText("THREE-POINT SHOT");
                return "THREE-POINT SHOT";
            default:
                lblskills.setText(" TWO-POINT SHOT");
                return " TWO-POINT SHOT";
        }
    }

    private String pilotskills() { //rastgele pilot ozelligi secme
        Random r = new Random();
        int a = r.nextInt(pilotskills.size());
        switch (pilotskills.get(a)) {
            case 1:
                lblskills.setText("       SPEED");
                return "       SPEED";
            case 2:
                lblskills.setText("      REFLEX");
                return "      REFLEX";
            default:
                lblskills.setText(" SMOOTH DRIVING");
                return " SMOOTH DRIVING";
        }
    }

    private void rewindbasket(Basketbolcu b) {
        if (kart != 0) {
            kart--;
        }
        secilenb.add(b);
        int kartSira = 99;
        for (int i = 0; i < pcbasketkart.size(); i++) {
            if (pcbasketkart.get(i).getSporcuIsim().equals(secilenb.get(0).getSporcuIsim())) {
                kartSira = i;
                pcbasketkart.get(i).setKartKullanildiMi(false);
            }
        }
        secilenb.removeAll(secilenb);
        switch (kartSira) {
            case 0:
                btn1.setVisible(true);
                break;
            case 1:
                btn3.setVisible(true);
                break;
            case 2:
                btn5.setVisible(true);
                break;
            default:
                btn7.setVisible(true);
                break;
        }
    }

    private void rewindpilot(Pilot b) {
        if (kart != 0) {
            kart--;
        }
        secilenp.add(b);
        int kartSira = 99;
        for (int i = 0; i < pcpilotkart.size(); i++) {
            if (pcpilotkart.get(i).getSporcuIsim().equals(secilenp.get(0).getSporcuIsim())) {
                kartSira = i;
                pcpilotkart.get(i).setKartKullanildiMi(false);
            }
        }
        secilenp.removeAll(secilenp);
        switch (kartSira) {
            case 0:
                btn1.setVisible(true);
                break;
            case 1:
                btn3.setVisible(true);
                break;
            case 2:
                btn5.setVisible(true);
                break;
            default:
                btn7.setVisible(true);
                break;
        }
    }

    private void btnplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnplayActionPerformed
        btnplay.setVisible(false);
        baslik.setVisible(false);
        btn1.setVisible(true);
        btn7.setVisible(true);
        btn4.setVisible(true);
        btn6.setVisible(true);
        btn5.setVisible(true);
        btn8.setVisible(true);
        btn3.setVisible(true);
        btn2.setVisible(true);
        btn14.setVisible(true);
        btn10.setVisible(true);
        btn9.setVisible(true);
        btn11.setVisible(true);
        btn12.setVisible(true);
        btn13.setVisible(true);
        btn16.setVisible(true);
        btn15.setVisible(true);
        btndeal.setVisible(true);
        lblisim.setVisible(true);
        txtisim.setVisible(true);
        btn1.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
        btn3.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
        btn5.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
        btn7.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
        btn2.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
        btn4.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
        btn6.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
        btn8.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
        btn9.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
        btn11.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
        btn13.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
        btn15.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
        btn10.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
        btn12.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
        btn14.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
        btn16.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
    }//GEN-LAST:event_btnplayActionPerformed
//deal butonu ile karistirilmis kartlari oyuncu ve pc ye dagıtma
    private void btndealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndealActionPerformed
        if (txtisim.getText().isEmpty() == true) {
            uyari.setVisible(true);
        } else {
            kullanici.setVisible(true);
            pc.setVisible(true);
            uyari.setVisible(false);
            lblisim.setVisible(false);
            txtisim.setVisible(false);
            kullanici.setText(txtisim.getText());
            insan.setKullaniciAdi(txtisim.getText());
            btndeal.setVisible(false);
            uyari.setVisible(false);
            lblisim.setVisible(false);
            txtisim.setVisible(false);
            pc.setVisible(true);
            lblbotskor.setVisible(true);
            lblinsanskor.setVisible(true);
            for (int i = 0; i < 4; i++) {
                oyuncubasketkart.add(basketbolcular.get(i));
                oyuncupilotkart.add(pilotlar.get(i));
            }
            for (int i = 4; i < 8; i++) {
                pcbasketkart.add(basketbolcular.get(i));
                pcpilotkart.add(pilotlar.get(i));
            }
            btn9.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(0).isImage()));
            btn11.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(1).isImage()));
            btn13.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(2).isImage()));
            btn15.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(3).isImage()));
            btn10.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(0).isImage()));
            btn12.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(1).isImage()));
            btn14.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(2).isImage()));
            btn16.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(3).isImage()));
        }
    }//GEN-LAST:event_btndealActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        if (kart == 0) {
            lblrewind.setVisible(false);
            gamepilot();
            k = comparingpilots(oyuncupilotkart.get(0));
            btn9.setVisible(false);
            lbluyari.setVisible(false);
            gameOver();
            if (k == 1) {
                lblrewind.setVisible(true);
                rewindpilot(pilot);
                btn9.setVisible(true);
                btn9.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(0).isImage()));
                btnbotkart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
            }
        } else {
            if (karttipi == 0) {
                lblrewind.setVisible(false);
                gamepilot();
                k = comparingpilots(oyuncupilotkart.get(0));
                btn9.setVisible(false);
                lbluyari.setVisible(false);
                gameOver();
                if (k == 1) {
                    lblrewind.setVisible(true);
                    rewindpilot(pilot);
                    btn9.setVisible(true);
                    btn9.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(0).isImage()));
                    btnbotkart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                    btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                }
            } else {
                lbluyari.setVisible(true);
                lbluyari.setText("Please choose a basketballer card to play");
            }
        }
        karttipi = 1;

    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        if (kart == 0) {
            lblrewind.setVisible(false);
            gamebasket();
            k = comparingbasket(oyuncubasketkart.get(0));
            btn10.setVisible(false);
            lbluyari.setVisible(false);
            gameOver();
            if (k == 1) {
                lblrewind.setVisible(true);
                rewindbasket(basketci);
                btn10.setVisible(true);
                btn10.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(0).isImage()));
                btnbotkart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
            }
        } else {
            if (karttipi == 1) {
                lblrewind.setVisible(false);
                gamebasket();
                k = comparingbasket(oyuncubasketkart.get(0));
                btn10.setVisible(false);
                lbluyari.setVisible(false);
                gameOver();
                if (k == 1) {
                    lblrewind.setVisible(true);
                    rewindbasket(basketci);
                    btn10.setVisible(true);
                    btn10.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(0).isImage()));
                    btnbotkart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                    btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                }
            } else {
                lbluyari.setVisible(true);
                lbluyari.setText("Please choose a pilot card to play");
            }
        }
        karttipi = 0;

    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        if (kart == 0) {
            lblrewind.setVisible(false);
            gamepilot();
            k = comparingpilots(oyuncupilotkart.get(1));
            btn11.setVisible(false);
            lbluyari.setVisible(false);
            gameOver();
            if (k == 1) {
                lblrewind.setVisible(true);
                rewindpilot(pilot);
                btn11.setVisible(true);
                btn11.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(1).isImage()));
                btnbotkart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
            }
        } else {
            if (karttipi == 0) {
                lblrewind.setVisible(false);
                gamepilot();
                k = comparingpilots(oyuncupilotkart.get(1));
                btn11.setVisible(false);
                lbluyari.setVisible(false);
                gameOver();
                if (k == 1) {
                    lblrewind.setVisible(true);
                    rewindpilot(pilot);
                    btn11.setVisible(true);
                    btn11.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(1).isImage()));
                    btnbotkart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                    btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                }
            } else {
                lbluyari.setVisible(true);
                lbluyari.setText("Please choose a basketballer card to play");
            }
        }
        karttipi = 1;

    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        if (kart == 0) {
            lblrewind.setVisible(false);
            gamebasket();
            k = comparingbasket(oyuncubasketkart.get(1));
            btn12.setVisible(false);
            lbluyari.setVisible(false);
            gameOver();
            if (k == 1) {
                lblrewind.setVisible(true);
                rewindbasket(basketci);
                btn12.setVisible(true);
                btn12.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(1).isImage()));
                btnbotkart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
            }
        } else {
            if (karttipi == 1) {
                lblrewind.setVisible(false);
                gamebasket();
                k = comparingbasket(oyuncubasketkart.get(1));
                btn12.setVisible(false);
                lbluyari.setVisible(false);
                gameOver();
                if (k == 1) {
                    lblrewind.setVisible(true);
                    rewindbasket(basketci);
                    btn12.setVisible(true);
                    btn12.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(1).isImage()));
                    btnbotkart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                    btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                }
            } else {
                lbluyari.setVisible(true);
                lbluyari.setText("Please choose a pilot card to play");
            }
        }
        karttipi = 0;
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        if (kart == 0) {
            lblrewind.setVisible(false);
            gamepilot();
            k = comparingpilots(oyuncupilotkart.get(2));
            btn13.setVisible(false);
            lbluyari.setVisible(false);
            gameOver();
            if (k == 1) {
                lblrewind.setVisible(true);
                rewindpilot(pilot);
                btn13.setVisible(true);
                btn13.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(2).isImage()));
                btnbotkart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
            }
        } else {
            if (karttipi == 0) {
                lblrewind.setVisible(false);
                gamepilot();
                k = comparingpilots(oyuncupilotkart.get(2));
                btn13.setVisible(false);
                lbluyari.setVisible(false);
                gameOver();
                if (k == 1) {
                    lblrewind.setVisible(true);
                    rewindpilot(pilot);
                    btn13.setVisible(true);
                    btn13.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(2).isImage()));
                    btnbotkart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                    btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                }
            } else {
                lbluyari.setVisible(true);
                lbluyari.setText("Please choose a basketballer card to play");
            }
        }
        karttipi = 1;
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        if (kart == 0) {
            lblrewind.setVisible(false);
            gamebasket();
            k = comparingbasket(oyuncubasketkart.get(2));
            btn14.setVisible(false);
            lbluyari.setVisible(false);
            gameOver();
            if (k == 1) {
                lblrewind.setVisible(true);
                rewindbasket(basketci);
                btn14.setVisible(true);
                btn14.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(2).isImage()));
                btnbotkart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
            }
        } else {
            if (karttipi == 1) {
                lblrewind.setVisible(false);
                gamebasket();
                k = comparingbasket(oyuncubasketkart.get(2));
                btn14.setVisible(false);
                lbluyari.setVisible(false);
                gameOver();
                if (k == 1) {
                    lblrewind.setVisible(true);
                    rewindbasket(basketci);
                    btn14.setVisible(true);
                    btn14.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(2).isImage()));
                    btnbotkart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                    btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                }
            } else {
                lbluyari.setVisible(true);
                lbluyari.setText("Please choose a pilot card to play");
            }
        }
        karttipi = 0;
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        if (kart == 0) {
            lblrewind.setVisible(false);
            gamepilot();
            k = comparingpilots(oyuncupilotkart.get(3));
            btn15.setVisible(false);
            lbluyari.setVisible(false);
            gameOver();
            if (k == 1) {
                lblrewind.setVisible(true);
                rewindpilot(pilot);
                btn15.setVisible(true);
                btn15.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(3).isImage()));
                btnbotkart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
            }
        } else {
            if (karttipi == 0) {
                lblrewind.setVisible(false);
                gamepilot();
                k = comparingpilots(oyuncupilotkart.get(3));
                btn15.setVisible(false);
                lbluyari.setVisible(false);
                gameOver();
                if (k == 1) {
                    lblrewind.setVisible(true);
                    rewindpilot(pilot);
                    btn15.setVisible(true);
                    btn15.setIcon(new javax.swing.ImageIcon(oyuncupilotkart.get(3).isImage()));
                    btnbotkart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                    btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\f11.png"));
                }
            } else {
                lbluyari.setVisible(true);
                lbluyari.setText("Please choose a basketballer card to play");
            }
        }
        karttipi = 1;
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        if (kart == 0) {
            lblrewind.setVisible(false);
            gamebasket();
            k = comparingbasket(oyuncubasketkart.get(3));
            btn16.setVisible(false);
            lbluyari.setVisible(false);
            gameOver();
            if (k == 1) {
                lblrewind.setVisible(true);
                rewindbasket(basketci);
                btn16.setVisible(true);
                btn16.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(3).isImage()));
                btnbotkart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
            }
        } else {
            if (karttipi == 1) {
                lblrewind.setVisible(false);
                gamebasket();
                k = comparingbasket(oyuncubasketkart.get(3));
                btn16.setVisible(false);
                lbluyari.setVisible(false);
                gameOver();
                if (k == 1) {
                    lblrewind.setVisible(true);
                    rewindbasket(basketci);
                    btn16.setVisible(true);
                    btn16.setIcon(new javax.swing.ImageIcon(oyuncubasketkart.get(3).isImage()));
                    btnbotkart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                    btnkullanicikart.setIcon(new javax.swing.ImageIcon("images\\basket1.png"));
                }
            } else {
                lbluyari.setVisible(true);
                lbluyari.setText("Please choose a pilot card to play");
            }
        }
        karttipi = 0;
    }//GEN-LAST:event_btn16ActionPerformed

    public static void main(String[] args) { // sporculari iki farkli arrayliste ekleme
        basketbolcular.add(new Basketbolcu("Stephen Curry", "Golden State Warriors", "images\\curry.png", 95, 98, 90));//sporculari belirledim
        basketbolcular.add(new Basketbolcu("Kobe Bryant", "Los Angeles Lakers", "images\\kobe.png", 100, 100, 100));
        basketbolcular.add(new Basketbolcu("Lebron James", "Los Angeles Lakers", "images\\lebron.png", 90, 92, 87));
        basketbolcular.add(new Basketbolcu("Luka Doncic", "Dallas Mavericks", "images\\doncic.png", 70, 80, 70));
        basketbolcular.add(new Basketbolcu("Giannis Antetokounmpo", "Milwaukee Bucks", "images\\giannis.png", 93, 90, 82));
        basketbolcular.add(new Basketbolcu("James Harden", "Houston Rockets", "images\\harden.png", 80, 82, 75));
        basketbolcular.add(new Basketbolcu("Kyle Lowry", "Toronto Raptors", "images\\lowry.png", 80, 85, 75));
        basketbolcular.add(new Basketbolcu("Bogdan Bogdanovic", "Atlanta Hawks", "images\\bogdan.png", 78, 85, 65));
        pilotlar.add(new Pilot("George Russell", "Williams", "images\\russell.png", 80, 75, 70));
        pilotlar.add(new Pilot("Daniel Ricciardo", "Renault", "images\\ric.png", 85, 80, 75));
        pilotlar.add(new Pilot("Sebastian Vettel", "Ferrari", "images\\vettel.png", 95, 95, 90));
        pilotlar.add(new Pilot("Alexander Albon", "Red Bull Racing", "images\\albon.png", 90, 85, 80));
        pilotlar.add(new Pilot("Lewis Hamilton", "Mercedes", "images\\lewis.png", 100, 100, 98));
        pilotlar.add(new Pilot("Carlos Sainz", "McLaren", "images\\sainz.png", 70, 65, 68));
        pilotlar.add(new Pilot("Lance Stroll", "Racing Point", "images\\stroll.png", 90, 90, 80));
        pilotlar.add(new Pilot("Kevin Magnussen", "HAAS", "images\\kevin.png", 65, 70, 70));
        Collections.shuffle(basketbolcular); //kartlari karistirma
        Collections.shuffle(pilotlar);
        basketskills.add(1);
        basketskills.add(2);
        basketskills.add(3);
        pilotskills.add(1);
        pilotskills.add(2);
        pilotskills.add(3);
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Test.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Test.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Test.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Test.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Test().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel background;
    private javax.swing.JLabel baslik;
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnbotkart;
    private javax.swing.JButton btndeal;
    private javax.swing.JButton btnkullanicikart;
    private javax.swing.JButton btnplay;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel kullanici;
    private javax.swing.JLabel lblbotskor;
    private javax.swing.JLabel lblgameover;
    private javax.swing.JLabel lblinsanskor;
    private javax.swing.JLabel lblisim;
    private javax.swing.JLabel lblrewind;
    private javax.swing.JLabel lblskills;
    private javax.swing.JLabel lbluyari;
    private javax.swing.JLabel lblwinner;
    private javax.swing.JLabel pc;
    private javax.swing.JTextField txtisim;
    private javax.swing.JTextField uyari;
    // End of variables declaration//GEN-END:variables
}
