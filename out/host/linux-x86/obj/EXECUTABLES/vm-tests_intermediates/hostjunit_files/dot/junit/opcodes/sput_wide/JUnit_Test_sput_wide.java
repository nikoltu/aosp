package dot.junit.opcodes.sput_wide;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_sput_wide extends DeviceTestCase {
public void testE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testE6.jar", "/data/local/tmp/Main_testE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_13.jar", "/data/local/tmp/T_sput_wide_13.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE6.jar:/data/local/tmp/T_sput_wide_13.jar", "dot.junit.opcodes.sput_wide.Main_testE6");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_1.jar", "/data/local/tmp/T_sput_wide_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_sput_wide_1.jar", "dot.junit.opcodes.sput_wide.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_5.jar", "/data/local/tmp/T_sput_wide_5.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_sput_wide_5.jar", "dot.junit.opcodes.sput_wide.Main_testN2");}

public void testN3() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testN3.jar", "/data/local/tmp/Main_testN3.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_12.jar", "/data/local/tmp/T_sput_wide_12.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN3.jar:/data/local/tmp/T_sput_wide_12.jar", "dot.junit.opcodes.sput_wide.Main_testN3");}

public void testN4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testN4.jar", "/data/local/tmp/Main_testN4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_1.jar", "/data/local/tmp/T_sput_wide_1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_14.jar", "/data/local/tmp/T_sput_wide_14.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN4.jar:/data/local/tmp/T_sput_wide_1.jar:/data/local/tmp/T_sput_wide_14.jar", "dot.junit.opcodes.sput_wide.Main_testN4");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_3.jar", "/data/local/tmp/T_sput_wide_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_sput_wide_3.jar", "dot.junit.opcodes.sput_wide.Main_testVFE1");}

public void testVFE10() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE10.jar", "/data/local/tmp/Main_testVFE10.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_9.jar", "/data/local/tmp/T_sput_wide_9.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE10.jar:/data/local/tmp/T_sput_wide_9.jar", "dot.junit.opcodes.sput_wide.Main_testVFE10");}

public void testVFE11() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE11.jar", "/data/local/tmp/Main_testVFE11.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_10.jar", "/data/local/tmp/T_sput_wide_10.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE11.jar:/data/local/tmp/T_sput_wide_10.jar", "dot.junit.opcodes.sput_wide.Main_testVFE11");}

public void testVFE12() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE12.jar", "/data/local/tmp/Main_testVFE12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_1.jar", "/data/local/tmp/T_sput_wide_1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_15.jar", "/data/local/tmp/T_sput_wide_15.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE12.jar:/data/local/tmp/T_sput_wide_1.jar:/data/local/tmp/T_sput_wide_15.jar", "dot.junit.opcodes.sput_wide.Main_testVFE12");}

public void testVFE13() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE13.jar", "/data/local/tmp/Main_testVFE13.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_2.jar", "/data/local/tmp/T_sput_wide_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE13.jar:/data/local/tmp/T_sput_wide_2.jar", "dot.junit.opcodes.sput_wide.Main_testVFE13");}

public void testVFE14() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE14.jar", "/data/local/tmp/Main_testVFE14.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_20.jar", "/data/local/tmp/T_sput_wide_20.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE14.jar:/data/local/tmp/T_sput_wide_20.jar", "dot.junit.opcodes.sput_wide.Main_testVFE14");}

public void testVFE15() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE15.jar", "/data/local/tmp/Main_testVFE15.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_21.jar", "/data/local/tmp/T_sput_wide_21.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE15.jar:/data/local/tmp/T_sput_wide_21.jar", "dot.junit.opcodes.sput_wide.Main_testVFE15");}

public void testVFE16() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE16.jar", "/data/local/tmp/Main_testVFE16.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_22.jar", "/data/local/tmp/T_sput_wide_22.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE16.jar:/data/local/tmp/T_sput_wide_22.jar", "dot.junit.opcodes.sput_wide.Main_testVFE16");}

public void testVFE17() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE17.jar", "/data/local/tmp/Main_testVFE17.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_23.jar", "/data/local/tmp/T_sput_wide_23.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE17.jar:/data/local/tmp/T_sput_wide_23.jar", "dot.junit.opcodes.sput_wide.Main_testVFE17");}

public void testVFE18() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE18.jar", "/data/local/tmp/Main_testVFE18.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_24.jar", "/data/local/tmp/T_sput_wide_24.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE18.jar:/data/local/tmp/T_sput_wide_24.jar", "dot.junit.opcodes.sput_wide.Main_testVFE18");}

public void testVFE19() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE19.jar", "/data/local/tmp/Main_testVFE19.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/TestStubs.jar", "/data/local/tmp/TestStubs.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_11.jar", "/data/local/tmp/T_sput_wide_11.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE19.jar:/data/local/tmp/TestStubs.jar:/data/local/tmp/T_sput_wide_11.jar", "dot.junit.opcodes.sput_wide.Main_testVFE19");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_4.jar", "/data/local/tmp/T_sput_wide_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_sput_wide_4.jar", "dot.junit.opcodes.sput_wide.Main_testVFE2");}

public void testVFE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE5.jar", "/data/local/tmp/Main_testVFE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_17.jar", "/data/local/tmp/T_sput_wide_17.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE5.jar:/data/local/tmp/T_sput_wide_17.jar", "dot.junit.opcodes.sput_wide.Main_testVFE5");}

public void testVFE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE6.jar", "/data/local/tmp/Main_testVFE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_6.jar", "/data/local/tmp/T_sput_wide_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE6.jar:/data/local/tmp/T_sput_wide_6.jar", "dot.junit.opcodes.sput_wide.Main_testVFE6");}

public void testVFE7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE7.jar", "/data/local/tmp/Main_testVFE7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_18.jar", "/data/local/tmp/T_sput_wide_18.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE7.jar:/data/local/tmp/T_sput_wide_18.jar", "dot.junit.opcodes.sput_wide.Main_testVFE7");}

public void testVFE8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE8.jar", "/data/local/tmp/Main_testVFE8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_7.jar", "/data/local/tmp/T_sput_wide_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE8.jar:/data/local/tmp/T_sput_wide_7.jar", "dot.junit.opcodes.sput_wide.Main_testVFE8");}

public void testVFE9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/Main_testVFE9.jar", "/data/local/tmp/Main_testVFE9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/TestStubs.jar", "/data/local/tmp/TestStubs.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/sput_wide/d/T_sput_wide_8.jar", "/data/local/tmp/T_sput_wide_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE9.jar:/data/local/tmp/TestStubs.jar:/data/local/tmp/T_sput_wide_8.jar", "dot.junit.opcodes.sput_wide.Main_testVFE9");}


}
