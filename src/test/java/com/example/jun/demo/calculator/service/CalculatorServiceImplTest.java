package com.example.jun.demo.calculator.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

import static org.mockito.BDDMockito.given;
import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@RunWith(SpringRunner.class)
class CalculatorServiceImplTest {

    @MockBean
    CalculatorServiceImpl cal;

    @Test
    void createRandomNumbers() {
        given(cal.createRandomNumbers()).willReturn(30);
        assertThat(cal.createRandomNumbers()).isEqualTo(30);
    }
}