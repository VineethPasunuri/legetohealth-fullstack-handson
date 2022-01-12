package Day3;

public class InternationalMovie extends Movie {
	private String country;
	private String language;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

//	public InternationalMovie(String movieName, String producedBy, String country, String language) {
//		super(movieName, producedBy);
//		this.country = country;
//		this.language = language;
//	}

	public InternationalMovie(String movieName, String producedBy, String directedBy, int duration, int year,
			String category, String country, String language) {
		super(movieName, producedBy, directedBy, duration, year, category);
		this.country = country;
		this.language = language;
		// TODO Auto-generated constructor stub
	}

}
