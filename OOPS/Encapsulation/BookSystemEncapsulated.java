package OOPS.Encapsulation;
public class BookSystemEncapsulated{
    private String title;
    private String author;
    private static int totoalIssued;
    BookSystemEncapsulated(String name,String writer){
        this.title = name;
        this.author = writer;
    }
    public void issueBook() {
        totoalIssued++;
    }

    public  String getwriter() {
        return author;
    }

    public  String getname() {
        return title;
    }
    public static int getTotoalIssued(){
        return totoalIssued;
    }

    public static void main(String[] args) {

        BookSystemEncapsulated book = new BookSystemEncapsulated ("JavaBasics" ,"Mahesh" );
        System.out.println("Book: " + book.getname() + " by " + book.getwriter());
        book.issueBook();
       BookSystemEncapsulated book1 = new BookSystemEncapsulated("OOP concepts" ,"Priya" );
        System.out.println("Book: " + book1.getname() + " by " + book1.getwriter());
        book1.issueBook();
        System.out.println("Total Books Issued: " + BookSystemEncapsulated.getTotoalIssued());
    }

}