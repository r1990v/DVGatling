package com.testing.performance

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseURL("https://apig-qa.apps.dev.deltaverge.com")
		.proxy(
    Proxy("127.0.0.1", 8888)
    .httpsPort(8888))
		.acceptEncodingHeader("gzip")
		.disableWarmUp
		

	val headers_0 = Map(
		"Authorization" -> "Bearer",
		"tenantToken" -> "",
		"user_details" -> "null")

	val headers_1 = Map("Content-Type"->"application/x-www-form-urlencoded",
                      "Content-Length"->"137",
                      "Host"->"apig-qa.apps.dev.deltaverge.com",
                      "Connection"->"Keep-Alive",
                      "Accept-Encoding"->"gzip",
                      "User-Agent" -> "okhttp/3.8.1")

	val headers_2 = Map(
		"Authorization" -> "Bearer ${cor_access_token}",
		"Content-Type" -> "application/json",
		"tenantToken" -> "tenant1",
		"user_details" -> """{"userId":null,"orgLabel":"Basha Agent","email":"mahammadbasha.it@gmail.com","name":"Shilpa  ","orgId":"e2760583-0c6a-43d6-afd8-03cc90282cc9","accountId":"eaaac285-5916-4080-9845-e888cb1b2607","avatarUrl":null,"supervisorId":null,"userTenancyAccessId":"tenant1","userTenancyIdentityId":"0a5d2196-3683-4d17-8522-8b5e698ca5a0","userDapSet":[{"filterKey":"serviceLine","filterValue":"[\"CAT-ef0d377e-50b9-473f-9490-87269a07e413\",\"CAT-c70c7b09-a7ee-4a9e-a12b-2c0d77ae8876\",\"CAT-9f945d04-0094-456e-a671-e0e991bb6cec\"]","filterOperator":"EQUAL"},{"filterKey":"territory","filterValue":"[{\"id\":\"1b0204f4-22b0-46d6-bc55-f230f7a484b9\",\"territoryTree\":[{\"nodeId\":\"fcfdfd7c-d12b-419f-946d-3907e11ecf11\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"822d2651-3ce8-4c5c-93dd-bcca3202ac1d\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"93578fd1-7bbf-4597-a7ba-83b910831804\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"b48c0113-8e06-43d9-9a54-0d5cd5a7591c\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"2b0cf080-66b8-4ffb-bd7f-4580f6b89673\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"0d9f79af-eb90-4bd3-bdc2-404309db5eae\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"d17baef2-5830-472d-8855-e0b868b790e6\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"bf15a2b9-fa38-435f-8eb7-ebebe527b33d\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"00a445e4-028e-4447-b71a-7d721fd7af02\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"2a383eaa-2912-4b66-a28d-370c6f0eb5ea\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"ChIJu37_EBeQUjoRtGgR-y9sEzg\",\"nodeLevelType\":\"district\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"}]}]","filterOperator":"EQUAL"}]}""")

	val headers_3 = Map(
		"Authorization" -> "Bearer ${cor_access_token}",
		"tenantToken" -> "tenant1",
		"user_details" -> """{"userId":null,"orgLabel":"Basha Agent","email":"mahammadbasha.it@gmail.com","name":"Shilpa  ","orgId":"e2760583-0c6a-43d6-afd8-03cc90282cc9","accountId":"eaaac285-5916-4080-9845-e888cb1b2607","avatarUrl":null,"supervisorId":null,"userTenancyAccessId":"tenant1","userTenancyIdentityId":"0a5d2196-3683-4d17-8522-8b5e698ca5a0","userDapSet":[{"filterKey":"serviceLine","filterValue":"[\"CAT-ef0d377e-50b9-473f-9490-87269a07e413\",\"CAT-c70c7b09-a7ee-4a9e-a12b-2c0d77ae8876\",\"CAT-9f945d04-0094-456e-a671-e0e991bb6cec\"]","filterOperator":"EQUAL"},{"filterKey":"territory","filterValue":"[{\"id\":\"1b0204f4-22b0-46d6-bc55-f230f7a484b9\",\"territoryTree\":[{\"nodeId\":\"fcfdfd7c-d12b-419f-946d-3907e11ecf11\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"822d2651-3ce8-4c5c-93dd-bcca3202ac1d\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"93578fd1-7bbf-4597-a7ba-83b910831804\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"b48c0113-8e06-43d9-9a54-0d5cd5a7591c\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"2b0cf080-66b8-4ffb-bd7f-4580f6b89673\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"0d9f79af-eb90-4bd3-bdc2-404309db5eae\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"d17baef2-5830-472d-8855-e0b868b790e6\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"bf15a2b9-fa38-435f-8eb7-ebebe527b33d\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"00a445e4-028e-4447-b71a-7d721fd7af02\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"2a383eaa-2912-4b66-a28d-370c6f0eb5ea\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"ChIJu37_EBeQUjoRtGgR-y9sEzg\",\"nodeLevelType\":\"district\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"}]}]","filterOperator":"EQUAL"}]}""")

	val headers_11 = Map(
		"Content-Type" -> "application/json",
		"tenantToken" -> "tenant1",
		"user_details" -> """{"userId":null,"orgLabel":"Escort Harvesting Solution","email":"shilpampatil06@gmail.com","name":"Shilpa  ","orgId":"2ba62a46-edde-4839-b479-2c3a612555e3","accountId":"eaaac285-5916-4080-9845-e888cb1b2607","avatarUrl":null,"supervisorId":null,"userTenancyAccessId":"tenant1","userTenancyIdentityId":"373c2e49-4195-4062-bf4f-5fbee8e0c106","userDapSet":[{"filterKey":"serviceLine","filterValue":"[\"CAT-c70c7b09-a7ee-4a9e-a12b-2c0d77ae8876\",\"CAT-9f945d04-0094-456e-a671-e0e991bb6cec\"]","filterOperator":"EQUAL"},{"filterKey":"territory","filterValue":"[{\"id\":\"f599e161-6480-4228-9ba1-30e8e9d47ad0\",\"territoryTree\":[{\"nodeId\":\"fcfdfd7c-d12b-419f-946d-3907e11ecf11\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"822d2651-3ce8-4c5c-93dd-bcca3202ac1d\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"93578fd1-7bbf-4597-a7ba-83b910831804\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"b48c0113-8e06-43d9-9a54-0d5cd5a7591c\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"2b0cf080-66b8-4ffb-bd7f-4580f6b89673\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"0d9f79af-eb90-4bd3-bdc2-404309db5eae\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"d17baef2-5830-472d-8855-e0b868b790e6\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"bf15a2b9-fa38-435f-8eb7-ebebe527b33d\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"00a445e4-028e-4447-b71a-7d721fd7af02\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"2a383eaa-2912-4b66-a28d-370c6f0eb5ea\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"ChIJu37_EBeQUjoRtGgR-y9sEzg\",\"nodeLevelType\":\"district\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"}]}]","filterOperator":"EQUAL"}]}""")

	val headers_12 = Map(
		"tenantToken" -> "tenant1",
		"user_details" -> """{"userId":null,"orgLabel":"Escort Harvesting Solution","email":"shilpampatil06@gmail.com","name":"Shilpa  ","orgId":"2ba62a46-edde-4839-b479-2c3a612555e3","accountId":"eaaac285-5916-4080-9845-e888cb1b2607","avatarUrl":null,"supervisorId":null,"userTenancyAccessId":"tenant1","userTenancyIdentityId":"373c2e49-4195-4062-bf4f-5fbee8e0c106","userDapSet":[{"filterKey":"serviceLine","filterValue":"[\"CAT-c70c7b09-a7ee-4a9e-a12b-2c0d77ae8876\",\"CAT-9f945d04-0094-456e-a671-e0e991bb6cec\"]","filterOperator":"EQUAL"},{"filterKey":"territory","filterValue":"[{\"id\":\"f599e161-6480-4228-9ba1-30e8e9d47ad0\",\"territoryTree\":[{\"nodeId\":\"fcfdfd7c-d12b-419f-946d-3907e11ecf11\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"822d2651-3ce8-4c5c-93dd-bcca3202ac1d\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"93578fd1-7bbf-4597-a7ba-83b910831804\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"b48c0113-8e06-43d9-9a54-0d5cd5a7591c\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJkbeSa_BfYzARphNChaFPjNc\",\"selectedNodeLevelType\":\"country\"},{\"nodeId\":\"2b0cf080-66b8-4ffb-bd7f-4580f6b89673\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"0d9f79af-eb90-4bd3-bdc2-404309db5eae\",\"nodeLevelType\":\"pincode\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"d17baef2-5830-472d-8855-e0b868b790e6\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"bf15a2b9-fa38-435f-8eb7-ebebe527b33d\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"00a445e4-028e-4447-b71a-7d721fd7af02\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"2a383eaa-2912-4b66-a28d-370c6f0eb5ea\",\"nodeLevelType\":\"Centre\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"},{\"nodeId\":\"ChIJu37_EBeQUjoRtGgR-y9sEzg\",\"nodeLevelType\":\"district\",\"selectedNodeId\":\"ChIJj0i_N0xaozsR1Xx10YzS8UE\",\"selectedNodeLevelType\":\"state\"}]}]","filterOperator":"EQUAL"}]}""")
   
	val scn = scenario("RecordedSimulation")
			.exec(http("request_1")
			.post("/api/v1.0.0/isam/oauth/token")
			.headers(headers_1)
			.formParam("username", "9071813108")
			.formParam("password", "Agent@123")
			.formParam("grant_type", "password")
			.formParam("scope", "Write")
			.formParam("client_secret", "TrustedClient@2017")
			.formParam("client_id", "Isam_Trusted_Client")
			.basicAuth("Isam_Trusted_Client","TrustedClient@2017")
			.check(regex(""""access_token":"(.+?)"""").saveAs("cor_access_token")))
		.pause(1)
		.exec(http("request_2")
			.post("/api/v1.0.0/panm/protected/panm.fndusr.find/v0.1")
			.headers(headers_2)
			.body(RawFileBody("RecordedSimulation_0002_request.txt")))
		.pause(1)
		.exec(http("request_3")
			.get("/api/v1.0.0/wall/card/wfs.user.get.carddecks/v0.1/e2760583-0c6a-43d6-afd8-03cc90282cc9/?offset=0&pageSize=5&rank=true")
			.headers(headers_3))
		.pause(6)

	setUp(scn.inject(atOnceUsers(10))).protocols(httpProtocol)
}