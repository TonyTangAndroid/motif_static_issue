package com.tonytang.okhttp.asset.motifstaticerror;

@motif.Scope
public interface FooScope {

  Foo foo();

  @motif.Objects
  abstract class Objects extends OptionModule {

  }
}

class Foo {

}

abstract class OptionModule {

  abstract Foo foo();

}
