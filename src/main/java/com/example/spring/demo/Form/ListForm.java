package com.example.spring.demo.Form;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ListForm {
  private Integer boardId;
  private String boardName;
  private String boardDescription;
  private Integer listId;
  private String listName;
  private Integer cardId;
  private String cardName;
  private Integer progressId;
  private String percentageOfCompletion;
  private Timestamp deadlineStartDate;
  private Timestamp deadlineEndDate;
}
