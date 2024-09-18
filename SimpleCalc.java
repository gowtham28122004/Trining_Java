package calculator.sample;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class SimpleCalc implements ActionListener {
	
	JLabel displayLabel;
	JButton sevenButton;
	JButton eightButton;
	JButton nineButton;
	JButton fourButton;
	JButton fiveButton;
	JButton sixButton;
	JButton oneButton;
	JButton twoButton;
	JButton threeButton;
	JButton dotButton;
	JButton zeroButton;
	JButton equalButton;
	JButton divisionButton;
	JButton multipleButton;
	JButton subtractionButton;
	JButton additionButton;
	JButton powerButton;
	JButton dobzeroButton;
	JButton pomButton;
	JButton clearButton;
	
	boolean isOperatatorClicked = false;
	
	String oldValue;
	int choice;

	public Index() {
		
		JFrame jf = new JFrame("Calculator");
		jf.setLayout(null);
		jf.setSize(600, 600);
		jf.setLocation(300,200);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		displayLabel = new JLabel(" ");
		displayLabel.setBounds(30, 50, 540, 40);
		displayLabel.setBackground(Color.GRAY);
		displayLabel.setOpaque(true);
		displayLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		
		jf.add(displayLabel);
		
		sevenButton = new JButton("7");
		sevenButton.setBounds(30, 130, 80, 80);
		sevenButton.addActionListener(this);
		jf.add(sevenButton);
		
		eightButton = new JButton("8");
		eightButton.setBounds(130, 130, 80, 80);
		eightButton.addActionListener(this);
		jf.add(eightButton);
		
		nineButton = new JButton("9");
		nineButton.setBounds(230, 130, 80, 80);
		nineButton.addActionListener(this);
		jf.add(nineButton);
		
		fourButton = new JButton("4");
		fourButton.setBounds(30, 230, 80, 80);
		fourButton.addActionListener(this);
		jf.add(fourButton);
		
		fiveButton = new JButton("5");
		fiveButton.setBounds(130, 230, 80, 80);
		fiveButton.addActionListener(this);
		jf.add(fiveButton);
		
		sixButton = new JButton("6");
		sixButton.setBounds(230, 230, 80, 80);
		sixButton.addActionListener(this);
		jf.add(sixButton);
		
		oneButton = new JButton("1");
		oneButton.setBounds(30, 330, 80, 80);
		oneButton.addActionListener(this);
		jf.add(oneButton);
		
		twoButton = new JButton("2");
		twoButton.setBounds(130, 330, 80, 80);
		twoButton.addActionListener(this);
		jf.add(twoButton);
		
		threeButton = new JButton("3");
		threeButton.setBounds(230, 330, 80, 80);
		threeButton.addActionListener(this);
		jf.add(threeButton);
		
		dotButton = new JButton(".");
		dotButton.setBounds(30, 430, 80, 80);
		dotButton.addActionListener(this);
		jf.add(dotButton);
		
		zeroButton = new JButton("0");
		zeroButton.setBounds(130, 430, 80, 80);
		zeroButton.addActionListener(this);
		jf.add(zeroButton);
		
		equalButton = new JButton("=");
		equalButton.setBounds(230, 430, 80, 80);
		equalButton.addActionListener(this);
		jf.add(equalButton);
		
		divisionButton = new JButton("/");
		divisionButton.setBounds(330, 130, 80, 80);
		divisionButton.addActionListener(this);
		jf.add(divisionButton);
		
		multipleButton = new JButton("X");
		multipleButton.setBounds(330, 230, 80, 80);
		multipleButton.addActionListener(this);
		jf.add(multipleButton);
		
		subtractionButton = new JButton("-");
		subtractionButton.setBounds(330, 330, 80, 80);
		subtractionButton.addActionListener(this);
		jf.add(subtractionButton);
		
		additionButton = new JButton("+");
		additionButton.setBounds(330, 430, 80, 80);
		additionButton.addActionListener(this);
		jf.add(additionButton);
		
		powerButton = new JButton("^");
		powerButton.setBounds(430, 330, 80, 80);
		powerButton.addActionListener(this);
		jf.add(powerButton);
		
		dobzeroButton = new JButton("00");
		dobzeroButton.setBounds(430, 230, 80, 80);
		dobzeroButton.addActionListener(this);
		jf.add(dobzeroButton);
		
		pomButton = new JButton("+ / -");
		pomButton.setBounds(430, 130, 80, 80);
		pomButton.addActionListener(this);
		jf.add(pomButton);
		
		clearButton = new JButton("clear");
		clearButton.setBounds(430, 430, 80, 80);
		clearButton.addActionListener(this);
		jf.add(clearButton);
		
	}
	
	public static void main(String[] args) {
		
		new SimpleCalc();
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == sevenButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("7");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"7");
				
			}
			
		}
		else if(e.getSource() == eightButton) {
			if(isOperatatorClicked) {
				
				displayLabel.setText("8");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"8");
				
			}
			
		}
		else if(e.getSource() == nineButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("9");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"9");
				
			}
			
		}
		else if(e.getSource() == fourButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("4");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"4");
				
			}
			
		}
		else if(e.getSource() == fiveButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("5");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"5");
				
			}
			
			
		}
		else if(e.getSource() == sixButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("6");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"6");
				
			}
			
		}
		else if(e.getSource() == oneButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("1");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"1");
				
			}
			
		}
		else if(e.getSource() == twoButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("2");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"2");
				
			}
			
			
		}
		else if(e.getSource() == threeButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("3");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"3");
				
			}
			
		}
		else if(e.getSource() == dotButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText(".");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+".");
				
			}
			
		}
		else if(e.getSource() == zeroButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("0");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"0");
				
			}
			
		}
		else if(e.getSource() == dobzeroButton) {
			
			if(isOperatatorClicked) {
				
				displayLabel.setText("00");
				
				isOperatatorClicked = false;
				
			}
			else {
				
				displayLabel.setText(displayLabel.getText()+"00");
				
			}
			
		}
		else if(e.getSource() == equalButton) {
			
			String newValue = displayLabel.getText();
			
		    float oldvalue = Float.parseFloat(oldValue);
		    float newvalue = Float.parseFloat(newValue);
		    float result;
		    
		    switch (choice) {
			case 1: {
				
				result = oldvalue + newvalue;
				break;
				
			}
			case 2: {
				
				result = oldvalue - newvalue;
				break;
				
			}
			case 3: {
				
				result = oldvalue * newvalue;
				break;
				
			}
			case 4: {
				
				result = oldvalue / newvalue;
				break;
				
			}
			case 5: {
				
				result = 1;
				for(int i = 1; i <= newvalue; i++) {
					result *= oldvalue; 
				}
				break;
				
			}
			case 6: {
				
				result = oldvalue * -1;
				break;
				
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		    
		    displayLabel.setText(result+" ");
			
		}
		else if(e.getSource() == divisionButton) {
			
			isOperatatorClicked = true;
			oldValue = displayLabel.getText();	
			choice = 4;
			
		}
		else if(e.getSource() == pomButton) {
			
			isOperatatorClicked = true;
			oldValue = displayLabel.getText();
			choice = 6;
		}
		else if(e.getSource() == multipleButton) {
			
			isOperatatorClicked = true;
			oldValue = displayLabel.getText();
			choice = 3;
			
		}
		else if(e.getSource() == subtractionButton) {
			
			isOperatatorClicked = true;
			oldValue = displayLabel.getText();
			choice = 2;
			
		}
		else if(e.getSource() == additionButton) {
			
			isOperatatorClicked = true;
			oldValue = displayLabel.getText();
			choice = 1;
			
		}
		else if(e.getSource() == powerButton) {
			
			isOperatatorClicked = true;
			oldValue = displayLabel.getText();
			choice = 5;
			
		}
		else if(e.getSource() == clearButton) {
			
			displayLabel.setText(" ");
			
		}
		else {
			
			displayLabel.setText("ERROR");
			
		}
		
		
	}

}
