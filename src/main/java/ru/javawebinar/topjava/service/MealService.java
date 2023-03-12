package ru.javawebinar.topjava.service;

import org.springframework.stereotype.Service;
import ru.javawebinar.topjava.model.Meal;
import ru.javawebinar.topjava.repository.MealRepository;

import java.util.Collection;

import static ru.javawebinar.topjava.util.ValidationUtil.checkNotFound;
import static ru.javawebinar.topjava.util.ValidationUtil.checkNotFoundWithId;

@Service
public class MealService {

    private MealRepository repository;


    public MealService(MealRepository repository) {
        this.repository = repository;
    }

    public Meal create(Meal meal) {
        return repository.save(meal);
    }

    public void delete(Integer id) {
        repository.delete(id);
    }

    public Meal update(Meal meal) {
        return repository.save(meal);
    }

    public Meal get(Integer id) {
        return checkNotFoundWithId(repository.get(id), id);
    }

    public Collection<Meal> getAll(Integer userId) {
        return repository.getAll(userId);
    }
}