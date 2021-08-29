package com.example.spring.demo.Form;

import java.sql.Timestamp;

import lombok.Data;

@Data
public class ListForm {
  private Integer boradId;
  private Integer listId;
  private String listName;
  private boolean listDeleteFlg;
  private String listCreateName;
  private String listCreateDay;
  private String listUpdateName;
  private String listUpdateDay;
  private Integer cardId;
  private Integer progressId;
  private String cardName;
  private String cardDetails;
  private boolean cardDeleteFlg;
  private Timestamp deadlineStartDate;
  private Timestamp deadlineEndDate;
  private String percentageOfCompletion;
  private String cardCreateUser;
  private Timestamp cardCreateDay;
}
