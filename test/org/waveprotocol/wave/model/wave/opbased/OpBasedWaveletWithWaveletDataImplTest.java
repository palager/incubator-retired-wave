/**
 * Copyright 2008 Google Inc.
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
 *
 */

package org.waveprotocol.wave.model.wave.opbased;


import org.waveprotocol.wave.model.testing.BasicFactories;
import org.waveprotocol.wave.model.wave.data.ObservableWaveletData;
import org.waveprotocol.wave.model.wave.data.impl.WaveletDataImpl;

/**
 * An integration test that runs the {@link OpBasedWaveletTestBase} test suite
 * on {@link OpBasedWavelet}s backed by {@link WaveletDataImpl}s.
 *
 */

public final class OpBasedWaveletWithWaveletDataImplTest extends OpBasedWaveletTestBase {
  private final WaveletDataImpl.Factory factory =
      BasicFactories.waveletDataImplFactory();

  @Override
  protected ObservableWaveletData.Factory<?> createWaveletDataFactory() {
    return factory;
  }
}