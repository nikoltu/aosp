//autogenerated by util.build.BuildDalvikSuite, do not change
package dot.junit.opcodes.rsub_int;
import dot.junit.opcodes.rsub_int.d.*;
import dot.junit.*;
public class Main_testN1 extends DxAbstractMain {
    public static void main(String[] args) throws Exception {
        T_rsub_int_1 t = new T_rsub_int_1();
        assertEquals("Subtest_1 is failed", -4, t.run(8));
        assertEquals("Subtest_2 is failed",45, t.run1(15));
        assertEquals("Subtest_3 is failed",0, t.run2(20));
        assertEquals("Subtest_4 is failed",-35, t.run3(10));
        assertEquals("Subtest_5 is failed",-20, t.run4(-50));
        assertEquals("Subtest_6 is failed",20, t.run5(-70));
    }
}
