package dot.junit.opcodes.invoke_static_range;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_invoke_static_range extends DeviceTestCase {
public void testE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testE2.jar", "/data/local/tmp/Main_testE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_6.jar", "/data/local/tmp/T_invoke_static_range_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE2.jar:/data/local/tmp/T_invoke_static_range_6.jar", "dot.junit.opcodes.invoke_static_range.Main_testE2");}

public void testE7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testE7.jar", "/data/local/tmp/Main_testE7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_14.jar", "/data/local/tmp/T_invoke_static_range_14.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE7.jar:/data/local/tmp/T_invoke_static_range_14.jar", "dot.junit.opcodes.invoke_static_range.Main_testE7");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_1.jar", "/data/local/tmp/T_invoke_static_range_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_invoke_static_range_1.jar", "dot.junit.opcodes.invoke_static_range.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/TestClass.jar", "/data/local/tmp/TestClass.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_2.jar", "/data/local/tmp/T_invoke_static_range_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/TestClass.jar:/data/local/tmp/T_invoke_static_range_2.jar", "dot.junit.opcodes.invoke_static_range.Main_testN2");}

public void testN3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testN3.jar", "/data/local/tmp/Main_testN3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_4.jar", "/data/local/tmp/T_invoke_static_range_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN3.jar:/data/local/tmp/T_invoke_static_range_4.jar", "dot.junit.opcodes.invoke_static_range.Main_testN3");}

public void testN5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testN5.jar", "/data/local/tmp/Main_testN5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/TestClass.jar", "/data/local/tmp/TestClass.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_15.jar", "/data/local/tmp/T_invoke_static_range_15.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN5.jar:/data/local/tmp/TestClass.jar:/data/local/tmp/T_invoke_static_range_15.jar", "dot.junit.opcodes.invoke_static_range.Main_testN5");}

public void testN6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testN6.jar", "/data/local/tmp/Main_testN6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_18.jar", "/data/local/tmp/T_invoke_static_range_18.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN6.jar:/data/local/tmp/T_invoke_static_range_18.jar", "dot.junit.opcodes.invoke_static_range.Main_testN6");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_3.jar", "/data/local/tmp/T_invoke_static_range_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_invoke_static_range_3.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE1");}

public void testVFE10() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE10.jar", "/data/local/tmp/Main_testVFE10.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/TestClass.jar", "/data/local/tmp/TestClass.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_13.jar", "/data/local/tmp/T_invoke_static_range_13.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE10.jar:/data/local/tmp/TestClass.jar:/data/local/tmp/T_invoke_static_range_13.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE10");}

public void testVFE12() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE12.jar", "/data/local/tmp/Main_testVFE12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/TestClass.jar", "/data/local/tmp/TestClass.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_17.jar", "/data/local/tmp/T_invoke_static_range_17.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE12.jar:/data/local/tmp/TestClass.jar:/data/local/tmp/T_invoke_static_range_17.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE12");}

public void testVFE13() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE13.jar", "/data/local/tmp/Main_testVFE13.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_16.jar", "/data/local/tmp/T_invoke_static_range_16.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE13.jar:/data/local/tmp/T_invoke_static_range_16.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE13");}

public void testVFE18() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE18.jar", "/data/local/tmp/Main_testVFE18.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_24.jar", "/data/local/tmp/T_invoke_static_range_24.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE18.jar:/data/local/tmp/T_invoke_static_range_24.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE18");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_10.jar", "/data/local/tmp/T_invoke_static_range_10.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_invoke_static_range_10.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE3");}

public void testVFE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE4.jar", "/data/local/tmp/Main_testVFE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_11.jar", "/data/local/tmp/T_invoke_static_range_11.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE4.jar:/data/local/tmp/T_invoke_static_range_11.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE4");}

public void testVFE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE5.jar", "/data/local/tmp/Main_testVFE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_19.jar", "/data/local/tmp/T_invoke_static_range_19.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE5.jar:/data/local/tmp/T_invoke_static_range_19.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE5");}

public void testVFE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE6.jar", "/data/local/tmp/Main_testVFE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_20.jar", "/data/local/tmp/T_invoke_static_range_20.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE6.jar:/data/local/tmp/T_invoke_static_range_20.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE6");}

public void testVFE7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE7.jar", "/data/local/tmp/Main_testVFE7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_5.jar", "/data/local/tmp/T_invoke_static_range_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE7.jar:/data/local/tmp/T_invoke_static_range_5.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE7");}

public void testVFE8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE8.jar", "/data/local/tmp/Main_testVFE8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_7.jar", "/data/local/tmp/T_invoke_static_range_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE8.jar:/data/local/tmp/T_invoke_static_range_7.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE8");}

public void testVFE9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/Main_testVFE9.jar", "/data/local/tmp/Main_testVFE9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/TestClass.jar", "/data/local/tmp/TestClass.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_static_range/d/T_invoke_static_range_8.jar", "/data/local/tmp/T_invoke_static_range_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE9.jar:/data/local/tmp/TestClass.jar:/data/local/tmp/T_invoke_static_range_8.jar", "dot.junit.opcodes.invoke_static_range.Main_testVFE9");}


}
