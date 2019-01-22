package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardTerminalAdministrationInventoryResponse
 */
public class CardTerminalAdministrationInventoryResponse   {
  private String cardPOSRegistryOperatingSessionReference = null;

  private String cardPOSInventoryHandlingTaskReference = null;

  private String cardPOSDeviceReference = null;

  private String cardPOSDeviceIdentifier = null;

  private String cardPOSDeviceType = null;

  private String cardPOSDeviceSoftwareType = null;

  private String cardPOSDeviceSoftwareVersion = null;

  private String cardPOSDeviceAcquiredDate = null;

  private String cardPOSDeviceStatus = null;

  private Object cardPOSInventoryHandlingTaskRecord = null;


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to active service session\" 
   * @return cardPOSRegistryOperatingSessionReference
  **/

  public String getCardPOSRegistryOperatingSessionReference() {
    return cardPOSRegistryOperatingSessionReference;
  }

  public void setCardPOSRegistryOperatingSessionReference(String cardPOSRegistryOperatingSessionReference) {
    this.cardPOSRegistryOperatingSessionReference = cardPOSRegistryOperatingSessionReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"refers to the POS inventory activity/task\" 
   * @return cardPOSInventoryHandlingTaskReference
  **/

  public String getCardPOSInventoryHandlingTaskReference() {
    return cardPOSInventoryHandlingTaskReference;
  }

  public void setCardPOSInventoryHandlingTaskReference(String cardPOSInventoryHandlingTaskReference) {
    this.cardPOSInventoryHandlingTaskReference = cardPOSInventoryHandlingTaskReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference identification of the device\" 
   * @return cardPOSDeviceReference
  **/

  public String getCardPOSDeviceReference() {
    return cardPOSDeviceReference;
  }

  public void setCardPOSDeviceReference(String cardPOSDeviceReference) {
    this.cardPOSDeviceReference = cardPOSDeviceReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"serial number or other unique physical identifier\" 
   * @return cardPOSDeviceIdentifier
  **/

  public String getCardPOSDeviceIdentifier() {
    return cardPOSDeviceIdentifier;
  }

  public void setCardPOSDeviceIdentifier(String cardPOSDeviceIdentifier) {
    this.cardPOSDeviceIdentifier = cardPOSDeviceIdentifier;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardPOSDeviceType
  **/

  public String getCardPOSDeviceType() {
    return cardPOSDeviceType;
  }

  public void setCardPOSDeviceType(String cardPOSDeviceType) {
    this.cardPOSDeviceType = cardPOSDeviceType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardPOSDeviceSoftwareType
  **/

  public String getCardPOSDeviceSoftwareType() {
    return cardPOSDeviceSoftwareType;
  }

  public void setCardPOSDeviceSoftwareType(String cardPOSDeviceSoftwareType) {
    this.cardPOSDeviceSoftwareType = cardPOSDeviceSoftwareType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardPOSDeviceSoftwareVersion
  **/

  public String getCardPOSDeviceSoftwareVersion() {
    return cardPOSDeviceSoftwareVersion;
  }

  public void setCardPOSDeviceSoftwareVersion(String cardPOSDeviceSoftwareVersion) {
    this.cardPOSDeviceSoftwareVersion = cardPOSDeviceSoftwareVersion;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::DateTime general-info: \"date device first obtained\" 
   * @return cardPOSDeviceAcquiredDate
  **/

  public String getCardPOSDeviceAcquiredDate() {
    return cardPOSDeviceAcquiredDate;
  }

  public void setCardPOSDeviceAcquiredDate(String cardPOSDeviceAcquiredDate) {
    this.cardPOSDeviceAcquiredDate = cardPOSDeviceAcquiredDate;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardPOSDeviceStatus
  **/

  public String getCardPOSDeviceStatus() {
    return cardPOSDeviceStatus;
  }

  public void setCardPOSDeviceStatus(String cardPOSDeviceStatus) {
    this.cardPOSDeviceStatus = cardPOSDeviceStatus;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Binary general-info: \"processing record for the task\" 
   * @return cardPOSInventoryHandlingTaskRecord
  **/

  public Object getCardPOSInventoryHandlingTaskRecord() {
    return cardPOSInventoryHandlingTaskRecord;
  }

  public void setCardPOSInventoryHandlingTaskRecord(Object cardPOSInventoryHandlingTaskRecord) {
    this.cardPOSInventoryHandlingTaskRecord = cardPOSInventoryHandlingTaskRecord;
  }


}

