package frameTest;

import java.awt.CheckboxMenuItem;
import java.awt.Frame;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.MenuShortcut;
import java.awt.event.KeyEvent;

public class MenuTest {
	public static void main(String[] args) {
		Frame f = new Frame("Parent");
		f.setSize(300, 200);

		MenuBar mb = new MenuBar();
		Menu mFile = new Menu("파일(F)");
		MenuItem miNew = new MenuItem("새로 만들기(N)");
		MenuShortcut scNew = new MenuShortcut(KeyEvent.VK_N);
		MenuItem miNewWin = new MenuItem("새 창(W)");
		MenuShortcut scNewWin = new MenuShortcut(KeyEvent.VK_SHIFT + KeyEvent.VK_N);
		MenuItem miOpen = new MenuItem("Open");

		Menu mOthers = new Menu("Others");
		MenuItem miExit = new MenuItem("Exit");
		
		miNew.setShortcut(scNew);
		miNewWin.setShortcut(scNewWin);

		mFile.add(miNew);
		mFile.add(miNewWin);
		mFile.add(miOpen);
		mFile.add(mOthers);
		mFile.addSeparator();
		mFile.add(miExit);

		MenuItem miPrint = new MenuItem("Print...");
		MenuItem miPreview = new MenuItem("Print Preview");
		MenuItem miSetup = new MenuItem("Print Setup...");
		mOthers.add(miPrint);
		mOthers.add(miPreview);
		mOthers.add(miSetup);

		Menu mEdit = new Menu("Edit");
		Menu mView = new Menu("View");
		Menu mHelp = new Menu("Help");
		CheckboxMenuItem miStatusbar = new CheckboxMenuItem("Statusbar");
		mView.add(miStatusbar);

		mb.add(mFile);
		mb.add(mEdit);
		mb.add(mView);
		mb.setHelpMenu(mHelp);

		f.setMenuBar(mb);
		f.setVisible(true);
	}
}
