package com.example.demo.service;

import com.example.demo.model.Expense;
import com.example.demo.repository.ExpenseRepository;
import org.springframework.stereotype.Service;
import com.example.demo.dto.SummaryDTO;
import java.util.stream.Collectors;

import java.util.List;

@Service
public class ExpenseService {

    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    public List<Expense> getAll() {
        return repo.findAll();
    }

    public Expense save(Expense expense) {
        return repo.save(expense);
    }

    public void delete(Long id) {
        repo.deleteById(id);
    }

    public List<SummaryDTO> getCategorySummary() {
        return repo.getTotalByCategory()
                .stream()
                .map(obj -> new SummaryDTO(
                        (String) obj[0],
                        (Double) obj[1]))
                .collect(Collectors.toList());
    }
}