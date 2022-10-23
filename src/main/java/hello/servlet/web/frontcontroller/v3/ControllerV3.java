package hello.servlet.web.frontcontroller.v3;

import hello.servlet.web.frontcontroller.Modelview;

import java.util.Map;

public interface ControllerV3 {
    Modelview process(Map<String, String> paramMap);
}
