//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.invoke_virtual;
import dot.junit.opcodes.invoke_virtual.d.*;
import dot.junit.*;
public class Main_testVFE15 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        //@uses dot.junit.opcodes.invoke_virtual.d.T_invoke_virtual_19
        //@uses dot.junit.opcodes.invoke_virtual.d.TSuper
         try {
             new T_invoke_virtual_19().run();
             fail("expected NoSuchMethodError");
         } catch (NoSuchMethodError t) {
         }
    }
}