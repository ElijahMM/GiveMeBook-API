package com.mihai.licenta.Repos;

import com.mihai.licenta.Models.DBModels.Book;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by mihai on 12.04.2017.
 */
public interface BooksRepository extends JpaRepository<Book, Long> {

    Book findByTitle(String title);
}
