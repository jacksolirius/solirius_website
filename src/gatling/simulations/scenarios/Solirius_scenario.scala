package scenarios

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import utils.{Environment}

import scala.concurrent.duration._
import scala.util.Random

object Solirius_scenario {

  val BaseURL = Environment.baseURL

  val MinThinkTime = Environment.minThinkTime
  val MaxThinkTime = Environment.maxThinkTime




  val homePage =

    group("solirius_010_HomePage") {
      exec(http("solirius_010_HomePage")
        .get(BaseURL + "/solirius")
        .headers(Environment.get_header)
        .check(substring("Want to find out more?")))
    }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val aboutUs =

    group("solirius_020_About_Us") {
      exec(http("solirius_020_About_Us")
        .get(BaseURL + "/solirius/about-us")
        .headers(Environment.get_header)
        .check(substring("Our mission")))
    }

    .pause(MinThinkTime seconds, MaxThinkTime seconds)

  val services =
    group("solirius_030_Business-Consulting") {
      exec(http("solirius_030_Business-Consulting")
        .get(BaseURL + "/solirius/business-consulting")
        .headers(Environment.get_header)
        .check(substring("business consultants")))
    }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

  .group("solirius_040_Cloud_Cyber") {
    exec(http("solirius_040_Cloud_Cyber")
      .get(BaseURL + "/solirius/cloud-and-cyber")
      .headers(Environment.get_header)
      .check(substring("adopt cloud solutions")))
  }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_050_Data_AI") {
        exec(http("solirius_050_Data_AI")
          .get(BaseURL + "/solirius/data-and-ai")
          .headers(Environment.get_header))
         // .check(substring("adopt cloud solutions")))
      }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_060_Digital_Delivery") {
        exec(http("solirius_060_Digital_Delivery")
          .get(BaseURL + "/solirius/digital-delivery")
          .headers(Environment.get_header)
         .check(substring("we know that the journey to delivering new")))
      }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_070_Digital_Engineering") {
        exec(http("solirius_070_Digital_Engineering")
          .get(BaseURL + "/solirius/digital-engineering")
          .headers(Environment.get_header)
         .check(substring("technologies to build both")))
      }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_080_User_Centered_Design") {
        exec(http("solirius_080_User_Centered_Design")
          .get(BaseURL + "/solirius/user-centered-design")
          .headers(Environment.get_header)
          .check(substring("design with data and the latest")))
      }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

    val insights =
      group("solirius_090_Insights") {
        exec(http("solirius_090_Insights")
          .get(BaseURL + "/solirius/insights")
          .headers(Environment.get_header)
          .check(substring("All posts")))
      }
        .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_100_Blog_1_Rebecca") {
        exec(http("solirius_100_Blog_1_Rebecca")
          .get(BaseURL + "/solirius/post/how-to-make-website-design-more-inclusive")
          .headers(Environment.get_header)
          .check(substring("Rebecca from our Business Consulting")))
      }
        .pause(MinThinkTime seconds, MaxThinkTime seconds)

        .group("solirius_110_Blog_2_Max") {
          exec(http("solirius_110_Blog_2_Max")
            .get(BaseURL + "/solirius/post/an-understanding-of-cloud-computing")
            .headers(Environment.get_header)
            .check(substring("When thinking of uploading files")))
        }
        .pause(MinThinkTime seconds, MaxThinkTime seconds)

      val contactUs =
        group("solirius_120_Contact") {
          exec(http("solirius_120_Contact")
            .get(BaseURL + "/solirius/contact")
            .headers(Environment.get_header)
            .check(substring("Required fields are marked with")))
        }
          .pause(MinThinkTime seconds, MaxThinkTime seconds)
/*
        .group("solirius_130_Contact_Submit") {
          exec(http("solirius_130_Contact_Submit")
            .post(BaseURL + "/_api/wix-forms/v1/submit-form")
            .headers(Environment.post_header)
            .body(ElFileBody("submission.json")))
           // .check(substring("Thank you for contacting Solirius Consulting")))
        }
            .pause(MinThinkTime seconds, MaxThinkTime seconds)

 */


  val joinOurTeam =
    group("solirius_140_Join_Our_Team") {
      exec(http("solirius_140_Join_Our_Team")
        .get(BaseURL + "/solirius/join-our-team")
        .headers(Environment.get_header)
        .check(substring("WHY SOLIRIUS")))
    }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

  .group("solirius_150_Job_Search") {
    exec(http("solirius_150_Job_Search")
      .get(BaseURL + "/solirius/job-search")
      .headers(Environment.get_header)
      .check(substring("Showing")))
  }

      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_160_Job_Application") {
        exec(http("solirius_160_Job_Application")
          .get(BaseURL + "/solirius/job-search/job/2afda21d-2ecf-4b59-994d-c8912def2a70")
          //Need to take out the hard code above
          .headers(Environment.get_header)
          .check(substring("About us")))
      }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_170_Job_Application_Apply") {
        exec(http("solirius_170_Job_Application_Apply")
          .get(BaseURL + "/solirius/job-search/job/2afda21d-2ecf-4b59-994d-c8912def2a70/apply")
          //Need to take out the hard code above
          .headers(Environment.get_header)
          .check(substring("Apply for")))
      }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      /*
      .group("solirius_180_Job_Application_Apply_Post") {
        exec(http("solirius_180_Job_Application_Apply_Post")
          .post(BaseURL + "/_api/cloud-data/v1/wix-data/collections/save")
          .headers(Environment.post_header)
          .body(ElFileBody("jobApply.json")))
          //.check(substring("Apply for")))
      }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_185_Job_Application_Apply_Report") {
        exec(http("solirius_185_Job_Application_Apply_Report")
          .post(BaseURL + "/_api/action-triggers-server/v1/report-event")
          .headers(Environment.post_header)
          .body(ElFileBody("jobReport.json")))
        //.check(substring("Apply for")))
      }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_190_Job_Application_Apply_Success") {
        exec(http("solirius_190_Job_Application_Apply_Success")
          .get(BaseURL + "/job-search/job/2afda21d-2ecf-4b59-994d-c8912def2a70/apply/success")
          .headers(Environment.get_header)
          .body(ElFileBody("jobApply.json")))
          //.check(substring("Your application has been successfully submitted.")))
      }
      .pause(MinThinkTime seconds, MaxThinkTime seconds)

       */


    .group("solirius_200_Cookie_Policy") {
      exec(http("solirius_200_Cookie_Policy")
        .get(BaseURL + "/solirius/cookie-policy")
        .headers(Environment.get_header)
        .check(substring("What is a cookie")))
    }
    .pause(MinThinkTime seconds, MaxThinkTime seconds)

      .group("solirius_210_Privacy_Policy") {
        exec(http("solirius_210_Privacy_Policy")
          .get(BaseURL + "/solirius/privacy-policy")
          .headers(Environment.get_header)
          .check(substring("This section will form a basic overview of how Solirius")))

    }
}


