package dot.junit.opcodes.invoke_direct_range;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_invoke_direct_range extends DeviceTestCase {
public void testE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testE3.jar", "/data/local/tmp/Main_testE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_8.jar", "/data/local/tmp/T_invoke_direct_range_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE3.jar:/data/local/tmp/T_invoke_direct_range_8.jar", "dot.junit.opcodes.invoke_direct_range.Main_testE3");}

public void testE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testE5.jar", "/data/local/tmp/Main_testE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_9.jar", "/data/local/tmp/T_invoke_direct_range_9.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE5.jar:/data/local/tmp/T_invoke_direct_range_9.jar", "dot.junit.opcodes.invoke_direct_range.Main_testE5");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_2.jar", "/data/local/tmp/T_invoke_direct_range_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_invoke_direct_range_2.jar", "dot.junit.opcodes.invoke_direct_range.Main_testN2");}

public void testN7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testN7.jar", "/data/local/tmp/Main_testN7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_21.jar", "/data/local/tmp/T_invoke_direct_range_21.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN7.jar:/data/local/tmp/T_invoke_direct_range_21.jar", "dot.junit.opcodes.invoke_direct_range.Main_testN7");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_3.jar", "/data/local/tmp/T_invoke_direct_range_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_invoke_direct_range_3.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE1");}

public void testVFE10() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE10.jar", "/data/local/tmp/Main_testVFE10.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_25.jar", "/data/local/tmp/T_invoke_direct_range_25.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/TPlain.jar", "/data/local/tmp/TPlain.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE10.jar:/data/local/tmp/T_invoke_direct_range_25.jar:/data/local/tmp/TSuper.jar:/data/local/tmp/TPlain.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE10");}

public void testVFE11() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE11.jar", "/data/local/tmp/Main_testVFE11.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_25.jar", "/data/local/tmp/T_invoke_direct_range_25.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE11.jar:/data/local/tmp/T_invoke_direct_range_25.jar:/data/local/tmp/TSuper.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE11");}

public void testVFE12() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE12.jar", "/data/local/tmp/Main_testVFE12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_15.jar", "/data/local/tmp/T_invoke_direct_range_15.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE12.jar:/data/local/tmp/T_invoke_direct_range_15.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE12");}

public void testVFE13() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE13.jar", "/data/local/tmp/Main_testVFE13.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_7.jar", "/data/local/tmp/T_invoke_direct_range_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE13.jar:/data/local/tmp/T_invoke_direct_range_7.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE13");}

public void testVFE14() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE14.jar", "/data/local/tmp/Main_testVFE14.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_16.jar", "/data/local/tmp/T_invoke_direct_range_16.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE14.jar:/data/local/tmp/T_invoke_direct_range_16.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE14");}

public void testVFE15() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE15.jar", "/data/local/tmp/Main_testVFE15.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_11.jar", "/data/local/tmp/T_invoke_direct_range_11.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE15.jar:/data/local/tmp/T_invoke_direct_range_11.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE15");}

public void testVFE16() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE16.jar", "/data/local/tmp/Main_testVFE16.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_12.jar", "/data/local/tmp/T_invoke_direct_range_12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE16.jar:/data/local/tmp/T_invoke_direct_range_12.jar:/data/local/tmp/TSuper.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE16");}

public void testVFE17() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE17.jar", "/data/local/tmp/Main_testVFE17.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_13.jar", "/data/local/tmp/T_invoke_direct_range_13.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/TAbstract.jar", "/data/local/tmp/TAbstract.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE17.jar:/data/local/tmp/T_invoke_direct_range_13.jar:/data/local/tmp/TAbstract.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE17");}

public void testVFE18() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE18.jar", "/data/local/tmp/Main_testVFE18.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_17.jar", "/data/local/tmp/T_invoke_direct_range_17.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE18.jar:/data/local/tmp/T_invoke_direct_range_17.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE18");}

public void testVFE19() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE19.jar", "/data/local/tmp/Main_testVFE19.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_18.jar", "/data/local/tmp/T_invoke_direct_range_18.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE19.jar:/data/local/tmp/TSuper.jar:/data/local/tmp/T_invoke_direct_range_18.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE19");}

public void testVFE20() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE20.jar", "/data/local/tmp/Main_testVFE20.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_26.jar", "/data/local/tmp/T_invoke_direct_range_26.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE20.jar:/data/local/tmp/T_invoke_direct_range_26.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE20");}

public void testVFE21() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE21.jar", "/data/local/tmp/Main_testVFE21.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_27.jar", "/data/local/tmp/T_invoke_direct_range_27.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE21.jar:/data/local/tmp/T_invoke_direct_range_27.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE21");}

public void testVFE3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE3.jar", "/data/local/tmp/Main_testVFE3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_4.jar", "/data/local/tmp/T_invoke_direct_range_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE3.jar:/data/local/tmp/T_invoke_direct_range_4.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE3");}

public void testVFE4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE4.jar", "/data/local/tmp/Main_testVFE4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_6.jar", "/data/local/tmp/T_invoke_direct_range_6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/TSuper.jar", "/data/local/tmp/TSuper.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE4.jar:/data/local/tmp/T_invoke_direct_range_6.jar:/data/local/tmp/TSuper.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE4");}

public void testVFE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE5.jar", "/data/local/tmp/Main_testVFE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_5.jar", "/data/local/tmp/T_invoke_direct_range_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE5.jar:/data/local/tmp/T_invoke_direct_range_5.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE5");}

public void testVFE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE6.jar", "/data/local/tmp/Main_testVFE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_10.jar", "/data/local/tmp/T_invoke_direct_range_10.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE6.jar:/data/local/tmp/T_invoke_direct_range_10.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE6");}

public void testVFE8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE8.jar", "/data/local/tmp/Main_testVFE8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_14.jar", "/data/local/tmp/T_invoke_direct_range_14.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE8.jar:/data/local/tmp/T_invoke_direct_range_14.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE8");}

public void testVFE9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/Main_testVFE9.jar", "/data/local/tmp/Main_testVFE9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/invoke_direct_range/d/T_invoke_direct_range_24.jar", "/data/local/tmp/T_invoke_direct_range_24.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE9.jar:/data/local/tmp/T_invoke_direct_range_24.jar", "dot.junit.opcodes.invoke_direct_range.Main_testVFE9");}


}
