package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

public class BookService {
	




	@Service
	

	    @Autowired
	    private BookRepository bookRepository;

	    public Optional<Book> findBookById(Long id) {
	        return bookRepository.findById(id);
	    }

	    public Book updateBook(Long id, Book updatedBook) {
	        Optional<Book> existingBook = bookRepository.findById(id);
	        if (existingBook.isPresent()) {
	            Book book = existingBook.get();
	            book.setTitle(updatedBook.getTitle());
	            book.setAuthor(updatedBook.getAuthor());
	            book.setGenre(updatedBook.getGenre());
	            book.setPrice(updatedBook.getPrice());
	            book.setPublishedYear(updatedBook.getPublishedYear());
	            return bookRepository.save(book);
	        } else {
	            return null; // Handle this case more robustly in real applications
	        }
	    }
	}



