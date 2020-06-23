package dk.muhko.test;

import dk.muhko.JSON;
import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsProperty;
import jsinterop.base.Js;
import jsinterop.base.JsPropertyMap;

public class Worker {

    public void work() {
        String json = "{ \"payload\": { \"property1\": 1.0, \"property2\": \"2.0\" }}";
        JsPropertyMap<?> obj = Js.uncheckedCast(JSON.parse(json));
        Object payload = obj.get("payload");
        Mapped mapped = Js.uncheckedCast(payload);

        DomGlobal.console.log("Hello World", mapped.property2, mapped.property1);
    }

    private static class Mapped {
        @JsProperty
        public double property1;

        @JsProperty
        public String property2;
    }

}
