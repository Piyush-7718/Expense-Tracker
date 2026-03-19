package com.example.demo.controller;

import jakarta.validation.Valid;

import com.example.demo.dto.SummaryDTO;
import com.example.demo.model.Expense;
import com.example.demo.service.ExpenseService;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import java.util.List;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/expenses")
public class ExpenseController {

    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @GetMapping
    public List<Expense> getAll() {
        return service.getAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Expense add(@Valid @RequestBody Expense expense) {
        return service.save(expense);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PutMapping("/{id}")
    public Expense update(@PathVariable Long id, @Valid @RequestBody Expense expense) {
        expense.setId(id);
        return service.save(expense);
    }

    @GetMapping("/summary")
    public List<SummaryDTO> summary() {
        return service.getCategorySummary();
    }
}