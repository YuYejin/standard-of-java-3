public class DefiningAnnotationTypes {

    @interface TestInfo {
        int count();
        String testedBy();
        String[] testTools();
        TestType testType();
        DateTime testDate(); // 자신이 아닌 다른 애너테이션(@DateTime) 을 포함할 수 있다.
    }

    enum TestType { FIRST, FINAL }

    @interface DateTime {
        String yymmdd();
        String hhmmss();
    }


    @TestInfo(
            count = 3, testedBy = "Kim",
            testTools = {"JUNIT", "AutoTester"},
            testType = TestType.FIRST,
            testDate = @DateTime(yymmdd = "160101", hhmmss = "235959")
    )

    public class NewClass {

    }
}

