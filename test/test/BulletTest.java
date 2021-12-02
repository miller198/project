package entity;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BulletTest {

    Bullet bullet;

    @BeforeEach
    void setUp() {
        bullet = new Bullet(0,0,3);
    }

    @Test
    void setSpeed() {
    }

    @Test
    void getSpeed() {
        assertAll(
                "multi",
                () -> assertEquals(3, bullet.getSpeed()),
                () -> {
                    bullet.setSpeed(5);
                    assertEquals(5,bullet.getSpeed());
                }
        );
    }
}