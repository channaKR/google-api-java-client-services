/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.dlp.v2.model;

/**
 * Create a de-identified copy of the requested table or files. A TransformationDetail will be
 * created for each transformation. If any rows in BigQuery are skipped during de-identification
 * (transformation errors or row size exceeds BigQuery insert API limits) they are placed in the
 * failure output table. If the original row exceeds the BigQuery insert API limit it will be
 * truncated when written to the failure output table. The failure output table can be set in the
 * action.deidentify.output.big_query_output.deidentified_failure_output_table field, if no table is
 * set, a table will be automatically created in the same project and dataset as the original table.
 * Compatible with: Inspect
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Data Loss Prevention (DLP) API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class GooglePrivacyDlpV2Deidentify extends com.google.api.client.json.GenericJson {

  /**
   * Required. User settable Cloud Storage bucket and folders to store de-identified files. This
   * field must be set for cloud storage deidentification. The output Cloud Storage bucket must be
   * different from the input bucket. De-identified files will overwrite files in the output path.
   * Form of: gs://bucket/folder/ or gs://bucket
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String cloudStorageOutput;

  /**
   * List of user-specified file type groups to transform. If specified, only the files with these
   * filetypes will be transformed. If empty, all supported files will be transformed. Supported
   * types may be automatically added over time. If a file type is set in this field that isn't
   * supported by the Deidentify action then the job will fail and will not be successfully
   * created/started. Currently the only filetypes supported are: IMAGES, TEXT_FILES, CSV, TSV.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> fileTypesToTransform;

  /**
   * User specified deidentify templates and configs for structured, unstructured, and image files.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2TransformationConfig transformationConfig;

  /**
   * Config for storing transformation details. This is separate from the de-identified content, and
   * contains metadata about the successful transformations and/or failures that occurred while de-
   * identifying. This needs to be set in order for users to access information about the status of
   * each transformation (see TransformationDetails message for more information about what is
   * noted).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private GooglePrivacyDlpV2TransformationDetailsStorageConfig transformationDetailsStorageConfig;

  /**
   * Required. User settable Cloud Storage bucket and folders to store de-identified files. This
   * field must be set for cloud storage deidentification. The output Cloud Storage bucket must be
   * different from the input bucket. De-identified files will overwrite files in the output path.
   * Form of: gs://bucket/folder/ or gs://bucket
   * @return value or {@code null} for none
   */
  public java.lang.String getCloudStorageOutput() {
    return cloudStorageOutput;
  }

  /**
   * Required. User settable Cloud Storage bucket and folders to store de-identified files. This
   * field must be set for cloud storage deidentification. The output Cloud Storage bucket must be
   * different from the input bucket. De-identified files will overwrite files in the output path.
   * Form of: gs://bucket/folder/ or gs://bucket
   * @param cloudStorageOutput cloudStorageOutput or {@code null} for none
   */
  public GooglePrivacyDlpV2Deidentify setCloudStorageOutput(java.lang.String cloudStorageOutput) {
    this.cloudStorageOutput = cloudStorageOutput;
    return this;
  }

  /**
   * List of user-specified file type groups to transform. If specified, only the files with these
   * filetypes will be transformed. If empty, all supported files will be transformed. Supported
   * types may be automatically added over time. If a file type is set in this field that isn't
   * supported by the Deidentify action then the job will fail and will not be successfully
   * created/started. Currently the only filetypes supported are: IMAGES, TEXT_FILES, CSV, TSV.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getFileTypesToTransform() {
    return fileTypesToTransform;
  }

  /**
   * List of user-specified file type groups to transform. If specified, only the files with these
   * filetypes will be transformed. If empty, all supported files will be transformed. Supported
   * types may be automatically added over time. If a file type is set in this field that isn't
   * supported by the Deidentify action then the job will fail and will not be successfully
   * created/started. Currently the only filetypes supported are: IMAGES, TEXT_FILES, CSV, TSV.
   * @param fileTypesToTransform fileTypesToTransform or {@code null} for none
   */
  public GooglePrivacyDlpV2Deidentify setFileTypesToTransform(java.util.List<java.lang.String> fileTypesToTransform) {
    this.fileTypesToTransform = fileTypesToTransform;
    return this;
  }

  /**
   * User specified deidentify templates and configs for structured, unstructured, and image files.
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationConfig getTransformationConfig() {
    return transformationConfig;
  }

  /**
   * User specified deidentify templates and configs for structured, unstructured, and image files.
   * @param transformationConfig transformationConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2Deidentify setTransformationConfig(GooglePrivacyDlpV2TransformationConfig transformationConfig) {
    this.transformationConfig = transformationConfig;
    return this;
  }

  /**
   * Config for storing transformation details. This is separate from the de-identified content, and
   * contains metadata about the successful transformations and/or failures that occurred while de-
   * identifying. This needs to be set in order for users to access information about the status of
   * each transformation (see TransformationDetails message for more information about what is
   * noted).
   * @return value or {@code null} for none
   */
  public GooglePrivacyDlpV2TransformationDetailsStorageConfig getTransformationDetailsStorageConfig() {
    return transformationDetailsStorageConfig;
  }

  /**
   * Config for storing transformation details. This is separate from the de-identified content, and
   * contains metadata about the successful transformations and/or failures that occurred while de-
   * identifying. This needs to be set in order for users to access information about the status of
   * each transformation (see TransformationDetails message for more information about what is
   * noted).
   * @param transformationDetailsStorageConfig transformationDetailsStorageConfig or {@code null} for none
   */
  public GooglePrivacyDlpV2Deidentify setTransformationDetailsStorageConfig(GooglePrivacyDlpV2TransformationDetailsStorageConfig transformationDetailsStorageConfig) {
    this.transformationDetailsStorageConfig = transformationDetailsStorageConfig;
    return this;
  }

  @Override
  public GooglePrivacyDlpV2Deidentify set(String fieldName, Object value) {
    return (GooglePrivacyDlpV2Deidentify) super.set(fieldName, value);
  }

  @Override
  public GooglePrivacyDlpV2Deidentify clone() {
    return (GooglePrivacyDlpV2Deidentify) super.clone();
  }

}
