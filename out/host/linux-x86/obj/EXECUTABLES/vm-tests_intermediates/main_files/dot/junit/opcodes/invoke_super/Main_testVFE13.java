//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_super;
import dot.junit.opcodes.invoke_super.d.*;
import dot.junit.*;
public class Main_testVFE13 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_super.d.T_invoke_super_18
        //@uses dot.junit.opcodes.invoke_super.TestStubs
         try {
             new T_invoke_super_18().run(new TestStubs());
             fail("expected IllegalAccessError");
         } catch (IllegalAccessError t) {
         }
    }
}
