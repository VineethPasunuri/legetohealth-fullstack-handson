package Day3;

public class SpecialMovie extends Movie {
	private String soundEffects;
	private String visualEffects;

	public String getSoundEffects() {
		return soundEffects;
	}

	public void setSoundEffects(String soundEffects) {
		this.soundEffects = soundEffects;
	}

	public String getVisualEffects() {
		return visualEffects;
	}

	public void setVisualEffects(String visualEffects) {
		this.visualEffects = visualEffects;
	}

	public SpecialMovie(String movieName, String producedBy, String directedBy, int duration, int year, String category,
			String soundEffects, String visualEffects) {
		super(movieName, producedBy, directedBy, duration, year, category);
		// TODO Auto-generated constructor stub
		this.soundEffects = soundEffects;
		this.visualEffects = visualEffects;
	}

	@Override
	public String toString() {
		return "Movie Name=" + getMovieName() + "soundEffects=" + soundEffects + ", visualEffects=" + visualEffects;
	}

}
