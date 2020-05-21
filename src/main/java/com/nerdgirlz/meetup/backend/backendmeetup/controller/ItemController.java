package com.nerdgirlz.meetup.backend.backendmeetup.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nerdgirlz.meetup.backend.backendmeetup.business.ItemBusinessService;
import com.nerdgirlz.meetup.backend.backendmeetup.model.Item;

@RestController
public class ItemController {

  @Autowired
  private ItemBusinessService businessService;

  @GetMapping("/dummy-item")
  public Item dummyItem() {
    return new Item(1, "nerdgirlz", 0, 100);
  }

  @GetMapping("/item-from-service")
  public Item itemFromBusinessService() {
    Item item = businessService.retreiveHardcodedItem();

    return item;
  }

  @GetMapping("/all-items-database")
  public List<Item> retrieveAllItems() {
    return businessService.retrieveAllItems();
  }

}
