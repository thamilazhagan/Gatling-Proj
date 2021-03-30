package simulations
//
//import io.gatling.core.Predef.Simulation
//import io.gatling.core.Predef._
//import io.gatling.core.structure.ChainBuilder
//import io.gatling.http.Predef._
//
//import scala.io.Source
//
//class test extends Simulation {
//
//  val httpProtocol = http
//    .baseUrl("https://insight.rpxcorp.com")
//    .inferHtmlResources()
//    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
//
//  val headers = Map(
//    "Accept" -> "*/*",
//    "Accept-Encoding" -> "gzip, deflate, br",
//    "Accept-Language" -> "en-US,en;q=0.9",
//    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
//    "Origin" -> "https://insight.rpxcorp.com",
//    "Sec-Fetch-Dest" -> "empty",
//    "Sec-Fetch-Mode" -> "cors",
//    "Sec-Fetch-Site" -> "same-origin",
//    "X-CSRF-Token" -> "qZdSKE27Z0oIpAHPH5rdax+P17CdmqnEnRn+alvLQ23mFx62MYJvWOGqSOYH4rVaM+4fyICEJOEN1qvaUOHVBQ==",
//    "X-Requested-With" -> "XMLHttpRequest",
//    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
//    "sec-ch-ua-mobile" -> "?0")




//  def login(): ChainBuilder={
//    exec(http("Login Page")
//      .post("/users/sign_in")
//      .headers(headers)
//      .formParam("utf8", "✓")
//      .formParam("authenticity_token", "CbADRz2e8WQNa3dbdJ+Iw8HrdoG0MM0kt/bwsKwb0J4B1ilrbV3GGB3L0v3dHt1HXFrER9Vb7GVXw/S1UNObDA==")
//      .formParam("request_path", "/public_login")
//      .formParam("company_needed", "false")
//      .formParam("user[email]", "Qainsurancetest@gmail.com")
//      .formParam("user[password]", "welcomE1")
//      .formParam("user[remember_me]", "0")
//      .formParam("user[remember_me]", "1")
//      .formParam("weak_password", "true"))
 // }

//  val csvfeeder=csv("./src/test/resources/data/getUser.csv").circular
//
//  def getUser()= {
//   // repeat(2) {
//      //val csvfeeder=csv("./src/test/resources/data/getUser.csv").circular
//      feed(csvfeeder)
//        .exec(http("get single user url")
//
//          .get("https://insight.rpxcorp.com${User_Url}"))
//        .pause(2)
//   // }
//  }
//  val csvfeeder2=csv("./src/test/resources/data/FC.csv").circular
//
//  def getUser2()= {
//    // repeat(2) {
//    //val csvfeeder=csv("./src/test/resources/data/FC.csv").circular
//    feed(csvfeeder2)
//      .exec(http("get second user url")
//
//        .get("https://insight.rpxcorp.com${User_Url}"))
//      .pause(2)
    // }
  //}
//  val csvfeeder3=csv("./src/test/resources/data/Litigation.csv").circular
//
//  def getUser3()= {
//    // repeat(2) {
//    //val csvfeeder=csv("./src/test/resources/data/getUser.csv").circular
//    feed(csvfeeder3)
//      .exec(http("get third user url")
//
//        .get("https://insight.rpxcorp.com${User_Url}"))
//      .pause(2)
    // }
  //}
//
//demo


  //demo
//    def navigateToChieneseCampaign(): ChainBuilder={
//    exec(http("Chinese Campaign Page Navigation")
//      .get("/litigation_campaign/191"))
//  }
//
//      def navigateToDCCampaign(): ChainBuilder={
//      exec(http("DC Campaign Page Navigation")
//        .get("/litigation_campaign/35043"))
//    }
//
//  def navigateToEntitypage(): ChainBuilder ={
//    exec(http("Entity page Navigation")
//      .get("/entity/87697"))
//  }
//
//  def navigateToLitigationPage(): ChainBuilder={
//    exec(http("Litigation Page Navigation")
//      .get("/litigation/7596"))
//  }
//
//
//  def navigateToFCPage(): ChainBuilder={
//    exec(http("FC Page Navigation")
//      .get("/federal_circuit/3009989"))
//  }
//
//  def navigateToLawfirmPage(): ChainBuilder={
//    exec(http("Lawfirm page Navigation")
//      .get("/lawfirm/59146"))
//  }
//
//
//  def navigateToTechCentrePage(): ChainBuilder={
//    exec(http("TechCentre Page Navigation")
//      .get("/tech_center/1676046"))
//  }
//
//  def navigateToChineseLitigationPage(): ChainBuilder={
//    exec(http("Chinese Litigation Page Navigation")
//      .get("/litigation/china/4001216"))
//  }
//
//  def navigateToChinesePRBPage(): ChainBuilder={
//    exec(http("Chinese PRB Page Navigation")
//      .get("/china/prb/5012417"))
//  }
//
//  def navigateToReexaminationPage(): ChainBuilder={
//    exec(http("Reexamination Page Navigation")
//      .get("/reexaminations/7015713"))
//  }
//  def navigateToPTABPage(): ChainBuilder={
//    exec(http("PTAB Page Navigation")
//      .get("/ptabs/1"))
//  }
//
//  def navigateToVenuesPage(): ChainBuilder={
//    exec(http("Venues Page Navigation")
//      .get("/venues/96476"))
//  }
//
//  def navigateToJudgesPage(): ChainBuilder={
//    exec(http("Judges Page Navigation")
//      .get("/judges/98129"))
//  }
//
//  def navigateToPTABJudgesPage(): ChainBuilder={
//    exec(http("PTAB Judges Page Navigation")
//      .get("/ptab/judge/1004108"))
//  }
//
//  def navigateToChineseJudgesPage(): ChainBuilder={
//    exec(http("Chinese Judges Page Navigation")
//      .get("/china/judge/991405"))
//  }
//
//  def navigateToNewsPage(): ChainBuilder={
//    exec(http("News Page Navigation")
//      .get("/news/60076"))
//  }
//
//  def navigateToITCPage(): ChainBuilder={
//    exec(http("ITC Page Navigation")
//      .get("/itc/880"))
//  }
//
//  def navigateToPriorArtSearchReportPage(): ChainBuilder={
//    exec(http("Prior Art Search Result Page Navigation")
//      .get("/rpxpriorartsearchreports"))
//  }
//
//  def navigateToLitigationCampaignAssessmentsReportPage(): ChainBuilder={
//    exec(http("Litigation Campaign Assessments Report Page Navigation")
//      .get("/lca_reports"))
//  }
//
//  def navigateToAdvancedSearchPage(): ChainBuilder={
//    exec(http("Advanced Search Page Navigation")
//      .get("/advanced_search/"))
//  }
//
//  def navigateToPatentDetailPage(): ChainBuilder={
//    exec(http("Patent Detail Page Navigation")
//      .get("/pat/US6179053B1"))
//  }
//
//  def navigateToChinesePatentDetailPage(): ChainBuilder={
//    exec(http("Chinese Patent Detail Page Navigation")
//      .get("/cn/CN204159473U"))
//  }
//
//  def navigateToPortfolioDetailPage(): ChainBuilder={
//    exec(http("Portfolio Detail Page Navigation")
//      .get("/portfolios/1078258"))
//  }
//
//  def navigateToAcquisitionsDetailPage(): ChainBuilder={
//    exec(http("Acquisitions Detail Page Navigation")
//      .get("/acquisitions/6960"))
//  }
//
//  def navigateToPTABAnalysticsPage(): ChainBuilder={
//    exec(http("Ptabs Analytics Detail Page Navigation")
//      .get("/analytics/ptab"))
//  }
//
//  def navigateToAllSearchPage(): ChainBuilder={
//    exec(http("All Search Page Navigation")
//      .get("/advanced_search/search_all#grouped=true&utf8=%E2%9C%93"))
//  }
//
//
//  def navigateToLitigationSearchPage(): ChainBuilder={
//    exec(http("Litigation Search Page Navigation")
//      .get("/advanced_search/search_litigations#grouped=true&utf8=%E2%9C%93"))
//  }
//
//  def navigateToEntitySearchPage(): ChainBuilder={
//    exec(http("Entity Search Page Navigation")
//      .get("/advanced_search/search_entities#grouped=true&utf8=%E2%9C%93"))
//  }
//
//  def navigateToPatentSearchPage(): ChainBuilder={
//    exec(http("Patent Search Page Navigation")
//      .get("/advanced_search/search_patents#grouped=true&utf8=%E2%9C%93"))
//  }
//
//  def navigateToMarketPlaceSearchPage(): ChainBuilder={
//    exec(http("Market Place Search Page Navigation")
//      .get("/advanced_search/search_marketplaces#grouped=true&utf8=%E2%9C%93"))
//  }
//
//  def navigateToPortfoliosSearchPage(): ChainBuilder={
//    exec(http("Portfolios Search Page Navigation")
//      .get("/advanced_search/search_portfolios#grouped=true&utf8=%E2%9C%93"))
//  }
//
//  def navigateToNewsSearchPage(): ChainBuilder={
//    exec(http("News Search Page Navigation")
//      .get("/news/details"))
//  }
//
//  def navigateToJudgesSearchPage(): ChainBuilder={
//    exec(http("Judges Search Page Navigation")
//      .get("/advanced_search/search_judges?"))
//  }
//
//  def navigateToLawFirmsSearchPage(): ChainBuilder={
//    exec(http("Law Firms Search Page Navigation")
//      .get("/advanced_search/search_lawfirms?"))
//  }
//
//  def navigateToVenuesSearchPage(): ChainBuilder={
//    exec(http("Venues Search Page Navigation")
//      .get("/advanced_search/search_venues?"))
//  }
//
//  val scn = scenario("Insight API Performance")
//    .group("LogIn Call")
//    {
//      exec(login())
//    }
//    .group("CCssVV") {
//
//      exec(getUser())
//    }
////  .group("csv1") {
////    exec(getUser2())
////  }
//  .group("csv2"){
//      exec(getUser3())
//    }
//    .group("Chinese Campaign Calls")
//    {
//      exec(navigateToChieneseCampaign())
//    }
//    .group("DC Campaign Calls")
//    {
//      exec(navigateToDCCampaign())
//    }
//    .group("Entity Calls")
//    {
//      exec(navigateToEntitypage())
//    }
//    .group("Litigation Calls") {
//      exec(navigateToLitigationPage())
//
//    }
//    .group("FC Calls") {
//      exec(navigateToFCPage())
//
//    }
//    .group("Lawfirm Calls") {
//      exec(navigateToLawfirmPage())
//
//    }
//    .group("Techcentre Calls") {
//      exec(navigateToTechCentrePage())
//
//    }
//    .group("Chinese Litigation Calls") {
//      exec(navigateToChineseLitigationPage())
//
//    }
//    .group("Chinese PRB Calls") {
//      exec(navigateToChinesePRBPage())
//
//    }
//    .group("Reexamination Calls") {
//      exec(navigateToReexaminationPage())
//
//    }
//    .group("PTAB Details Calls") {
//      exec(navigateToPTABPage())
//
//    }
//
//    .group("Venues Calls") {
//      exec(navigateToVenuesPage())
//
//    }
//    .group("Judge Calls") {
//      exec(navigateToJudgesPage())
//
//    }
//    .group("PTAB Judge Calls") {
//      exec(navigateToPTABJudgesPage())
//
//    }
//    .group("Chinese Judge Calls") {
//      exec(navigateToChineseJudgesPage())
//
//    }
//    .group("News Calls") {
//      exec(navigateToNewsPage())
//
//    }
//    .group("ITC Calls") {
//      exec(navigateToITCPage())
//
//    }
//    .group("Prior Art Search Report Calls") {
//      exec(navigateToPriorArtSearchReportPage())
//
//    }
//    .group("Litigation Campaign Assessments Report Calls") {
//      exec(navigateToLitigationCampaignAssessmentsReportPage())
//
//    }
//    .group("Advanced Search Calls") {
//      exec(navigateToAdvancedSearchPage())
//
//    }
//    .group("Patent Detail Calls") {
//      exec(navigateToPatentDetailPage())
//
//    }
//    .group("Chinese patent detail Calls") {
//      exec(navigateToChinesePatentDetailPage())
//
//    }
//    .group("Portfolio Detail Calls") {
//      exec(navigateToPortfolioDetailPage())
//
//    }
//    .group("Acquisition Calls") {
//      exec(navigateToAcquisitionsDetailPage())
//
//    }
//    .group("Ptabs Analytics Calls") {
//      exec(navigateToPTABAnalysticsPage())
//
//    }
//    .group("All Search page Calls") {
//      exec(navigateToAllSearchPage())
//
//    }
//    .group("Litigation Search Calls") {
//      exec(navigateToLitigationSearchPage())
//
//    }
//    .group("Entity search Calls") {
//      exec(navigateToEntitySearchPage())
//
//    }
//    .group("Patent search page Calls") {
//      exec(navigateToPatentSearchPage())
//
//    }
//    .group("Marketplace Search Calls") {
//      exec(navigateToMarketPlaceSearchPage())
//
//    }
//    .group("Portfolios search Calls") {
//      exec(navigateToPortfoliosSearchPage())
//
//    }
//    .group("News Search Calls") {
//      exec(navigateToNewsSearchPage())
//
//    }
//    .group("Judge Search Calls") {
//      exec(navigateToJudgesSearchPage())
//
//    }
//    .group("Law Firms search Calls") {
//      exec(navigateToLawFirmsSearchPage())
//
//    }
//    .group("Venues search Calls") {
//      exec(navigateToVenuesSearchPage()
//      )
//
//    }

//  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
//
//}
//package simulations

import io.gatling.core.Predef._
import io.gatling.core.structure.ChainBuilder
import io.gatling.http.Predef._

class test extends Simulation {

  val httpProtocol = http
    .baseUrl("https://insight.rpxcorp.com/")
    .inferHtmlResources()
    .userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/89.0.4389.90 Safari/537.36")
  val csvFeeder = csv("./src/test/scala/simulations/simulations/test.csv").queue

  val headers = Map(
    "Accept" -> "*/*",
    "Accept-Encoding" -> "gzip, deflate, br",
    "Accept-Language" -> "en-US,en;q=0.9",
    "Content-Type" -> "application/x-www-form-urlencoded; charset=UTF-8",
    "Origin" -> "https://insight.rpxcorp.com",
    "Sec-Fetch-Dest" -> "empty",
    "Sec-Fetch-Mode" -> "cors",
    "Sec-Fetch-Site" -> "same-origin",
    "X-CSRF-Token" -> "qZdSKE27Z0oIpAHPH5rdax+P17CdmqnEnRn+alvLQ23mFx62MYJvWOGqSOYH4rVaM+4fyICEJOEN1qvaUOHVBQ==",
    "X-Requested-With" -> "XMLHttpRequest",
    "sec-ch-ua" -> """Google Chrome";v="89", "Chromium";v="89", ";Not A Brand";v="99""",
    "sec-ch-ua-mobile" -> "?0")

  def login(): ChainBuilder={
    exec(http("Login Page")
      .post("/users/sign_in")
      .headers(headers)
      .formParam("utf8", "✓")
      .formParam("authenticity_token", "CbADRz2e8WQNa3dbdJ+Iw8HrdoG0MM0kt/bwsKwb0J4B1ilrbV3GGB3L0v3dHt1HXFrER9Vb7GVXw/S1UNObDA==")
      .formParam("request_path", "/public_login")
      .formParam("company_needed", "false")
      .formParam("user[email]", "Qainsurancetest@gmail.com")
      .formParam("user[password]", "welcomE1")
      .formParam("user[remember_me]", "0")
      .formParam("user[remember_me]", "1")
      .formParam("weak_password", "true"))
      .pause(5)
  }

  def getURLAndDescription(): ChainBuilder={
   repeat(35)
   {
      feed(csvFeeder)
        .group("${request_name}") {
          exec(http("${request_name}").get("${path}")).pause(5)
        }
    }
  }

  val scn = scenario("Insight API Performance")
    .exec(login())
    .exec(getURLAndDescription())

  setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}