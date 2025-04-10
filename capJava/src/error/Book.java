package error;

import java.util.Comparator;

public class Book implements Comparable {
	String title;
	int price;
	Double rating;

	public Book(String title, int price, double rating) {
		this.title = title;
		this.price = price;
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", price=" + price + ", rating=" + rating + "]";
	}

	public int compareTo(Object o) {
		Book b = (Book) o;
//		if (this.rating > b.rating)
//			return 1;
//		if (this.rating < b.rating)
//			return -1;
//		return 0;

//		return this.price - b.price;

//		if (this.price != b.price)
		return this.price - b.price;
//		if (!this.rating.equals(b.rating))
//			return this.rating.compareTo(b.rating);
//		return this.title.compareTo(b.title);
	}

}

class RatingComparator implements Comparator {
	@Override
	public int compare(Object o1, Object o2) {
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		return b1.rating.compareTo(b2.rating);
	}
}

class TitleComparator implements Comparator {
	public int compare(Object o1, Object o2) {
		Book b1 = (Book) o1;
		Book b2 = (Book) o2;
		return b1.title.compareTo(b2.title);
	}
}