/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.bian.dto.*;
import org.bian.util.JsonReader;
import com.fasterxml.jackson.core.type.TypeReference;

@Service
public class CardTerminalAdministrationApiServiceImpl implements CardTerminalAdministrationApiService {

	public CardTerminalAdministrationRecordResponse record(String crReferenceId, CardTerminalAdministrationRecordRequest request){
		return JsonReader.read("record-CardTerminalAdministrationRecordResponse.json",new TypeReference<CardTerminalAdministrationRecordResponse>(){});
	}
	
	public CardTerminalAdministrationRegistrationResponse requestPostRegistrations(String crReferenceId, CardTerminalAdministrationRegistrationRequest request){
		return JsonReader.read("requestPost-CardTerminalAdministrationRegistrationResponse.json",new TypeReference<CardTerminalAdministrationRegistrationResponse>(){});
	}
	
	public CardTerminalAdministrationRegistrationResponse requestPutRegistrations(String crReferenceId, String bqReferenceId, CardTerminalAdministrationRegistrationRequest request){
		return JsonReader.read("requestPut-CardTerminalAdministrationRegistrationResponse.json",new TypeReference<CardTerminalAdministrationRegistrationResponse>(){});
	}
	
	public CardTerminalAdministrationRepairResponse requestPostRepairs(String crReferenceId, CardTerminalAdministrationRepairRequest request){
		return JsonReader.read("requestPost-CardTerminalAdministrationRepairResponse.json",new TypeReference<CardTerminalAdministrationRepairResponse>(){});
	}
	
	public CardTerminalAdministrationRepairResponse requestPutRepairs(String crReferenceId, String bqReferenceId, CardTerminalAdministrationRepairRequest request){
		return JsonReader.read("requestPut-CardTerminalAdministrationRepairResponse.json",new TypeReference<CardTerminalAdministrationRepairResponse>(){});
	}
	
	public CardTerminalAdministrationResponse retrieve(String crReferenceId){
		return JsonReader.read("retrieve-CardTerminalAdministrationResponse.json",new TypeReference<CardTerminalAdministrationResponse>(){});
	}
	
	public List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier){
		return JsonReader.read("retrieveBQIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveBQs(){
		return JsonReader.read("retrieveBQs-String.json",new TypeReference<List<String>>(){});
	}
	
	public List<String> retrieveRefIds(){
		return JsonReader.read("retrieveRefIds-String.json",new TypeReference<List<String>>(){});
	}
	
	public CardTerminalAdministrationInventoryResponse retrieveInventories(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTerminalAdministrationInventoryResponse.json",new TypeReference<CardTerminalAdministrationInventoryResponse>(){});
	}
	
	public CardTerminalAdministrationRegistrationResponse retrieveRegistrations(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTerminalAdministrationRegistrationResponse.json",new TypeReference<CardTerminalAdministrationRegistrationResponse>(){});
	}
	
	public CardTerminalAdministrationRepairResponse retrieveRepairs(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTerminalAdministrationRepairResponse.json",new TypeReference<CardTerminalAdministrationRepairResponse>(){});
	}
	
	public CardTerminalAdministrationUpdatesResponse retrieveUpdates(String crReferenceId, String bqReferenceId){
		return JsonReader.read("retrieve-CardTerminalAdministrationUpdatesResponse.json",new TypeReference<CardTerminalAdministrationUpdatesResponse>(){});
	}
	
	public CardTerminalAdministrationRegistrationResponse updateRegistrations(String crReferenceId, String bqReferenceId, CardTerminalAdministrationRegistrationRequest request){
		return JsonReader.read("update-CardTerminalAdministrationRegistrationResponse.json",new TypeReference<CardTerminalAdministrationRegistrationResponse>(){});
	}
	
}
