/*
 * KubeDB
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: v0
 * Contact: hello@appscode.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.kubedb.client.models;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;
import org.joda.time.DateTime;

/**
 * V1alpha1DormantDatabaseStatus
 */

public class V1alpha1DormantDatabaseStatus {
  @SerializedName("creationTime")
  private DateTime creationTime = null;

  @SerializedName("pausingTime")
  private DateTime pausingTime = null;

  @SerializedName("phase")
  private String phase = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("wipeOutTime")
  private DateTime wipeOutTime = null;

  public V1alpha1DormantDatabaseStatus creationTime(DateTime creationTime) {
    this.creationTime = creationTime;
    return this;
  }

   /**
   * Get creationTime
   * @return creationTime
  **/
  @ApiModelProperty()
  public DateTime getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(DateTime creationTime) {
    this.creationTime = creationTime;
  }

  public V1alpha1DormantDatabaseStatus pausingTime(DateTime pausingTime) {
    this.pausingTime = pausingTime;
    return this;
  }

   /**
   * Get pausingTime
   * @return pausingTime
  **/
  @ApiModelProperty()
  public DateTime getPausingTime() {
    return pausingTime;
  }

  public void setPausingTime(DateTime pausingTime) {
    this.pausingTime = pausingTime;
  }

  public V1alpha1DormantDatabaseStatus phase(String phase) {
    this.phase = phase;
    return this;
  }

   /**
   * Get phase
   * @return phase
  **/
  @ApiModelProperty()
  public String getPhase() {
    return phase;
  }

  public void setPhase(String phase) {
    this.phase = phase;
  }

  public V1alpha1DormantDatabaseStatus reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty()
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public V1alpha1DormantDatabaseStatus wipeOutTime(DateTime wipeOutTime) {
    this.wipeOutTime = wipeOutTime;
    return this;
  }

   /**
   * Get wipeOutTime
   * @return wipeOutTime
  **/
  @ApiModelProperty()
  public DateTime getWipeOutTime() {
    return wipeOutTime;
  }

  public void setWipeOutTime(DateTime wipeOutTime) {
    this.wipeOutTime = wipeOutTime;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1DormantDatabaseStatus v1alpha1DormantDatabaseStatus = (V1alpha1DormantDatabaseStatus) o;
    return Objects.equals(this.creationTime, v1alpha1DormantDatabaseStatus.creationTime) &&
        Objects.equals(this.pausingTime, v1alpha1DormantDatabaseStatus.pausingTime) &&
        Objects.equals(this.phase, v1alpha1DormantDatabaseStatus.phase) &&
        Objects.equals(this.reason, v1alpha1DormantDatabaseStatus.reason) &&
        Objects.equals(this.wipeOutTime, v1alpha1DormantDatabaseStatus.wipeOutTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(creationTime, pausingTime, phase, reason, wipeOutTime);
  }


  @Override
  public String toString() {

    String sb = "class V1alpha1DormantDatabaseStatus {\n"
        + "    creationTime: " + toIndentedString(creationTime) + "\n"
        + "    pausingTime: " + toIndentedString(pausingTime) + "\n"
        + "    phase: " + toIndentedString(phase) + "\n"
        + "    reason: " + toIndentedString(reason) + "\n"
        + "    wipeOutTime: " + toIndentedString(wipeOutTime) + "\n"
        + "}";
    return sb;
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

