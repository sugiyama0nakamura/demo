package com.example.spring.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;

/**
 * リスト情報
 */
@RequiredArgsConstructor
@RestController
public class ListController {
  // private final ListFacade listFacade;
 
  // /**
  //  * 指定したボードの情報を取得する
  //  */
  // @RequestMapping(value="/api/v1/boards/id", method="GET")
  // public List boardDetails(ListForm form){
  //   // List boardInfo = listFacade.getBoardInfo(form.getBoardId);
  //   // return boardInfo;
  // }

  // /**
  //  * リストを作成する
  //  */
  // @RequestMapping(value="/api/v1/list", method="POST")
  // public ModelAndView createList(ListForm form){

  // }

  // /**
  //  * リストを更新する
  //  */
  // @RequestMapping(value="/api/v1/update/list", method="GET")
  // public ModelAndView updateList(ListForm form){

  // }

  // /**
  //  * リストを削除する
  //  */
  // @RequestMapping(value="/api/v1/delete/list", method="GET")
  // public ModelAndView deleteList(ListForm form){

  // }

  // /**
  //  * カードを作成する
  //  */
  // @RequestMapping(value="/api/v1/cards", method="POST")
  // public ModelAndView createCard(ListForm form){

  // }

  // /**
  //  * カードを削除する
  //  */
  // @RequestMapping(value="/api/v1/delete/cards", method="POST")
  // public ModelAndView deleteCard(ListForm form){

  // }

  // /**
  //  * カードを更新する
  //  */
  // @RequestMapping(value="/api/v1/update/cards", method="POST")
  // public ModelAndView updateCard(ListForm form){

  // }
}
