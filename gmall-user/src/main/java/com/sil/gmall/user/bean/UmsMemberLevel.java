package com.sil.gmall.user.bean;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class UmsMemberLevel {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private long id;
  private String name;
  private long growthPoint;
  private long defaultStatus;
  private double freeFreightPoint;
  private long commentGrowthPoint;
  private long priviledgeFreeFreight;
  private long priviledgeSignIn;
  private long priviledgeComment;
  private long priviledgePromotion;
  private long priviledgeMemberPrice;
  private long priviledgeBirthday;
  private String note;


  public long getId() {
    return id;
  }

  public void setId(long id) {
    this.id = id;
  }


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public long getGrowthPoint() {
    return growthPoint;
  }

  public void setGrowthPoint(long growthPoint) {
    this.growthPoint = growthPoint;
  }


  public long getDefaultStatus() {
    return defaultStatus;
  }

  public void setDefaultStatus(long defaultStatus) {
    this.defaultStatus = defaultStatus;
  }


  public double getFreeFreightPoint() {
    return freeFreightPoint;
  }

  public void setFreeFreightPoint(double freeFreightPoint) {
    this.freeFreightPoint = freeFreightPoint;
  }


  public long getCommentGrowthPoint() {
    return commentGrowthPoint;
  }

  public void setCommentGrowthPoint(long commentGrowthPoint) {
    this.commentGrowthPoint = commentGrowthPoint;
  }


  public long getPriviledgeFreeFreight() {
    return priviledgeFreeFreight;
  }

  public void setPriviledgeFreeFreight(long priviledgeFreeFreight) {
    this.priviledgeFreeFreight = priviledgeFreeFreight;
  }


  public long getPriviledgeSignIn() {
    return priviledgeSignIn;
  }

  public void setPriviledgeSignIn(long priviledgeSignIn) {
    this.priviledgeSignIn = priviledgeSignIn;
  }


  public long getPriviledgeComment() {
    return priviledgeComment;
  }

  public void setPriviledgeComment(long priviledgeComment) {
    this.priviledgeComment = priviledgeComment;
  }


  public long getPriviledgePromotion() {
    return priviledgePromotion;
  }

  public void setPriviledgePromotion(long priviledgePromotion) {
    this.priviledgePromotion = priviledgePromotion;
  }


  public long getPriviledgeMemberPrice() {
    return priviledgeMemberPrice;
  }

  public void setPriviledgeMemberPrice(long priviledgeMemberPrice) {
    this.priviledgeMemberPrice = priviledgeMemberPrice;
  }


  public long getPriviledgeBirthday() {
    return priviledgeBirthday;
  }

  public void setPriviledgeBirthday(long priviledgeBirthday) {
    this.priviledgeBirthday = priviledgeBirthday;
  }


  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

}
