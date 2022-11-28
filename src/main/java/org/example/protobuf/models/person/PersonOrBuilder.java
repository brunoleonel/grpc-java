// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: person.proto

package org.example.protobuf.models.person;

public interface PersonOrBuilder extends
    // @@protoc_insertion_point(interface_extends:Person)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>int64 id = 1;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>string name = 2;</code>
   * @return The name.
   */
  java.lang.String getName();
  /**
   * <code>string name = 2;</code>
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString
      getNameBytes();

  /**
   * <code>.common.Address address = 3;</code>
   * @return Whether the address field is set.
   */
  boolean hasAddress();
  /**
   * <code>.common.Address address = 3;</code>
   * @return The address.
   */
  org.example.protobuf.models.common.Address getAddress();
  /**
   * <code>.common.Address address = 3;</code>
   */
  org.example.protobuf.models.common.AddressOrBuilder getAddressOrBuilder();

  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<org.example.protobuf.models.common.Car> 
      getCarList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  org.example.protobuf.models.common.Car getCar(int index);
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  int getCarCount();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  java.util.List<? extends org.example.protobuf.models.common.CarOrBuilder> 
      getCarOrBuilderList();
  /**
   * <code>repeated .common.Car car = 4;</code>
   */
  org.example.protobuf.models.common.CarOrBuilder getCarOrBuilder(
      int index);
}
