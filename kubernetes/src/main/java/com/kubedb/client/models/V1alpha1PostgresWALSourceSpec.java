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

/**
 * V1alpha1PostgresWALSourceSpec
 */

public class V1alpha1PostgresWALSourceSpec {
  @SerializedName("azure")
  private V1alpha1AzureSpec azure = null;

  @SerializedName("backupName")
  private String backupName = null;

  @SerializedName("gcs")
  private V1alpha1GCSSpec gcs = null;

  @SerializedName("local")
  private V1alpha1LocalSpec local = null;

  @SerializedName("pitr")
  private String pitr = null;

  @SerializedName("s3")
  private V1alpha1S3Spec s3 = null;

  @SerializedName("storageSecretName")
  private String storageSecretName = null;

  @SerializedName("swift")
  private V1alpha1SwiftSpec swift = null;

  public V1alpha1PostgresWALSourceSpec azure(V1alpha1AzureSpec azure) {
    this.azure = azure;
    return this;
  }

   /**
   * Get azure
   * @return azure
  **/
  @ApiModelProperty()
  public V1alpha1AzureSpec getAzure() {
    return azure;
  }

  public void setAzure(V1alpha1AzureSpec azure) {
    this.azure = azure;
  }

  public V1alpha1PostgresWALSourceSpec backupName(String backupName) {
    this.backupName = backupName;
    return this;
  }

   /**
   * Get backupName
   * @return backupName
  **/
  @ApiModelProperty()
  public String getBackupName() {
    return backupName;
  }

  public void setBackupName(String backupName) {
    this.backupName = backupName;
  }

  public V1alpha1PostgresWALSourceSpec gcs(V1alpha1GCSSpec gcs) {
    this.gcs = gcs;
    return this;
  }

   /**
   * Get gcs
   * @return gcs
  **/
  @ApiModelProperty()
  public V1alpha1GCSSpec getGcs() {
    return gcs;
  }

  public void setGcs(V1alpha1GCSSpec gcs) {
    this.gcs = gcs;
  }

  public V1alpha1PostgresWALSourceSpec local(V1alpha1LocalSpec local) {
    this.local = local;
    return this;
  }

   /**
   * Get local
   * @return local
  **/
  @ApiModelProperty()
  public V1alpha1LocalSpec getLocal() {
    return local;
  }

  public void setLocal(V1alpha1LocalSpec local) {
    this.local = local;
  }

  public V1alpha1PostgresWALSourceSpec pitr(String pitr) {
    this.pitr = pitr;
    return this;
  }

   /**
   * Get pitr
   * @return pitr
  **/
  @ApiModelProperty()
  public String getPitr() {
    return pitr;
  }

  public void setPitr(String pitr) {
    this.pitr = pitr;
  }

  public V1alpha1PostgresWALSourceSpec s3(V1alpha1S3Spec s3) {
    this.s3 = s3;
    return this;
  }

   /**
   * Get s3
   * @return s3
  **/
  @ApiModelProperty()
  public V1alpha1S3Spec getS3() {
    return s3;
  }

  public void setS3(V1alpha1S3Spec s3) {
    this.s3 = s3;
  }

  public V1alpha1PostgresWALSourceSpec storageSecretName(String storageSecretName) {
    this.storageSecretName = storageSecretName;
    return this;
  }

   /**
   * Get storageSecretName
   * @return storageSecretName
  **/
  @ApiModelProperty()
  public String getStorageSecretName() {
    return storageSecretName;
  }

  public void setStorageSecretName(String storageSecretName) {
    this.storageSecretName = storageSecretName;
  }

  public V1alpha1PostgresWALSourceSpec swift(V1alpha1SwiftSpec swift) {
    this.swift = swift;
    return this;
  }

   /**
   * Get swift
   * @return swift
  **/
  @ApiModelProperty()
  public V1alpha1SwiftSpec getSwift() {
    return swift;
  }

  public void setSwift(V1alpha1SwiftSpec swift) {
    this.swift = swift;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1alpha1PostgresWALSourceSpec v1alpha1PostgresWALSourceSpec = (V1alpha1PostgresWALSourceSpec) o;
    return Objects.equals(this.azure, v1alpha1PostgresWALSourceSpec.azure) &&
        Objects.equals(this.backupName, v1alpha1PostgresWALSourceSpec.backupName) &&
        Objects.equals(this.gcs, v1alpha1PostgresWALSourceSpec.gcs) &&
        Objects.equals(this.local, v1alpha1PostgresWALSourceSpec.local) &&
        Objects.equals(this.pitr, v1alpha1PostgresWALSourceSpec.pitr) &&
        Objects.equals(this.s3, v1alpha1PostgresWALSourceSpec.s3) &&
        Objects.equals(this.storageSecretName, v1alpha1PostgresWALSourceSpec.storageSecretName) &&
        Objects.equals(this.swift, v1alpha1PostgresWALSourceSpec.swift);
  }

  @Override
  public int hashCode() {
    return Objects.hash(azure, backupName, gcs, local, pitr, s3, storageSecretName, swift);
  }


  @Override
  public String toString() {

    String sb = "class V1alpha1PostgresWALSourceSpec {\n"
        + "    azure: " + toIndentedString(azure) + "\n"
        + "    backupName: " + toIndentedString(backupName) + "\n"
        + "    gcs: " + toIndentedString(gcs) + "\n"
        + "    local: " + toIndentedString(local) + "\n"
        + "    pitr: " + toIndentedString(pitr) + "\n"
        + "    s3: " + toIndentedString(s3) + "\n"
        + "    storageSecretName: " + toIndentedString(storageSecretName) + "\n"
        + "    swift: " + toIndentedString(swift) + "\n"
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

