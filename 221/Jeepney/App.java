import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.SwingConstants;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Stack;

public class App {
	
	JLabel pLine1, pLine2, pLine3, pLine4, pLine5, pLine6, pLine7, pLine8, pLine9, pLine10;
	JLabel passengerLine[] = {pLine1, pLine2, pLine3, pLine4, pLine5, pLine6, pLine7, pLine8, pLine9, pLine10};
	
	JLabel p1, p2, p3, p4, p5, p6, p7, p8, p9, p10;
	JLabel jeepPassenger[] = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10};
	
	JLabel pp1, pp2, pp3, pp4, pp5, pp6, pp7, pp8, pp9, pp10;
	JLabel paidPassenger[] = {pp1, pp2, pp3, pp4, pp5, pp6, pp7, pp8, pp9, pp10};
	JLabel lblP1, lblP2, lblP3, lblP4, lblP5, lblP6, lblP7, lblP8, lblP9, lblP10;
	JLabel paidPassengerLabel[] = {lblP1, lblP2, lblP3, lblP4, lblP5, lblP6, lblP7, lblP8, lblP9, lblP10};
	
	int passengerLineNum = -1;
	
	Queue<Integer> queue = new LinkedList<>();
	Random rand = new Random();
	int fare[] = {rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20),
			      rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20), rand.nextInt(20)};
	
	Stack<Integer> fareStack = new Stack<>();
	
	int fareCollectionNum = 0;

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App window = new App();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public App() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1152, 778);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Image passengerPaidIMG = new ImageIcon(this.getClass().getResource("/Passenger (Paid).png")).getImage();
		Image passengerPaid = passengerPaidIMG.getScaledInstance(50, 50, Image.SCALE_DEFAULT);
		Image jeepPassengerPaid = passengerPaidIMG.getScaledInstance(71, 71, Image.SCALE_DEFAULT);
		
		paidPassenger[0] = new JLabel("");
		paidPassenger[0].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[0].setBounds(1078, 91, 50, 50);
		frame.getContentPane().add(paidPassenger[0]);
		paidPassenger[0].setVisible(false);
		
		paidPassenger[1] = new JLabel("");
		paidPassenger[1].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[1].setBounds(1078, 151, 50, 50);
		frame.getContentPane().add(paidPassenger[1]);
		paidPassenger[1].setVisible(false);
		
		paidPassenger[2] = new JLabel("");
		paidPassenger[2].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[2].setBounds(1078, 211, 50, 50);
		frame.getContentPane().add(paidPassenger[2]);
		paidPassenger[2].setVisible(false);
		
		paidPassenger[3] = new JLabel("");
		paidPassenger[3].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[3].setBounds(1078, 271, 50, 50);
		frame.getContentPane().add(paidPassenger[3]);
		paidPassenger[3].setVisible(false);
		
		paidPassenger[4] = new JLabel("");
		paidPassenger[4].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[4].setBounds(1078, 331, 50, 50);
		frame.getContentPane().add(paidPassenger[4]);
		paidPassenger[4].setVisible(false);
		
		paidPassenger[5] = new JLabel("");
		paidPassenger[5].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[5].setBounds(1078, 391, 50, 50);
		frame.getContentPane().add(paidPassenger[5]);
		paidPassenger[5].setVisible(false);
		
		paidPassenger[6] = new JLabel("");
		paidPassenger[6].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[6].setBounds(1078, 451, 50, 50);
		frame.getContentPane().add(paidPassenger[6]);
		paidPassenger[6].setVisible(false);
		
		paidPassenger[7] = new JLabel("");
		paidPassenger[7].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[7].setBounds(1078, 511, 50, 50);
		frame.getContentPane().add(paidPassenger[7]);
		paidPassenger[7].setVisible(false);
		
		paidPassenger[8] = new JLabel("");
		paidPassenger[8].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[8].setBounds(1078, 571, 50, 50);
		frame.getContentPane().add(paidPassenger[8]);
		paidPassenger[8].setVisible(false);
		
		paidPassenger[9] = new JLabel("");
		paidPassenger[9].setIcon(new ImageIcon(passengerPaid));
		paidPassenger[9].setBounds(1078, 631, 50, 50);
		frame.getContentPane().add(paidPassenger[9]);
		paidPassenger[9].setVisible(false);
		
		paidPassengerLabel[0] = new JLabel("");
		paidPassengerLabel[0].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[0].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[0].setBounds(868, 91,200, 50);
		frame.getContentPane().add(paidPassengerLabel[0]);
		
		paidPassengerLabel[1] = new JLabel("");
		paidPassengerLabel[1].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[1].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[1].setBounds(868, 151,200, 50);
		frame.getContentPane().add(paidPassengerLabel[1]);
		
		paidPassengerLabel[2] = new JLabel("");
		paidPassengerLabel[2].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[2].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[2].setBounds(868, 211,200, 50);
		frame.getContentPane().add(paidPassengerLabel[2]);
		
		paidPassengerLabel[3] = new JLabel("");
		paidPassengerLabel[3].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[3].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[3].setBounds(868, 271,200, 50);
		frame.getContentPane().add(paidPassengerLabel[3]);
		
		paidPassengerLabel[4] = new JLabel("");
		paidPassengerLabel[4].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[4].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[4].setBounds(868, 331,200, 50);
		frame.getContentPane().add(paidPassengerLabel[4]);
		
		paidPassengerLabel[5] = new JLabel("");
		paidPassengerLabel[5].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[5].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[5].setBounds(868, 391,200, 50);
		frame.getContentPane().add(paidPassengerLabel[5]);
		
		paidPassengerLabel[6] = new JLabel("");
		paidPassengerLabel[6].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[6].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[6].setBounds(868, 451,200, 50);
		frame.getContentPane().add(paidPassengerLabel[6]);
		
		paidPassengerLabel[7] = new JLabel("");
		paidPassengerLabel[7].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[7].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[7].setBounds(868, 511,200, 50);
		frame.getContentPane().add(paidPassengerLabel[7]);
		
		paidPassengerLabel[8] = new JLabel("");
		paidPassengerLabel[8].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[8].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[8].setBounds(868, 571,200, 50);
		frame.getContentPane().add(paidPassengerLabel[8]);
		
		paidPassengerLabel[9] = new JLabel("");
		paidPassengerLabel[9].setHorizontalAlignment(SwingConstants.RIGHT);
		paidPassengerLabel[9].setFont(new Font("Tahoma", Font.BOLD, 16));
		paidPassengerLabel[9].setBounds(868, 631,200, 50);
		frame.getContentPane().add(paidPassengerLabel[9]);
		
		Image passengerIMG = new ImageIcon(this.getClass().getResource("/Passenger.png")).getImage();
		Image passenger = passengerIMG.getScaledInstance(71, 71, Image.SCALE_DEFAULT);
		int passengerVert = 115;
		int passengerHori = 420;
		
		jeepPassenger[0] = new JLabel("");
		jeepPassenger[0].setIcon(new ImageIcon(passenger));
		jeepPassenger[0].setBounds(383, 221, 71, 71);
		frame.getContentPane().add(jeepPassenger[0]);
		jeepPassenger[0].setVisible(false);
		
		jeepPassenger[1] = new JLabel("");
		jeepPassenger[1].setIcon(new ImageIcon(passenger));
		jeepPassenger[1].setBounds(383, 52, 71, 71);
		frame.getContentPane().add(jeepPassenger[1]);
		jeepPassenger[1].setVisible(false);
		
		jeepPassenger[2] = new JLabel("");
		jeepPassenger[2].setIcon(new ImageIcon(passenger));
		jeepPassenger[2].setBounds(302, 221, 71, 71);
		frame.getContentPane().add(jeepPassenger[2]);
		jeepPassenger[2].setVisible(false);

		jeepPassenger[3] = new JLabel("");
		jeepPassenger[3].setIcon(new ImageIcon(passenger));
		jeepPassenger[3].setBounds(302, 52, 71, 71);
		frame.getContentPane().add(jeepPassenger[3]);
		jeepPassenger[3].setVisible(false);
		
		jeepPassenger[4] = new JLabel("");
		jeepPassenger[4].setIcon(new ImageIcon(passenger));
		jeepPassenger[4].setBounds(221, 221, 71, 71);
		frame.getContentPane().add(jeepPassenger[4]);
		jeepPassenger[4].setVisible(false);
		
		jeepPassenger[5] = new JLabel("");
		jeepPassenger[5].setIcon(new ImageIcon(passenger));
		jeepPassenger[5].setBounds(221, 52, 71, 71);
		frame.getContentPane().add(jeepPassenger[5]);
		jeepPassenger[5].setVisible(false);
		
		jeepPassenger[6] = new JLabel("");
		jeepPassenger[6].setIcon(new ImageIcon(passenger));
		jeepPassenger[6].setBounds(140, 221, 71, 71);
		frame.getContentPane().add(jeepPassenger[6]);
		jeepPassenger[6].setVisible(false);
	
		jeepPassenger[7] = new JLabel("");
		jeepPassenger[7].setIcon(new ImageIcon(passenger));
		jeepPassenger[7].setBounds(140, 52, 71, 71);
		frame.getContentPane().add(jeepPassenger[7]);
		jeepPassenger[7].setVisible(false);
		
		jeepPassenger[8] = new JLabel("");
		jeepPassenger[8].setIcon(new ImageIcon(passenger));
		jeepPassenger[8].setBounds(59, 221, 71, 71);
		frame.getContentPane().add(jeepPassenger[8]);
		jeepPassenger[8].setVisible(false);
		
		jeepPassenger[9] = new JLabel("");
		jeepPassenger[9].setIcon(new ImageIcon(passenger));
		jeepPassenger[9].setBounds(59, 52, 71, 71);
		frame.getContentPane().add(jeepPassenger[9]);
		jeepPassenger[9].setVisible(false);
		
		Image conductorIMG = new ImageIcon(this.getClass().getResource("/Conductor.png")).getImage();
		Image conductor = conductorIMG.getScaledInstance(71, 71, Image.SCALE_DEFAULT);
		
		JLabel lblConductor = new JLabel("");
		lblConductor.setIcon(new ImageIcon(conductor));
		lblConductor.setBounds(475, 195, 71, 71);
		frame.getContentPane().add(lblConductor);
		
		JLabel lblJeepneyLayout = new JLabel("");
		Image jeepneyLayoutIMG = new ImageIcon(this.getClass().getResource("/Raw.png")).getImage();
		Image jeepney = jeepneyLayoutIMG.getScaledInstance(593, 324, Image.SCALE_DEFAULT);
		lblJeepneyLayout.setIcon(new ImageIcon(jeepney));
		lblJeepneyLayout.setBounds(10, 10, 593, 324);
		frame.getContentPane().add(lblJeepneyLayout);
		
		passengerLine[0] = new JLabel("");
		passengerLine[0].setIcon(new ImageIcon(passenger));
		passengerLine[0].setBounds(passengerVert, passengerHori, 71, 71);
		frame.getContentPane().add(passengerLine[0]);
		passengerLine[0].setVisible(false);
		
		passengerLine[1] = new JLabel("");
		passengerLine[1].setIcon(new ImageIcon(passenger));
		passengerLine[1].setBounds(passengerVert + 81, passengerHori, 71, 71);
		frame.getContentPane().add(passengerLine[1]);
		passengerLine[1].setVisible(false);
		
		passengerLine[2] = new JLabel("");
		passengerLine[2].setIcon(new ImageIcon(passenger));
		passengerLine[2].setBounds(passengerVert + 81 * 2, passengerHori, 71, 71);
		frame.getContentPane().add(passengerLine[2]);
		passengerLine[2].setVisible(false);
		
		passengerLine[3] = new JLabel("");
		passengerLine[3].setIcon(new ImageIcon(passenger));
		passengerLine[3].setBounds(passengerVert + 81 * 3, passengerHori, 71, 71);
		frame.getContentPane().add(passengerLine[3]);
		passengerLine[3].setVisible(false);
		
		passengerLine[4] = new JLabel("");
		passengerLine[4].setIcon(new ImageIcon(passenger));
		passengerLine[4].setBounds(passengerVert + 81 * 4, passengerHori, 71, 71);
		frame.getContentPane().add(passengerLine[4]);
		passengerLine[4].setVisible(false);
		
		passengerLine[5] = new JLabel("");
		passengerLine[5].setIcon(new ImageIcon(passenger));
		passengerLine[5].setBounds(passengerVert, passengerHori + 81, 71, 71);
		frame.getContentPane().add(passengerLine[5]);
		passengerLine[5].setVisible(false);
		
		passengerLine[6] = new JLabel("");
		passengerLine[6].setIcon(new ImageIcon(passenger));
		passengerLine[6].setBounds(passengerVert + 81, passengerHori + 81, 71, 71);
		frame.getContentPane().add(passengerLine[6]);
		passengerLine[6].setVisible(false);
		
		passengerLine[7] = new JLabel("");
		passengerLine[7].setIcon(new ImageIcon(passenger));
		passengerLine[7].setBounds(passengerVert + 81 * 2, passengerHori + 81, 71, 71);
		frame.getContentPane().add(passengerLine[7]);
		passengerLine[7].setVisible(false);
		
		passengerLine[8] = new JLabel("");
		passengerLine[8].setIcon(new ImageIcon(passenger));
		passengerLine[8].setBounds(passengerVert + 81 * 3, passengerHori + 81, 71, 71);
		frame.getContentPane().add(passengerLine[8]);
		passengerLine[8].setVisible(false);
		
		passengerLine[9] = new JLabel("");
		passengerLine[9].setIcon(new ImageIcon(passenger));
		passengerLine[9].setBounds(passengerVert + 81 * 4, passengerHori + 81, 71, 71);
		frame.getContentPane().add(passengerLine[9]);
		passengerLine[9].setVisible(false);
		
		JLabel lblBoardingLine = new JLabel("Boarding Line");
		lblBoardingLine.setHorizontalAlignment(SwingConstants.CENTER);
		lblBoardingLine.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBoardingLine.setBounds(10, 344, 593, 28);
		frame.getContentPane().add(lblBoardingLine);
		
		JButton btnAddPassenger = new JButton("Add Passenger");
		btnAddPassenger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (passengerLineNum <= 8) {
					passengerLineNum += 1;
					queue.add(fare[passengerLineNum]);
					passengerLine[passengerLineNum].setVisible(true);
				}
			}
		});
		btnAddPassenger.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnAddPassenger.setBounds(10, 649, 169, 82);
		frame.getContentPane().add(btnAddPassenger);
		
		JButton btnRemovePassenger = new JButton("Remove Passenger");
		btnRemovePassenger.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (passengerLineNum >= 0) {
					queue.remove();
					passengerLine[passengerLineNum].setVisible(false);
					passengerLineNum -= 1;
				}
			}
		});
		btnRemovePassenger.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnRemovePassenger.setBounds(222, 649, 169, 82);
		frame.getContentPane().add(btnRemovePassenger);
		
		JButton btnDepart = new JButton("Depart");
		btnDepart.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if (passengerLineNum > 0) {
					Thread countdownThread = new Thread(new Runnable() {
						@Override
						public void run() {
							btnAddPassenger.setVisible(false);
							btnRemovePassenger.setVisible(false);
							btnDepart.setVisible(false);
							lblBoardingLine.setVisible(false);
							for (int i = 0; i <= passengerLineNum; i++) {
								passengerLine[i].setVisible(false);
								int peekFare = queue.peek();
								fareStack.push(peekFare);
								queue.remove();
								jeepPassenger[i].setVisible(true);
								try {
									Thread.sleep(1000);
								} catch (InterruptedException e1) {
									e1.printStackTrace();
								}
							}
						}
					});
					countdownThread.start();
				} else {
					System.out.println("Tanga! Wala kang pasahero! BOBO INUTIL WALANG MANGMANG WALANG MAGULANG HINDI KA MAHAL NG PAMILYA MO");
				}
			}
		});
		btnDepart.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnDepart.setBounds(434, 649, 169, 82);
		frame.getContentPane().add(btnDepart);
		
		JLabel lblFaresCollected = new JLabel("Fares Collected");
		lblFaresCollected.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblFaresCollected.setHorizontalAlignment(SwingConstants.CENTER);
		lblFaresCollected.setBounds(898, 10, 230, 71);
		frame.getContentPane().add(lblFaresCollected);
		lblFaresCollected.setVisible(false);
		
		JButton btnCollectFare = new JButton("Collect Fare");
		btnCollectFare.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Thread countdownThread = new Thread(new Runnable() {
					@Override
					public void run() {
						lblFaresCollected.setVisible(true);
						for (int i = passengerLineNum; i >= 0; i--) {
							if (i <= 1) {
								lblConductor.setBounds(383, 137, 71, 71);
							} else if (i <= 3) {
								lblConductor.setBounds(302, 137, 71, 71);
							} else if (i <= 5) {
								lblConductor.setBounds(221, 137, 71, 71);
							} else if (i <= 7) {
								lblConductor.setBounds(140, 137, 71, 71);
							} else {
								lblConductor.setBounds(59, 137, 71, 71);
							}
							jeepPassenger[i].setIcon(new ImageIcon(jeepPassengerPaid));
							String peekFare = Integer.toString(fareStack.peek());
							paidPassenger[fareCollectionNum].setVisible(true);
							paidPassengerLabel[fareCollectionNum].setText("P" + (12 + Integer.parseInt(peekFare)));
							fareCollectionNum++;
							fareStack.pop();
							try {
								Thread.sleep(1000);
							} catch (InterruptedException e1) {
								e1.printStackTrace();
							}
						}
						lblConductor.setBounds(475, 195, 71, 71);
					}
				});
				countdownThread.start();
			}
		});
		btnCollectFare.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnCollectFare.setBounds(434, 649, 169, 82);
		frame.getContentPane().add(btnCollectFare);
	}
}
