import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class TicTacToe implements ActionListener {

	JFrame frame = new JFrame();
    JLabel textField = new JLabel();
    JPanel panel = new JPanel();
    JButton[] buttons = new JButton[9];
    JPanel buttons_panel = new JPanel();
    boolean player1_turn;
    Random random = new Random();
    boolean players_draw = false;
    
	TicTacToe() {
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		frame.setSize(800, 800);
		frame.setLayout(new BorderLayout());
		
		textField.setText("TicTacToe");
		textField.setFont(new Font("Ink Free", Font.BOLD, 70));
		textField.setForeground(Color.green);
		textField.setHorizontalAlignment(JLabel.CENTER);
		
		
		panel.setBounds(0, 0, 800, 100);
		panel.setBackground(Color.black);
		panel.add(textField);
		
		
		buttons_panel.setLayout(new GridLayout(3, 3));
		
		for(int i=0; i<9; i++) {
			  buttons[i] = new JButton();
			  buttons[i].setFont(new Font("Mv Boli", Font.PLAIN, 120));
			  buttons[i].setFocusable(false);
			  buttons[i].addActionListener(this);
			  buttons_panel.add(buttons[i]);
		}
		
		
		frame.add(panel, BorderLayout.NORTH);
		frame.add(buttons_panel);
		frame.getContentPane().setBackground(Color.gray);
		frame.setVisible(true);
		
		turn();
	}
	public void turn() {
		
		for(int i=0; i<9; i++) {
			buttons[i].setEnabled(false);
		}
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if(random.nextInt(2) == 0) {
			textField.setText("X turn");
			player1_turn = true;
			for(int i=0; i<9; i++) {
				buttons[i].setEnabled(true);
			}
		}
		else {
			textField.setText("O turn");
			player1_turn = false;
			for(int i=0; i<9; i++) {
				buttons[i].setEnabled(true);
			}
		}
	}
	
	public void check() {
		
	if((buttons[0].getText() == "X") &&
		(buttons[1].getText() == "X") &&
		(buttons[2].getText() == "X")
			) {
		xWins(0, 1, 2);
		
	}
	if((buttons[3].getText() == "X") &&
			(buttons[4].getText() == "X") &&
			(buttons[5].getText() == "X")
				) {
			xWins(3, 4, 5);
			
		}
	if((buttons[6].getText() == "X") &&
			(buttons[7].getText() == "X") &&
			(buttons[8].getText() == "X")
				) {
			xWins(6, 7, 8);
			
		}
	if((buttons[0].getText() == "X") &&
			(buttons[3].getText() == "X") &&
			(buttons[6].getText() == "X")
				) {
			xWins(0, 3, 6);
			
		}
	if((buttons[1].getText() == "X") &&
			(buttons[4].getText() == "X") &&
			(buttons[7].getText() == "X")
				) {
			xWins(1, 4, 7);
			
		}
	if((buttons[2].getText() == "X") &&
			(buttons[5].getText() == "X") &&
			(buttons[8].getText() == "X")
				) {
			xWins(2, 5, 8);
			
		}
	if((buttons[0].getText() == "X") &&
			(buttons[4].getText() == "X") &&
			(buttons[8].getText() == "X")
				) {
			xWins(0, 4, 8);
			
		}
	if((buttons[2].getText() == "X") &&
			(buttons[4].getText() == "X") &&
			(buttons[6].getText() == "X")
				) {
			xWins(2, 4, 6);
			
		}
	//O wins
	if((buttons[0].getText() == "O") &&
			(buttons[1].getText() == "O") &&
			(buttons[2].getText() == "O")
				) {
			oWins(0, 1, 2);
			
		}
		if((buttons[3].getText() == "O") &&
				(buttons[4].getText() == "O") &&
				(buttons[5].getText() == "O")
					) {
				oWins(3, 4, 5);
				
			}
		if((buttons[6].getText() == "O") &&
				(buttons[7].getText() == "O") &&
				(buttons[8].getText() == "O")
					) {
				xWins(6, 7, 8);
				
			}
		if((buttons[0].getText() == "O") &&
				(buttons[3].getText() == "O") &&
				(buttons[6].getText() == "O")
					) {
				oWins(0, 3, 6);
				
			}
		if((buttons[1].getText() == "O") &&
				(buttons[4].getText() == "O") &&
				(buttons[7].getText() == "O")
					) {
				oWins(1, 4, 7);
				
			}
		if((buttons[2].getText() == "O") &&
				(buttons[5].getText() == "O") &&
				(buttons[8].getText() == "O")
					) {
				oWins(2, 5, 8);
				
			}
		if((buttons[0].getText() == "O") &&
				(buttons[4].getText() == "O") &&
				(buttons[8].getText() == "O")
					) {
				oWins(0, 4, 8);
				
			}
		if((buttons[2].getText() == "O") &&
				(buttons[4].getText() == "O") &&
				(buttons[6].getText() == "O")
					) {
				oWins(2, 4, 6);
				
			}
		if((buttons[0].getText() != "") &&
				(buttons[1].getText() != "") &&
				(buttons[2].getText() != "") &&
				(buttons[3].getText() != "") &&
				(buttons[4].getText() != "") &&
				(buttons[5].getText() != "") &&
				(buttons[6].getText() != "") &&
				(buttons[7].getText() != "") &&
				(buttons[8].getText() != "")
			) {
				draw();
		}
	}
	
	public void xWins(int a, int b, int c) {
		
		buttons[a].setBackground(Color.green);
		buttons[b].setBackground(Color.green);
		buttons[c].setBackground(Color.green);
		textField.setText("X Wins");
		
		for(int i = 0; i < 9; i++) {
			buttons[i].setEnabled(false);
		}
	}
	
	public void oWins(int a, int b, int c) {
		
		buttons[a].setBackground(Color.green);
		buttons[b].setBackground(Color.green);
		buttons[c].setBackground(Color.green);
		textField.setText("O Wins");
		
		for(int i = 0; i < 9; i++) {
			buttons[i].setEnabled(false);
		}
	}
	public void draw() {
		
		textField.setText("draw");
		for(int i=0; i<9; i++) {
			buttons[i].setEnabled(false);
		}
			
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i=0; i < 9; i++) {
			
			if(e.getSource() == buttons[i]) {
				if(buttons[i].getText() == "") {
					if(player1_turn) {
					buttons[i].setForeground(Color.red);
					buttons[i].setText("X");
					textField.setText("O turn");
					player1_turn = false;
					check();
				    }
					else {
						buttons[i].setForeground(Color.blue);
						buttons[i].setText("O");
						textField.setText("X turn");
						player1_turn = true;
						check();
					}
				}
				if(players_draw) {
					draw();
				}
				
				
			}
		}
		
	}

}
