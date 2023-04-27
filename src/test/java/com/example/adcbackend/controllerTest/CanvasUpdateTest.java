package com.example.adcbackend.controllerTest;

import com.example.adcbackend.domain.Canvas;
import com.example.adcbackend.service.CanvasService;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * FileName: CanvasUpdateTest
 * author: gxs
 * Date: 2023/4/27  15:31
 */
@SpringBootTest
@RunWith(SpringRunner.class)
public class CanvasUpdateTest {


    @Autowired
    private CanvasService canvasService;

    @Test
    public void updateTest() {
            Canvas sample = canvasService.getById(5);
             sample.setDsa("hashmap");
            canvasService.updateById(sample);
            assertThat(sample.getDsa()).isEqualTo("hashmap");
    }
}
