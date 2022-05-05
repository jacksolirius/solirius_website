package simulations

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.scenario.Simulation
import io.gatling.core.controller.inject.open.OpenInjectionStep
import io.gatling.commons.stats.assertion.Assertion
import io.gatling.core.pause.PauseType
import scenarios._
import utils.Environment

import scala.concurrent.duration._

class Main_Simulation extends Simulation {

  val BaseURL = Environment.baseURL

  val httpProtocol = http
    .baseUrl(BaseURL)
    .doNotTrackHeader("1")
    .inferHtmlResources()
    .silentResources

  val Solirius = scenario("Solirius Simulation")
    .exitBlockOnFail {
      exec(Solirius_scenario.homePage)
      .exec(Solirius_scenario.aboutUs)
        .exec(Solirius_scenario.services)
        .exec(Solirius_scenario.insights)
        .exec(Solirius_scenario.contactUs)
        .exec(Solirius_scenario.joinOurTeam)
    }


  setUp(
    Solirius.inject(rampUsers(1) during (10 minutes))
      .protocols(httpProtocol))

}
