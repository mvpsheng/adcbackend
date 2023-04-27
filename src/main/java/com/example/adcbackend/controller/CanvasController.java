package com.example.adcbackend.controller;

import com.baomidou.mybatisplus.core.conditions.update.UpdateWrapper;
import com.example.adcbackend.domain.Canvas;
import com.example.adcbackend.domain.Tags;
import com.example.adcbackend.mapper.CanvasMapper;
import com.example.adcbackend.service.CanvasService;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.Arrays;
import java.util.List;

/**
 * FileName: CanvasController
 * author: gxs
 * Date: 2023/4/21  15:05
 */
@RestController
@AllArgsConstructor
@CrossOrigin(origins = "http://localhost:5173")
@RequestMapping("/canvas")
public class CanvasController {
    private final CanvasService canvasService;

    private final CanvasMapper canvasMapper;
    @GetMapping
    public ResponseEntity<List<Canvas>> getAllCanvases() {
        List<Canvas> allCanvas = canvasMapper.selectList(null);
        for (Canvas canvas :
                allCanvas) {
            System.out.println(canvas.toString());
        }
        return ResponseEntity.ok(allCanvas);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteCanvasById(@PathVariable Long id) {
        canvasMapper.deleteById(id);
        return ResponseEntity.ok("Deleted");
    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCanvas(@PathVariable Long id, @RequestBody Canvas canvas) {
        System.out.println(canvas);
        UpdateWrapper<Canvas> updateWrapper = new UpdateWrapper<>();
        updateWrapper.eq("id", id);
        canvasMapper.update(canvas, updateWrapper);
        return ResponseEntity.ok("Canvas updated successfully");
    }

    @PostMapping
    public ResponseEntity<String> createCanvas(@RequestBody Canvas canvas) {
        canvasMapper.insert(canvas);
        return ResponseEntity.ok("Canvas created successfully");
    }

}
