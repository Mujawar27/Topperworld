package game;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class ATM implements ActionListener
		{    
		         TextField widrawamt=new TextField();
		         TextField depositamt=new TextField();
		         TextField txt1=new TextField();
		         JButton Button1=new JButton("check balance");
		         JButton Button2=new JButton("Withdraw Amount");
		         JButton Button3=new JButton("Deposite Amount");
		         Label lblWidrawamt=new Label("Enter withdraw Amount");
		         Label lblDepositeamt=new Label("Enter deposite Amount");
		         Label title=new Label("Welcome To ATM...");
		         public ATM()
		         {
		            JFrame mainframe=new JFrame("Simple calculation demo");
		            mainframe.setSize(1200,1200);
		            mainframe.setLayout(null);
		            mainframe.setVisible(true);
		            mainframe.getContentPane().setBackground(Color.cyan);
		            Font fnt1=new Font("Elephant",Font.BOLD,30);
		            Font fnt2=new Font("Arial",Font.BOLD,30);
		            Font fnt3=new Font("Monospaced",Font.BOLD,60);
		            title.setFont(fnt3);
		            title.setBounds(350,70,800,60);
		            mainframe.add(title);

		            Button1.setBounds(410,180,500,37);
		            Button1.setFont(fnt1);
		            mainframe.add(Button1);
		            Button1.addActionListener(this);


		            Button2.setBounds(410,400,500,37);
		            Button2.setFont(fnt1);
		            mainframe.add(Button2);
		            Button2.addActionListener(this);

		            Button3.setBounds(400,590,500,37);
		            Button3.setFont(fnt1);
		            mainframe.add(Button3);
		            Button3.addActionListener(this);


		            lblWidrawamt.setBounds(170,330,400,40);
		            lblWidrawamt.setFont(fnt2);
		            mainframe.add(lblWidrawamt);
		            widrawamt.setBounds(600,330,320,40);
		            mainframe.add(widrawamt);
		            widrawamt.setFont(fnt1);

		            lblDepositeamt.setBounds(170,520,400,30);
		            lblDepositeamt.setFont(fnt2);

		            mainframe.add(lblDepositeamt);
		            depositamt.setBounds(600,520,320,40);
		            mainframe.add(depositamt);
		            depositamt.setFont(fnt1);

		            txt1.setFont(fnt1);
		            mainframe.add(txt1);

		            mainframe.addWindowListener(new WindowAdapter()
		            {
		                public void windowClosing(WindowEvent evnt)
		                {
		                    System.exit(1);
		                }
		            });
		         }
		         double avBalance=5000;
		         public void actionPerformed(ActionEvent evnt)
		         {
		            if(evnt.getSource()==Button1)
		            {
		                JFrame jfrm=new JFrame("withdraw");
		                jfrm.setVisible(true);
		                jfrm.setLayout(null);
		                jfrm.setSize(600,400);
		                Font font4=new Font("Elephant",Font.ITALIC,30);
		                

		                jfrm.getContentPane().setBackground(Color.yellow);

		                Label cuBalance=new Label("Your Current Balance :-");
		                Label ro=new Label("Rs."+avBalance);
		                ro.setFont(font4);


		                cuBalance.setFont(font4);
		                cuBalance.setBounds(40,110,440,30);
		                jfrm.add(cuBalance);
		                jfrm.add(ro);
		                ro.setBounds(200,155,250,50);

		            }
		            else if(evnt.getSource()==Button2)
		            {
		                String s1=widrawamt.getText();
		                double amt=Double.parseDouble(s1);
		                JFrame jfrm=new JFrame("withdraw");
		                jfrm.setVisible(true);
		                jfrm.setLayout(null);
		                jfrm.setSize(600,400);

		                Font font4=new Font("Elephant",Font.ITALIC,30);
		                
		                if(amt>avBalance)
		                {
		                    jfrm.getContentPane().setBackground(Color.RED);
		                    Label withdrawa=new Label("Insufficient Balance");
		                    withdrawa.setFont(font4);
		                    withdrawa.setBounds(130,100,530,30);
		                    jfrm.add(withdrawa);
		                }
		                else
		                {
		                    jfrm.getContentPane().setBackground(Color.GREEN);
		                    avBalance-=amt;
		                    Label widrawamt=new Label("Transaction successful...");
		                    Label curBal=new Label("current balance Rs" +avBalance);
		                    widrawamt.setFont(font4);
		                    curBal.setFont(font4);
		                    widrawamt.setBounds(110,120,560,30);
		                    curBal.setBounds(110,170,570,30);
		                    jfrm.add(widrawamt);
		                    jfrm.add(curBal);

		                }
		            }
		        
		            else if(evnt.getSource()==Button3)
		            {
		                JFrame jfrm=new JFrame("withdraw");
		                jfrm.setVisible(true);
		                jfrm.setLayout(null);
		                jfrm.setSize(600,400);
		                Font font4=new Font("Elephant",Font.ITALIC,30);
		                String s3=depositamt.getText();
		                double amt3=Double.parseDouble(s3);
		                jfrm.getContentPane().setBackground(Color.GREEN);
		                avBalance+=amt3;

		                Label cuBalance=new Label("Transaction sucesssful...!");
		                cuBalance.setFont(font4);
		                cuBalance.setBounds(110,100,550,30);
		                jfrm.add(cuBalance);
		            }
		        }
		         public static void main(String args[])
		         {
		            ATM obj=new ATM();

		         }
		        

	}

