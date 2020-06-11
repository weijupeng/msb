package com.wjp.designmode.structure.bridge;

/**
 * @author wjp
 * @date 2020/6/9 18:20
 */
public class BridgeTest {
    public static void main(String[] args) {
        Bridge myBridge = new MyBridge();

        SourceSub1 sourceSub1 = new SourceSub1();
        myBridge.setSource(sourceSub1);
        myBridge.method();


        SourceSub2 sourceSub2 = new SourceSub2();
        myBridge.setSource(sourceSub2);
        sourceSub2.method();
    }
}
