/**
 * Copyright 2011-2012 eBusiness Information, Groupe Excilys (www.excilys.com)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * 		http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.excilys.ebi.gatling.http.check.bodypart

import com.excilys.ebi.gatling.core.check.Matcher
import com.excilys.ebi.gatling.core.session.Session
import com.excilys.ebi.gatling.core.util.StringHelper.EMPTY
import com.excilys.ebi.gatling.http.request.HttpPhase.BodyPartReceived
import com.excilys.ebi.gatling.http.response.ExtendedResponse
import com.excilys.ebi.gatling.http.check.HttpCheck

class ChecksumCheck(val algorithm: String, matcher: Matcher[ExtendedResponse, String], saveAs: Option[String]) extends HttpCheck((s: Session) => EMPTY, matcher, saveAs, BodyPartReceived)
