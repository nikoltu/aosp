//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.sput_boolean;
import dot.junit.opcodes.sput_boolean.d.*;
import dot.junit.*;
public class Main_testVFE8 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
         try {
             new T_sput_boolean_7().run();
             fail("expected IncompatibleClassChangeError");
         } catch (IncompatibleClassChangeError t) {
         }
    }
}
