package battleGame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import java.awt.*;

public class GUI_BattleGame { // Kiri attack hero, Kanan attack enemy
    static JFrame window = new JFrame("Battle Game");
    static JLabel labelHero = new JLabel("Hero");
    static JLabel labelEnemy = new JLabel("Enemy");
    static JLabel hpHero = new JLabel("HP");
    static JLabel hpEnemy = new JLabel("HP");
    static JLabel status = new JLabel("Status",SwingConstants.CENTER);
    static JButton btAtkHero = new JButton("Attack");
    static JButton btAtkEnemy = new JButton("Attack");
    public static void main(String[] args) {
        
        siapkanUI();

        Hero wrsblng = new Hero(); // Wiro Sableng
        Enemy mklmpr = new Enemy(); // Maklampir

        wrsblng.nama = "Wiro Sableng";

        labelHero.setText(wrsblng.nama);
        hpHero.setText("HP: " + wrsblng.hp);
        hpEnemy.setText("HP: " + mklmpr.hp);
    }

    private static void siapkanUI() {
        window.setSize(400,300);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        GridBagLayout layout = new GridBagLayout();
        GridBagConstraints cs = new GridBagConstraints();

        panel.setLayout(layout);

        cs.fill = GridBagConstraints.HORIZONTAL;
        cs.insets = new Insets(10, 10, 10, 10);
        cs.gridx = 0;
        cs.gridy = 0;
        panel.add(labelHero, cs);

        cs.gridx = 1;
        cs.gridy = 0;
        panel.add(labelEnemy, cs);

        cs.gridx = 0;
        cs.gridy = 1;
        panel.add(hpHero, cs);

        cs.gridx = 1;
        cs.gridy = 1;
        panel.add(hpEnemy, cs);

        cs.gridx = 0;
        cs.gridy = 2;
        cs.gridwidth = 2;
        panel.add(status, cs);

        cs.gridx = 0;
        cs.gridy = 3;
        cs.gridwidth = 1;
        panel.add(btAtkHero, cs);

        cs.gridx = 1;
        cs.gridy = 3;
        panel.add(btAtkEnemy, cs);

        window.add(panel);
        window.setVisible(true);
    }
}
