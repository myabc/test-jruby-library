package jrubytesting;

import org.jruby.Ruby;
import org.jruby.RubyArray;
import org.jruby.RubyClass;
import org.jruby.RubyModule;
import org.jruby.runtime.ObjectAllocator;
import org.jruby.runtime.builtin.IRubyObject;
import org.jruby.runtime.load.BasicLibraryService;

public class TestJrubyLibraryService implements BasicLibraryService {

  public boolean basicLoad(Ruby ruby) {
    System.out.println("Hello from Java");
    ruby.evalScriptlet("puts 'Hello from Ruby'");
    return true;
  }

}