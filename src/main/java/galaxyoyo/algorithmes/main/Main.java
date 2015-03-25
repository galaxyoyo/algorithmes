package galaxyoyo.algorithmes.main;

import galaxyoyo.algorithmes.frames.MainFrame;

import javax.swing.UIManager;

public class Main
{
	public static void main(String ... args)
	{
		try
		{
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
		}
		catch (Throwable t)
		{
			t.printStackTrace();
		}
		
		new MainFrame();
	}
}