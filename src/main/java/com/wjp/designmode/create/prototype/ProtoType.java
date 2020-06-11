package com.wjp.designmode.create.prototype;

/**
 * @author wjp
 * @date 2020/6/9 14:46
 */
public class ProtoType implements Cloneable {
    @Override
    public Object clone() throws CloneNotSupportedException {
        ProtoType protoType = (ProtoType) super.clone();
        return protoType;
    }
}
