import java.util.Date;

public class Book {
   public static final int AVAILABLE = 1;
   public static final int UNAVAILABLE = 2;
   public String title; 
   public String author;
   public String isbn;
   public int pages; 
   public int year; 
   public int status;
   private Date due;
   private Patron patron;
   
   public Book(String title, String author, String isbn, int year, int pages) {
      this.title = title;
      this.author = author;
      this.isbn = isbn;
      this.pages = pages;
      this.year = year;
      this.status = AVAILABLE;
      this.patron = null;
      this.due = null;
   }
   
   public void checkin() {
      this.status = AVAILABLE;
      this.patron = null;
      this.due = null;
   }
   
   public void checkout(Patron patron, Date due) {
      this.status = UNAVAILABLE;
      this.patron = patron;
      this.due = due;
   }
   
   public boolean equals (Book iBook) {
        return this.isbn.equals(iBook.isbn);
   }
   
   public boolean equals(String bIsbn) {
        return this.isbn.equals(bIsbn);
   }
   
   public void setTitle(String inputTitle) {
      title = inputTitle;
   }
   
   public String getTitle() {
      return title;
   }
   
   public void setAuthor(String inputAuthor) {
      author = inputAuthor;
   }
   
   public String getAuthor() {
      return author;
   }
   
   public void setIsbn(String inputIsbn) {
      isbn = inputIsbn;
   }
   
   public String getIsbn() {
      return isbn;
   }
   
   public void setPages(int inputPages) {
      pages = inputPages;
   }
   
   public int getPages() {
      return pages;
   }
   
   public void getYear(int inputYear) {
      year = inputYear;
   }
   
   public int getYear() {
      return year;
   }
   
   public void setStatus(int inputStatus) {
      status = inputStatus;
   }
   
   public int getStatus() {
      return status;
   }
   
   public void setDue(Date inputDue) {
      due = inputDue;
   }
   
   public Date getDue() {
      return due;
   }
   
   public void setPatron(Patron inputPatron) {
      patron = inputPatron;
   }
   
   public Patron getPatron() {
      return patron;
   }
   
   public String toString() {
      return String.format("Title: %s, Author: %s, ISBN: %s, Year: %d, Pages: %d.", title, author, isbn, year, pages);
   }
   
}

         