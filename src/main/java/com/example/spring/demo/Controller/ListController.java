package com.example.spring.demo.Controller;

import java.util.List;
import java.util.Map;

import com.example.spring.demo.Facade.ListFacade;
import com.example.spring.demo.Form.ListForm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import lombok.RequiredArgsConstructor;

/**
 * @author sugiyama
 * 
 * リスト画面のControllerクラス
 */
@RequiredArgsConstructor
@RestController
public class ListController {
  private final ListFacade listFacade;

  @Autowired
  public ListController(ListFacade listFacade){
    this.listFacade = listFacade;
  }

  @Bean
  public RestTemplate restTemplate() {
    return new RestTemplate();
}
 
  /**
   * 指定したボードの情報を取得する
   * 
   */
  @GetMapping("/api/v1/boards/{board_id}")
  public Map<String, Object> boardDetails(@PathVariable Integer board_id){
    board_id = 1;
    return listFacade.getListInfo(board_id);
  }

  /**
   * リストを作成する
   */
  @PostMapping("/api/v1/list")
  public List createList(){
    Integer board_id = 1;
    Integer list_id = 1;

    return null;
  }

  /**
   * リストを更新する
   */
  @GetMapping("/api/v1/update/list")
  public List updateList(ListForm form){
    return null;
  }

  /**
   * リストを削除する
   */  
  @GetMapping("/api/v1/delete/list")
  public List deleteList(ListForm form){
    return null;
  }

  /**
   * カードを作成する
   */
  @PostMapping("/api/v1/cards")
  public List createCard(ListForm form){
    return null;
  }

  /**
   * カードを削除する
   */
  @PostMapping("/api/v1/delete/cards")
  public List deleteCard(ListForm form){
    return null;
  }

  /**
   * カードを更新する
   */
  @PostMapping("/api/v1/update/cards")
  public List updateCard(ListForm form){
    return null;
  }
}
