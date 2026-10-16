package com.klef.soa.exam.service;

import java.util.List;

import com.klef.soa.exam.entity.Art;

public interface ArtService
{
    String addArt(Art art);

    List<Art> displayAll();

    String deleteArt(Long id);
}