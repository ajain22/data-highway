/**
 * Copyright (C) 2016-2019 Expedia Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.hotels.road.offramp.kafka;

import java.util.Map;

interface KafkaDeserializer<T> extends
    org.apache.kafka.common.serialization.Deserializer<T>,
    com.hotels.road.offramp.utilities.Deserializer<T> {
  @Override
  default void configure(Map<String, ?> configs, boolean isKey) {}

  @Override
  default void close() {}
}