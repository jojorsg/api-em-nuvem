package br.com.jojo.apiemnuvem.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @OneToOne(cascade = CascadeType.ALL)
    private me.dio.domain.model.Account account;

    @OneToOne(cascade = CascadeType.ALL)
    private me.dio.domain.model.Card card;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<me.dio.domain.model.Feature> features;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private List<me.dio.domain.model.News> news;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public me.dio.domain.model.Account getAccount() {
        return account;
    }

    public void setAccount(me.dio.domain.model.Account account) {
        this.account = account;
    }

    public me.dio.domain.model.Card getCard() {
        return card;
    }

    public void setCard(me.dio.domain.model.Card card) {
        this.card = card;
    }

    public List<me.dio.domain.model.Feature> getFeatures() {
        return features;
    }

    public void setFeatures(List<me.dio.domain.model.Feature> features) {
        this.features = features;
    }

    public List<me.dio.domain.model.News> getNews() {
        return news;
    }

    public void setNews(List<me.dio.domain.model.News> news) {
        this.news = news;
    }

}
