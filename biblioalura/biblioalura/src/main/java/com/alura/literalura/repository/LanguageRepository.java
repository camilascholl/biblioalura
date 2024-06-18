package com.alura.biblioalura.repository;

import com.alura.biblioalura.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface LanguageRepository extends JpaRepository<Language, Long> {
    Optional<Language> findByLanguage(String language);
}
