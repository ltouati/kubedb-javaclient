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
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * ComGithubAppscodeKubeMonApiPrometheusSpec
 */

public class ComGithubAppscodeKubeMonApiPrometheusSpec {
  @SerializedName("interval")
  private String interval = null;

  @SerializedName("labels")
  private Map<String, String> labels = null;

  @SerializedName("namespace")
  private String namespace = null;

  @SerializedName("port")
  private Integer port = null;

  public ComGithubAppscodeKubeMonApiPrometheusSpec interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Interval at which metrics should be scraped
   * @return interval
  **/
  @ApiModelProperty(value = "Interval at which metrics should be scraped")
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public ComGithubAppscodeKubeMonApiPrometheusSpec labels(Map<String, String> labels) {
    this.labels = labels;
    return this;
  }

  public ComGithubAppscodeKubeMonApiPrometheusSpec putLabelsItem(String key, String labelsItem) {
    if (this.labels == null) {
      this.labels = new HashMap<>();
    }
    this.labels.put(key, labelsItem);
    return this;
  }

   /**
   * Labels are key value pairs that is used to select Prometheus instance via ServiceMonitor labels.
   * @return labels
  **/
  @ApiModelProperty(value = "Labels are key value pairs that is used to select Prometheus instance via ServiceMonitor labels.")
  public Map<String, String> getLabels() {
    return labels;
  }

  public void setLabels(Map<String, String> labels) {
    this.labels = labels;
  }

  public ComGithubAppscodeKubeMonApiPrometheusSpec namespace(String namespace) {
    this.namespace = namespace;
    return this;
  }

   /**
   * Namespace of Prometheus. Service monitors will be created in this namespace.
   * @return namespace
  **/
  @ApiModelProperty(value = "Namespace of Prometheus. Service monitors will be created in this namespace.")
  public String getNamespace() {
    return namespace;
  }

  public void setNamespace(String namespace) {
    this.namespace = namespace;
  }

  public ComGithubAppscodeKubeMonApiPrometheusSpec port(Integer port) {
    this.port = port;
    return this;
  }

   /**
   * Port number for the exporter side car.
   * @return port
  **/
  @ApiModelProperty(value = "Port number for the exporter side car.")
  public Integer getPort() {
    return port;
  }

  public void setPort(Integer port) {
    this.port = port;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ComGithubAppscodeKubeMonApiPrometheusSpec comGithubAppscodeKubeMonApiPrometheusSpec = (ComGithubAppscodeKubeMonApiPrometheusSpec) o;
    return Objects.equals(this.interval, comGithubAppscodeKubeMonApiPrometheusSpec.interval) &&
        Objects.equals(this.labels, comGithubAppscodeKubeMonApiPrometheusSpec.labels) &&
        Objects.equals(this.namespace, comGithubAppscodeKubeMonApiPrometheusSpec.namespace) &&
        Objects.equals(this.port, comGithubAppscodeKubeMonApiPrometheusSpec.port);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interval, labels, namespace, port);
  }


  @Override
  public String toString() {

    String sb = "class ComGithubAppscodeKubeMonApiPrometheusSpec {\n"
        + "    interval: " + toIndentedString(interval) + "\n"
        + "    labels: " + toIndentedString(labels) + "\n"
        + "    namespace: " + toIndentedString(namespace) + "\n"
        + "    port: " + toIndentedString(port) + "\n"
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

