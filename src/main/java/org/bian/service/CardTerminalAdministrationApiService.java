/**
 * @author Virtusa
 */
package org.bian.service;

import java.util.List;

import org.bian.dto.*;

public interface CardTerminalAdministrationApiService {

	CardTerminalAdministrationRecordResponse record(String crReferenceId, CardTerminalAdministrationRecordRequest request);
	
	CardTerminalAdministrationRegistrationResponse requestPostRegistrations(String crReferenceId, CardTerminalAdministrationRegistrationRequest request);
	
	CardTerminalAdministrationRegistrationResponse requestPutRegistrations(String crReferenceId, String bqReferenceId, CardTerminalAdministrationRegistrationRequest request);
	
	CardTerminalAdministrationRepairResponse requestPostRepairs(String crReferenceId, CardTerminalAdministrationRepairRequest request);
	
	CardTerminalAdministrationRepairResponse requestPutRepairs(String crReferenceId, String bqReferenceId, CardTerminalAdministrationRepairRequest request);
	
	CardTerminalAdministrationResponse retrieve(String crReferenceId);
	
	List<String> retrieveBQIds(String crReferenceId, String behaviorQualifier);
	
	List<String> retrieveBQs();
	
	List<String> retrieveRefIds();
	
	CardTerminalAdministrationInventoryResponse retrieveInventories(String crReferenceId, String bqReferenceId);
	
	CardTerminalAdministrationRegistrationResponse retrieveRegistrations(String crReferenceId, String bqReferenceId);
	
	CardTerminalAdministrationRepairResponse retrieveRepairs(String crReferenceId, String bqReferenceId);
	
	CardTerminalAdministrationUpdatesResponse retrieveUpdates(String crReferenceId, String bqReferenceId);
	
	CardTerminalAdministrationRegistrationResponse updateRegistrations(String crReferenceId, String bqReferenceId, CardTerminalAdministrationRegistrationRequest request);
	
}
