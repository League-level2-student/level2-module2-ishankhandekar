package _06_overloading;

public class LeagueOptionPaneRunner {
	public static void main(String[] args) {
		LeagueOptionPane lop = new LeagueOptionPane();
		lop.showMessageDialog("The League is the Best");
		lop.showMessageDialog("The League is the Best", "League");
		lop.showMessageDialog("The League is the Best", "League","java.png");
		lop.showMessageDialog("The League is the Best", "League", "java.png", 255);
	}
}
