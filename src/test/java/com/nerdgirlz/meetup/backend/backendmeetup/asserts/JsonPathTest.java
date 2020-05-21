package com.nerdgirlz.meetup.backend.backendmeetup.asserts;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.Test;

import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class JsonPathTest {

  @Test
  public void learning() {
    String responseFromService = "[" +
      "{\"id\":35, \"name\":\"desenvolvimentobackend\", \"quantity\":100}," +
      "{\"id\":37, \"name\":\"saude mental\", \"quantity\":100}," +
      "{\"id\":34, \"name\":\"acessibilidade nos games\", \"quantity\":100}" +
      "]";

    DocumentContext context = JsonPath.parse(responseFromService);

    int length = context.read("$.length()");
    assertThat(length).isEqualTo(3);

    List<Integer> ids = context.read("$..id");

    assertThat(ids).containsExactly(35,37,34);

    System.out.println(context.read("$.[1]").toString());
    System.out.println(context.read("$.[0:2]").toString());
    System.out.println(context.read("$.[?(@.name=='saude mental')]").toString());
    System.out.println(context.read("$.[?(@.quantity==100)]").toString());

  }

}
