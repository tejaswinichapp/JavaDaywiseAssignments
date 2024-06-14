package Day.wise.assignments;

public class Movie {
	 private String mpaaRating;
	    private int idNumber;
	    private String title;

	    public Movie(String mpaaRating, int idNumber, String title) {
	        this.mpaaRating = mpaaRating;
	        this.idNumber = idNumber;
	        this.title = title;
	    }

		public String getMpaaRating() {
			return mpaaRating;
		}

		public void setMpaaRating(String mpaaRating) {
			this.mpaaRating = mpaaRating;
		}

		public int getIdNumber() {
			return idNumber;
		}

		public void setIdNumber(int idNumber) {
			this.idNumber = idNumber;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		@Override
		public String toString() {
			return "Movie [mpaaRating=" + mpaaRating + ", idNumber=" + idNumber + ", title=" + title + "]";
		}
	    
}
