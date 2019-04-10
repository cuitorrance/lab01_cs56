// Author: Torrance Cui
// Lab01 main class

public class Lab01 {

    public static void main(String[] args) {
	// TODO Auto-generated method stub
		
	// tests author default constructor
	System.out.println("--author default constructor test--");
	Author author = new Author();
	System.out.println(author);
		
	System.out.println();
		
	// tests author constructor
	System.out.println("--author constructor test--");
	Author jim = new Author("Jim", "Halpert", 1965, 8);
	System.out.println(jim);
	jim.setBirth(1968);
	jim.setLast("Scott");
	System.out.println(jim);
		
	System.out.println();
		
	// tests author copy constructor
	System.out.println("--author copy constructor test--");
	Author torrance =  jim;
	System.out.println(jim);
	System.out.println(torrance);
		
	System.out.println();
		
	//tests book default constructor
	System.out.println("--book default constructor test--");
	Book book = new Book();
	System.out.println(book);
		
	System.out.println();
		
	//tests book constructor
	System.out.println("--book constructor test--");
	Book math = new Book(100,1996,25.64, "Basics of Math", jim);
	System.out.println(math);
		
	System.out.println();
		
	//tests book setters
	System.out.println("--book setter test--");
	book.setDatePub(1043);
	book.setNumPages(4903);
	book.setPrice(30.2);
	book.setTitle("How to Fly");
	book.setAuthor(jim.getFirst(), jim.getLast(), jim.getBirth(), jim.getNumPub());
	System.out.println(book);
		
	System.out.println();
		
	//tests book copy constructor
	System.out.println("--book copy constructor test--");
	System.out.println("-----------------");
	Book exp = new Book(13,3902,435.23, "Expensive Book", torrance);
	System.out.println("OLD COPY");
	System.out.println(exp);
	System.out.println("-----------------");
	System.out.println("NEW COPY");
	exp = math;
	System.out.println(exp);
	System.out.println("-----------------");
	System.out.println("COPIED BOOK");
	System.out.println(math);
		
	System.out.println();

	//updating publications test
	System.out.println("--Updating Publications Test--");
	System.out.println("Before Update");
	System.out.println("-----------------");
	System.out.println(math);
	System.out.println("After Update");
	System.out.println("-----------------");
	math.getAuthor().setNumPub(9);
	System.out.println(math);
		
    }

}
