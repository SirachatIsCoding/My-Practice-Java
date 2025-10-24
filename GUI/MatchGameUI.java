import javax.swing.*;
import java.awt.*;

public class MatchGameUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Matching game");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(new BorderLayout());
        frame.setResizable(true);

        // Header
        JPanel header = new JPanel(new GridLayout(1, 2));
        JLabel scoreLabel = new JLabel("Score: 0", SwingConstants.CENTER);
        JLabel timeLabel = new JLabel("Time: 100s", SwingConstants.CENTER);
        scoreLabel.setFont(new Font("", Font.BOLD, 20));
        timeLabel.setFont(new Font("", Font.BOLD, 20));
        header.add(scoreLabel);
        header.add(timeLabel);
        
        // Game Board   
        JPanel board = new JPanel(new GridLayout(4, 4, 10, 10));
        board.setBackground(new Color(255, 239, 213)); // พื้นหลังพาสเทล
        for (int i = 0; i < 16; i++) {
            JButton card = new JButton();
            card.setBackground(new Color(173, 216, 230)); // ฟ้าอ่อน
            card.setFocusPainted(false);
            card.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
            board.add(card);
        }

        // Control Bar
        JPanel controls = new JPanel();
        JButton startBtn = new JButton("Start");
        JButton resetBtn = new JButton("reset");
        controls.add(startBtn);
        controls.add(resetBtn);

        frame.add(header, BorderLayout.NORTH);
        frame.add(board, BorderLayout.CENTER);
        frame.add(controls, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
