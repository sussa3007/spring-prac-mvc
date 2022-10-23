package hello.servlet.web.frontcontroller.v3.controller;

import hello.servlet.web.frontcontroller.Modelview;
import hello.servlet.web.frontcontroller.v3.ControllerV3;

import java.util.Map;

public class MemberFormControllerV3 implements ControllerV3 {

    @Override
    public Modelview process(Map<String, String> paramMap) {
        return new Modelview("new-form");
    }
}
