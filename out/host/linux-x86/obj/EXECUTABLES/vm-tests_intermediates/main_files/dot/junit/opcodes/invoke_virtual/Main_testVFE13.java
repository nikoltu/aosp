//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_virtual;
import dot.junit.opcodes.invoke_virtual.d.*;
import dot.junit.*;
public class Main_testVFE13 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_virtual.d.T_invoke_virtual_18
        //@uses dot.junit.opcodes.invoke_virtual.TestStubs
         try {
             new T_invoke_virtual_18().run(new TestStubs());
             fail("expected IllegalAccessError");
         } catch (IllegalAccessError t) {
         }
    }
}