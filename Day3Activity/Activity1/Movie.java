package Day3;

public class Movie {
	private String movieName;
	private String producedBy;
	private String directedBy;
	private int duration;
	private int year;
	private String category;
	private static int movieCount;
	private String movieID;

	public String getMovieID() {
		return movieName + "_" + movieCount;
	}

	public static int getMovieCount() {
		return movieCount;
	}

	public static void setMovieCount(int movieCount) {
		Movie.movieCount = movieCount;
	}

	{
		movieCount++;
	}

	public Movie(String movieName, String producedBy) {
		// super();
		this.movieName = movieName;
		this.producedBy = producedBy;
	}

	public Movie(String movieName, String producedBy, String directedBy, int duration, int year, String category) {
		// super();
		this(movieName, producedBy);
		this.directedBy = directedBy;
		this.duration = duration;
		this.year = year;
		this.category = category;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getProducedBy() {
		return producedBy;
	}

	public void setProducedBy(String producedBy) {
		this.producedBy = producedBy;
	}

	public String getDirectedBy() {
		return directedBy;
	}

	public void setDirectedBy(String directedBy) {
		this.directedBy = directedBy;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String showDetails() {
		return "movieName=" + movieName + ", producedBy=" + producedBy + ", directedBy=" + directedBy + ", duration="
				+ duration + ", year=" + year + ", category=" + category;
	}

//	@Override
//	public String toString() {
//		return "movieName=" + movieName + ", producedBy=" + producedBy + ", directedBy=" + directedBy + ", duration="
//				+ duration + ", year=" + year + ", category=" + category;
//	}

}
