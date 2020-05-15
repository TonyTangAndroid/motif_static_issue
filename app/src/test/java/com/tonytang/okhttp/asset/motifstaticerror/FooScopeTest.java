package com.tonytang.okhttp.asset.motifstaticerror;


import static com.google.common.truth.Truth.assertThat;

import com.google.common.truth.Truth;
import org.junit.Test;


public class FooScopeTest {

  @Test
  public void fooCouldBeCreated() {
    FooScope fooScope = new FooScopeImpl();
    assertThat(fooScope.foo()).isNotNull();
  }
}