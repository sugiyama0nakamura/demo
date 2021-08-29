package com.example.spring.demo.Facade;

import java.util.ArrayList;
import java.util.List;

import com.example.spring.demo.Common.MessageUtil;
import com.example.spring.demo.Service.ListService;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class ListFacade {
  // private final ListService listService;

  // /**
  //  * ボードIDに紐づくデータ全て取得
  //  * 
  //  * @param boardId ボードID
  //  * @return ボードIDから紐づくデータ全て
  //  */
  // public List getBoardInfo(String boardId) {
  //   //該当データ全取得する
  //   List boardList = listService.getBoardInfo(boardId);
  //   List listList = listService.getListInfo(boardId);
  //   List cardList = listService.getCardInfo(boardId);
  //   List progressList = listService.getprogressInfo(boardId);
  //   String message = MessageUtil.I_000_201;
  //   List<> list = ArrayList();
  //   return list(boardList, listList, cardList, progressList, message);
  // }
  
}
