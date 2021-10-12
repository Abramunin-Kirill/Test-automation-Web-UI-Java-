package com.geekbrains.lesson4;

import org.junit.jupiter.api.*;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.assertj.core.api.Assertions.assertThatNullPointerException;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class BoxTest {
    Box box;

    @Nested
    class WhenIsEmpty {
        @BeforeEach
        void createBox() {
            box = new Box();
        }

        @Test
        void addBallTest() {
            box.addBall();
            Assertions.assertEquals(1, box.getBallCounter());
        }

        @Test
        void removeBallFromEmptyBoxTest() {
            assertThatNullPointerException().isThrownBy(() -> box.removeBall());
        }

        @Test
        void shuffleEmptyBoxTest() {
            assertThatExceptionOfType(BoxIsEmptyException.class).isThrownBy(() -> box.shuffleBalls());
        }

        @Nested
        class WhenWithBalls {
            @BeforeEach
            void addBalls() {
                box.addBall();
            }

            @Test
            void removeBallFromBoxWithBalls() {
                box.removeBall();
                assertThat(box.getBallCounter()).isEqualTo(0);
            }
        }
    }

}