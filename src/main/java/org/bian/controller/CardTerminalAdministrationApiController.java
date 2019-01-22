/**
 * @author Virtusa
 */
package org.bian.controller;

import java.util.List;
import org.bian.annotation.BianRestController;
import org.bian.annotation.BQ;
import org.bian.dto.BianRequest;
import org.bian.dto.BianResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PathVariable;
import org.bian.dto.*;
import org.bian.service.*;
import org.bian.annotation.functionalpattern.Administer;

@BianRestController
public class CardTerminalAdministrationApiController {

	@Autowired
	CardTerminalAdministrationApiService service;
	
	@Administer.Record
	public BianResponse<CardTerminalAdministrationRecordResponse> record(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTerminalAdministrationRecordRequest> bianRequest) {
		return BianResponse.forSuccess(service.record(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("registrations")
	@Administer.RequestPost
	public BianResponse<CardTerminalAdministrationRegistrationResponse> requestPostRegistrations(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTerminalAdministrationRegistrationRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPostRegistrations(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("registrations")
	@Administer.RequestPut
	public BianResponse<CardTerminalAdministrationRegistrationResponse> requestPutRegistrations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardTerminalAdministrationRegistrationRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPutRegistrations(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@BQ("repairs")
	@Administer.RequestPost
	public BianResponse<CardTerminalAdministrationRepairResponse> requestPostRepairs(@PathVariable("cr-reference-id") String crReferenceId, @RequestBody BianRequest<CardTerminalAdministrationRepairRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPostRepairs(crReferenceId, bianRequest.getData()));
	}
	
	@BQ("repairs")
	@Administer.RequestPut
	public BianResponse<CardTerminalAdministrationRepairResponse> requestPutRepairs(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardTerminalAdministrationRepairRequest> bianRequest) {
		return BianResponse.forSuccess(service.requestPutRepairs(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
	@Administer.Retrieve
	public BianResponse<CardTerminalAdministrationResponse> retrieve(@PathVariable("cr-reference-id") String crReferenceId) {
		return BianResponse.forSuccess(service.retrieve(crReferenceId));
	}
	
	@Administer.RetrieveBQIds
	public BianResponse<List<String>> retrieveBQIds(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("behavior-qualifier") String behaviorQualifier) {
		return BianResponse.forSuccess(service.retrieveBQIds(crReferenceId, behaviorQualifier));
	}
	
	@Administer.RetrieveBQs
	public BianResponse<List<String>> retrieveBQs() {
		return BianResponse.forSuccess(service.retrieveBQs());
	}
	
	@Administer.RetrieveRefIds
	public BianResponse<List<String>> retrieveRefIds() {
		return BianResponse.forSuccess(service.retrieveRefIds());
	}
	
	@BQ("inventories")
	@Administer.Retrieve
	public BianResponse<CardTerminalAdministrationInventoryResponse> retrieveInventories(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveInventories(crReferenceId, bqReferenceId));
	}
	
	@BQ("registrations")
	@Administer.Retrieve
	public BianResponse<CardTerminalAdministrationRegistrationResponse> retrieveRegistrations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRegistrations(crReferenceId, bqReferenceId));
	}
	
	@BQ("repairs")
	@Administer.Retrieve
	public BianResponse<CardTerminalAdministrationRepairResponse> retrieveRepairs(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveRepairs(crReferenceId, bqReferenceId));
	}
	
	@BQ("updates")
	@Administer.Retrieve
	public BianResponse<CardTerminalAdministrationUpdatesResponse> retrieveUpdates(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId) {
		return BianResponse.forSuccess(service.retrieveUpdates(crReferenceId, bqReferenceId));
	}
	
	@BQ("registrations")
	@Administer.Update
	public BianResponse<CardTerminalAdministrationRegistrationResponse> updateRegistrations(@PathVariable("cr-reference-id") String crReferenceId, @PathVariable("bq-reference-id") String bqReferenceId, @RequestBody BianRequest<CardTerminalAdministrationRegistrationRequest> bianRequest) {
		return BianResponse.forSuccess(service.updateRegistrations(crReferenceId, bqReferenceId, bianRequest.getData()));
	}
	
}
