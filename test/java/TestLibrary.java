import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestLibrary {

   private Library library;
   private Books books;
   private Books book1;

   @Before
    public void before(){
       library = new Library(2);
       books = new Books("Catcher in the Rye", "J.D. Salinger", "Drama");
       book1 = new Books("Brave New World", "Aldous Huxley", "Science Fiction");
       library.addBook(books);
   }

   @Test
    public void canCountBook(){
       assertEquals(1, library.bookCount());
   }

   @Test
   public void canAddBook(){
      library.addBook(book1);
      assertEquals(2, library.bookCount());
   }

   @Test
   public void canCheckForCapacity(){
      library.addBook(book1);
      assertEquals(false, library.checkCapacity());
   }

   @Test
   public void canCheckForNoneCapacity(){
      assertEquals(true,library.checkCapacity());
   }



}
