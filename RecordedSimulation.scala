
import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://frog.editorx.com")
		.inferHtmlResources()
		.userAgentHeader("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36")

	val headers_0 = Map("Content-Type" -> "text/plain;charset=UTF-8")

	val headers_2 = Map(
		"Content-Type" -> "application/json",
		"X-Wix-Client-Artifact-Id" -> "wix-form-builder",
		"authorization" -> "CPerFO7Nuz7_1k7VGXOZymaNiKdgnKgssU9ZziUoejA.eyJpbnN0YW5jZUlkIjoiMWY5NDE5YzMtNmEyMi00NTE3LTkyYzktOGE4M2Y5YjVjZmExIiwiYXBwRGVmSWQiOiIxNGNlMTIxNC1iMjc4LWE3ZTQtMTM3My0wMGNlYmQxYmVmN2MiLCJtZXRhU2l0ZUlkIjoiZmVmZjhjMWUtMWIwOS00NjFhLTgyMDgtMzk5ZjJmY2U3ZGMxIiwic2lnbkRhdGUiOiIyMDIyLTA0LTIxVDA4OjM4OjQ0LjEzMloiLCJkZW1vTW9kZSI6ZmFsc2UsImFpZCI6IjcxMjNiODMxLTBhMTMtNDk5OC1hYzY3LWQwMDcyYzI0YzU1NCIsImJpVG9rZW4iOiJlMTZiOTVkZC03MTJiLTAzMGQtMTBjMS1iMzFjZDY3YmIyNjAiLCJzaXRlT3duZXJJZCI6ImUyMWQ0OTI5LWE3MmEtNDZhNi05NmFjLTc0MjdjNmI2NDgxZiJ9")

	val headers_3 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
		"origin" -> "https://opsteam12.editorx.io",
		"pragma" -> "no-cache",
		"sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "macOS",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site")

    val uri2 = "https://opsteam12.editorx.io/_api/wix-forms/v1/submit-form"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.post("/form-builder")
			.headers(headers_0)
			.body(RawFileBody("recordedsimulation/0000_request.txt"))
			.resources(http("request_1")
			.post("/bolt-performance")
			.headers(headers_0)
			.body(RawFileBody("recordedsimulation/0001_request.txt")),
            http("request_2")
			.post(uri2)
			.headers(headers_2)
			.body(RawFileBody("recordedsimulation/0002_request.json")),
            http("request_3")
			.post("/pa?_msid=feff8c1e-1b09-461a-8208-399f2fce7dc1&vsi=ad5640d1-63ae-4bbe-93f0-c7c882a2ebd1&rid=1650530323.732305240154731739&_av=thunderbolt-1.9846.0&isb=false&_brandId=editorx&_siteBranchId=undefined&_ms=852153&_lv=2.0.985%7CC&_visitorId=7123b831-0a13-4998-ac67-d0072c24c554&_siteMemberId=undefined&bsi=d4e283b3-6733-4b9b-adae-5e8906fa598d%7C12&src=76&evid=1108&uuid=e21d4929-a72a-46a6-96ac-7427c6b6481f&url=https%3A%2F%2Fopsteam12.editorx.io%2Fsolirius%2Fcontact&ref=&bot=false&bl=en-GB&pl=en-GB%2Cen-US%2Cen&_=165053117380510")
			.headers(headers_3),
            http("request_4")
			.post("/bolt-performance")
			.headers(headers_0)
			.body(RawFileBody("recordedsimulation/0004_request.txt")),
            http("request_5")
			.post("/form-builder")
			.headers(headers_0)
			.body(RawFileBody("recordedsimulation/0005_request.txt"))))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}