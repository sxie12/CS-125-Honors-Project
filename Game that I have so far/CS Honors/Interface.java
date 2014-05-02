
public class Interface {
	
	public static void start() {
		while(Zen.isRunning()) {
			HighScoreList.setHighScores();

			Zen.setColor(200, 100, 50);
			// Zen.getZenWidth() = 1000
			// Zen.getZenHeight() = 400
			Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());
			// Ignore this, just for measurement to center things: 27.5
			PixelatedText.drawPixelatedText("Runner Game",332,20,6);
			
			Zen.setColor(0, 200, 200);
			// Start game button design
			Zen.fillRect(180, 130, 640, 60);
			Zen.fillOval(150, 130, 60, 60);
			Zen.fillOval(790, 130, 60, 60);
			
			// Credit button design
			Zen.fillRect(180, 210, 200, 60);
			Zen.fillOval(150, 210, 60, 60);
			
			// Settings button design
			Zen.fillRect(400, 210, 200, 60);
			
			// Highscore list button design
			Zen.fillRect(620, 210, 200, 60);
			Zen.fillOval(790, 210, 60, 60);
			
			PixelatedText.drawPixelatedText("Start Game",405,150,4);
			PixelatedText.drawPixelatedText("Credits",210,230,4);
			PixelatedText.drawPixelatedText("Settings",425,230,4);
			PixelatedText.drawPixelatedText("Highscores",633,230,4);
			
			if(Zen.getMouseClickX() >= 165 && Zen.getMouseClickX() <= 835 && Zen.getMouseClickY() >= 130 && Zen.getMouseClickY() <= 190) {
				// Goto the game menu
				RunnerGame3.gameStart();
			}
			if(Zen.getMouseClickX() >= 165 && Zen.getMouseClickX() <= 380 && Zen.getMouseClickY() >= 210 && Zen.getMouseClickY() <= 270) {
				// Goto the credits menu
				Credits.displayCredits();
			}
			if(Zen.getMouseClickX() >= 400 && Zen.getMouseClickX() <= 600 && Zen.getMouseClickY() >= 210 && Zen.getMouseClickY() <= 270) {
				// Goto the settings menu
				Settings.settings();
			}
			if(Zen.getMouseClickX() >= 620 && Zen.getMouseClickX() <= 835 && Zen.getMouseClickY() >= 210 && Zen.getMouseClickY() <= 270) {
				// Goto the highscore menu
				HighScoreList.highscoreList();
			}
			
			Zen.sleep(45);
			Zen.flipBuffer();
		}
	}
	
	public static void main(String[] args) {
		Interface.start();
	}
}
