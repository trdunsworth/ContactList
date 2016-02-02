/**
 * Created by tony.dunsworth on 1/28/2016.
 */
public class Menu {
	private String menuText;
	private int optionCount;

	public Menu() {
		menuText = "";
		optionCount = 0;
	}

	public void addOption(String option) {
		optionCount = optionCount + 1;
		menuText = menuText + optionCount + ") " + option + "\n";
	}

	public void display() {
		System.out.println(menuText);
	}
}
