package com.klef.soa.exam.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.klef.soa.exam.entity.Art;
import com.klef.soa.exam.repository.ArtRepository;

@Service
public class ArtServiceImpl implements ArtService
{
    @Autowired
    private ArtRepository artRepository;

    @Override
    public String addArt(Art art)
    {
        artRepository.save(art);
        return "Art Record Added Successfully";
    }

    @Override
    public List<Art> displayAll()
    {
        return artRepository.findAll();
    }

    @Override
    public String deleteArt(Long id)
    {
        if (artRepository.existsById(id))
        {
            artRepository.deleteById(id);
            return "Art Record Deleted Successfully";
        }

        return "Art Record Not Found";
    }
}