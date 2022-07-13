import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

public class MetaAnnotation {

    /**
     * Target
     * */
    @Target({FIELD, TYPE, TYPE_USE})  // 적용대상이 FIELD, TYPE, TYPE_USE
    public @interface MyAnnotation {  // MyAnnotation을 정의
    }

    @MyAnnotation  // 적용대상이 TYPE인 경우
    class MyClass {
        @MyAnnotation  // 적용대상이 FIELD인 경우
        int i;
        
        @MyAnnotation  // 적용대상이 TYPE_USE인 경우
        MyClass mc;
    }
    
}
