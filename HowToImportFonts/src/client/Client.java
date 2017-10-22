package client;

import java.awt.EventQueue;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.GraphicsEnvironment;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Client
{

    private JFrame frame;

    /**
     * Launch the application.
     */
    public static void main(String[] args)
    {
	EventQueue.invokeLater(new Runnable()
	{
	    public void run()
	    {
		try
		{
		    Client window = new Client();
		    window.frame.setVisible(true);
		}
		catch (Exception e)
		{
		    e.printStackTrace();
		}
	    }
	});
    }

    /**
     * Create the application.
     */
    public Client()
    {
	initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize()
    {
	frame = new JFrame();
	frame.setBounds(100, 100, 450, 300);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(null);

	JLabel lblThisIsA = new JLabel();
	lblThisIsA.setBounds(26, 23, 293, 36);
	frame.getContentPane().add(lblThisIsA);
	
	GraphicsEnvironment ge = null;
	ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
	try
	{
	    ge.registerFont(Font.createFont(Font.TRUETYPE_FONT, lblThisIsA.getClass().getResourceAsStream("/fonts/digital-7Mono.ttf")));
	}
	catch (FontFormatException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	catch (IOException e)
	{
	    // TODO Auto-generated catch block
	    e.printStackTrace();
	}
	for(String f : ge.getAvailableFontFamilyNames())
	{
	    System.out.println(f);
	}
	Font digital7Mono = new Font("Digital-7 Mono", Font.PLAIN, 50);
	lblThisIsA.setFont(digital7Mono);
	lblThisIsA.setText("012345679");
    }

}
