public class Settings {
	public final static String[] difficulties = { "Easy", "Medium", "Hard" };
	public static int index;
	// index is the difficulty corresponding to the array above

	public static void settings() {
		while (Zen.isRunning()) {
			findDiff();

			Zen.setColor(200, 100, 50);
			Zen.fillRect(0, 0, Zen.getZenWidth(), Zen.getZenHeight());

			PixelatedText.drawPixelatedText("Settings", 390, 20, 6);

			PixelatedText.drawPixelatedText("Difficulty: " + difficulties[index],
					100, 100, 4);
			PixelatedText
			.drawPixelatedText("Clear highscore list", 100, 150, 4);

			/**
			 * Testing where the button was 
			 * Zen.setColor(0, 200, 200);
			 * Zen.fillRect(93, 93, 200, 40);
			 * 
			 * Zen.setColor(0, 200, 200);
			 * Zen.fillRect(93, 140, 400, 40);
			 */


			if (Zen.getMouseClickX() >= 93 && Zen.getMouseClickX() <= 298
					&& Zen.getMouseClickY() >= 93
					&& Zen.getMouseClickY() <= 133) {
				// Pop up difficulty menu
				SettingsDiff.set();
			}
			if (Zen.getMouseClickX() >= 93 && Zen.getMouseClickX() <= 493
					&& Zen.getMouseClickY() >= 140
					&& Zen.getMouseClickY() <= 180) {
				// Pop up clear high scores warning
				SettingsClear.clear();
			}

			Zen.setColor(0, 200, 200);
			// Back button design
			Zen.fillRect(700, 270, 200, 60);

			PixelatedText.drawPixelatedText("Back", 762, 290, 4);

			if (Zen.getMouseClickX() >= 700 && Zen.getMouseClickX() <= 900
					&& Zen.getMouseClickY() >= 270
					&& Zen.getMouseClickY() <= 330) {
				// Goto the interface menu
				Interface.start();
			}
			
			Zen.sleep(45);
			Zen.flipBuffer();
		}
	}
	
	// Finds the difficulty from the saved file
	public static void findDiff() {
		TextIO.readFile("Highscores file");
		int lineNum = 1;
		while (lineNum < 12) {
			String line = TextIO.getln();
			if(lineNum == 11)
				index = Integer.parseInt(line);
			lineNum++;
		}
	}

	/**
	public static void main(String[] args) {
		Settings.settings();
	}
	*/
}
