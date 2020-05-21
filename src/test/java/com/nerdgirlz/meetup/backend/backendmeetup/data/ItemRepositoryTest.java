package com.nerdgirlz.meetup.backend.backendmeetup.data;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.Optional;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.nerdgirlz.meetup.backend.backendmeetup.model.Item;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ItemRepositoryTest {

  @Autowired
  private ItemRepository repository;

  @Test
  public void testFindAll() {
    List<Item> items = repository.findAll();
    assertEquals(3,items.size());
  }

  @Test
  public void testFindOne() {
    Item item = repository.findById(35).get();

    assertEquals("desenvolvimentobackend",item.getName());
  }
}
