package com.example.demo.service;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.Part;
import com.example.demo.repositories.PartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

/**
 *
 */

@Service
public class PartServiceImpl implements PartService {
    private final PartRepository partRepository;

    @Autowired

    public PartServiceImpl(PartRepository partRepository) {
        this.partRepository = partRepository;
    }

    @Override
    public List<Part> findAll() {
        return (List<Part>) partRepository.findAll();
    }

    public List<Part> listAll(String keyword) {
        if (keyword != null) {
            return partRepository.search(keyword);
        }
        return (List<Part>) partRepository.findAll();
    }

    @Override
    public Part findById(int theId) {
        Long theIdl = (long) theId;
        Optional<Part> result = partRepository.findById(theIdl);

        Part thePart = null;

        if (result.isPresent()) {
            thePart = result.get();
        } else {
            // we didn't find the part id
            throw new RuntimeException("Did not find part id - " + theId);
        }

        return thePart;
    }

    @Override
    public void save(Part thePart) {
        partRepository.save(thePart);

    }

    @Override
    public void deleteById(int theId) {
        Long theIdl = (long) theId;
        partRepository.deleteById(theIdl);
    }

    @Override
    public long countAllParts() {
        return partRepository.count();
    }

    @Override
    public void addSamplePartInventory(){
        partRepository.saveAll(List.of(
                new InhousePart("RAM 32GB DDR5 (2 x 16GB)", 125.00,8,1,10),
                new InhousePart("GBIT AirPower 12G GDDR6 Graphics Card", 659.99,5,1,10),
                new InhousePart("Seabridge 10TB 7200RPM SATA 6.0/Gbs 3.5\" Hard Disk Drive", 164.45, 9,1,10),
                new InhousePart("Ssing 2TB SSD M.2 Solid State Drive", 199.99, 11,1,15),
                new InhousePart("Breeze 80 PLUS GOLD ATX 3.0 750W Power Supply",125.95,7,1,8),
                new InhousePart("Breeze H150i AF120 RGB 360mm Radiator Liquid CPU Cooler", 179.99, 8,1,9)
        ));
    }

}
