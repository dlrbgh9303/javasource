package inheritance;

public class CaptionTv extends TV {

	boolean caption;
	
	void displayCaption(String text) {
		if (caption) {
			System.out.println(text);
		}
	}
	
}
