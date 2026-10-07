package com.melodyflow.service;

import com.melodyflow.entity.Expense;
import com.melodyflow.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;

    public ExpenseService(ExpenseRepository expenseRepository) {
        this.expenseRepository = expenseRepository;
    }

    public List<Expense> findAll() {
        return expenseRepository.findAll();
    }

    public Optional<Expense> findById(Long id) {
        return expenseRepository.findById(id);
    }

    public List<Expense> findByConcertPlanId(Long concertPlanId) {
        return expenseRepository.findByConcertPlanId(concertPlanId);
    }

    public List<Expense> findByConcertPlanIdOrderByExpenseDateAsc(Long concertPlanId) {
        return expenseRepository.findByConcertPlanIdOrderByExpenseDateAsc(concertPlanId);
    }

    public Expense save(Expense expense) {
        return expenseRepository.save(expense);
    }

    public void deleteById(Long id) {
        expenseRepository.deleteById(id);
    }
}