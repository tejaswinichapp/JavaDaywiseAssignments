package Day.wise.assignments;

public class Novel extends Book {
	String isbn;
	String title;
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	@Override
	public String toString() {
		return "Novel [isbn=" + isbn + ", title=" + title + "]";
	}
	
	
	

}
