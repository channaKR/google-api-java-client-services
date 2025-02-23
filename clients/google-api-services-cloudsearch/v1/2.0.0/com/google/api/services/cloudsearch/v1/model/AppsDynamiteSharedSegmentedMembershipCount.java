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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Contains info on membership count for member types: HUMAN_USER, BOT_USER & ROSTER_MEMBER
 * different states: INVITED, JOINED
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class AppsDynamiteSharedSegmentedMembershipCount extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String memberType;

  /**
   * count of members with given type and state
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer membershipCount;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String membershipState;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMemberType() {
    return memberType;
  }

  /**
   * @param memberType memberType or {@code null} for none
   */
  public AppsDynamiteSharedSegmentedMembershipCount setMemberType(java.lang.String memberType) {
    this.memberType = memberType;
    return this;
  }

  /**
   * count of members with given type and state
   * @return value or {@code null} for none
   */
  public java.lang.Integer getMembershipCount() {
    return membershipCount;
  }

  /**
   * count of members with given type and state
   * @param membershipCount membershipCount or {@code null} for none
   */
  public AppsDynamiteSharedSegmentedMembershipCount setMembershipCount(java.lang.Integer membershipCount) {
    this.membershipCount = membershipCount;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getMembershipState() {
    return membershipState;
  }

  /**
   * @param membershipState membershipState or {@code null} for none
   */
  public AppsDynamiteSharedSegmentedMembershipCount setMembershipState(java.lang.String membershipState) {
    this.membershipState = membershipState;
    return this;
  }

  @Override
  public AppsDynamiteSharedSegmentedMembershipCount set(String fieldName, Object value) {
    return (AppsDynamiteSharedSegmentedMembershipCount) super.set(fieldName, value);
  }

  @Override
  public AppsDynamiteSharedSegmentedMembershipCount clone() {
    return (AppsDynamiteSharedSegmentedMembershipCount) super.clone();
  }

}
