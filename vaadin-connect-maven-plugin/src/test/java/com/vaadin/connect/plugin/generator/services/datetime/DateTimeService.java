/*
 * Copyright 2000-2019 Vaadin Ltd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.vaadin.connect.plugin.generator.services.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.vaadin.connect.VaadinService;

@VaadinService
public class DateTimeService {
  public Instant echoInstant(Instant instant) {
    return instant;
  }

  public Date echoDate(Date date) {
    return date;
  }

  public LocalDate echoLocalDate(LocalDate localDate) {
    return localDate;
  }

  public LocalDateTime echoLocalDateTime(LocalDateTime localDateTime) {
    return localDateTime;
  }

  public List<LocalDateTime> echoListLocalDateTime(
      List<LocalDateTime> localDateTimeList) {
    return localDateTimeList;
  }

  public Map<String, Instant> echoMapInstant(Map<String, Instant> mapInstant) {
    return mapInstant;
  }
}
