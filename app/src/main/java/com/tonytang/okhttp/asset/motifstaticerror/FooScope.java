package com.tonytang.okhttp.asset.motifstaticerror;

@motif.Scope
public interface FooScope {

  Foo foo();

  @motif.Objects
  abstract class Objects extends OptionModule {

  }
}

class Foo {

  private final Bar bar;

  public Foo(Bar bar) {
    this.bar = bar;
  }
}


class Bar {

}


abstract class OptionModule {

  abstract Bar bar();

  Foo foo(Bar bar) {
    return new Foo(bar);
  }

}
