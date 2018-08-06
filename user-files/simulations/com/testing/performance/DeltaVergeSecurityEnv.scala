package com.testing.performance

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class DeltaVergeSecurityEnv extends Simulation {

	val httpProtocol = http
		.baseURL("https://apig-security.apps.dev.deltaverge.com")
		.inferHtmlResources()
		.proxy(
             Proxy("127.0.0.1", 8888)
            .httpsPort(8888))
		.acceptEncodingHeader("gzip")
		.disableWarmUp

	val headers_0 =Map("Content-Type"->"application/x-www-form-urlencoded",
                      "Content-Length"->"137",
                      "Host"->"apig-security.apps.dev.deltaverge.com",
                      "Connection"->"Keep-Alive",
                      "Accept-Encoding"->"gzip",
                      "User-Agent" -> "okhttp/3.8.1") 

	val headers_1 = Map(
		"Authorization" -> "Bearer ${cor_access_token}",
		"Content-Type" -> "application/json",
		"tenantToken" -> "tenant1",
		"user_details" -> """{"userId":null,"orgLabel":"Escorts Security Corp","email":"apt1@gmail.com","name":"Andhra Agent Profile T1  ","orgId":"5faec5ba-c58f-46c2-a00b-3823718ec60d","accountId":"e7bad411-01d9-43b8-8635-a701fac2aff8","avatarUrl":null,"supervisorId":null,"userTenancyAccessId":"tenant1","userTenancyIdentityId":"06f4eb8e-c190-4986-b1c0-ead679a94852","userDapSet":[{"filterKey":"serviceLine","filterValue":"[\"CAT-2e8a39bb-7a60-4573-bcc8-811e77aa0d7b\"]","filterOperator":"EQUAL"},{"filterKey":"territory","filterValue":"[{\"id\":\"b9177f07-bf63-42f5-9894-cce514259dab\",\"territoryTree\":[{\"nodeId\":\"08c09a80d40256519dbfe4b16caa8e03\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJ97RZr90nODoRK6G-vlm6C2I\",\"selectedNodeLevelType\":\"district\"}]}]","filterOperator":"EQUAL"}]}""")

	val headers_2 = Map(
		"Authorization" -> "Bearer ${cor_access_token}",
		"tenantToken" -> "tenant1",
		"user_details" -> """{"userId":null,"orgLabel":"Escorts Security Corp","email":"apt1@gmail.com","name":"Andhra Agent Profile T1  ","orgId":"5faec5ba-c58f-46c2-a00b-3823718ec60d","accountId":"e7bad411-01d9-43b8-8635-a701fac2aff8","avatarUrl":null,"supervisorId":null,"userTenancyAccessId":"tenant1","userTenancyIdentityId":"06f4eb8e-c190-4986-b1c0-ead679a94852","userDapSet":[{"filterKey":"serviceLine","filterValue":"[\"CAT-2e8a39bb-7a60-4573-bcc8-811e77aa0d7b\"]","filterOperator":"EQUAL"},{"filterKey":"territory","filterValue":"[{\"id\":\"b9177f07-bf63-42f5-9894-cce514259dab\",\"territoryTree\":[{\"nodeId\":\"08c09a80d40256519dbfe4b16caa8e03\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJ97RZr90nODoRK6G-vlm6C2I\",\"selectedNodeLevelType\":\"district\"}]}]","filterOperator":"EQUAL"}]}""")

	val headers_9 = Map(
	  "Authorization" -> "Bearer ${cor_aa_access_token}",
		"Content-Type" -> "application/json",
		"tenantToken" -> "tenant1",
		"user_details" -> """{"userId":null,"orgLabel":"Escorts Security Corp","email":"rahul.vats@wipro.com","name":"Rahul Vats  ","orgId":"c0f192f5-99f4-424f-b980-f0ccb3dd8544","accountId":"e7bad411-01d9-43b8-8635-a701fac2aff8","avatarUrl":null,"supervisorId":null,"userTenancyAccessId":"tenant1","userTenancyIdentityId":"f3166de2-3c28-43a9-9b7e-a45753223daf","userDapSet":[{"filterKey":"serviceLine","filterValue":"[\"CAT-2e8a39bb-7a60-4573-bcc8-811e77aa0d7b\",\"CAT-c868e6a4-9cee-45db-9bed-853aaf3a7dca\"]","filterOperator":"EQUAL"},{"filterKey":"territory","filterValue":"[{\"id\":\"563d6e32-2136-45d4-890e-5d05f99e8885\",\"territoryTree\":[{\"nodeId\":\"08c09a80d40256519dbfe4b16caa8e03\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"dec32fcc8fddc307b6ff964423418e3f\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"42d177807952047ad4571b357425957c\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"f52f48489d4a0b008b632632d6b75c13\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"f75a90613d7f1a801aff545ea5699458\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"29fa8b7078c29863ac931a90922471cc\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"ChIJuxzEjwJXDDkRXDNLvIrRjFc\",\"nodeLevelType\":\"town\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"964807887411789099c2eb2fdb325e74\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"cfcfe20ce4770e03436008d35800180d\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"541d8d4161b9cfd8dc70395932ccea5f\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"ae057a41296c5f6956e3ba3a06eca7e0\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"5edee0b5-0665-43cf-b482-aa37e3f5ba55\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"d86b492c-98cc-47d8-827a-70c2f1a04672\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"}]}]","filterOperator":"EQUAL"}]}""")

	val headers_10 = Map(
	  "Authorization" -> "Bearer ${cor_aa_access_token}",
		"tenantToken" -> "tenant1",
		"user_details" -> """{"userId":null,"orgLabel":"Escorts Security Corp","email":"rahul.vats@wipro.com","name":"Rahul Vats  ","orgId":"c0f192f5-99f4-424f-b980-f0ccb3dd8544","accountId":"e7bad411-01d9-43b8-8635-a701fac2aff8","avatarUrl":null,"supervisorId":null,"userTenancyAccessId":"tenant1","userTenancyIdentityId":"f3166de2-3c28-43a9-9b7e-a45753223daf","userDapSet":[{"filterKey":"serviceLine","filterValue":"[\"CAT-2e8a39bb-7a60-4573-bcc8-811e77aa0d7b\",\"CAT-c868e6a4-9cee-45db-9bed-853aaf3a7dca\"]","filterOperator":"EQUAL"},{"filterKey":"territory","filterValue":"[{\"id\":\"563d6e32-2136-45d4-890e-5d05f99e8885\",\"territoryTree\":[{\"nodeId\":\"08c09a80d40256519dbfe4b16caa8e03\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"dec32fcc8fddc307b6ff964423418e3f\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"42d177807952047ad4571b357425957c\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"f52f48489d4a0b008b632632d6b75c13\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"f75a90613d7f1a801aff545ea5699458\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"29fa8b7078c29863ac931a90922471cc\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"ChIJuxzEjwJXDDkRXDNLvIrRjFc\",\"nodeLevelType\":\"town\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"964807887411789099c2eb2fdb325e74\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"cfcfe20ce4770e03436008d35800180d\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"541d8d4161b9cfd8dc70395932ccea5f\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"ae057a41296c5f6956e3ba3a06eca7e0\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"5edee0b5-0665-43cf-b482-aa37e3f5ba55\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"d86b492c-98cc-47d8-827a-70c2f1a04672\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"}]}]","filterOperator":"EQUAL"}]}""")

	val scn = scenario("DeltaVergeSecurityEnv")
		.exec(http("1_Agent_Login_ISAM")
			.post("/api/v1.0.0/isam/oauth/token")
			.headers(headers_0)
			.formParam("username", "1234567800")
			.formParam("password", "Wipro@123")
			.formParam("grant_type", "password")
			.formParam("scope", "Write")
			.formParam("client_secret", "TrustedClient@2017")
			.formParam("client_id", "Isam_Trusted_Client")
			.basicAuth("Isam_Trusted_Client","TrustedClient@2017")
			.check(regex(""""access_token":"(.+?)"""").saveAs("cor_access_token")))
		.pause(1)
		.exec(http("2_Agent_PANM")
			.post("/api/v1.0.0/panm/protected/panm.fndusr.find/v0.1")
			.headers(headers_1)
			.body(RawFileBody("DeltaVergeSecurityEnv_0001_request.txt")))
		.pause(1)
		.exec(http("3_Get_Wall_Details")
			.get("/api/v1.0.0/wall/card/wfs.user.get.carddecks/v0.1/5faec5ba-c58f-46c2-a00b-3823718ec60d/?offset=0&pageSize=5&rank=true")
			.headers(headers_2))
		.pause(1)
		.exec(http("4_Get_Retrieve_Territories")
			.post("/api/v1.0.0/setup/private/tsm.retrievedata.territories.by.ids.retrieve/v1.0")
			.headers(headers_1)
			.body(RawFileBody("DeltaVergeSecurityEnv_0003_request.txt"))
			.resources(http("5_Find_Service_Line")
			.post("/api/v1.0.0/catalog/private/cms.find.service.lines.by.territoryIds/v0.1/findServicesByTerritoryId")
			.headers(headers_1)
			.body(RawFileBody("DeltaVergeSecurityEnv_0004_request.txt"))))
		.pause(1)
		.exec(http("6_Find_Org")
			.post("/api/v1.0.0/panm/private/panm.fndcnctdorg.find/v0.1")
			.headers(headers_1)
			.body(StringBody("""{"sourceId":"5faec5ba-c58f-46c2-a00b-3823718ec60d"}""")))
		.pause(1)
		.exec(http("7_Contract_Request")
			.post("/api/v1.0.0/orders/ofs.order.create.contract.request/v0.1")
			.headers(headers_1)
			//.body(RawFileBody("DeltaVergeSecurityEnv_0006_request.txt"))
			.body(StringBody("""{"commission":22.0,"startDate":"2018-07-17T00:00:00+05:30","endDate":"2018-07-19T00:00:00+05:30","minimumPerDay":{"unit":"Hour","value":8.0,"quantity":"8 Hour"},"recipient":{"billingAddress":null,"shippingAddress":null,"userId":"5faec5ba-c58f-46c2-a00b-3823718ec60d","userName":"Andhra Agent Profile T1  ","emailId":"apt1@gmail.com","mobileNo":"1234567800","orgId":"5faec5ba-c58f-46c2-a00b-3823718ec60d","orgName":"Escorts Security Corp"},"seller":{"billingAddress":null,"shippingAddress":null,"userId":"c0f192f5-99f4-424f-b980-f0ccb3dd8544","userName":"Escorts Security Corp","emailId":"rahul.vats@wipro.com","mobileNo":"9990998202","orgId":"c0f192f5-99f4-424f-b980-f0ccb3dd8544","orgName":"Escorts Security Corp"},"buyer":{"billingAddress":null,"shippingAddress":null,"userId":"5faec5ba-c58f-46c2-a00b-3823718ec60d","userName":"Andhra Agent Profile T1  ","emailId":"apt1@gmail.com","mobileNo":"1234567800","orgId":"5faec5ba-c58f-46c2-a00b-3823718ec60d","orgName":"Escorts Security Corp"},"requester":{"billingAddress":null,"shippingAddress":null,"userId":"06f4eb8e-c190-4986-b1c0-ead679a94852","userName":"Andhra Agent Profile T1  ","emailId":"apt1@gmail.com","mobileNo":"1234567800","orgId":"5faec5ba-c58f-46c2-a00b-3823718ec60d","orgName":"Escorts Security Corp"},"serviceInfo":[{"category":null,"commission":22.0,"itemId":null,"serviceId":"SER-61f1ff13-f984-432b-99e3-b740debc84e3","serviceName":"Farm Service 1","serviceLine":"Harvesting","serviceLineId":"CAT-2e8a39bb-7a60-4573-bcc8-811e77aa0d7b","price":{"currencyCode":"INR","amount":200.0,"currencySymbol":"₹"},"quantity":{"unit":"Hour","value":1920.0,"quantity":"1920 Hour"}}],"paymentTerm":"ADVANCEPAYMENT","totalPrice":6400.0,"typeValue":null,"territoryInfo":{"territoryId":"08c09a80d40256519dbfe4b16caa8e03","territoryName":"533428","rootTerritoryId":"b9177f07-bf63-42f5-9894-cce514259dab"}}"""))
			.check(regex(""""instrumentId":"(.+?)"""").saveAs("cor_cr_id")))
		.pause(1)
		.exec(http("8_Wall_Refresh")
			.get("/api/v1.0.0/wall/card/wfs.user.get.carddecks/v0.1/5faec5ba-c58f-46c2-a00b-3823718ec60d/?offset=0&pageSize=5&rank=true")
			.headers(headers_2))
		.pause(5)
		.exec(http("1_Account_Admin_Login_ISAM")
			.post("/api/v1.0.0/isam/oauth/token")
			.headers(headers_0)
			.formParam("username", "9990998202")
			.formParam("password", "Wipro@123")
			.formParam("grant_type", "password")
			.formParam("scope", "Write")
			.formParam("client_secret", "TrustedClient@2017")
			.formParam("client_id", "Isam_Trusted_Client")
			.basicAuth("Isam_Trusted_Client","TrustedClient@2017")
			.check(regex(""""access_token":"(.+?)"""").saveAs("cor_aa_access_token")))
		.pause(1)
		.exec(http("2_Account_Admin_PANM")
			.post("/api/v1.0.0/panm/protected/panm.fndusr.find/v0.1")
			.headers(headers_9)
			.body(RawFileBody("DeltaVergeSecurityEnv_0009_request.txt")))
		.pause(1)
		.exec(http("3_Load_AA_Wall")
			.get("/api/v1.0.0/wall/card/wfs.user.get.carddecks/v0.1/c0f192f5-99f4-424f-b980-f0ccb3dd8544/?offset=0&pageSize=5&rank=true")
			.headers(headers_10))
		.pause(3)
		.exec(http("4_View_Random_Card")
			.get("/api/v1.0.0/wall/card/wall.deck.timeline/v0.1/97f5c62d-ab07-4c33-8dd7-9067c8beb0c9/")
			.headers(headers_10))
		.pause(3)
		.exec(http("5_View_CR_order_details")
			.get("/api/v1.0.0/orders/ofs.order.get.contract.request/v0.1/viewCr/${cor_cr_id}")
			.headers(headers_10)
			.check(regex(""""itemId":"(.+?)"""").saveAs("cor_item_id")))
		.pause(1)
		.exec(http("6_Confirm_Contract")
			.post("/api/v1.0.0/orders/ofs.order.create.contract.approvel/v0.1")
			.headers(headers_9)
			.check(regex(""""instrumentId":"(.+?)"""").saveAs("cor_cc_id"))
			.body(StringBody("""{"paymentTerm":"ADVANCEPAYMENT","recipient":null,"seller":{"billingAddress":null,"shippingAddress":null,"userId":"c0f192f5-99f4-424f-b980-f0ccb3dd8544","userName":"Rahul Vats  ","emailId":"rahul.vats@wipro.com","mobileNo":"9990998202","orgId":"c0f192f5-99f4-424f-b980-f0ccb3dd8544","orgName":"Escorts Security Corp"},"buyer":{"billingAddress":null,"shippingAddress":null,"userId":"5faec5ba-c58f-46c2-a00b-3823718ec60d","userName":"Andhra Agent Profile T1  ","emailId":"apt1@gmail.com","mobileNo":"1234567800","orgId":"5faec5ba-c58f-46c2-a00b-3823718ec60d","orgName":"Escorts Security Corp"},"requester":{"billingAddress":null,"shippingAddress":null,"userId":"c0f192f5-99f4-424f-b980-f0ccb3dd8544","userName":"Rahul Vats  ","emailId":"rahul.vats@wipro.com","mobileNo":"9990998202","orgId":"c0f192f5-99f4-424f-b980-f0ccb3dd8544","orgName":"Escorts Security Corp"},"commission":0.0,"totalPrice":6400.0,"serviceInfo":[{"serviceId":"SER-61f1ff13-f984-432b-99e3-b740debc84e3","itemId":"${cor_item_id}","serviceName":"Farm Service 1","price":{"currencyCode":"INR","amount":200.0,"currencySymbol":"₹"},"category":null,"serviceLine":"Harvesting","serviceLineId":"CAT-2e8a39bb-7a60-4573-bcc8-811e77aa0d7b","commission":22.0,"Commission":22.0,"quantity":{"unit":"Hr","value":1920.0},"assignedAssets":[]}],"minimumPerDay":{"unit":"Hour","value":8.0},"startDate":"1531440000000","endDate":"1531612800000","referenceInstId":"${cor_cr_id}","territoryInfo":{"territoryId":"08c09a80d40256519dbfe4b16caa8e03","territoryName":"533428","rootTerritoryId":"b9177f07-bf63-42f5-9894-cce514259dab"}}"""))
			)
		.pause(1)
		.exec(http("7_Assign_Asset")
			.post("/api/v1.0.0/asset/ias.assign.asset/v0.1/")
			.headers(headers_9)
			.body(StringBody("""{"allocationId":null,"startDate":"2018-07-17T05: 30:00.000Z","endDate":"2018-07-19T05: 30:00.000Z","associatedInstrument":"${cor_cc_id}","manager":null,"assignee":null,"allocationStatus":null,"assets":[]}"""))
			)
			//.body(RawFileBody("DeltaVergeSecurityEnv_0015_request.txt"))
			//.check(regex("""associatedInstrument":"(.+?)"""").saveAs("cor_cc_id")))
		.pause(7)

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}