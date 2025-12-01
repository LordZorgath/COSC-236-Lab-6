package lab5;

public class PaperBookFactory implements BookFactory{
	public PaperBook createBook(String title){
		return new PaperBook(title);
	}
};
