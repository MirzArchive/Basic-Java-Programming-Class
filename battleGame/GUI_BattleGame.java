package battleGame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import java.awt.event.*;

import java.awt.*;

public class GUI_BattleGame { // Kiri attack hero, Kanan attack enemy
    static JFrame window = new JFrame("Battle Game");
    static JLabel labelHero = new JLabel("Hero");
    static JLabel labelEnemy = new JLabel("Enemy");
    static JLabel hpHero = new JLabel("HP");
    static JLabel hpEnemy = new JLabel("HP");
    static JLabel status = new JLabel("Status",SwingConstants.CENTER);
    static JButton btAtkHero = new JButton("Attack");
    static JButton btHealHero = new JButton("Heal");
    public static void main(String[] args) {
        
        siapkanUI();

        Hero hero = new Hero("Wiro Sableng", 1000, 200, "Warrior"); // Wiro Sableng
        Enemy enemy = new Enemy("Mak Lampir", 800, 400, "Orc"); // Maklampir

        labelHero.setText(hero.name);
        hpHero.setText("HP: " + hero.health);
        hpEnemy.setText("HP: " + enemy.health);

        ActionListener lstBtnAtkHero = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero.doAttack(enemy);
                hpEnemy.setText("HP: " + enemy.health);

                if (hero.health <= 0) {
                    JOptionPane.showMessageDialog(window,"Game Over", "Kalah", JOptionPane.ERROR_MESSAGE);
                    reset(hero, enemy);
                }
                else if (enemy.health <= 0) {
                    JOptionPane.showMessageDialog(window,"Mak Lampir koid..", "Menang", JOptionPane.INFORMATION_MESSAGE);
                }
            }

            private void reset(Hero hero, Enemy enemy) {
                hero.health = 1000;
                enemy.health = 800;
            }
        };

        btAtkHero.addActionListener(lstBtnAtkHero);

        ActionListener lstBtnHealHero = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hero.doHeal(100);
                hpHero.setText("HP: " + hero.health);
            }
        };

        btHealHero.addActionListener(lstBtnHealHero);
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
        panel.add(btHealHero, cs);

        window.add(panel);
        window.setVisible(true);
    }
}
