package utils

import io.gatling.core.Predef._
import io.gatling.http.Predef._

object Environment {

  val baseURL = "https://opsteam12.editorx.io"




  val minThinkTime = 5
  val maxThinkTime = 7

  val HttpProtocol = http

  val get_header = Map(
    "accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.9",
    "accept-encoding" -> "gzip, deflate, br",
    "accept-language" -> "en-GB,en-US;q=0.9,en;q=0.8",
    "sec-ch-ua" -> """ Not A;Brand";v="99", "Chromium";v="100", "Google Chrome";v="100""",
    "sec-ch-ua-mobile" -> "?0",
    "sec-ch-ua-platform" -> "macOS",
    "sec-fetch-dest" -> "document",
    "sec-fetch-mode" -> "navigate",
    "sec-fetch-site" -> "same-origin",
    "sec-fetch-user" -> "?1",
    "upgrade-insecure-requests" -> "1",
    "user-agent" -> "Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/100.0.4896.75 Safari/537.36")

  val post_header = Map(
    "Content-Type" -> "application/json",
    "X-Wix-Client-Artifact-Id" -> "wix-form-builder",
    "authorization" -> "CPerFO7Nuz7_1k7VGXOZymaNiKdgnKgssU9ZziUoejA.eyJpbnN0YW5jZUlkIjoiMWY5NDE5YzMtNmEyMi00NTE3LTkyYzktOGE4M2Y5YjVjZmExIiwiYXBwRGVmSWQiOiIxNGNlMTIxNC1iMjc4LWE3ZTQtMTM3My0wMGNlYmQxYmVmN2MiLCJtZXRhU2l0ZUlkIjoiZmVmZjhjMWUtMWIwOS00NjFhLTgyMDgtMzk5ZjJmY2U3ZGMxIiwic2lnbkRhdGUiOiIyMDIyLTA0LTIxVDA4OjM4OjQ0LjEzMloiLCJkZW1vTW9kZSI6ZmFsc2UsImFpZCI6IjcxMjNiODMxLTBhMTMtNDk5OC1hYzY3LWQwMDcyYzI0YzU1NCIsImJpVG9rZW4iOiJlMTZiOTVkZC03MTJiLTAzMGQtMTBjMS1iMzFjZDY3YmIyNjAiLCJzaXRlT3duZXJJZCI6ImUyMWQ0OTI5LWE3MmEtNDZhNi05NmFjLTc0MjdjNmI2NDgxZiJ9")

}
