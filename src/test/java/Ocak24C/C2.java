package Ocak24C;

import org.junit.jupiter.api.*;

public class C2 {
    @BeforeAll
    public static void beforeAll() {
        System.out.println("BeforeAll notasyonu tum test methodlarindan once 1 kez calistiriilir");
    }

    @BeforeEach
    public void setUp() {
        System.out.println("BeforeEach notasyonuna sahip olan bir method her test methodundan once 1 kez calistirilir");
    }

    @Test
    public void test01() {
        System.out.println("test01 calisti");
    }
    @Test
    public void test02() {
        System.out.println("test02 calisti");
    }
    @Test
    public void test03() {
        System.out.println("test03 calisti");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("AfterEach notasyonuna sahip olan bir method her test methodundan sonra 1 kez calistirilir");
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("AfterAll notasyonuna sahip olan bir method classtaki tum test methodlarindan sonra 1 kez calistirilir");
    }
}
