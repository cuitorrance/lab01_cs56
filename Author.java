//author: Torrance Cui
//Author class

public class Author {

    private String first;
    private String last;
    private int birth;
    private int numpub;
	
    //default constructor
    public Author() {
	setFirst("");
	setLast("");
	setBirth(0);
	setNumPub(0);
    }
    //constructor
    public Author(String first, String last, int birth, int numpub) {
	setFirst(first);
	setLast(last);
	setBirth(birth);
	setNumPub(numpub);
    }
    //copy constructor
    Author(Author a){
	setFirst(a.getFirst());
	setLast(a.getLast());
	setBirth(a.getBirth());
	setNumPub(a.getNumPub());
    }
    //getters and setters
    public void setFirst(String firstname) {
	first = firstname;
    }
    public void setLast(String lastname) {
	last = lastname;
    }
    public void setBirth(int birthyear) {
	birth = birthyear;
    }
    public void setNumPub(int numpubed) {
	numpub = numpubed;
    }
    public String getFirst() {
	return first;
    }
    public String getLast() {
	return last;
    }
    public int getBirth() {
	return birth;
    }
    public int getNumPub() {
	return numpub;
    }
    //override to string
    public String toString() {
		
	if (numpub == 1) {
	    return "Written by " + first + " " + last + ", who was born in " + birth + " and has " + numpub + " publication";
	}else {
	    return "Written by " + first + " " + last + ", who was born in " + birth + " and has " + numpub + " publications";
	}
		
    }
} 
