//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.new_array;
import dot.junit.opcodes.new_array.d.*;
import dot.junit.*;
public class Main_testVFE7 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        try {
            new T_new_array_11().run();
            fail("expected NoClassDefFoundError");
        } catch (NoClassDefFoundError t) {
        }
    }
}
