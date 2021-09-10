package com.example.spring.demo.Dto;

import java.security.Timestamp;

import lombok.Data;

@Data
public class ListDto {
  private Integer listId;
  private Integer userId;
  private Integer boardId;
  private String listName;
  private String createUser;
  private Timestamp createDay;
  private String updateUser;
  private Timestamp updateDay;
  private boolean deleteFlg;
  private Timestamp deadlineStartDate;
  private Timestamp deadlineEndDate;

  public Integer getListId() {
    return listId;
  }

  public void setListId (Integer listId) {
    this.listId = listId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId (Integer userId) {
    this.userId = userId;
  }

  public Integer getBoardId() {
    return boardId;
  }

  public void setBoardId (Integer boardId) {
    this.boardId = boardId;
  }  

  public String getListName() {
    return listName;
  }

  public void setListName (String listName) {
    this.listName = listName;
  }

  public String getCreateUser() {
    return createUser;
  }

  public void setCreateUser (String createUser) {
    this.createUser = createUser;
  }

  public Timestamp getCreateDay () {
    return createDay;
  }

  public void setCreateDay (Timestamp createDay) {
    this.createDay = createDay;
  }

  public String getUpdateUser() {
    return updateUser;
  }

  public void setUpdateUser (String updateUser) {
    this.updateUser = updateUser;
  }

  public Timestamp getUpdateDay () {
    return updateDay;
  }

  public void setUpdateDay (Timestamp updateDay) {
    this.updateDay = updateDay;
  }

  public boolean getDeleteFlg () {
    return deleteFlg;
  }

  public void setDeleteFlg (boolean deleteFlg) {
    this.deleteFlg = deleteFlg;
  }

  public Timestamp getDeadlineStartDate () {
    return deadlineStartDate;
  }

  public void setDeadlineStartDate (Timestamp deadlineStartDate) {
    this.deadlineStartDate = deadlineStartDate;
  }

  public Timestamp getDeadlineEndtDate () {
    return deadlineEndDate;
  }

  public void setDeadlineEndDate (Timestamp deadlineEndDate) {
    this.deadlineEndDate = deadlineEndDate;
  }

}
