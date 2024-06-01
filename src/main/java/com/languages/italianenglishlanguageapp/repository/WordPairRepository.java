package com.languages.italianenglishlanguageapp.repository;

import com.languages.italianenglishlanguageapp.entity.Wordpair;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordPairRepository extends JpaRepository<Wordpair,Long> {
}
