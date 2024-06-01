package com.languages.italianenglishlanguageapp.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import static jakarta.persistence.GenerationType.IDENTITY;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "wordpairs")
@Entity
public class Wordpair {
    @Id

    @GeneratedValue(strategy = IDENTITY)
    private Long id;
    @Column(name = "italian")
    private String italianWord;
    @Column(name = "english")
    private String englishWord;
}
