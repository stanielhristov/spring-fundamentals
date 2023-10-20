package com.plannerapp.init;

import com.plannerapp.model.entity.PriorityEntity;
import com.plannerapp.model.enums.PriorityNameEnum;
import com.plannerapp.repo.PriorityRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Component
public class PriorityInit implements CommandLineRunner {
    private final PriorityRepository priorityRepository;

    public PriorityInit(PriorityRepository priorityRepository) {
        this.priorityRepository = priorityRepository;
    }

    @Override
    public void run(String... args) {
        long count = priorityRepository.count();

        if (count == 0) {
            List<PriorityEntity> priorities = new ArrayList<>();

            Arrays.stream(PriorityNameEnum.values())
                    .forEach(priorityName -> {
                        PriorityEntity priority = new PriorityEntity();
                        priority.setPriorityName(priorityName);
                        priorities.add(priority);
                    });

            priorityRepository.saveAll(priorities);
        }
    }
}