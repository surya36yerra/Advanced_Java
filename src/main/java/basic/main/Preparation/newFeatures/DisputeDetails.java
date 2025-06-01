package newFeatures;

/**
 * Response for dispute details
 */
public class DisputeDetails {
  private String status;
  private String resolvedDate;
  private String disputeID;
  private String accountNumber;
  private String comment;
  private String amount;
  private String simplefiedStatus;
  private String reason;

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getResolvedDate() {
    return resolvedDate;
  }

  public void setResolvedDate(String resolvedDate) {
    this.resolvedDate = resolvedDate;
  }

  public String getDisputeID() {
    return disputeID;
  }

  public void setDisputeID(String disputeID) {
    this.disputeID = disputeID;
  }

  public String getAccountNumber() {
    return accountNumber;
  }

  public void setAccountNumber(String accountNumber) {
    this.accountNumber = accountNumber;
  }

  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public String getSimplefiedStatus() {
    return simplefiedStatus;
  }

  public void setSimplefiedStatus(String simplefiedStatus) {
    this.simplefiedStatus = simplefiedStatus;
  }

  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }
  
}
