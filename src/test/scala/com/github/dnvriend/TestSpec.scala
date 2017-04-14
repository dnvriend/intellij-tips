/*
 * Copyright 2017 Dennis Vriend
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.dnvriend

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FlatSpec, Matchers, OptionValues }
import org.typelevel.scalatest.{ DisjunctionMatchers, ValidationMatchers }

import scala.concurrent.{ ExecutionContext, Future }
import scala.concurrent.duration._
import scala.util.Try

abstract class TestSpec extends FlatSpec with Matchers with ValidationMatchers with DisjunctionMatchers with ScalaFutures with OptionValues {
  implicit val pc: PatienceConfig = PatienceConfig(timeout = 60.minutes, interval = 300.millis)
  implicit val ec: ExecutionContext = scala.concurrent.ExecutionContext.Implicits.global

  implicit class PimpedFuture[T](self: Future[T]) {
    def toTry: Try[T] = Try(self.futureValue)
  }
}
