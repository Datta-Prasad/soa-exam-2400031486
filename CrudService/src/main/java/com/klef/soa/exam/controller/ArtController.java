package com.klef.soa.exam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.soa.exam.entity.Art;
import com.klef.soa.exam.service.ArtService;

@RestController
@RequestMapping("/")
public class ArtController
{
    @Autowired
    private ArtService artService;

    @GetMapping
    public String home()
    {
        return "CRUD Service is Running";
    }

    @PostMapping("/Add")
    public String addArt(@RequestBody Art art)
    {
        return artService.addArt(art);
    }

    @GetMapping("/DisplayAll")
    public List<Art> displayAll()
    {
        return artService.displayAll();
    }

    @DeleteMapping("/Delete/{id}")
    public String deleteArt(@PathVariable Long id)
    {
        return artService.deleteArt(id);
    }
}
