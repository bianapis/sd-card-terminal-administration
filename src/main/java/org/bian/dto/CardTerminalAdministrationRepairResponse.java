package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardTerminalAdministrationRepairResponse
 */
public class CardTerminalAdministrationRepairResponse   {
  private String cardPOSRegistryOperatingSessionReference = null;

  private String cardPOSRepairTaskReference = null;

  private String cardPOSDeviceReference = null;

  private String merchantReference = null;

  private String merchantType = null;

  private String merchantLocation = null;

  private String cardPOSDeviceConfiguration = null;

  private String cardPOSDeviceStatus = null;

  private Object cardPOSRegistrationTaskRecord = null;


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
   * @return cardPOSRepairTaskReference
  **/

  public String getCardPOSRepairTaskReference() {
    return cardPOSRepairTaskReference;
  }

  public void setCardPOSRepairTaskReference(String cardPOSRepairTaskReference) {
    this.cardPOSRepairTaskReference = cardPOSRepairTaskReference;
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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::ISO20022andUNCEFACT::Identifier general-info: \"reference to Card merchant registereedd with the device\" 
   * @return merchantReference
  **/

  public String getMerchantReference() {
    return merchantReference;
  }

  public void setMerchantReference(String merchantReference) {
    this.merchantReference = merchantReference;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return merchantType
  **/

  public String getMerchantType() {
    return merchantType;
  }

  public void setMerchantType(String merchantType) {
    this.merchantType = merchantType;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return merchantLocation
  **/

  public String getMerchantLocation() {
    return merchantLocation;
  }

  public void setMerchantLocation(String merchantLocation) {
    this.merchantLocation = merchantLocation;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text 
   * @return cardPOSDeviceConfiguration
  **/

  public String getCardPOSDeviceConfiguration() {
    return cardPOSDeviceConfiguration;
  }

  public void setCardPOSDeviceConfiguration(String cardPOSDeviceConfiguration) {
    this.cardPOSDeviceConfiguration = cardPOSDeviceConfiguration;
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
   * @return cardPOSRegistrationTaskRecord
  **/

  public Object getCardPOSRegistrationTaskRecord() {
    return cardPOSRegistrationTaskRecord;
  }

  public void setCardPOSRegistrationTaskRecord(Object cardPOSRegistrationTaskRecord) {
    this.cardPOSRegistrationTaskRecord = cardPOSRegistrationTaskRecord;
  }


}

