package com.solution.p2p.core.common.utils;

/**
 * Created with IntelliJ IDEA.
 * User: JohnKee
 * Date: 14-11-3
 * Time: 下午2:48
 * To change this template use File | Settings | File Templates.
 */
public enum CommonState {

    NORMAL("NORM","正常"),
    FREEZE("FRZE","冻结");

    CommonState(String state, String stateDesc) {
        this.state = state;
        this.stateDesc = stateDesc;
    }

    private String state;
    private String stateDesc;

    public String getState() {
        return state;
    }

    public String getStateDesc() {
        return stateDesc;
    }
}
