package com.example.spring.demo.Form;

import java.security.Timestamp;

import lombok.Data;

@Data
public class CardForm {
  private Integer cardId;
  private Integer userId;
  private Integer listId;
  private String cardName;
  private String cardDetails;
  private String createUser;
  private Timestamp createDay;
  private String updateUser;
  private Timestamp updateDay;
  private boolean deleteFlg;
  private Timestamp deadlineStartDate;
  private Timestamp deadlineEndDate;

  public Integer getCardId() {
    return cardId;
  }

  public void setCardId (Integer cardId) {
    this.cardId = cardId;
  }

  public Integer getUserId() {
    return userId;
  }

  public void setUserId (Integer userId) {
    this.userId = userId;
  }

  public Integer getListId() {
    return listId;
  }

  public void setListId (Integer listId) {
    this.listId = listId;
  }

  public String getCardName() {
    return cardName;
  }

  public void setCardName (String cardName) {
    this.cardName = cardName;
  }

  public String getCardDetails() {
    return cardDetails;
  }

  public void setCardDetails (String cardDetails) {
    this.cardDetails = cardDetails;
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
