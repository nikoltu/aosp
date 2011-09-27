package dot.junit.opcodes.iput_char;
import java.io.IOException;
import junit.framework.TestCase;
import com.android.hosttest.DeviceTestCase;
import dot.junit.DeviceUtil;

public class JUnit_Test_iput_char extends DeviceTestCase {
public void testE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testE2.jar", "/data/local/tmp/Main_testE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_13.jar", "/data/local/tmp/T_iput_char_13.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testE2.jar:/data/local/tmp/T_iput_char_13.jar", "dot.junit.opcodes.iput_char.Main_testE2");}

public void testN1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testN1.jar", "/data/local/tmp/Main_testN1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_1.jar", "/data/local/tmp/T_iput_char_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN1.jar:/data/local/tmp/T_iput_char_1.jar", "dot.junit.opcodes.iput_char.Main_testN1");}

public void testN2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testN2.jar", "/data/local/tmp/Main_testN2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_12.jar", "/data/local/tmp/T_iput_char_12.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN2.jar:/data/local/tmp/T_iput_char_12.jar", "dot.junit.opcodes.iput_char.Main_testN2");}

public void testN4() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testN4.jar", "/data/local/tmp/Main_testN4.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_14.jar", "/data/local/tmp/T_iput_char_14.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_1.jar", "/data/local/tmp/T_iput_char_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testN4.jar:/data/local/tmp/T_iput_char_14.jar:/data/local/tmp/T_iput_char_1.jar", "dot.junit.opcodes.iput_char.Main_testN4");}

public void testVFE1() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE1.jar", "/data/local/tmp/Main_testVFE1.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_3.jar", "/data/local/tmp/T_iput_char_3.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE1.jar:/data/local/tmp/T_iput_char_3.jar", "dot.junit.opcodes.iput_char.Main_testVFE1");}

public void testVFE10() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE10.jar", "/data/local/tmp/Main_testVFE10.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_9.jar", "/data/local/tmp/T_iput_char_9.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE10.jar:/data/local/tmp/T_iput_char_9.jar", "dot.junit.opcodes.iput_char.Main_testVFE10");}

public void testVFE11() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE11.jar", "/data/local/tmp/Main_testVFE11.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_10.jar", "/data/local/tmp/T_iput_char_10.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE11.jar:/data/local/tmp/T_iput_char_10.jar", "dot.junit.opcodes.iput_char.Main_testVFE11");}

public void testVFE12() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE12.jar", "/data/local/tmp/Main_testVFE12.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_15.jar", "/data/local/tmp/T_iput_char_15.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_1.jar", "/data/local/tmp/T_iput_char_1.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE12.jar:/data/local/tmp/T_iput_char_15.jar:/data/local/tmp/T_iput_char_1.jar", "dot.junit.opcodes.iput_char.Main_testVFE12");}

public void testVFE13() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE13.jar", "/data/local/tmp/Main_testVFE13.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_2.jar", "/data/local/tmp/T_iput_char_2.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE13.jar:/data/local/tmp/T_iput_char_2.jar", "dot.junit.opcodes.iput_char.Main_testVFE13");}

public void testVFE14() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE14.jar", "/data/local/tmp/Main_testVFE14.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_20.jar", "/data/local/tmp/T_iput_char_20.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE14.jar:/data/local/tmp/T_iput_char_20.jar", "dot.junit.opcodes.iput_char.Main_testVFE14");}

public void testVFE15() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE15.jar", "/data/local/tmp/Main_testVFE15.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_21.jar", "/data/local/tmp/T_iput_char_21.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE15.jar:/data/local/tmp/T_iput_char_21.jar", "dot.junit.opcodes.iput_char.Main_testVFE15");}

public void testVFE16() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE16.jar", "/data/local/tmp/Main_testVFE16.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_22.jar", "/data/local/tmp/T_iput_char_22.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE16.jar:/data/local/tmp/T_iput_char_22.jar", "dot.junit.opcodes.iput_char.Main_testVFE16");}

public void testVFE17() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE17.jar", "/data/local/tmp/Main_testVFE17.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_23.jar", "/data/local/tmp/T_iput_char_23.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE17.jar:/data/local/tmp/T_iput_char_23.jar", "dot.junit.opcodes.iput_char.Main_testVFE17");}

public void testVFE18() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE18.jar", "/data/local/tmp/Main_testVFE18.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_24.jar", "/data/local/tmp/T_iput_char_24.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE18.jar:/data/local/tmp/T_iput_char_24.jar", "dot.junit.opcodes.iput_char.Main_testVFE18");}

public void testVFE19() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE19.jar", "/data/local/tmp/Main_testVFE19.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_11.jar", "/data/local/tmp/T_iput_char_11.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/TestStubs.jar", "/data/local/tmp/TestStubs.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE19.jar:/data/local/tmp/T_iput_char_11.jar:/data/local/tmp/TestStubs.jar", "dot.junit.opcodes.iput_char.Main_testVFE19");}

public void testVFE2() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE2.jar", "/data/local/tmp/Main_testVFE2.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_4.jar", "/data/local/tmp/T_iput_char_4.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE2.jar:/data/local/tmp/T_iput_char_4.jar", "dot.junit.opcodes.iput_char.Main_testVFE2");}

public void testVFE30() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE30.jar", "/data/local/tmp/Main_testVFE30.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_30.jar", "/data/local/tmp/T_iput_char_30.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE30.jar:/data/local/tmp/T_iput_char_30.jar", "dot.junit.opcodes.iput_char.Main_testVFE30");}

public void testVFE5() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE5.jar", "/data/local/tmp/Main_testVFE5.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_17.jar", "/data/local/tmp/T_iput_char_17.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE5.jar:/data/local/tmp/T_iput_char_17.jar", "dot.junit.opcodes.iput_char.Main_testVFE5");}

public void testVFE6() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE6.jar", "/data/local/tmp/Main_testVFE6.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_6.jar", "/data/local/tmp/T_iput_char_6.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE6.jar:/data/local/tmp/T_iput_char_6.jar", "dot.junit.opcodes.iput_char.Main_testVFE6");}

public void testVFE7() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE7.jar", "/data/local/tmp/Main_testVFE7.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_18.jar", "/data/local/tmp/T_iput_char_18.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE7.jar:/data/local/tmp/T_iput_char_18.jar", "dot.junit.opcodes.iput_char.Main_testVFE7");}

public void testVFE8() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE8.jar", "/data/local/tmp/Main_testVFE8.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_7.jar", "/data/local/tmp/T_iput_char_7.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE8.jar:/data/local/tmp/T_iput_char_7.jar", "dot.junit.opcodes.iput_char.Main_testVFE8");}

public void testVFE9() throws Exception {
    DeviceUtil.adbPush(getDevice(), "dot/junit/dexcore.jar", "/data/local/tmp/dexcore.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/Main_testVFE9.jar", "/data/local/tmp/Main_testVFE9.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/TestStubs.jar", "/data/local/tmp/TestStubs.jar");    DeviceUtil.adbPush(getDevice(), "dot/junit/opcodes/iput_char/d/T_iput_char_8.jar", "/data/local/tmp/T_iput_char_8.jar");    DeviceUtil.adbExec(getDevice(), "/data/local/tmp/dexcore.jar:/data/local/tmp/Main_testVFE9.jar:/data/local/tmp/TestStubs.jar:/data/local/tmp/T_iput_char_8.jar", "dot.junit.opcodes.iput_char.Main_testVFE9");}


}