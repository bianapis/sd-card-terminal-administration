package org.bian.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.validation.Valid;
  
/**
 * CardTerminalAdministrationResponse
 */
public class CardTerminalAdministrationResponse   {
  private String cardPOSRegistryOperatingSessionReference = null;

  private String cardPOSRegistrySchedule = null;

  private String cardPOSTermainalRegistryConfiguration = null;


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
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"describes service availability\" 
   * @return cardPOSRegistrySchedule
  **/

  public String getCardPOSRegistrySchedule() {
    return cardPOSRegistrySchedule;
  }

  public void setCardPOSRegistrySchedule(String cardPOSRegistrySchedule) {
    this.cardPOSRegistrySchedule = cardPOSRegistrySchedule;
  }


  /**
   * `status: Not Mapped` core-data-type-reference: BIAN::DataTypesLibrary::CoreDataTypes::UNCEFACT::Text general-info: \"service configuration setting\" 
   * @return cardPOSTermainalRegistryConfiguration
  **/

  public String getCardPOSTermainalRegistryConfiguration() {
    return cardPOSTermainalRegistryConfiguration;
  }

  public void setCardPOSTermainalRegistryConfiguration(String cardPOSTermainalRegistryConfiguration) {
    this.cardPOSTermainalRegistryConfiguration = cardPOSTermainalRegistryConfiguration;
  }


}

