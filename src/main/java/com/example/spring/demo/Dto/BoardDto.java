package com.example.spring.demo.Dto;

import java.security.Timestamp;

import lombok.Data;

@Data
public class BoardDto {
  private Integer boardId;
  private Integer userId;
  private String boardName;
  private String boardDescription;
  private String createUser;
  private Timestamp createDay;
  private String updateUser;
  private Timestamp updateDay;
  private boolean deleteFlg;
  private Timestamp deadlineStartDate;
  private Timestamp deadlineEndDate;

  public Integer getBoardId(){
    return boardId;
  }

  public void setBoardId(Integer boardId) {
    this.boardId = boardId;
  }

  public Integer getUserId(){
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }

  public String getBoardName(){
    return boardName;
  }

  public void setBoardName(String boardName) {
    this.boardName = boardName;
  }

  public String getBoardDescription(){
    return boardDescription;
  }

  public void setBoardDescription(String boardDescription) {
    this.boardDescription = boardDescription;
  }

  public String getCreateUser(){
    return createUser;
  }

  public void setCreateUser(String createUser) {
    this.createUser = createUser;
  }

  public Timestamp getCreateday(){
    return createDay;
  }

  public void setCreateUser(Timestamp createDay) {
    this.createDay = createDay;
  }

  public String getUpdateUser(){
    return updateUser;
  }

  public void setUpdateUser(String updateUser) {
    this.updateUser = updateUser;
  }

  public Timestamp getUpdateday(){
    return updateDay;
  }

  public void setUpdateUser(Timestamp updateDay) {
    this.updateDay = updateDay;
  }

  public Boolean getDeleteFlg(){
    return deleteFlg;
  }

  public void setDeleteFlg(Boolean deleteFlg) {
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
