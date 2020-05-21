package com.nerdgirlz.meetup.backend.backendmeetup.data;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nerdgirlz.meetup.backend.backendmeetup.model.Item;

public interface ItemRepository extends JpaRepository<Item, Integer>{

}
