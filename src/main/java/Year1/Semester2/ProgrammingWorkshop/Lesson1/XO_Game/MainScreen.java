package Year1.Semester2.ProgrammingWorkshop.Lesson1.XO_Game;

import javax.swing.*;
import java.awt.*;

public class MainScreen extends JPanel {
    private int player = 1;
    private JButton[] buttons;
    private int turnsLeft = 9;

    public MainScreen(int x, int y, int width, int height){

        this.setLayout(new GridLayout(3,3));

        buttons = new JButton[9];
        for (int i = 0; i < buttons.length; i++) {
            buttons[i] = new JButton();

            buttons[i].setFont(new Font("Arial", Font.PLAIN, 40));
            int currI = i;
            buttons[i].addActionListener(e -> {
                this.turnsLeft--;
                if (player == 1){
                    buttons[currI].setText("X");
                    if (checkWinner()){
                        announceWinner();
                        return;
                    }
                    this.player = 2;
                }
                else if (player == 2){
                    buttons[currI].setText("0");
                    if (checkWinner()){
                        announceWinner();
                        return;
                    }
                    this.player = 1;
                }
                buttons[currI].setEnabled(false);
                if (this.turnsLeft == 0){
                    JOptionPane.showMessageDialog(this, "Draw!");

                }
            });
            this.add(buttons[i]);
        }


    }

    public boolean checkWinner(){
        String curr;
        for (int i = 0; i < 3; i++) {
            curr = this.buttons[i].getText();
            if ((!curr.isEmpty()) &&
                    curr.equals(this.buttons[i+3].getText()) &&
                    curr.equals(this.buttons[i+6].getText())){
                return true;
            }
        }

        for (int i = 0; i < this.buttons.length; i+=3) {
            curr = this.buttons[i].getText();
            if ((!curr.isEmpty()) &&
                    curr.equals(this.buttons[i+1].getText()) &&
                    curr.equals(this.buttons[i+2].getText())){
                return true;
            }
        }

        curr = this.buttons[0].getText();
        if ((!curr.isEmpty()) &&
                curr.equals(this.buttons[4].getText()) &&
                curr.equals(this.buttons[8].getText())){
            return true;
        }

        curr = this.buttons[2].getText();
        if ((!curr.isEmpty()) &&
                curr.equals(this.buttons[4].getText()) &&
                curr.equals(this.buttons[6].getText())){
            return true;
        }

        return false;

    }

    public void announceWinner(){
        JOptionPane.showMessageDialog(this, "Player " + player + " wins!");
        for (JButton button : this.buttons) {
            button.setEnabled(false);
        }
    }
}
